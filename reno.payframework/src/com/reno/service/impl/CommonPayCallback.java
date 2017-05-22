package com.reno.service.impl;

import com.reno.common.CommonResponse;
import com.reno.common.Constant;
import com.reno.common.PrintHelper;
import com.reno.model.OrderEntity;
import com.reno.model.PayHead;
import com.reno.model.PayRequest;

/**
 * 
 * @ClassName:  CommonPayCallback   
 * @Description:TODO(支付回调外部调用类)   
 * @author: reno 
 * @date:   2017年5月22日 下午3:00:20   
 *     
 * @Copyright: 2017 reno. All rights reserved. 
 * 注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class CommonPayCallback extends PayCallback<OrderEntity, PayRequest, PayHead> {

	/**
	 * 订单主键
	 */
	private Integer oderId;
	/**
	 * 订单编号，用户下单的编号
	 */
	private String orderNumber;
	/**
	 * 订单来源：Online，APP，H5，Offline
	 */
	private String orderSource;
	/**
	 * 订单支付类型 order：订单；invoice：发票
	 */
	private String orderType;

	/**
	 * 订单金额
	 */
	private double orderAmount;
	/**
	 * 下单时间
	 */
	private String orderTime;
	/**
	 * 订单实际支付金额
	 */
	private double orderPaidAmount;
	/**
	 * 订单实际支付时间
	 */
	private String orderPaidTime;

	/**
	 * 发票金额
	 */
	private double invoiceAmount;
	/**
	 * 发票时间
	 */
	private String invoiceTime;
	/**
	 * 发票实际支付金额
	 */
	private double invoicePaidAmount;
	/**
	 * 发票实际支付时间
	 */
	private String invoicePaidTime;

	/**
	 * 支付流水号 guid
	 */
	private String payId;
	/**
	 * 支付记录号
	 */
	private String payBillId;
	/**
	 * 商家号
	 */
	private String payMerchantId;
	/**
	 * 支付状态码 0：成功支付，1：支付成功，等待银行回复，-1：支付失败
	 */
	private Integer payCode;
	/**
	 * 支付状态 success：成功，false：失败
	 */
	private String payStatus;
	/**
	 * 支付方式 Z：支付宝，W：微信，CB：中国银行
	 */
	private String payWay;
	/**
	 * 支付详情描述
	 */
	private String payDescription;
	
	/**
	 * 支付请求操作系统平台 windows，linux，android，ios，h5
	 */
	private String osType;
	/**
	 * 浏览器类型 ie，firefox，chorm
	 */
	
		
	
	/**
	 * 
	 * @Title:  CommonPayCallback   
	 * @Description:    TODO(构造方法)   
	 * @param:    
	 * @throws
	 */
	public CommonPayCallback() {
		super();
	}

	/**
	 * 
	 * @Title:  CommonPayCallback   
	 * @Description:    TODO(构造方法)   
	 * @param:  @param o  
	 * @throws
	 */
	public CommonPayCallback(OrderEntity o) {
		super(o);
	}

	/**
	 * 
	 * @Title:  CommonPayCallback   
	 * @Description:    TODO(构造方法)   
	 * @param:  @param pay  
	 * @throws
	 */
	public CommonPayCallback(PayRequest pay,PayHead payhead) {
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===CommonPayCallback  Start===");
		
		this.payRequestContext = pay;
		
		this.payHeadContext=payhead;
		
		
		
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===CommonPayCallback  End===");
	}

	/**
	 * 
	 * <p>Title: RequestFieldValidate</p>   
	 * <p>Description: 数据验证</p>   
	 * @return   
	 * @see com.reno.service.impl.PayCallback#RequestFieldValidate()
	 */
	@Override
	public CommonResponse RequestFieldValidate() {
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===CommonPayCallback  RequestFieldValidate Start===");
		CommonResponse response = new CommonResponse();
		response.setIsSuccess(true);
		response.setCode(0);
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===CommonPayCallback  RequestFieldValidate End===");
		return response;
	}
	
    /**
     * 
     * <p>Title: InitContext</p>   
     * <p>Description: 支付请求初始化方法</p>   
     * @return   
     * @see com.reno.service.impl.PayCallback#InitContext()
     */
	@Override
	public CommonResponse InitContext() {

		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===CommonPayCallback  InitContext Start===");
		

		CommonResponse response = new CommonResponse();
		response.setCode(0);
		response.setIsSuccess(true);
		
		//相应的数据初始化，包含从PayRequest中获取数据初始化到Order中，并从数据库中查询更加详细的Order信息
		this.orderContext = new OrderEntity();
		this.orderContext.setOrderNumber(this.payRequestContext.getOrderNumber());
		this.orderContext.setOrderSource(this.payRequestContext.getOrderSource());
		this.orderContext.setOrderType(this.payRequestContext.getOrderType());
		this.orderContext.setOrderPaidAmount(this.payRequestContext.getOrderPaidAmount());
		this.orderContext.setOrderPaidTime(this.payRequestContext.getOrderPaidTime());
		this.orderContext.setInvoicePaidAmount(this.payRequestContext.getInvoicePaidAmount());
		this.orderContext.setInvoicePaidTime(this.payRequestContext.getInvoicePaidTime());
		this.orderContext.setPayId(this.payRequestContext.getPayId());
		this.orderContext.setPayBillId(this.payRequestContext.getPayBillId());
		this.orderContext.setPayMerchantId(this.payRequestContext.getPayMerchantId());
		
		//TODO:select from order in DB
		
		this.orderNumber = this.payRequestContext.getOrderNumber();
		this.orderSource = this.payRequestContext.getOrderSource();
		this.orderType = this.payRequestContext.getOrderType();
        this.orderPaidAmount=this.payRequestContext.getOrderPaidAmount();
		this.orderPaidTime = this.payRequestContext.getOrderPaidTime();
		this.invoicePaidAmount = this.payRequestContext.getInvoicePaidAmount();
		this.invoicePaidTime = this.payRequestContext.getInvoicePaidTime();
        
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===CommonPayCallback  InitContext End===");
		
		return response;
	}

	/**
	 * 
	 * <p>Title: ExecuteCallback</p>   
	 * <p>Description:支付回调 </p>   
	 * @return   
	 * @see com.reno.service.impl.PayCallback#ExecuteCallback()
	 */
	@Override
	public CommonResponse ExecuteCallback() {
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===CommonPayCallback  ExecuteCallback Start===");
		
		CommonResponse response = new CommonResponse();
		response.setCode(0);
		response.setIsSuccess(true);

		response = CommonPayCallbackFactory.CreateExecutePayCallback(this).ExecutePayCallback();
		
		PrintHelper.showMessage(Constant.isShowMessage, Constant.showType,"===CommonPayCallback  ExecuteCallback End===");
		return response;
	}

	

	public Integer getOderId() {
		return oderId;
	}

	public void setOderId(Integer oderId) {
		this.oderId = oderId;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getOrderSource() {
		return orderSource;
	}

	public void setOrderSource(String orderSource) {
		this.orderSource = orderSource;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderTime() {
		return orderTime;
	}

	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}

	public double getOrderPaidAmount() {
		return orderPaidAmount;
	}

	public void setOrderPaidAmount(double orderPaidAmount) {
		this.orderPaidAmount = orderPaidAmount;
	}

	public String getOrderPaidTime() {
		return orderPaidTime;
	}

	public void setOrderPaidTime(String orderPaidTime) {
		this.orderPaidTime = orderPaidTime;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	public String getInvoiceTime() {
		return invoiceTime;
	}

	public void setInvoiceTime(String invoiceTime) {
		this.invoiceTime = invoiceTime;
	}

	public double getInvoicePaidAmount() {
		return invoicePaidAmount;
	}

	public void setInvoicePaidAmount(double invoicePaidAmount) {
		this.invoicePaidAmount = invoicePaidAmount;
	}

	public String getInvoicePaidTime() {
		return invoicePaidTime;
	}

	public void setInvoicePaidTime(String invoicePaidTime) {
		this.invoicePaidTime = invoicePaidTime;
	}

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}

	public String getPayBillId() {
		return payBillId;
	}

	public void setPayBillId(String payBillId) {
		this.payBillId = payBillId;
	}

	public String getPayMerchantId() {
		return payMerchantId;
	}

	public void setPayMerchantId(String payMerchantId) {
		this.payMerchantId = payMerchantId;
	}

	public Integer getPayCode() {
		return payCode;
	}

	public void setPayCode(Integer payCode) {
		this.payCode = payCode;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

	public String getPayWay() {
		return payWay;
	}

	public void setPayWay(String payWay) {
		this.payWay = payWay;
	}

	public String getPayDescription() {
		return payDescription;
	}

	public void setPayDescription(String payDescription) {
		this.payDescription = payDescription;
	}

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	

	
}
