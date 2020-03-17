package com.wuxufang.month.pojo;

import java.io.Serializable;

/**
 * 
 * @author 煜   类型表
 *
 */

public class Types implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer tid;
	
	private String tname;

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Types [tid=" + tid + ", tname=" + tname + "]";
	}
	
}
