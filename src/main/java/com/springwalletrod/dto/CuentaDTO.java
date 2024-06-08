package com.springwalletrod.dto;

public class CuentaDTO {
	private Integer numeroCuenta;
	private Double saldoActual;
	
	
	public CuentaDTO(Integer numeroCuenta, Double saldoActual) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldoActual = saldoActual;
	}
	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}
	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	public Double getSaldoActual() {
		return saldoActual;
	}
	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}
	
	
}
