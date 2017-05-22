package com.reno.model;

/**
 * 
 * @ClassName: PayRequest
 * @Description:TODO(支付请求类)
 * @author: reno
 * @date: 2017年5月22日 下午2:38:35
 * 
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PayRequest {

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

}
