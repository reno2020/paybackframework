package com.reno.service;

import com.reno.common.CommonResponse;

/**
 * 
 * @ClassName: IPayCallback
 * @Description:TODO(支付回调抽象接口)
 * @author: reno
 * @date: 2017年5月22日 下午2:33:51
 * 
 * @param <O>
 * @param <P>
 * @param <R>
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public interface IPayCallback<O, P, R> {

	/**
	 * 
	 * @Title: Execute   
	 * @Description: TODO(支付回调执行方法)   
	 * @param: @return      
	 * @return: CommonResponse      
	 * @throws
	 */
	public CommonResponse Execute();

}
