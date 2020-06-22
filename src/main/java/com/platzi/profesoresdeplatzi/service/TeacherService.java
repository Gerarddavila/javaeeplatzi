package com.platzi.profesoresdeplatzi.service;

import java.util.List;

import com.platzi.profesoresdeplatzi.model.Teacher;

public interface TeacherService {
	void saveTeacher (Teacher teacher);
	void deleteTeacherById(Long idTeacher);
	void updateTeacher(Teacher teacher);
	List<Teacher>findAllTeachers();
	Teacher findById(Long idTeacher);
	Teacher findByName (String name);
}
