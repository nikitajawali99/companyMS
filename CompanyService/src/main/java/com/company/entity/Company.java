package com.company.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String description;
	//@JsonIgnore
//	@OneToMany(mappedBy = "company")
//	private List<Job> jobs;
	
//	@OneToMany(mappedBy = "company")
//	private List<Review> reviews;
	

}
