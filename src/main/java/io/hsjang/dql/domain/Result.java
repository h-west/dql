package io.hsjang.dql.domain;

import java.util.HashMap;

import io.hsjang.dql.model.ResultCode;

public class Result extends HashMap<String, Object> {

	private static final long serialVersionUID = 1L;

	String KEY_CODE = "code";
	String KEY_DATA = "data";
	String KEY_MESSAGE = "msg";
	Data data = new Data();

	public Result() {
		this(ResultCode.OK);
	}

	public Result(ResultCode code) {
		super();
		init(code);
	}

	public Result(String k, Object v) {
		this(ResultCode.OK, k, v);
	}

	public Result(Data data) {
		this(ResultCode.OK, data);
	}

	public Result(ResultCode code, String k, Object v) {
		super();
		init(code);
		addData(k, v);
	}

	public Result(ResultCode code, Data data) {
		super();
		init(code);
		addData(data);
	}

	private void init(ResultCode code) {
		put(KEY_CODE, code.getCode());
		put(KEY_MESSAGE, code.getMessage());
		put(KEY_DATA, this.data);
	}

	public void addData(String k, Object v) {
		this.data.put(k, v);
	}

	public void addData(Data data) {
		this.data.putAll(data);
	}
	
	public Result mergeResultData(Result r) {
		addData(r.getData());
		return this;
	}

	public Data getData() {
		return this.data;
	}
}
