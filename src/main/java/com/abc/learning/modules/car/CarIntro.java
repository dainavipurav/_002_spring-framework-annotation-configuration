package com.abc.learning.modules.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.abc.learning.interfaces.Introduction;

@Component
public class CarIntro implements Introduction {

	@Value("${car.image}")
	private String image;

	@Value("${car.intro}")
	private String intro;

	/// Constructor Level DI
	/*
	 * public CarIntro(@Value("${car.image}") String image, @Value("${car.intro}")
	 * String intro) { this.image = image; this.intro = intro; }
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
