package com.reno.common;

/**
 * 
 * @ClassName: CommonResponse
 * @Description:TODO(请求返回类)
 * @author: reno
 * @date: 2017年5月22日 下午1:00:25
 * 
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CommonResponse {

	/**
	 * 状态码 0：正常，-1：异常； 大于0表示业务逻辑错误，例如未查询到数据，数组为空等 小于0表示程序异常，例如数组越界，空指针等
	 */
	private Integer code;
	/**
	 * 请求执行成功标志 true：请求执行成功，code>=0的情况都为true false：请请求执行异常，code<0的情况都为false
	 */
	private boolean isSuccess;
	/**
	 * 请求执行返回的消息 只有在code>=0的情况的情况下，可为空。code<0的情况必须写入原因
	 */
	private String message;
	/**
	 * 请求返回的实体 用于相关数据的返回，供调用端接收处理
	 */
	private Object obj;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

}
