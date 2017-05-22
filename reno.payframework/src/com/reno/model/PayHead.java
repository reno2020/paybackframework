package com.reno.model;

/**
 * 
 * @ClassName: PayHead
 * @Description:TODO(支付头部请求类)
 * @author: reno
 * @date: 2017年5月22日 下午2:20:08
 * 
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PayHead {

	/**
	 * 支付请求操作系统平台 windows，linux，android，ios，h5
	 */
	private String osType;
	/**
	 * 浏览器类型 ie，firefox，chorm
	 */
	private String browserType;

	public String getOsType() {
		return osType;
	}

	public void setOsType(String osType) {
		this.osType = osType;
	}

	public String getBrowserType() {
		return browserType;
	}

	public void setBrowserType(String browserType) {
		this.browserType = browserType;
	}

}
