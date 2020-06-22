package com.platzi.profesoresdeplatzi.dao;

import java.util.List;

import org.springframework.context.annotation.Bean;

import com.platzi.profesoresdeplatzi.model.SocialMedia;
import com.platzi.profesoresdeplatzi.model.TeacherSocialMedia;


public interface SocialMediaDao {
	

	void saveSocialMedia(SocialMedia socialMedia);
	void deleteSocialMediabyId(Long idSocialMedia);
	void updateSocialMedia(SocialMedia socialMedia);
	List<SocialMedia>findAllSocialMedia();
	
	SocialMedia findById(Long idSocialMedia);
	
	SocialMedia findByName(Long name);
	
	TeacherSocialMedia findSocialMediaByIdAndName(Long idSocialMedia, String nickname);
	
}