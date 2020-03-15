package com.taotao.sso.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转Controller
 * <p>Title: PageController</p>
 * <p>Description: </p>
 * <p>Company: www.itcast.com</p> 
 * @author	入云龙
 * @date	2015年9月15日上午8:51:53
 * @version 1.0
 */
@Controller
@RequestMapping("/page")
public class PageController {

	@RequestMapping("/register")
	public String showRegister() {
		return "register";
	}
	@RequestMapping("/login")
	public String showLogin(String redirect, Model model) {//redirect是访问/login页面时带的参数，是登陆成功后跳转的页面url，即登录之前的页面
		model.addAttribute("redirect", redirect);//将登陆成功后跳转的url添加到login.jsp页面，login页面的js逻辑会重定向到这个url
		return "login";
	}
}
