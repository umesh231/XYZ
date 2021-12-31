package com.spring.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.practice.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer>{

}
