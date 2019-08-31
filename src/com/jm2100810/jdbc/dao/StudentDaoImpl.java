package com.jm2100810.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jm2100810.jdbc.util.DbUtil;

public class StudentDaoImpl implements StudentDao {

	private static final String CREATE_STUDENT_TABLE_QUERY = "CREATE TABLE JM2190810_STUDENT(ID NUMBER PRIMARY KEY, NAME VARCHAR, EMAIL VARCHAR)";

	private static final String INSERT_STUDENT_QUERY = "INSERT INTO JM2190810_STUDENT VALUES(?, ?, ?)";

	private static final String UPDATE_STUDENT_QUERY = "UPDATE JM2190810_STUDENT SET NAME  = ?, EMAIL = ? WHERE ID = ?";

	private static final String DELETE_STUDENT_QUERY = "DELETE FROM JM2190810_STUDENT WHERE ID = ?";

	private static final String SELECT_STUDENT_QUERY = "SELECT ID, NAME, EMAIL FROM JM2190810_STUDENT WHERE ID = ?";

	private static final String SELECT_STUDENTS_QUERY = "SELECT ID, NAME, EMAIL FROM JM2190810_STUDENT";

	private static final String DROP_STUDENT_TABLE_QUERY = "DROP TABLE JM2190810_STUDENT";

	@Override
	public void createStudentTable() {
		Connection con = null;
		try {
			con = DbUtil.getCon();
			PreparedStatement pstmt = con.prepareStatement(CREATE_STUDENT_TABLE_QUERY);
			boolean result = pstmt.execute();
			if (!result) {
				System.out.println("Student table created successfully.");
			}
		} catch (SQLException e) {
			System.out.println("Student table creation faild.");
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					System.out.println("Connection closing faild.");
					e.printStackTrace();
				}
			}

		}
	}

	@Override
	public void insertStudent(Student student) {
		try (Connection con = DbUtil.getCon(); PreparedStatement pstmt = con.prepareStatement(INSERT_STUDENT_QUERY);) {
			pstmt.setInt(1, student.getId());
			pstmt.setString(2, student.getName());
			pstmt.setString(3, student.getEmail());
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("Student inserted successfully.");
			}
		} catch (SQLException e) {
			System.out.println("Student insertion faild.");
			e.printStackTrace();
		}
	}

	@Override
	public void updateStudent(Student student) {
		try (Connection con = DbUtil.getCon(); PreparedStatement pstmt = con.prepareStatement(UPDATE_STUDENT_QUERY);) {
			pstmt.setInt(3, student.getId());
			pstmt.setString(1, student.getName());
			pstmt.setString(2, student.getEmail());
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("Student updated successfully.");
			}
		} catch (SQLException e) {
			System.out.println("Student updation faild.");
			e.printStackTrace();
		}
	}

	@Override
	public void deleteStudent(int id) {
		try (Connection con = DbUtil.getCon(); PreparedStatement pstmt = con.prepareStatement(DELETE_STUDENT_QUERY);) {
			pstmt.setInt(1, id);
			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("Student deleted successfully.");
			}
		} catch (SQLException e) {
			System.out.println("Student deletion faild.");
			e.printStackTrace();
		}
	}

	@Override
	public Student getStudent(int id) {
		Student student = null;
		try (Connection con = DbUtil.getCon(); PreparedStatement pstmt = con.prepareStatement(SELECT_STUDENT_QUERY);) {
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			student = new Student();
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setEmail(rs.getString(3));
		} catch (SQLException e) {
			System.out.println("Student fetch faild.");
			e.printStackTrace();
		}
		return student;
	}

	@Override
	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		try (Connection con = DbUtil.getCon(); PreparedStatement pstmt = con.prepareStatement(SELECT_STUDENTS_QUERY);) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setEmail(rs.getString(3));
				students.add(student);
			}

		} catch (SQLException e) {
			System.out.println("Students fetch faild.");
			e.printStackTrace();
		}
		return students;
	}

	@Override
	public void dropStudentTable() {
		try (Connection con = DbUtil.getCon();
				PreparedStatement pstmt = con.prepareStatement(DROP_STUDENT_TABLE_QUERY);) {
			boolean result = pstmt.execute();
			if (!result) {
				System.out.println("Student table dropped successfully.");
			}

		} catch (SQLException e) {
			System.out.println("Student table drop faild.");
			e.printStackTrace();
		}
	}

}
