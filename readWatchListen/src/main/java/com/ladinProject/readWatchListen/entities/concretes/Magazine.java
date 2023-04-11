package com.ladinProject.readWatchListen.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ladinProject.readWatchListen.entities.abstracts.Reading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "magazine_list")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine extends Reading {

	@Column(name = "chief_editor")
	private String chiefEditor;

}
