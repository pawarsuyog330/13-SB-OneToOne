package com.ashokit.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import lombok.Data;

@Entity
@Data
@Table(name = "CUSTOMER")
@GenericGenerator(name = "idgen", strategy = "foreign", parameters = {@Parameter(name="property" , value="locker")})
public class CustomerEntity {

	@Id
	@GeneratedValue(generator = "idgen")
	private Integer customerId;

	@Column(length = 25)
	private String customerName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="LOCKERID_FK", unique = true)
	@PrimaryKeyJoinColumn
	private LockerEntity locker;

}
