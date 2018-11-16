package io.hsjang.dql.common.exception;

import io.hsjang.dql.model.ResultCode;

public class DqlException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	ResultCode code;

	public DqlException(ResultCode code) {
		super(code.getMessage());
		this.code = code;
	}

	public ResultCode getResultCode() {
		return this.code;
	}

}
