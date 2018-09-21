package com.pactera.parseDemo.exception;

/**
 * 
 ************类说明**************
 * 类名：SQLExtractException
 * 建类时间：2018年9月21日 下午2:13:17
 * 类描述：
 */
public class SQLExtractException extends RuntimeException{

	private static final long serialVersionUID = -5588025121452725145L;

	public SQLExtractException(String message, Throwable cause) {
		super(message, cause);
	}

	public SQLExtractException(String message) {
		super(message);
	}

	public SQLExtractException(Throwable cause) {
		super(cause);
	}
}
