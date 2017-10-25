package cn.yrfk.arrangedorms.entity;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用的返回的类
 * 
 * @author ly
 * 
 */
public class MsgEntity {
	//状态码   200-成功    500-失败
	private int code;
	//提示信息
	private String msg;
	
	//用户要返回给浏览器的数据
	private Map<String, Object> extend = new HashMap<String, Object>();

	public static MsgEntity success(){
		MsgEntity result = new MsgEntity();
		result.setCode(200);
		result.setMsg("处理成功！");
		return result;
	}


	public static MsgEntity fail(){
		MsgEntity result = new MsgEntity();
		result.setCode(500);
		result.setMsg("处理失败！");
		return result;
	}
	
	public MsgEntity add(String key, Object value){
		this.getExtend().put(key, value);
		return this;
	}
	
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

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}
	
	
}
