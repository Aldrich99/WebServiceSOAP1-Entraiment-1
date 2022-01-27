package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BanqueEntity implements Serializable {

	public BanqueEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	private static final long serialVersionUID = -7501297620486962478L;
	private long code;
	private double montant;
	private Date timeStamps;
	public BanqueEntity(long code, double montant, Date timeStamps) {
		super();
		this.code = code;
		this.montant = montant;
		this.timeStamps = timeStamps;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public Date getTimeStamps() {
		return timeStamps;
	}
	public void setTimeStamps(Date timeStamps) {
		this.timeStamps = timeStamps;
	}

}
