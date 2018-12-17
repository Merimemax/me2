package edu.mum.m2.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DailyTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "tranId")
	private String tranId;
	
	@JoinColumn(name = "clientId", nullable = false)
	@ManyToOne(optional = false)
	private Client client;

	@JoinColumn(name = "accountId", nullable = false)
	@ManyToOne(optional = false)
	private Account account;

	@Column()
	@Temporal(TemporalType.TIMESTAMP)
	private Date tranTime;

	@Column(name = "description")
	private String description;

	@Column(name = "amount")
	private double amount;

	public DailyTransaction() {
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Date getTranTime() {
		return tranTime;
	}

	public void setTranTime(Date tranTime) {
		this.tranTime = tranTime;
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
