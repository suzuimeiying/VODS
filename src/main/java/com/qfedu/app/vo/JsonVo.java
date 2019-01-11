package com.qfedu.app.vo;


<<<<<<< Updated upstream:src/main/java/com/qfedu/app/vo/ResultVo.java
import java.util.HashMap;
import java.util.Map;

public class ResultVo {
=======
public class JsonVo {
>>>>>>> Stashed changes:src/main/java/com/qfedu/app/vo/JsonVo.java
	private int code;
	private String msg;
	private Map<String, Object> data = new HashMap<>();

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

	public Map<String, Object> getData() {
		return data;
	}

	public void setData(Map<String, Object> data) {
		this.data = data;
	}


<<<<<<< Updated upstream:src/main/java/com/qfedu/app/vo/ResultVo.java
	public ResultVo putDataValue(String key, Object value) {
		data.put(key, value);
		return this;
	}

	private ResultVo(int code, String message) {
		this.code = code;
		this.msg = message;
	}

	public static ResultVo setOK() {
		return new ResultVo(1, "Ok");
	}
	public static ResultVo setERROR() {
		return  new ResultVo(0, "ERROR");
=======
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
>>>>>>> Stashed changes:src/main/java/com/qfedu/app/vo/JsonVo.java
	}
	
	
	
}
