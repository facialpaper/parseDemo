package com.pactera.parseDemo.exception;

/**
 * 
 ************类说明**************
 * 类名：UnSupportedException
 * 建类时间：2018年9月20日 下午5:25:15
 * 类描述：不支持解析异常
 */
public class UnSupportedException extends RuntimeException{

	private static final long serialVersionUID = -5588025121452725145L;

	public UnSupportedException(String message, Throwable cause) {
		super(message, cause);
	}

	public UnSupportedException(String message) {
		super(message);
	}

	public UnSupportedException(Throwable cause) {
		super(cause);
	}
}
