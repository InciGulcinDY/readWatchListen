package com.ladinProject.readWatchListen.webApiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ladinProject.readWatchListen.business.abstracts.ReadingService;
import com.ladinProject.readWatchListen.entities.abstracts.Reading;

@RestController
@RequestMapping("/api/reading")
public class ReadingsController {
	private ReadingService readingService;
	
	
	@Autowired
	public ReadingsController(ReadingService readingService) {
		this.readingService = readingService;
	}



}
