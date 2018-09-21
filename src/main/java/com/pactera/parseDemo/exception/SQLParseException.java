package com.pactera.parseDemo.exception;

/**
 * 
 ************类说明**************
 * 类名：SQLParseException
 * 建类时间：2018年9月21日 上午9:12:18
 * 类描述：sql解析异常
 */
public class SQLParseException extends RuntimeException{

	private static final long serialVersionUID = -5588025121452725145L;

	public SQLParseException(String message, Throwable cause) {
		super(message, cause);
	}

	public SQLParseException(String message) {
		super(message);
	}

	public SQLParseException(Throwable cause) {
		super(cause);
	}
}
