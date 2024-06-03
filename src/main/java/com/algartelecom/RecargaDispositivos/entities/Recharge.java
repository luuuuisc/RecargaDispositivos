package com.algartelecom.RecargaDispositivos.entities;

import java.time.Instant;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_recharge")
public class Recharge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Double amount;
    
    private Instant moment;

    private StatusRecharge statusRecharge;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToOne
    @MapsId
    private Payment payment;



    public Recharge () {
    	
    }

	public Recharge(Long id, Client client, Payment payment, Double amount, Instant moment,
			StatusRecharge statusRecharge) {
		this.id = id;
		this.client = client;
		this.payment = payment;
		this.amount = amount;
		this.moment = moment;
		this.statusRecharge = statusRecharge;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public StatusRecharge getStatusRecharge() {
		return statusRecharge;
	}

	public void setStatusRecharge(StatusRecharge statusRecharge) {
		this.statusRecharge = statusRecharge;
	}
	
	
    
    
}
