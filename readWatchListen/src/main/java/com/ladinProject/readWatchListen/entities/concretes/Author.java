package com.ladinProject.readWatchListen.entities.concretes;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.ladinProject.readWatchListen.entities.abstracts.Person;

@Entity

public class Author extends Person{
	
	@OneToMany(mappedBy = "author" , cascade = CascadeType.ALL)
	private Set<Book> books;

}
