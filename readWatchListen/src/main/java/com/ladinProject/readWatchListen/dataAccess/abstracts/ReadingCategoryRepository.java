package com.ladinProject.readWatchListen.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ladinProject.readWatchListen.entities.abstracts.ReadingCategory;

@Repository
public interface ReadingCategoryRepository extends JpaRepository<ReadingCategory, Integer> {

}
