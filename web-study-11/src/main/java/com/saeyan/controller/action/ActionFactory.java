package com.saeyan.controller.action;
//커맨드 패턴으로 작업 처리를 위한 명령 처리 클래스가 있어야한다.

public class ActionFactory {
	
	private static ActionFactory instance = new ActionFactory();
	
	private ActionFactory() {}
	
	public static ActionFactory getInstance() {
		return instance;
	}
	                          //board_list
	public Action getAction(String command) {
		Action action = null;
		
		System.out.println("ActionFactory : " + command);
		//조건식 나열 --> action 구현 클래스 
		
		//command=board_write_form    //board_write 항상 이놈이 받는다
		if(command.equals("board_list")) {
			action = new BoardListAction();
			
			
		}else if(command.equals("board_write_form")) {
			action = new BoardWriteActionForm();
		}else if(command.equals("board_write")) {
			action = new BoardWriteAction();
			
			
		}else if(command.equals("board_view")) {
			action = new BoardViewAction();
		}else if(command.equals("board_check_pass_form")) {
			action = new BoardCheckPassFormAction();
		}else if(command.equals("board_check_pass")) {
			action = new BoardCheckPassAction();
		}else if(command.equals("board_update_form")) {
			action = new BoardUpdateFormAction();
		}else if(command.equals("board_update")) {
			action = new BoardUpdateAction();
		}else if(command.equals("board_delete")) {
			action = new BoardDeleteAction();
		}
		
		
		return action;
		
	}
}
