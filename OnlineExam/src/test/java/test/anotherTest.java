package test;


import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.layer2.Subject;
import com.example.demo.repo.SubjectRepo;


@SpringBootTest
public class anotherTest {


   
   
    @Autowired
    SubjectRepo repo;
   
//    @Autowired
//    StudentServiceImpl service;

@Test
void contextLoads() {

}

@Test
public void insertDetails() {
       
Subject s = new Subject();

s.setSubject("fazil");
s.setSubject_id(5);
s.setLevels(5);


        repo.save(s);
}

@Test
public void getSubject() {
      service.getAllSubject();
     
      List<Subject> list = service.getAllSubject();
      for(Subject sub: list)
{
System.out.println(sub.getSubject());
System.out.println(sub.getSubject_id());
System.out.println(sub.getLevels());



}
   
}
}