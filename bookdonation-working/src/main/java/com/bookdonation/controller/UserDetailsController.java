package com.bookdonation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookdonation.model.UserDetails;

@RestController
@RequestMapping("v1/bookdonation")
public class UserDetailsController {

	@PostMapping("userDetails")
	public String postUserDetails(@RequestBody UserDetails userDetails) {
	return "Successfully posted";
	
	}
	
	@GetMapping("/test")
	public String test() {
		return "WORKING!!!";
	}
}
