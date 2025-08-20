package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Student;

@RestController
public class HomeController {
	
	@GetMapping(value = "/")
	public void m1()
	{
		System.out.println("we are in m1 method");
		
	}
	
	@GetMapping(value = "/req1")
	public int m2()
	{
		System.out.println("we are in m2 method");
		return 10; 
	}
	
	@GetMapping(value = "/req2")
	public String m3()
	{
		System.out.println("we are in m3 method");
		return "ABC"; 
		
	}
	
	//req3?a=20 URL
	@GetMapping(value = "/req3") 
	public int m4(int a)
	{
		System.out.println("we are in m4 method");
		return a; 
		
	}
	
	///req4?x=20  URL
	@GetMapping(value = "/req4") 
	public int m5(@RequestParam("x") int a)
	{
		System.out.println("we are in m5 method");
		return a; 
		
	}
	
	@GetMapping(value = "/req5")
	public int m6(int a,int b)
	{
		System.out.println("we are in m6 method");
		return a+b;
	}
	
	@GetMapping(value = "/req6/{a}")
	public int m7(@PathVariable int a)
	{
		return a;
	}
	
	// /req7/10/20  URI
	@GetMapping(value="req7/{a}/{b}")
	public int m8(@PathVariable int a,@PathVariable int b)
	{
		return a+b;
	}
	
		// /req8/10/20  URI
		@GetMapping(value="req8/{a}/{b}")
		public int m9(@PathVariable("a") int x,@PathVariable("b") int y)
		{
			return x+y;
		}
		
		@GetMapping(value="req9/{a}/{b}")
		public String m10(@PathVariable int a,@PathVariable String b)
		{
			return a+b;
		}	
		
		// /req10?a=10,20,30,40,50  URL
		@GetMapping(value="/req10")
		public int[] m11(int a[])
		{
			return a;
		}
		
		// /req11/10,20,30,40,50        URI
		@GetMapping(value="req11/{a}")
		public int[] m12(@PathVariable int a[])
		{
			return a;
		}
		/*
		 * /req12
		 * [
    			10,20,30,40,50
		   ]
		 * 
		 * 
		 */
		@GetMapping(value="/req12")
		public int[] m13(@RequestBody int a[])
		{
			return a;
		}
		
		@GetMapping(value="/req13")
		public Student m14(@RequestBody Student s)
		{
			return s;
		}
		
		
		
	
}
