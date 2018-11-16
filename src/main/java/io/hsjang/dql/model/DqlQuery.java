package io.hsjang.dql.model;

import io.hsjang.dql.parser.DQLParser.QueryContext;
import lombok.Data;

@Data
public class DqlQuery{
	String collectionName;
	boolean hasQueries;
	String mongoQuery;
	
	public DqlQuery(QueryContext query) {
		setCollectionName(query.name().getText());
		setHasQueries(query.queries()!=null && query.queries().queryparams()!=null);
		setMongoQuery(hasQueries?query.queries().queryparams().value(0).getText():"{}");
	}
}