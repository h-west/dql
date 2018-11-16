package io.hsjang.dql.model;

import java.util.ArrayList;
import java.util.List;

import io.hsjang.dql.parser.DQLParser.OutputContext;
import lombok.Data;

@Data
public class Output{
	String name;
	boolean array;
	boolean hasFields;
	List<String> fields;
	
	public Output(OutputContext output) {
		setName(output.name().getText());
		setArray(output.fields()!=null);
		if(array) {
			setHasFields(output.fields().fieldparams()!=null);
			if(hasFields) {
				List<String> fieldList = new ArrayList<String>();
				output.fields().fieldparams().value().forEach(v->{
					fieldList.add(v.getText());
				});
				setFields(fieldList);
			}
		}else {
			setHasFields(output.field()!=null && output.field().fieldparams()!=null);
			if(hasFields) {
				List<String> fieldList = new ArrayList<String>();
				output.field().fieldparams().value().forEach(v->{
					fieldList.add(v.getText());
				});
				setFields(fieldList);
			}
		}
	}
	
}