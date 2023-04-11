package com.ladinProject.readWatchListen.entities.abstracts;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Data
@AllArgsConstructor
@NoArgsConstructor

public abstract class Reading {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int readingId;

	private String readingName;

	private String publisher;

	private int pageNumber;

	private String language;

	private String mainLanguage;

	private boolean isDigitalCopy;

	private int point;

	private String note;

	private String quote;

	private int year;

	@ManyToMany
	@JoinTable(name = "reading_readingCategories_list", joinColumns = {
			@JoinColumn(referencedColumnName = "readingId") }, inverseJoinColumns = {
					@JoinColumn(referencedColumnName = "readingCategoryId") })
	private Set<ReadingCategory> readingCategories;


}
