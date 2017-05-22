package com.reno.model;

/**
 * 
 * @ClassName: OrderEntity
 * @Description:TODO(订单类)
 * @author: reno
 * @date: 2017年5月22日 下午2:13:27
 * 
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class OrderEntity {

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
	 * 支付流水号
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

}
