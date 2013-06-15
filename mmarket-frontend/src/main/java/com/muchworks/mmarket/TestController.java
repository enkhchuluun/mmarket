package com.muchworks.mmarket;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.muchworks.mmarket.core.TestService;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	
}
