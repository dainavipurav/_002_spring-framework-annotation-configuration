package com.abc.learning.modules.car;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.abc.learning.interfaces.GovtRecognition;

@Component
public class CarGovtRecognition implements GovtRecognition {

	@Value("${car.isGovtRecognized}")
	private boolean isGovtRecognized;

	///Setter Level DI
	/*
	 * @Value("${car.isGovtRecognized}") public void setGovtRecognized(boolean
	 * isGovtRecognized) { this.isGovtRecognized = isGovtRecognized; }
	 */

	@Override
	public boolean isGovtRecognized() {
		return isGovtRecognized;
	}

}
