package com.reno.test;

import com.reno.common.PayType;
import com.reno.model.PayHead;
import com.reno.model.PayRequest;
import com.reno.service.impl.CommonPayCallback;

public class PayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		PayHead payHead = new PayHead();
		payHead.setOsType("windows");
		
		PayRequest payRequest = new PayRequest();
		payRequest.setOrderNumber("AAAA-BBBB_CCCC");
		payRequest.setOrderSource("APP");
		
		
		payRequest.setPayId("FFFF-OOOO-PPPP");
		payRequest.setPayBillId("2017052211111111");
		payRequest.setPayCode(0);
		payRequest.setPayDescription("中国银行扣款成功");
		payRequest.setPayMerchantId("jd");
		payRequest.setPayStatus("success");
		payRequest.setPayWay("CB");
		
		
		
//		payRequest.setOrderType(PayType.order.toString());
//		payRequest.setOrderPaidAmount(10000L);
//		payRequest.setOrderPaidTime("2017-05-22 10:00:00");
		
		payRequest.setOrderType(PayType.invoice.toString());
		payRequest.setInvoicePaidAmount(10L);
		payRequest.setInvoicePaidTime("2017-05-22 11:10:00");
		

		new CommonPayCallback(payRequest,payHead).Execute();
		
		
		
		
	}

}
