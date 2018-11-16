package io.hsjang.dql.controller;

import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.hsjang.dql.domain.Result;
import io.hsjang.dql.model.Dql;
import io.hsjang.dql.service.DqlService;
import reactor.core.publisher.Mono;

@RestController
public class DqlController {

	@Autowired
	DqlService dqlService;
	
	@GetMapping("/dql")
	public Mono<Result> dqlGet(@RequestParam("q") String dql) {
		return Dql.fluxOf(dql)// .log()
				.flatMap(dqlService::get).collect(Collector.of(Result::new, (r, d) -> r.addData(d),(r1, r2) -> r1.mergeResultData(r2), Collector.Characteristics.CONCURRENT));

	}

	@PostMapping("/dql")
	public Mono<Void> dqlPost(@RequestParam("q") String dql, Model model) {
		return Mono.empty();
	}
}
