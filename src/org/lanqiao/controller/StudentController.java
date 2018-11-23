package org.lanqiao.controller;

import java.util.Map;

import org.lanqiao.entity.Student;
import org.lanqiao.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("studentController")
public class StudentController {
	@Autowired
	@Qualifier("studentService")
	private StudentService studentService;
	
	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}


	@RequestMapping("queryStudentById")
	public String queryStudentById(@RequestParam Integer stuNo,Map<String,Object> map){
		Student stu = studentService.queryStudentById(stuNo);
		map.put("student", stu);
		return "success";
	}
	
	
}
