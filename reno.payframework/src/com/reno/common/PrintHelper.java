package com.reno.common;

import com.sun.corba.se.impl.orbutil.closure.Constant;

/**
 * 
 * @ClassName: PrintHelper
 * @Description:TODO(这里用一句话描述这个类的作用)
 * @author: reno
 * @date: 2017年5月22日 下午3:56:50
 * 
 * @Copyright: 2017 reno. All rights reserved.
 *             注意：本内容仅限于reno公司内部传阅，禁止外泄以及用于其他的商业目的
 */
public class PrintHelper {

	private Integer showType;
	private boolean isShow;

	public PrintHelper(Integer showType, boolean isShow) {
		this.showType = showType;
		this.isShow = isShow;
	}

	/**
	 * 
	 * @Title: showMessage
	 * @Description: TODO(显示方法)
	 * @param: @param isShow
	 * @param: @param showType
	 * @param: @param message
	 * @param: @return
	 * @return: Integer
	 * @throws
	 */
	public static Integer showMessage(boolean isShow, Integer showType,
			String message) {
		Integer result = 0;
		if (!isShow) {
			return result;
		}

		// showType 1：控制台，2：日志文本，3：数据库
		if (showType == 1) {
			System.out.println(message);
		} else if (showType == 2) {
			// file
		} else if (showType == 3) {
			// db
		}

		return result;
	}

	public Integer getShowType() {
		return showType;
	}

	public void setShowType(Integer showType) {
		this.showType = showType;
	}

	public boolean getIsShow() {
		return isShow;
	}

	public void setIsShow(boolean isShow) {
		this.isShow = isShow;
	}

}
