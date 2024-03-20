package com.user.contoller.action;


public class ActionFactory {
	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	
	public Action getAciton(String command) {
		Action action = null;
		
		if(command.equals("user_login_form")) {
			action = new UserLoginForm();
		}else if(command.equals("user_login")) {
			action = new UserLoginAction();
		}else if(command.equals("user_join_form")) {
			action = new UserJoinForm();
		}else if(command.equals("user_join")) {
			action = new UserJoinAction();
		}else if(command.equals("nonuser_join_form")) {
			action = new NonUserJoinForm();
		}else if(command.equals("nonuser_join")) {
			action = new NonUserJoinAction();
		}else if(command.equals("idcheck")) {
			action = new IdCheck();
		}else if(command.equals("idcheck_form")) {
			action = new IdCheckForm();
		}
		
		
		return action;
	
	}
	
	
	
	
	
}
