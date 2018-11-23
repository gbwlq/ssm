package org.lanqiao.service.impl;

import org.lanqiao.entity.Student;
import org.lanqiao.mapper.StudentMapper;
import org.lanqiao.service.StudentService;

public class StudentServiceImpl implements StudentService{
	
	private StudentMapper studentMapper;
	
	public void setStudentMapper(StudentMapper studentMapper) {
		this.studentMapper = studentMapper;
	}

	@Override
	public Student queryStudentById(int stuNo) {
		return studentMapper.queryStudentById(stuNo);
	}

	

}
