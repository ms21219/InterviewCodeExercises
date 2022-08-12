package com.example.interview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity(name = "NACE")
@Table(name = "NACE")
public class ExerciseModel {

	@Id
	@GeneratedValue
	private long id;
	@Column(name = "Orders")
	private long orders;
	@Column(name = "Level")
	private String level;
	@Column(name = "Code")
	private String code;
	@Column(name = "Parent")
	private String parent;
	@Column(name = "Description")
	private String description;
	@Column(name = "This_item_includes", length = 9000)
	private String itemIncl;
	@Column(name = "This_item_also_includes", length = 2000)
	private String itemAlsoIncl;
	@Column(name = "Rulings")
	private String rulings;
	@Column(name = "This_item_excludes", length = 2000)
	private String itemExcl;
	@Column(name = "Reference_to_ISIC_Rev._4")
	private String reference;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	public long getOrders() {
		return orders;
	}
	public void setOrders(long orders) {
		this.orders = orders;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getItemIncl() {
		return itemIncl;
	}
	public void setItemIncl(String itemIncl) {
		this.itemIncl = itemIncl;
	}
	public String getItemAlsoIncl() {
		return itemAlsoIncl;
	}
	public void setItemAlsoIncl(String itemAlsoIncl) {
		this.itemAlsoIncl = itemAlsoIncl;
	}
	public String getRulings() {
		return rulings;
	}
	public void setRulings(String rulings) {
		this.rulings = rulings;
	}
	public String getItemExcl() {
		return itemExcl;
	}
	public void setItemExcl(String itemExcl) {
		this.itemExcl = itemExcl;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	@Override
	public String toString() {
		return "ExerciseModel [orders=" + orders + ", level=" + level + ", code=" + code + ", parent=" + parent
				+ ", description=" + description + ", itemIncl=" + itemIncl + ", itemAlsoIncl=" + itemAlsoIncl
				+ ", rulings=" + rulings + ", itemExcl=" + itemExcl + ", reference=" + reference + "]";
	}
	
	
	
	
}