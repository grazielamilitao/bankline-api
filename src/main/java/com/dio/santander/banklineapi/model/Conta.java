package com.dio.santander.banklineapi.model;

import javax.persistence.*;

@Embeddable
public class Conta {
	@Column(name = "conta_numero")
	private Long numero;
	@Column(name = "conta_saldo")
	private double saldo;
	
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
