package edu.mum.m2.model;

import javax.persistence.*;

@Entity
public class MonthlyStatment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column
	private String forMonth;



	@Column
	private String clientName;

	@Column
	private double totalAmount;
	
	//added
	@Column()
	private String accountNo;

	public MonthlyStatment() {
		// TODO Auto-generated constructor stub
	}
	public String getForMonth() {
		return forMonth;
	}

	public void setForMonth(String forMonth) {
		this.forMonth = forMonth;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


}
