package com.mkyong.model;

public class Report {
	private String id;
	private String docnum;
	private String pubdate;
	private String appldate;
	private String classipcr;
	private String title;
	private String pabstract;
	private String applicant;
	private String address;
	private String inventor;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDocnum() {
		return docnum;
	}
	public void setDocnum(String docnum) {
		this.docnum = docnum;
	}
	public String getPubdate() {
		return pubdate;
	}
	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}
	public String getAppldate() {
		return appldate;
	}
	public void setAppldate(String appldate) {
		this.appldate = appldate;
	}
	public String getClassipcr() {
		return classipcr;
	}
	public void setClassipcr(String classipcr) {
		this.classipcr = classipcr;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getApplicant() {
		return applicant;
	}
	public void setApplicant(String applicant) {
		this.applicant = applicant;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getInventor() {
		return inventor;
	}
	public void setInventor(String inventor) {
		this.inventor = inventor;
	}
	@Override
	public String toString() {
		return "IventionPatent [id=" + id + ", docnum=" + docnum + ", pubdate=" + pubdate + ", appldate=" + appldate
				+ ", classipcr=" + classipcr + ", title=" + title + ", paastract=" + pabstract + ", applicant="
				+ applicant + ", address=" + address + ", inventor=" + inventor + "]";
	}
	public String getPabstract() {
		return pabstract;
	}
	public void setPabstract(String pabstract) {
		this.pabstract = pabstract;
	}

}
