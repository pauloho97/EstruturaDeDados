package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		//Coloca a String DELIVERED dentro da variável DELIVERED
		OrderStatus os2 = OrderStatus.DELIVERED.valueOf("DELIVERED");
		
	
		System.out.println(os1);
		System.out.println(os2);
		

	}

} 
