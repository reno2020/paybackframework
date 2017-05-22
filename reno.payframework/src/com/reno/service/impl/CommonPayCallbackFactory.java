package com.reno.service.impl;

import com.reno.common.PayType;
import com.reno.service.IExecutePayCallback;

/**
 * 
 * @ClassName: CommonPayCallbackFactory
 * @Description:TODO(支付请求工厂)
 * @author: reno
 * @date: 2017年5月22日 下午3:21:10
 * 
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CommonPayCallbackFactory {

	/**
	 * 
	 * @Title: CreateExecutePayCallback
	 * @Description: TODO(支付请求工厂方法)
	 * @param: @param payCallback
	 * @param: @return
	 * @return: IExecutePayCallback
	 * @throws
	 */
	public static IExecutePayCallback CreateExecutePayCallback(CommonPayCallback payCallback) {
		IExecutePayCallback instance = null;
		if (payCallback.getOrderType().equals(PayType.order.toString())) {
			instance = new OrderPayCallback(payCallback);
		} else if (payCallback.getOrderType().equals(
				PayType.invoice.toString())) {
			instance = new InvoicePayCallback(payCallback);
		}
		return instance;
	}

}
