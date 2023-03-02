package com.example.StudentController;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.StudentModel.StudentDetails;
import com.example.StudentService.StudentServices;



public class StudentControllers {
	@Autowired
	StudentServices s;
	@PostMapping("/add")
	public StudentDetails addInfo(@RequestBody StudentDetails m) {
		return s.add(m);
	}
	@GetMapping("/getDetails")
	public List<StudentDetails> getInfo(){
		return s.getDetails();
	}
	@PutMapping("/updateDetails")
	public StudentDetails updateInfo(@RequestBody StudentDetails m) {
		return s.updateDetails(m);
	}
	@DeleteMapping("/deleteDetails")
	public String deleteInfo() {
		return "Record Deleted";
	}
	@GetMapping("/sort/{field}")
	public List<StudentDetails> getWithSort(@PathVariable String field){
		return s.sort(field);
	}
	@GetMapping("/pagination/{offset}/{pageSize}")
	public List<StudentDetails> pagination(@PathVariable int offset,@PathVariable int pageSize){
		return s.pagination(offset,pageSize);
	}
}
