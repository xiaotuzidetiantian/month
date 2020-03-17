package com.wuxufang.month.pojo;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 
 * @author 煜   测评表
 *
 */

@Document(indexName = "month",type = "driver")
public class Driver implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Field(store = true,index = true,type = FieldType.Integer)
	private Integer sid;
	@Field(store = true,index = true,type = FieldType.Text,analyzer = "ik_smart")
	@NotBlank(message = "不能为空")
	private String movie;
	@Field(store = true,index = true,type = FieldType.Text,analyzer = "ik_smart")
	@NotBlank(message = "不能为空")
	private String title;
	@Field(store = true,index = true,type = FieldType.Text,analyzer = "ik_smart")
	@NotBlank(message = "不能为空")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date cdate;
	
	private Date d1;
	private Date d2;
	@Field(store = true,index = true,type = FieldType.Integer)
	@NotBlank(message = "不能为空")
	private Integer tid;
	
	private String tname;

	@Override
	public String toString() {
		return "Driver [sid=" + sid + ", movie=" + movie + ", title=" + title + ", cdate=" + cdate + ", tid=" + tid
				+ ", tname=" + tname + "]";
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

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

	public Date getD1() {
		return d1;
	}

	public void setD1(Date d1) {
		this.d1 = d1;
	}

	public Date getD2() {
		return d2;
	}

	public void setD2(Date d2) {
		this.d2 = d2;
	}
	
}
