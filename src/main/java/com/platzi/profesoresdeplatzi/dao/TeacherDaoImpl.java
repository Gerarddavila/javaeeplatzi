package com.platzi.profesoresdeplatzi.dao;

import java.util.Iterator;
import java.util.List;

import com.platzi.profesoresdeplatzi.model.Teacher;
import com.platzi.profesoresdeplatzi.model.TeacherSocialMedia;


public class TeacherDaoImpl extends AbstractSession implements TeacherDao{


	@Override
	public void saveTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		getSession().persist(teacher); 
	}

	@Override
	public void deleteTeacherById(Long idTeacher) {
		// TODO Auto-generated method stub
	Teacher teacher = findById(idTeacher);
	if (teacher != null) {
		
		Iterator<TeacherSocialMedia> i= teacher.getTeacherSocialMedias().iterator();
		while (i.hasNext()) {
			TeacherSocialMedia teacherSocialMedia = i.next();
			i.remove();
			getSession().delete(teacherSocialMedia);
		}
		teacher.getTeacherSocialMedias().clear();
		getSession().delete(idTeacher);
	}
	}

	@Override
	public void updateTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
		getSession().update(teacher);
		
	}

	@Override
	public List<Teacher>findAllTeachers() {
		
		
		return getSession().createQuery("from Teacher").list();
		// TODO Auto-generated method stub
		
		}

	@Override
	public Teacher findById(Long idTeacher) {
		// TODO Auto-generated method stub
		return (Teacher) getSession().get(Teacher.class, idTeacher);
	}

	@Override
	public Teacher findByName(String name) {
		// TODO Auto-generated method stub
		
		return (Teacher) getSession().createQuery(
				"from Teacher where name = :name")
				.setParameter("name", name).uniqueResult();
				
	}

}
