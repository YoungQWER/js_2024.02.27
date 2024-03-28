package com.product.controller.action;

import com.cart.controller.CartController;

public class ActionFactory {

	
	private static ActionFactory instance = new ActionFactory(); 
	
	private ActionFactory() {}
	
	public static ActionFactory getinstance() {
		return instance;
	}
	public Action getAction(String command) {
		Action action = null;


		if(command.equals("product_list")){
		      action = new productListAction();
		}else if(command.equals("product_view")) {
			  action = new productview();
		}else if(command.equals("product_Order")){
			  action = new ProductOrderAction();
		}else if(command.equals("product_order_form")){
			  action = new ProductOrderForm();
		}else if(command.equals("bank_account")) {
			  action = new bankAccount();
		}
		
		
		
		return action;
	}



}
