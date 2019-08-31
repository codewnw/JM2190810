package com.jm2100810.jdbc.dao;

import java.util.List;

public interface StudentDao {
	void createStudentTable();

	void insertStudent(Student student);

	void updateStudent(Student student);

	void deleteStudent(int id);

	Student getStudent(int id);

	List<Student> getStudents();

	void dropStudentTable();
}
