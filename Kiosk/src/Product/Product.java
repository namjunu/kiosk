package Product;

import util.Cw;

public class Product {
	public String name;
	public int price;
	
	public Product(String xx, int yy) {
		name = xx;
		price = yy;
	}
	
	void info() {
		Cw.wn("상품명: " + name + " 가격: " + price);
	}
	
}
