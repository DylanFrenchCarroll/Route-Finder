package application;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class data2UnitTest {

	public City tempCity = new City("cityName", 120, 240);
	static ArrayList<City> cityList = new ArrayList<>();

	//setting up for next test as I was getting errors for the test when referenced
	public static void addCity(String name, int x, int y) {

		cityList.add(new City(name, x, y));
	}
	
	@Test
	public void testAddCity() {

		CityList.addCity("temp", 1, 2);
		assertTrue(cityList.size() == 0);

	}

	@Test
	public void testdistance() {
		// distance method
		assertTrue(FXController.distance(6, 5, 10, 8) == 5);

	}

	@Test
	public void cityName() {
		
		assertTrue(tempCity.getCityName() == "cityName");
	}
	
	@Test
	public void cityYCord() {
		
		assertTrue(tempCity.getyCord() == 240);
	}
	
	@Test
	public void cityXCord() {
		
		assertTrue(tempCity.getxCord() == 120);
	}
	
	
	
	
	

}