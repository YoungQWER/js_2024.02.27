package com.syayan.controller.action;

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
		}else if(command.equals("")) {
			
		}else if(command.equals("")){
			  
		}
		return action;
	}



}
