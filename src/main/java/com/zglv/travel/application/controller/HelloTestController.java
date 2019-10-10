package com.zglv.travel.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/Hello/v1")
public class HelloTestController {
	
	@GetMapping(value = "/query/{id}")
	@ResponseBody
	public String gerUserName(@PathVariable(value="id") Integer id,
			@RequestParam(value="name",required=false,defaultValue="zql") String name) {
		return "333";
	}

}
