package com.hanains.email.http.action;

import com.hanains.http.action.Action;
import com.hanains.http.action.ActionFactory;

public class EmailListActionFactory extends ActionFactory {

	@Override
	public Action getAction(String actionName) {
		// TODO Auto-generated method stub
		
		Action action = null;
		
		if("form".equals(actionName)){
			action = new FormAction();
		}else if("insert".equals(actionName)){
			action = new InsertAction();
		}else{
			action = new IndexAction();
		}
			
	
		return null;
	}

}
