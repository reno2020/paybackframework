package com.reno.service.impl;

import com.reno.common.CommonResponse;
import com.reno.common.Constant;
import com.reno.common.PrintHelper;
import com.reno.service.IPayCallback;

/**
 * 
 * @ClassName: PayCallback
 * @Description:TODO(支付回调抽象类)
 * @author: reno
 * @date: 2017年5月22日 下午2:55:55
 * 
 * @param <O>
 *            Order
 * @param <P>
 *            PayRequest
 * @param <H>
 *            PayHead
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public abstract class PayCallback<O, P, H> implements IPayCallback<O, P, H> {

	/**
	 * 订单上下文
	 */
	public O orderContext;
	/**
	 * 支付请求上下文
	 */
	public P payRequestContext;
	/**
	 * 支付头部上下文
	 */
	public H payHeadContext;

	/**
	 * 
	 * @Title: InitContext
	 * @Description: TODO(支付回调初始化操作)
	 * @param: @return
	 * @return: CommonResponse
	 * @throws
	 */
	public abstract CommonResponse InitContext();

	/**
	 * 
	 * @Title: ExecuteCallback
	 * @Description: TODO(支付回调操作)
	 * @param: @return
	 * @return: CommonResponse
	 * @throws
	 */

	public abstract CommonResponse ExecuteCallback();

	/**
	 * 
	 * @Title: AfterCallback
	 * @Description: TODO(支付回调后续操作)
	 * @param: @param t
	 * @return: void
	 * @throws
	 */
	public void AfterCallback(P p) {
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType, "===PayCallback AfterCallback Start===");
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"PayCallback AfterCallback P:" + p.toString());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===PayCallback AfterCallback End===");
	}

	/**
	 * 
	 * @Title: RequestFieldValidate
	 * @Description: TODO(支付请求检查)
	 * @param: @return
	 * @return: CommonResponse
	 * @throws
	 */
	public abstract CommonResponse RequestFieldValidate();

	/**
	 * 
	 * @Title: PayCallback
	 * @Description: TODO(构造方法)
	 * @param:
	 * @throws
	 */
	protected PayCallback() {
	}

	/**
	 * 
	 * @Title: PayCallback
	 * @Description: TODO(构造方法)
	 * @param: @param o
	 * @throws
	 */
	protected PayCallback(O o) {
		this.orderContext = o;
	}

	/**
	 * 
	 * @Title: PayCallback
	 * @Description: TODO(构造方法)
	 * @param: @param o
	 * @param: @param p
	 * @param: @param h
	 * @throws
	 */
	protected PayCallback(O o, P p, H h) {
		this.orderContext = o;
		this.payRequestContext = p;
		this.payHeadContext = h;
	}

	/**
	 * 
	 * <p>
	 * Title: Execute
	 * </p>
	 * <p>
	 * Description: 支付回调方法
	 * </p>
	 * 
	 * @return
	 * @see com.reno.service.IPayCallback#Execute()
	 */
	public CommonResponse Execute() {
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===PayCallback Execute Start===");
		CommonResponse result = new CommonResponse();

		/**
		 * 支付请求验证
		 */
		result = RequestFieldValidate();
		if (!result.getIsSuccess()) {
			result.setMessage("请求参数错误，错误信息");
			result.setCode(1);
			return result;
		}

		/**
		 * 支付请求初始化
		 */
		result = InitContext();
		if (!result.getIsSuccess()) {
			return result;
		}

		/**
		 * 支付请求处理
		 */
		result = ExecuteCallback();

		/**
		 * 支付请求后续处理
		 */
		AfterCallback(payRequestContext);

		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===PayCallback Execute End===");
		return result;
	}

}
