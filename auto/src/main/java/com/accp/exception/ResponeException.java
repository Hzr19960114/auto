package com.accp.exception;

public class ResponeException<T>{
	
	private String cote;//错误码
	
	private String msg;//错误码信息
	
	private T t;//错误码对象
	
	public ResponeException() {
		// TODO Auto-generated constructor stub
	}

	
	public ResponeException(String cote, String msg, T t) {
		super();
		this.cote = cote;
		this.msg = msg;
		this.t = t;
	}



	public String getCote() {
		return cote;
	}

	public void setCote(String cote) {
		this.cote = cote;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
