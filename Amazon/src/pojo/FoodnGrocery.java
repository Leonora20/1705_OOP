package pojo;

public class FoodnGrocery {

		private Float price;
		private String type;
		private Integer quantity;
				
		public FoodnGrocery() {
			price = (float) 0;
			type = "";
			quantity = 0;
			System.out.println("creating object");
		}
		public FoodnGrocery(Float price, String type, Integer quantity) {
			this.price = price;
			this.type = type;
			this.quantity = quantity;
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
		public Integer getQuantity() {
			return quantity;
		}
		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}
				
}
