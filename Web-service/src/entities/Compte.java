package entities;

import java.util.Date;

public class Compte {
	private long code;
	private double solde;
	private Date date;
	public Compte(long code, double solde, Date date) {
		super();
		this.code = code;
		this.solde = solde;
		this.date = date;
	}
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
