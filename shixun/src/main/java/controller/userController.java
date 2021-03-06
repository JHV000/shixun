package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.UserDao;
import entity.User;

@Controller
public class userController {
	
	
	@Autowired
	UserDao dao;
	
	@RequestMapping("/index")
	public String queryAll(HttpServletRequest req){
		
		req.setAttribute("list", dao.queryAll());
		return "index";
	}
}
