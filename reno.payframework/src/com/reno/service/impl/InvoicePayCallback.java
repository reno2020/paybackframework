package com.reno.service.impl;

import com.reno.common.CommonResponse;
import com.reno.common.Constant;
import com.reno.common.PrintHelper;
import com.reno.service.IExecutePayCallback;

/**
 * 
 * @ClassName: InvoicePayCallback
 * @Description:TODO(发票支付回调类)
 * @author: reno
 * @date: 2017年5月22日 下午3:37:33
 * 
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class InvoicePayCallback implements IExecutePayCallback {

	/**
	 * 通用支付回调类
	 */
	private CommonPayCallback commonPayCallback;

	public CommonPayCallback getCommonPayCallback() {
		return commonPayCallback;
	}

	public void setCommonPayCallback(CommonPayCallback commonPayCallback) {
		this.commonPayCallback = commonPayCallback;
	}

	public InvoicePayCallback(CommonPayCallback commonPayCallback) {
		this.commonPayCallback = commonPayCallback;
	}

	/**
	 * 
	 * <p>Title: BeforExecutePayCallback</p>   
	 * <p>Description: 发票支付回调前置处理方法</p>   
	 * @return   
	 * @see com.reno.service.IExecutePayCallback#BeforExecutePayCallback()
	 */
	@Override
	public CommonResponse BeforeExecutePayCallback() {
		//用于Invoice特殊需求的验证，数据初始化等
	    PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===InvoicePayCallback BeforeExecutePayCallback Start===");
		CommonResponse response = new CommonResponse();
		response.setCode(0);
		response.setIsSuccess(true);
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===InvoicePayCallback BeforeExecutePayCallback End===");
		return response;
	}

	/**
	 * 
	 * <p>Title: ExecutePayCallback</p>   
	 * <p>Description:发票支付回调方法 </p>   
	 * @return   
	 * @see com.reno.service.IExecutePayCallback#ExecutePayCallback()
	 */
	@Override
	public CommonResponse ExecutePayCallback() {
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===InvoicePayCallback ExecutePayCallback Start===");

		CommonResponse response = new CommonResponse();
		response.setCode(0);
		response.setIsSuccess(true);
		
		response = BeforeExecutePayCallback();
		if(!response.getIsSuccess()){
			return response;
		}

		//you bussiness logic
		
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"OrderPaidAmount="+commonPayCallback.getOrderPaidAmount());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"OrderPaidTime="+commonPayCallback.getOrderPaidTime());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"InvoicePaidAmount="+commonPayCallback.getInvoicePaidAmount());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"InvoicePaidTime="+commonPayCallback.getInvoicePaidTime());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"orderContext.OrderNumber="+commonPayCallback.orderContext.getOrderNumber());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"payRequestContext.PayStatus="+commonPayCallback.payRequestContext.getPayStatus());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"payRequestContext.PayWay="+commonPayCallback.payRequestContext.getPayWay());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"payRequestContext.PayDescription="+commonPayCallback.payRequestContext.getPayDescription());
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"payHeadContext.OsType="+commonPayCallback.payHeadContext.getOsType());
		
		
		
		if (response.getIsSuccess()) {
			AfterExecutePayCallback();
		}
		
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===InvoicePayCallback ExecutePayCallback End===");
		return response;
	}

	/**
	 * 
	 * <p>Title: AfterExecutePayCallback</p>   
	 * <p>Description: 发票支付回调后续处理</p>      
	 * @see com.reno.service.IExecutePayCallback#AfterExecutePayCallback()
	 */
	@Override
	public void AfterExecutePayCallback() {
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===InvoicePayCallback AfterExecutePayCallback Start===");
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===InvoicePayCallback AfterExecutePayCallback End===");
	}

}
