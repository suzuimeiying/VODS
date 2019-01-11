package com.qfedu.app.vo;


public class JsonVo {
	private int code;
	private String msg;
	private Object data;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}


	public static JsonVo setOK(Object data) {
		JsonVo rvo=new JsonVo();
		rvo.setCode(1);
		rvo.setMsg("OK");
		rvo.setData(data);
		return rvo;
	}
	public static JsonVo setERROR() {
		JsonVo rvo=new JsonVo();
		rvo.setCode(0);
		rvo.setMsg("ERROR");
		return rvo;
	}
	
	
	
}
