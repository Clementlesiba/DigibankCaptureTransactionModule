package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name ="captureTransactionModule_tbl")
public class CapturetransactionEntity {
 @Id
 @SequenceGenerator(name="seq", initialValue=0013)
 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="seq")
 private Long id;
 
 private String name;
 private String sourcePassport;
 private String destinationPassport;
 private String destinationBank;
 private String destationCountry;
 private String accountNumber;
 private String amount;
 private String transactionCode;
public Long getId() {
	return id;
}
public void setId(Long id ) {
	this.id = id;
}
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
 
 
}
