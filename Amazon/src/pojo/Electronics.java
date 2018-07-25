package pojo;

public class Electronics {

		private Float price;
		private String type;
		private String brand;
		
		public Electronics() {
			price = (float) 0;
			type = "";
			brand = "";
			System.out.println("creating object");
		}
		public Electronics(Float price, String type, String brand) {
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
		
}
