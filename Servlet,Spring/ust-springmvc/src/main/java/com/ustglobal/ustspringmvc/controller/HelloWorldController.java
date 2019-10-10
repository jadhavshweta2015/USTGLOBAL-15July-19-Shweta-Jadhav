package com.ustglobal.ustspringmvc.controller;

import java.util.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.Service.Mode;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.ustglobal.ustspringmvc.dto.Employee;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		CustomDateEditor editor=new CustomDateEditor(format, true);
		binder.registerCustomEditor(Date.class, editor);
	}
	
	@RequestMapping(path="/world",method=RequestMethod.GET)
	public String hello(ModelMap map) {
		map.addAttribute("msg", "HelloWorld!!!!!!!!!!!");
		return "index";
	}
	
	@RequestMapping(path="/query",method=RequestMethod.GET)
	public String getInfo(@RequestParam("id") int id,@RequestParam("name")String name,ModelMap map) {
		map.addAttribute("id", id);
		map.addAttribute("name",name);
		return "Info";
	}
	
	@RequestMapping(path="/form-page",method=RequestMethod.GET)
	public String getForm() {
		return "Form";
	}
	
	@RequestMapping(path="/Form",method=RequestMethod.POST)
	public String formData(Employee emp,ModelMap map) {
		map.addAttribute("id", emp.getId());
		map.addAttribute("name", emp.getName());
		map.addAttribute("dob", emp.getDob());
		map.addAttribute("email", emp.getEmail());
		map.addAttribute("password", emp.getPassword());
		return "Info";
	}
	
	@RequestMapping(path="/add-cookies",method=RequestMethod.GET)
	public String addCookie(HttpServletResponse resp,ModelMap map) {
		Cookie cookie=new Cookie("name","namrata");
		resp.addCookie(cookie);
		map.addAttribute("msg", "cookie addedd to browser");
		return "cookies";
	}
	
	@RequestMapping(path="/get-cookies",method=RequestMethod.GET)
	public String getCookies(@CookieValue(name="name",required=false)String name,ModelMap map) {
		if(name==null) {
			map.addAttribute("msg", "cookie not present");
		}else {
		map.addAttribute("msg", "Cookie value="+name);
		}
		return "cookies";
		
	}
	
	@RequestMapping(path="/path/{id}/{name}",method=RequestMethod.GET)
	public String getPathValue(@PathVariable("id")int id,@PathVariable("name")String name,ModelMap map) {
		
		map.addAttribute("name", name);
		return "Info";
	}
	
	@RequestMapping(path="set-attribute",method=RequestMethod.GET)
	public String setSessionAttribute(HttpSession session,ModelMap map) {
		Employee emp=new Employee();
		emp.setId(1);
		emp.setName("shweta");
		emp.setEmail("s@b.com");
		emp.setPassword("s");
		
		session.setAttribute("emp", emp);
		map.addAttribute("msg", "session attribute added");
		return "index";
		
	}
	@RequestMapping(path="get-attribute",method=RequestMethod.GET)
	public String getSessionAttribute(@SessionAttribute(name="emp",required=false)Employee emp,ModelMap map) {
		if(emp==null) {
			map.addAttribute("msg", "no attribute");
		}
		else {
			System.out.println(emp.getName());
			System.out.println(emp.getId());
			map.addAttribute("msg", "got the attribute");
		}
		return "index";	
	}
	
	@RequestMapping(path="/forward",method=RequestMethod.GET)
	public String forward() {
		return "forward:add-cookies";
	}
	
	@RequestMapping(path="/redirect",method=RequestMethod.GET)
	public String redirect() {
		return "redirect:http://www.google.com";
	}
}
