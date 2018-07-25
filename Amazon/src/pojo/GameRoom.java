package pojo;

public class GameRoom extends SportsnOutdoors {

	private Float price;
	private String type;
	private String brand;
	
	public GameRoom() {
		price = (float) 0;
		type = "";
		brand = "";
		System.out.println("creating object");
	}
	public GameRoom(Float price, String type, String brand) {
		this.price = price;
		this.type = type;
		this.brand = brand;
	}
	
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
		
	@Override
	public void calculatePrice() {
		System.out.println("calculating Price");
	}
}
