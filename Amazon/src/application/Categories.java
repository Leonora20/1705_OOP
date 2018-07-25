package application;

import pojo.Home;

public class Categories {

	public static void main(String[] args) {
		Home sofa = new Home((float) 10000.5, "Red", "Palliser");
		System.out.println("Sofa : " +sofa.getPrice() +sofa.getColour() +sofa.getBrand());

	}

}
