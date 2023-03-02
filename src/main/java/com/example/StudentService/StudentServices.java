package com.example.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.StudentModel.StudentDetails;
import com.example.StudentRepository.StudentRepo;


@Service
public class StudentServices {
	@Autowired
	StudentRepo r;
	public StudentDetails add(StudentDetails m) {
		return r.save(m);
	}
	public List<StudentDetails> getDetails(){
		return r.findAll();
	}
	public StudentDetails updateDetails(StudentDetails m) {
		return r.saveAndFlush(m);
	}
	public void deleteDetails(int id) {
		r.deleteById(id);
	}
	public List<StudentDetails> sort(String field){
		return r.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	public List<StudentDetails> pagination(@PathVariable int offset,@PathVariable int pageSize){
		Page<StudentDetails> page = r.findAll(PageRequest.of(offset, pageSize));
		return page.getContent();
	}
}
