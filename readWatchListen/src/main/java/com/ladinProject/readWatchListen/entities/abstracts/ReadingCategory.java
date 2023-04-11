package com.ladinProject.readWatchListen.entities.abstracts;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReadingCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int readingCategoryId;

	private String category;
	
	@ManyToMany(mappedBy = "readingCategories")
	private Set<Reading> readings;

}
