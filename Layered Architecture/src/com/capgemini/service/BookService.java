package com.capgemini.service;

import com.capgemini.bean.BookBean;
import com.capgemini.dao.BookDAO;

public class BookService {
	
	public int addBook(int bookId,String title,float price){
		String grade="";
		if(price<=300){
			grade="c";
		}
		else if(price<=600){
			grade="b";
		}
		else{
			grade="a";
		}
		
		BookDAO bookDAO=new BookDAO();
		BookBean bookBean=new BookBean();
		bookBean.setBookId(bookId);
		bookBean.setTitle(title);
		bookBean.setPrice(price);
		bookBean.setGrade(grade);
		
		int updateResult=0;
		try{
		updateResult=bookDAO.addBook1(bookBean);
		return updateResult;
	}
	catch(Exception e){
		System.out.println("Exception Resolved");
	}
		return 0;
				
	}

}
