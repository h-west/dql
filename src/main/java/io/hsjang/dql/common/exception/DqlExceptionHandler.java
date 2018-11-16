package io.hsjang.dql.common.exception;

import org.springframework.core.annotation.Order;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DefaultDataBufferFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import org.springframework.web.server.WebExceptionHandler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.hsjang.dql.domain.Result;
import io.hsjang.dql.model.ResultCode;
import reactor.core.publisher.Mono;

@Component
@Order(-2)
public class DqlExceptionHandler implements WebExceptionHandler{

	ObjectMapper mapper = new ObjectMapper();
	
	@Override
	public Mono<Void> handle(ServerWebExchange exchange, Throwable ex) {
		
		if ( !(ex instanceof DqlException) ) {
			ex = new DqlException(ResultCode.DQL);
		}
		
		try {
			DqlException de = (DqlException) ex;
			ex.printStackTrace();
			
			exchange.getResponse().setStatusCode(de.getResultCode().getStatus());
			exchange.getResponse().getHeaders().setContentType(MediaType.APPLICATION_JSON_UTF8);
			DataBuffer db;
			db = new DefaultDataBufferFactory().wrap(mapper.writeValueAsBytes( new Result(de.getResultCode()) ));
			return exchange.getResponse().writeWith(Mono.just(db));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		
		return Mono.empty();
		
	}
}
