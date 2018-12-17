package edu.mum.m2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name="tranId")
	private String tranId;
	
	@Column(name="refTranId")
	private String refTranId;

	@Column()
	private String clientName;

	@Column()
	private String accountNo;

	@Column()
	@Temporal(TemporalType.TIMESTAMP)
	private Date tranTime;
	
	@Column()
	@Temporal(TemporalType.TIMESTAMP)
	private Date postingTime;

	@Column()
	private String description;

	@Column()
	private double amount;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTranId() {
		return tranId;
	}

	public void setTranId(String tranId) {
		this.tranId = tranId;
	}

	public String getRefTranId() {
		return refTranId;
	}

	public void setRefTranId(String refTranId) {
		this.refTranId = refTranId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Date getTranTime() {
		return tranTime;
	}

	public void setTranTime(Date tranTime) {
		this.tranTime = tranTime;
	}
	
	public Date getPostingTime() {
		return postingTime;
	}

	public void setPostingTime(Date postingTime) {
		this.postingTime = postingTime;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
