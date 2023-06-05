package Display;

import Product.Food;
import Product.Product;
import util.Cw;

public class MenuFood {
	public static void run() {
		for(Product p:KioskObj.products) {
			if(p instanceof Food) {
				Cw.wn(p.name + "" + p.price + "원");
			}
		}
		yy : while(true) {
			Cw.wn("[1.계란밥 / 2.계란밥 세트 / x. 이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				Cw.wn(KioskObj.products.get(7).name + " 선택됨");
				Order n4 = new Order(KioskObj.products.get(7));
				KioskObj.basket.add(n4);
				break;
			case "2":
				Cw.wn(KioskObj.products.get(8).name + " 선택됨");
				Order n5 = new Order(KioskObj.products.get(8));
				KioskObj.basket.add(n5);
				break;
			case "x":
				Cw.wn("이전 메뉴 이동");
				break yy;
			}
		}
	}
}
