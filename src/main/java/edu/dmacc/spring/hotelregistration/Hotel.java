package edu.dmacc.spring.hotelregistration;

public class Hotel {

	private HotelName hotelName;
	private String cityName;
	private RoomType roomType;
	private int numberOfAdults;
	private int numberOfChildren;
	private double cost;
	
	
	public HotelName getHotelName() {
		return hotelName;
	}
	public void setHotelName(HotelName hotelName) {
		this.hotelName = hotelName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public int getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
	public int getNumberOfChildren() {
		return numberOfChildren;
	}
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = 100.00;	
		}
	
	
	
}
