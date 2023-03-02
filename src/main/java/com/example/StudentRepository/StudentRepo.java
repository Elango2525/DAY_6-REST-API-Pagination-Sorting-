package com.example.StudentRepository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentModel.StudentDetails;



public interface StudentRepo extends JpaRepository<StudentDetails,Integer>{

}
