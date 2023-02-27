package ca.sheridancollege.owusukej.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.owusukej.beans.Student;
import ca.sheridancollege.owusukej.repositoris.StudentRepository;
import lombok.AllArgsConstructor;
	
	@RestController
	@AllArgsConstructor
	
	public class StudentController {
	private StudentRepository studentRepo;
	@GetMapping("/")
	public String home(Model model) {
	generateStudents();
	return "home";
	}
	
	@GetMapping("/students")
	public List<Student> getStudentList() {
	return (List<Student>) studentRepo.findAll();
	}
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable int id) {
	Optional<Student> student = studentRepo.findById(id);
	if (student.isPresent())
	return student.get();
	else
	return null;
	}
	
	@PostMapping(value="/students", headers={"Content-type=application/json"})
	public long poststudent(@RequestBody Student student) {
	Student s = studentRepo.save(student);
	return s.getId();
	}
	
	@PutMapping(value="/students", headers={"Content-type=application/json"})
	public String putStudentList(@RequestBody List<Student> studentList) {
	studentRepo.deleteAll();
	studentRepo.saveAll(studentList);
	return "Records Added:" + studentRepo.count();
	}
}
