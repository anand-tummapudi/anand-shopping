package net.shop.anandshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/", "/home", "/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting","Welcome to Spring MVC");
		return mv;
	}
	
	/*To Demonstrate @Request Param*/
	
/*	@RequestMapping(value= "/test")
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting) {
		if(greeting==null) {
			greeting="Hi Anand";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}
	*/
	/*TO Demonstrate @PathVariable*/
/*	@RequestMapping(value= "/test2/{greeting}")
	public ModelAndView test2(@PathVariable("greeting")String greeting) {
		if(greeting==null) {
			greeting="Hi Anand";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
	}*/
}
