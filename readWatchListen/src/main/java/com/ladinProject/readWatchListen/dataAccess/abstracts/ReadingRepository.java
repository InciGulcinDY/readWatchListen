package com.ladinProject.readWatchListen.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ladinProject.readWatchListen.entities.abstracts.Reading;
@Repository
public interface ReadingRepository extends JpaRepository<Reading, Integer>{

}
