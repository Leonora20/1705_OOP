package pojo;

public class Home {
		
		private Float price;
		private String colour;
		private String brand;
			
		public Home() {
			price = (float) 0;
			colour = "";
			brand = "";
		}
		
		public Home(Float price, String colour, String brand) {
		this.price = price;
		this.colour = colour;
		this.brand = brand;
	    }
		
		public Float getPrice() {
			return price;
		}
		public void setPrice(Float price) {
			this.price = price;
		}
		public String getColour() {
			return colour;
		}
		public void setColour(String colour) {
			this.colour = colour;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
				
}
