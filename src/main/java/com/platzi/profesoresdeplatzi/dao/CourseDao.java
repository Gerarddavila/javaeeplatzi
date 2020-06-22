package com.platzi.profesoresdeplatzi.dao;

import java.util.List;

import com.platzi.profesoresdeplatzi.model.Course;

public interface CourseDao {

	void saveCourse (Course course);
	void deleteCourseById(Long idCourse);
	void updateCourse(Course course);
	List<Course>findAllCourses();
	Course findById(Long idCourse);
	Course findByNombre (String name);
	List<Course> findByIdTeacher (Long idTeacher);
}
