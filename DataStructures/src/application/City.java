package application;

public class City {

	public int yCord;
	public int xCord;
	String cityName;

	public City(String cityName, int xCord, int yCord) {
		super();
		this.cityName = cityName;
		this.xCord = xCord;
		this.yCord = yCord;
	}

	public int getyCord() {
		return yCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	public int getxCord() {
		return xCord;
	}

	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "City [yCord=" + yCord + ", xCord=" + xCord + ", cityName=" + cityName + "]";
	}

}
