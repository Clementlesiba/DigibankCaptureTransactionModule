 package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean(name="capturetransactionmodule")
@SessionScoped


public class CaptureTransactionModule {
   private String name;
   private String sourcePassport;
   private String destinationPassport;
   private String destinationBank;
   private String destationCountry;
   private String accountNumber;
   private String amount;
   private String transactionCode;
   
   
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSourcePassport() {
	return sourcePassport;
}
public void setSourcePassport(String sourcePassport) {
	this.sourcePassport = sourcePassport;
}
public String getDestinationPassport() {
	return destinationPassport;
}
public void setDestinationPassport(String destinationPassport) {
	this.destinationPassport = destinationPassport;
}
public String getDestinationBank() {
	return destinationBank;
}
public void setDestinationBank(String destinationBank) {
	this.destinationBank = destinationBank;
}
public String getDestationCountry() {
	return destationCountry;
}
public void setDestationCountry(String destationCountry) {
	this.destationCountry = destationCountry;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
} 
public String getAmount() {
	return amount;
}
public void setAmount(String amount) {
	amount = amount;
}
public String getTransactionCode() {
	return transactionCode;
}
public void setTransactionCode(String transactionCode) {
	this.transactionCode = transactionCode;
}
public CapturetransactionEntity getEntity()
{  
	CapturetransactionEntity capturetransactionEntity = new CapturetransactionEntity();
	capturetransactionEntity.setName(name);
	capturetransactionEntity.setSourcePassport(sourcePassport);
	capturetransactionEntity.setDestinationPassport(destinationPassport);
	capturetransactionEntity.setDestinationBank(destinationBank);
	capturetransactionEntity.setDestationCountry(destationCountry);
	capturetransactionEntity.setAccountNumber(accountNumber);
	capturetransactionEntity.setAmount(amount);

	return capturetransactionEntity;
}
   
}
