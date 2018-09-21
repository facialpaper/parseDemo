package com.pactera.parseDemo.exception;

/**
 * 
 ************类说明**************
 * 类名：DBException
 * 建类时间：2018年9月21日 上午10:26:07
 * 类描述：数据库连接异常
 */
public class DBException extends RuntimeException{

	private static final long serialVersionUID = -5588025121452725145L;

	public DBException(String message, Throwable cause) {
		super(message, cause);
	}

	public DBException(String message) {
		super(message);
	}

	public DBException(Throwable cause) {
		super(cause);
	}
}
