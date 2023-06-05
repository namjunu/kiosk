package Display;

import Product.Product;
import Product.Time;
import util.Cw;

public class MenuTime {
	public static void run() {
		for(Product p:KioskObj.products) {
			if(p instanceof Time) {
				Cw.wn(p.name + " " + p.price + "원");
			}
		}
		
		yy :while(true) {
			Cw.wn("[1.1시간 / 2.2시간 / 3.5시간 / 4.10시간 / x.이전메뉴로]");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				Cw.wn(KioskObj.products.get(3).name + " 선택됨");
				Order n = new Order(KioskObj.products.get(3));
				KioskObj.basket.add(n);
				break;
			case "2":
				Cw.wn(KioskObj.products.get(4).name + " 선택됨");
				Order n1 = new Order(KioskObj.products.get(4));
				KioskObj.basket.add(n1);
				break;
			case "3":
				Cw.wn(KioskObj.products.get(5).name + " 선택됨");
				Order n2 = new Order(KioskObj.products.get(5));
				KioskObj.basket.add(n2);
				break;
			case "4":
				Cw.wn(KioskObj.products.get(6).name + " 선택됨");
				Order n3  = new Order(KioskObj.products.get(6));
				KioskObj.basket.add(n3);
				break;
			case "x":
				Cw.wn("이전 메뉴 이동");
				break yy;
			}
			
		}
	}
}
