package com.javalec.spring_board.dto;

import java.sql.Timestamp;

public class BDto {
	// 데이터 베이스 객체를 java 객체로 변경 하는 부분 
	
	// DB 속성 
	int bid;
	String bName;
	String bTit; 
	Timestamp bDate;
	int bHit;
	int bGroup;
	int bStep;
	int bIndent;
	
	public BDto() {
		
	}
	
	
	public BDto(int bid, String bName, String bTit, Timestamp bDate, int bHit, int bGroup, int bStep, int bIndent)  {
		
		this.bid = bid;
		this.bName = bName;
		this.bTit = bTit;
		this.bDate = bDate;
		this.bHit = bHit;
		this.bGroup = bGroup;
		this.bStep = bStep;
		this.bIndent = bIndent;

	}
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	public String getbTit() {
		return bTit;
	}
	public void setbTit(String bTit) {
		this.bTit = bTit;
	}
	public Timestamp getbDate() {
		return bDate;
	}
	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}
	public int getbHit() {
		return bHit;
	}
	public void setbHit(int bHit) {
		this.bHit = bHit;
	}
	public int getbGroup() {
		return bGroup;
	}
	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}
	public int getbStep() {
		return bStep;
	}
	public void setbStep(int bStep) {
		this.bStep = bStep;
	}
	public int getbIndent() {
		return bIndent;
	}
	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}
	
	
}
