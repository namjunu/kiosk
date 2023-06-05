package Display;

import java.util.ArrayList;
import java.util.Scanner;

import Product.Drink;
import Product.Food;
import Product.Product;
import Product.Time;

public class KioskObj {
	public static ArrayList<Order> basket = new ArrayList<>();
	public static ArrayList<Product> products = new ArrayList<>();
	public static Scanner sc = new Scanner(System.in);
	public static String cmd;
	
	public static void productLoad() {
		products.add(new Drink("아이스커피",1500));
		products.add(new Drink("믹스커피",1000));
		products.add(new Drink("아이스티",1500));
		products.add(new Time("1시간",1000));
		products.add(new Time("2시간",2000));
		products.add(new Time("5시간",5000));
		products.add(new Time("10시간",9000));
		products.add(new Food("계란밥",4500));
		products.add(new Food("계란밥 세트(계란밥 + 아이스커피,아이스티 중 하나",6000));
	}
}
