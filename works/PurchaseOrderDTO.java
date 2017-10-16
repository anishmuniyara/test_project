package com.pos.dto.inventory;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.pos.dto.login.CounterDTO;
import com.pos.dto.masters.AccountHeadDTO;
import com.pos.dto.masters.CurrencyDTO;
import com.pos.dto.masters.UserDTO;
import com.pos.dto.tools.FinancialYearDTO;
import com.pos.entity.AccountHead;
import com.pos.entity.Counter;
import com.pos.entity.CurrencyMaster;
import com.pos.entity.FinancialYear;
import com.pos.entity.PurchaseOrderItems;
import com.pos.entity.User;

public class PurchaseOrderDTO {
	
	private Long orderId;
	private Character status;
	private String remarks;
	private Date orderDate;
	private Date dueDate;
	private Double totalAmount;
	private Double totalDiscountAmount;
	//This is only for non gst transaction
	private Double totalTaxAmount;
	//This is only for non gst transaction
	private Double totalTaxPercentage;
	//This is for amount to display
	private Double totalTaxAmountDisplay;
	private Character taxUnit;
	private Character taxType;
	private Double totalIntegratedTaxAmount;
	private Double totalIntegratedTaxPercentage;
	private Double totalStateTaxAmount;
	private Double totalStateTaxPercentage;
	private Double totalCentralTaxAmount;
	private Double totalCentralTaxPercentage;
	private Double totalCessAmount;
	private Double totalCessPercentage;
	private Double totalExpenseAmount;
	private Double grandTotal;
	private CurrencyDTO currency;
	private AccountHeadDTO supplier;
	private CounterDTO counter;
	private FinancialYearDTO financialYear;
	private UserDTO user;
	private List<ItemDTO> items;
	private Boolean printReceipt;
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Character getStatus() {
		return status;
	}
	public void setStatus(Character status) {
		this.status = status;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getTotalDiscountAmount() {
		return totalDiscountAmount;
	}
	public void setTotalDiscountAmount(Double totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}
	public Double getTotalTaxAmount() {
		return totalTaxAmount;
	}
	public void setTotalTaxAmount(Double totalTaxAmount) {
		this.totalTaxAmount = totalTaxAmount;
	}
	public Double getTotalTaxPercentage() {
		return totalTaxPercentage;
	}
	public void setTotalTaxPercentage(Double totalTaxPercentage) {
		this.totalTaxPercentage = totalTaxPercentage;
	}
	public Character getTaxUnit() {
		return taxUnit;
	}
	public void setTaxUnit(Character taxUnit) {
		this.taxUnit = taxUnit;
	}
	public Character getTaxType() {
		return taxType;
	}
	public void setTaxType(Character taxType) {
		this.taxType = taxType;
	}
	public Double getTotalIntegratedTaxAmount() {
		return totalIntegratedTaxAmount;
	}
	public void setTotalIntegratedTaxAmount(Double totalIntegratedTaxAmount) {
		this.totalIntegratedTaxAmount = totalIntegratedTaxAmount;
	}
	public Double getTotalIntegratedTaxPercentage() {
		return totalIntegratedTaxPercentage;
	}
	public void setTotalIntegratedTaxPercentage(Double totalIntegratedTaxPercentage) {
		this.totalIntegratedTaxPercentage = totalIntegratedTaxPercentage;
	}
	public Double getTotalStateTaxAmount() {
		return totalStateTaxAmount;
	}
	public void setTotalStateTaxAmount(Double totalStateTaxAmount) {
		this.totalStateTaxAmount = totalStateTaxAmount;
	}
	public Double getTotalStateTaxPercentage() {
		return totalStateTaxPercentage;
	}
	public void setTotalStateTaxPercentage(Double totalStateTaxPercentage) {
		this.totalStateTaxPercentage = totalStateTaxPercentage;
	}
	public Double getTotalCentralTaxAmount() {
		return totalCentralTaxAmount;
	}
	public void setTotalCentralTaxAmount(Double totalCentralTaxAmount) {
		this.totalCentralTaxAmount = totalCentralTaxAmount;
	}
	public Double getTotalCentralTaxPercentage() {
		return totalCentralTaxPercentage;
	}
	public void setTotalCentralTaxPercentage(Double totalCentralTaxPercentage) {
		this.totalCentralTaxPercentage = totalCentralTaxPercentage;
	}
	public Double getTotalCessAmount() {
		return totalCessAmount;
	}
	public void setTotalCessAmount(Double totalCessAmount) {
		this.totalCessAmount = totalCessAmount;
	}
	public Double getTotalCessPercentage() {
		return totalCessPercentage;
	}
	public void setTotalCessPercentage(Double totalCessPercentage) {
		this.totalCessPercentage = totalCessPercentage;
	}
	public Double getTotalExpenseAmount() {
		return totalExpenseAmount;
	}
	public void setTotalExpenseAmount(Double totalExpenseAmount) {
		this.totalExpenseAmount = totalExpenseAmount;
	}
	public Double getGrandTotal() {
		return grandTotal;
	}
	public void setGrandTotal(Double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public CurrencyDTO getCurrency() {
		return currency;
	}
	public void setCurrency(CurrencyDTO currency) {
		this.currency = currency;
	}
	public AccountHeadDTO getSupplier() {
		return supplier;
	}
	public void setSupplier(AccountHeadDTO supplier) {
		this.supplier = supplier;
	}
	public CounterDTO getCounter() {
		return counter;
	}
	public void setCounter(CounterDTO counter) {
		this.counter = counter;
	}
	public FinancialYearDTO getFinancialYear() {
		return financialYear;
	}
	public void setFinancialYear(FinancialYearDTO financialYear) {
		this.financialYear = financialYear;
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public List<ItemDTO> getItems() {
		return items;
	}
	public void setItems(List<ItemDTO> items) {
		this.items = items;
	}
	public Boolean getPrintReceipt() {
		return printReceipt;
	}
	public void setPrintReceipt(Boolean printReceipt) {
		this.printReceipt = printReceipt;
	}
	public Double getTotalTaxAmountDisplay() {
		return totalTaxAmountDisplay;
	}
	public void setTotalTaxAmountDisplay(Double totalTaxAmountDisplay) {
		this.totalTaxAmountDisplay = totalTaxAmountDisplay;
	}

	
	
	
	
	
	


}
