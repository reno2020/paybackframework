package com.reno.service;

import com.reno.common.CommonResponse;
import com.reno.service.impl.CommonPayCallback;

/**
 * 
 * @ClassName: IExecutePayCallback
 * @Description:TODO(支付请求回调接口)
 * @author: reno
 * @date: 2017年5月22日 下午2:39:32
 * 
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface IExecutePayCallback {

	/**
	 * 支付回调执行类
	 */
	CommonPayCallback commonPayCallback = new CommonPayCallback();

	/**
	 * 
	 * @Title: BeforExecutePayCallback
	 * @Description: TODO(启动支付回调操作前置方法)
	 * @param: @return
	 * @return: CommonResponse
	 * @throws
	 */
	CommonResponse BeforeExecutePayCallback();

	/**
	 * 
	 * @Title: ExecutePayCallback
	 * @Description: TODO(启动支付回调操作)
	 * @param: @return
	 * @return: CommonResponse
	 * @throws
	 */
	CommonResponse ExecutePayCallback();

	/**
	 * 
	 * @Title: AfterExecutePayCallback
	 * @Description: TODO(启动支付回调操作后置方法)
	 * @param:
	 * @return: void
	 * @throws
	 */
	void AfterExecutePayCallback();

}
