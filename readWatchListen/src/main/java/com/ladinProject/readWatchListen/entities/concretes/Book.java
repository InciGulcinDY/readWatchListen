package com.ladinProject.readWatchListen.entities.concretes;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

import com.ladinProject.readWatchListen.entities.abstracts.Reading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book extends Reading {

	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;

	private String translator;

	private int editionNumber;

	private boolean isItMine;

	private int deliveryCounter;

}
