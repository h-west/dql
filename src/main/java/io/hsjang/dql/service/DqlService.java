package io.hsjang.dql.service;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.stereotype.Service;

import io.hsjang.dql.domain.Data;
import io.hsjang.dql.model.Dql;
import reactor.core.publisher.Mono;

@Service
public class DqlService {
	
	@Autowired
	ReactiveMongoTemplate mongoTemplate; 

	public Mono<Data> get(Dql dql){
		return dql.getOutput().isArray()
				? mongoTemplate.find(dql.getMongoQuery(), Data.class, dql.getDqlQuery().getCollectionName()).collect(Collectors.toList()) //.log()
					.flatMap(l->Mono.just(Data.of(dql.getOutput().getName(),l)))
				: mongoTemplate.findOne(dql.getMongoQuery(), Data.class, dql.getDqlQuery().getCollectionName()) //.log()
					.flatMap(l->Mono.just(Data.of(dql.getOutput().getName(),l)));
	}
	
}
