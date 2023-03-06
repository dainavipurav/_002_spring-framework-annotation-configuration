package com.abc.learning.modules.rikshaw;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.abc.learning.interfaces.GovtRecognition;
import com.abc.learning.interfaces.Introduction;
import com.abc.learning.interfaces.Vehicle;

@Component
@Scope("prototype")
public class Rikshaw implements Vehicle {

	@Value("${rikshaw.name}")
	private String name;

	@Value("${rikshaw.type}")
	private String type;

	@Value("${rikshaw.color}")
	private String color;

	@Value("${rikshaw.gearCount}")
	private int gearCount;

	@Value("${rikshaw.seatCount}")
	private int seatCount;

	@Autowired
	@Qualifier("rikshawIntro")
	private Introduction introduction;

	@Autowired
	@Qualifier("rikshawGovtRecognised")
	private GovtRecognition govtRecognition;

	@Override
	public String name() {
		return name;
	}

	@Override
	public String type() {
		return type;
	}

	@Override
	public String color() {
		return color;
	}

	@Override
	public int seatCount() {
		return seatCount;
	}

	@Override
	public int gearCount() {
		return gearCount;
	}

	@Override
	@PostConstruct
	public void display() {
		System.out.println("*** Vehicle Details ***");
		System.out.println("Vehicle Name : " + name);
		System.out.println("Vehicle Type : " + type);
		System.out.println("Vehicle Color : " + color);
		System.out.println("Vehicle Gear : " + gearCount);
		System.out.println("Vehicle No. Of Seats : " + seatCount);
		System.out.println("Vehicle Image : " + introduction.image());
		System.out.println("Vehicle Intro : " + introduction.intro());
		System.out.println("Vehicle Govt Recognized : " + govtRecognition.isGovtRecognized());
		System.out.println();
	}

	@Override
	@PreDestroy
	public void destroy() {
		System.out.println("Destroying Rikshaw Bean...");

	}

}
