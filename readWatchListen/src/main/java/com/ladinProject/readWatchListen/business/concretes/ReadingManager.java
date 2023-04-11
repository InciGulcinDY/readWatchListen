package com.ladinProject.readWatchListen.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ladinProject.readWatchListen.business.abstracts.ReadingService;
import com.ladinProject.readWatchListen.dataAccess.abstracts.ReadingRepository;
import com.ladinProject.readWatchListen.entities.abstracts.Reading;

public class ReadingManager implements ReadingService {
	private ReadingRepository readingRepository;
//	ReadingCategoryRepository readingCategoryRepository;

	@Autowired
	public ReadingManager(ReadingRepository readingRepository) {
		super();
		this.readingRepository = readingRepository;
	}



}
