package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Subject;

@Repository    ///ctrl + space bar to import jpa repo
public interface SubjectRepo extends JpaRepository<Subject,Integer> {

}
