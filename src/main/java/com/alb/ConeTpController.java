package com.alb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coneTpApi")
public class ConeTpController {

	@RequestMapping("getprof")
	public String getRef(){
		return "prof is 123123";
	}
}
