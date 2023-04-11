package com.ladinProject.readWatchListen.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ladinProject.readWatchListen.entities.abstracts.Reading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "essay_list")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Essay extends Reading {

	@Column(name = "author")
	private String Author;

}
