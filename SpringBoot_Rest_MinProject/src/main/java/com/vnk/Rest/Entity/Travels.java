package com.vnk.Rest.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Travels {
@Id	
@NonNull
private Integer id;	

@Column(length=25)
private String travelName;

@Column(length = 25)
private String owner;

private Double price;

@NonNull
@Column(length = 25)
private String cName;

@NonNull
private Long cPhoneNo;

@NonNull
@Column(length = 25)
private String startPlace;

@Column(length = 25)
@NonNull
private String endPlace;

@NonNull
private Integer age;

private Integer seetNumber; 
}
