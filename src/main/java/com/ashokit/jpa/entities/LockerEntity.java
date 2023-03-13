package com.ashokit.jpa.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "LOCKER")
public class LockerEntity {

	@Id
	private Integer lockerId;

	private Double rent;

}
