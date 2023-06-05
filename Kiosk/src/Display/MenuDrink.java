package Display;

import Product.Drink;
import Product.Product;
import util.Cw;

public class MenuDrink {
	public static void run() {
		for(Product p:KioskObj.products) {
			if(p instanceof Drink) {
				Cw.wn(p.name + " " + p.price + "원");
			}
		}
		yy:while(true) {
			Cw.wn("[1.아이스커피 / 2.믹스커피 / 3.아이스티 / x.이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				Cw.wn(KioskObj.products.get(0).name + " 선택됨");
				Order n6 = new Order(KioskObj.products.get(0));
				KioskObj.basket.add(n6);
				break;
			case "2":
				Cw.wn(KioskObj.products.get(1).name + " 선택됨");
				Order n7 = new Order(KioskObj.products.get(1));
				KioskObj.basket.add(n7);
				break;
			case "3":
				Cw.wn(KioskObj.products.get(2).name + " 선택됨");
				Order n8 = new Order(KioskObj.products.get(2));
				KioskObj.basket.add(n8);
				break;
			case "x":
				Cw.wn("이전 메뉴 이동");
				break yy;
			}
		}
	}
}
