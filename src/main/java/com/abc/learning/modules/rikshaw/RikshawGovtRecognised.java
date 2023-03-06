package com.abc.learning.modules.rikshaw;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.abc.learning.interfaces.GovtRecognition;

@Component
public class RikshawGovtRecognised implements GovtRecognition {

	@Value("${rikshaw.isGovtRecognized}")
	private boolean isGovtRecognized;
	
	///Setter Level DI
	/*
	 * @Value("${rikshaw.isGovtRecognized}") public void setGovtRecognized(boolean
	 * isGovtRecognized) { this.isGovtRecognized = isGovtRecognized; }
	 */



	@Override
	public boolean isGovtRecognized() {

		return isGovtRecognized;
	}

}
