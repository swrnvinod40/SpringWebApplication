package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.SalesTax;

@Controller
public class WelcomeController {

	// inject via application.properties
	private String message = "Hello World";

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		String taxRate = jdbcTemplate.queryForObject("select tax_rate from tax.unitedstates_sales", String.class);
		model.put("message", taxRate);
		return "filledform";
	}
	
	
	@PostMapping("/salestaxs")
	public String FilledForm(@ModelAttribute SalesTax salesTax){
		salesTax.setResult(25);
		System.out.println("vinod swarna");
		return "filledform";
	}
	
	@RequestMapping("/tesing")
	public String testing(){
		return "salestax";
	}

}