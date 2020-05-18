package com.subra;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController //("/")
public class CalcController {
	
	/* 
	 C:\Users\sdass>curl http://localhost:8082/5/6
	11
	*/
	@GetMapping("add/{a}/{b}")
	Integer add(@PathVariable("a") Integer a, @PathVariable("b") Integer b){
		System.out.println("received=" + a + " + "  + b);
		int result = a+b;
		System.out.println("returned=" +  result);
		return result;
	}
	
	@GetMapping("minus/{a}/{b}")
	Integer subtract(@PathVariable("a") Integer a, @PathVariable("b") Integer b){
		System.out.println("received=" + a + " - "  + b);
		int result = a-b;
		System.out.println("returned=" +  result);
		return result;
	}

}
