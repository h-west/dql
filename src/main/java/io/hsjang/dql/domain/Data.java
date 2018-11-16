package io.hsjang.dql.domain;

import java.util.HashMap;

import io.hsjang.dql.parser.DQLParser.FieldparamsContext;

public class Data extends HashMap<String, Object>{

	private static final long serialVersionUID = 1L;

	public static Data of(String k, Object v) {
		Data data = new Data();
		data.put(k, v);
		return data;
	}
	
	public Data filter(FieldparamsContext p) {
		Data empty = new Data();
		p.value().stream().forEach(v->{
			String k = v.getText();
			if(containsKey(k)) {
				empty.put(k, get(k));
			}
		});
		return empty;
	}
}
