package Display;

import util.Cw;

public class Kiosk {
	public static final String VERSION = "0.0.1v";
	
	void run() {
		KioskObj.productLoad();	//상품로드
		Disp.title();
		xx:while(true) {
			Cw.wn("명령 입력[1.음료선택 / 2.음식선택 / 3.시간선택 /e.프로그램종료]:");
			KioskObj.cmd = KioskObj.sc.next();
			switch(KioskObj.cmd) {
			case "1":
				MenuDrink.run();
				break;
			case "2":
				MenuFood.run();
				break;
			case "3":
				MenuTime.run();
			case "e":	
				Cw.wn("장바구니에 담긴 상품 갯수:"+KioskObj.basket.size());
				int sum = 0;
				for(Order o:KioskObj.basket) {
					sum = sum + o.selectedProduct.price;
				}
				Cw.wn("계산하실 금액은 :"+sum+"원 입니다.");
				
				Cw.wn("====================");
				for(Order o:KioskObj.basket) {
					Cw.wn(o.selectedProduct.name);
				}
				Cw.wn("====================");
				Cw.wn("프로그램종료");
				break xx;
			}
		}
	}
}
