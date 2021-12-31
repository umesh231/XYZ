package com.spring.practice.runner;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.spring.practice.entity.Person;
import com.spring.practice.repo.PersonRepo;

@Component
public class myRunner implements CommandLineRunner{

	@Autowired
	PersonRepo repo;
	
	@Override
	public void run(String... args) throws Exception {
		
		FileInputStream in = new FileInputStream("D:\\\\download.png");
		
		byte image[] = new byte[in.available()];
		
		repo.save(new Person("Aditya","Pune",Set.of("5'7"),image,new Date()));
		repo.save(new Person("Paras","Mumbai",Set.of("5'0"),image,new Date()));
		repo.save(new Person("Zurich","California",Set.of("6'1"),image,new Date()));
		
	}

}
