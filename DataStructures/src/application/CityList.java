package application;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class CityList {

	static ArrayList<City> cityList = new ArrayList<>();

	public static void addCity(String name, int x, int y) {

		cityList.add(new City(name, x, y));
	}

	public void addingAllCitiestoDatabase() {
		addCity("Bravos", 58, 48);
		addCity("Lorath", 157, 73);
		addCity("Norvos", 194, 189);
		addCity("Pentos", 63, 262);
		addCity("Myr", 107, 395);
		addCity("Tyrosh", 7, 417);
		addCity("Volantis", 289, 521);
		addCity("Ar Noy", 269, 302);
		addCity("Ny Sar", 205, 286);
		addCity("Saath", 451, 103);
		addCity("Morosie", 495, 63);
		addCity("The Sorrows", 229, 385);
		addCity("Essaria", 424, 258);
		addCity("Qohor", 316, 262);
		addCity("SelHorys", 246, 452);
		addCity("Mantarys", 456, 498);
		addCity("Tolos", 512, 530);
		addCity("Elyria", 480, 537);
		addCity("Mereen", 687, 458);
		addCity("Hesh", 774, 461);
		addCity("Sarnath", 562, 282);
		addCity("Yunkai", 652, 489);
		addCity("Drohe", 131, 247);
		addCity("Sarvs", 516, 99);
		addCity("Lys", 68, 516);
		addCity("Valysar", 239, 480);
		addCity("Volon Therys", 255, 509);
		addCity("Sar Mell", 261, 489);
		addCity("Bhorash", 575, 463);
		addCity("Lhazosh", 811, 511);
		addCity("Kosrak", 864, 459);
		addCity("Ghardoq", 826, 396);
		addCity("Vats Meghah", 868, 386);
		addCity("Vaes Efe", 895, 352);
		addCity("Hazdahn No", 678, 355);
		addCity("Vaes Dothrak", 927, 202);
		addCity("Sathar", 701, 282);
		addCity("Kasath", 639, 262);
		addCity("Gornath", 691, 236);
		addCity("Salksh", 666, 205);
		addCity("Vaesleisi", 798, 67);
		addCity("New Ibbish", 942, 7);
	
	}

	
	
	// Saving function for characters in xml format
	public void saveCity() throws Exception {
		XStream xstream = new XStream(new DomDriver());
		ObjectOutputStream out = xstream.createObjectOutputStream(new FileWriter("cities.xml"));
		out.writeObject(cityList);
		out.close();
	}

	@SuppressWarnings("unchecked")
	public void loadChar() throws Exception {
		XStream xstream = new XStream(new DomDriver());
		ObjectInputStream is = xstream.createObjectInputStream(new FileReader("cities.xml"));
		cityList = (ArrayList<City>) is.readObject();
		is.close();
	}

}
