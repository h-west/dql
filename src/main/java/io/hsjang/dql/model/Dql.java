package io.hsjang.dql.model;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Field;
import org.springframework.data.mongodb.core.query.Query;

import io.hsjang.dql.common.exception.DqlException;
import io.hsjang.dql.parser.DQLLexer;
import io.hsjang.dql.parser.DQLParser;
import io.hsjang.dql.parser.DQLParser.SingleContext;
import lombok.Data;
import reactor.core.publisher.Flux;

@Data
public class Dql {
	
	Output output;
	DqlQuery dqlQuery;
	Query mongoQuery;
	
	public static Flux<Dql> fluxOf(String dqlStr) {
		DQLLexer lexer = new DQLLexer(CharStreams.fromString(dqlStr));
		CommonTokenStream steam = new CommonTokenStream(lexer);
		DQLParser parser = new DQLParser(steam);
		return Flux.fromIterable(parser.dql().single()).map(Dql::new);
	}
	
	public Dql(SingleContext single) {
		try {
			
			setOutput(new Output(single.output()));
			setDqlQuery(new DqlQuery(single.query()));
			
			Query q = new BasicQuery( getDqlQuery().getMongoQuery() );
			if(this.output.isHasFields()) {
				Field f = q.fields();
				this.output.getFields().forEach(f::include);
			}
			setMongoQuery(q);
			
		}catch(Exception e) {
			throw new DqlException(ResultCode.DQL);
		}
	}
}