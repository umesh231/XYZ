package com.spring.practice.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "student")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column
	@NonNull
	private String name;
	
	@Column
	@NonNull
	private String city;
	
	@Column
	@NonNull
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "p_height",joinColumns = @JoinColumn(name="id"))
	private Set<String> height;
	
	@Lob
	@Column
	@NonNull
	private byte[] img;
	
	@Temporal(TemporalType.DATE)
	@NonNull
	private Date entryDate;
}
