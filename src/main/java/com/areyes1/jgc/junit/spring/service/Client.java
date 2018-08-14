package com.areyes1.jgc.junit.spring.service;

public class Client {
	
	private String clientType;
	private String clientNumber;
	private String accountNumber;
	private String subAccountNumber;
	private String exchangeCode;
	private String productGroupCode;
	private String symbol;
	private String expirationDate;

	public String getExchangeCode() {
		return exchangeCode;
	}

	public void setExchangeCode(String exchangeCode) {
		this.exchangeCode = exchangeCode;
	}

	public String getProductGroupCode() {
		return productGroupCode;
	}

	public void setProductGroupCode(String productGroupCode) {
		this.productGroupCode = productGroupCode;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getClientType() {
		return clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(String clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSubAccountNumber() {
		return subAccountNumber;
	}

	public void setSubAccountNumber(String subAccountNumber) {
		this.subAccountNumber = subAccountNumber;
	}

	@Override
	public String toString() {
		return "AccountNumber = " + this.getAccountNumber() + "  ClientNumber = " + this.getClientNumber()
				+ "   ClientType = " + this.getClientType() + "   ExchangeCode = " + this.getExchangeCode()
				+ "  ExpirationDate = " + this.getExpirationDate() + "  ProductGroupCode = "
				+ this.getProductGroupCode() + "  SubAccountNumber = " + this.getSubAccountNumber() + "  Symbol = "
				+ this.getSymbol();
	}

}
