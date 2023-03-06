package com.abc.learning.modules.rikshaw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.abc.learning.interfaces.Introduction;

@Component
public class RikshawIntro implements Introduction {

	@Value("${rikshaw.image}")
	private String image;

	@Value("${rikshaw.intro}")
	private String intro;

	///Constructor Level DI
	/*
	 * public RikshawIntro(@Value("${rikshaw.image}") String
	 * image, @Value("${rikshaw.intro}") String intro) { this.image = image;
	 * this.intro = intro; }
	 */

	@Override
	public String image() {

		return image;
	}

	@Override
	public String intro() {

		return intro;
	}

}
