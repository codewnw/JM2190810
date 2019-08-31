package com.jm2100810.jdbc.dao;

import java.util.List;

public class StudentApplication {

	public static void main(String[] args) {
		StudentDao studentDao = new StudentDaoImpl();

		studentDao.createStudentTable();

		studentDao.insertStudent(new Student(101, "Rohit", "rohit@gmail.com"));
		studentDao.insertStudent(new Student(102, "Sachin", "sachin@gmail.com"));
		studentDao.insertStudent(new Student(103, "Virat", "virat@gmail.com"));

		List<Student> students = studentDao.getStudents();
		System.out.println(students);

		studentDao.updateStudent(new Student(102, "Sachin Tendulkar", "sachin@gmail.com"));

		Student student = studentDao.getStudent(102);
		System.out.println(student);

		studentDao.deleteStudent(103);

		List<Student> studentsAfterDelete = studentDao.getStudents();
		System.out.println(studentsAfterDelete);

		studentDao.dropStudentTable();
	}

}
