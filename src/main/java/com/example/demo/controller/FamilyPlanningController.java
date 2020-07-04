package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.ListPemakaiKontrasepsiRequest;
import com.example.demo.service.FamilyPlanningService;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class FamilyPlanningController {

	@Autowired
	FamilyPlanningService familyPlanning;
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public ResponseEntity<?> upload(@RequestBody ListPemakaiKontrasepsiRequest input) {
		System.out.println(input);
		input = familyPlanning.upload(input);
		if(input == null) {
			return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);	
		}else {
			return ResponseEntity.ok().body("Upload successfully!");
		}
	}
	
	@RequestMapping(value = "/getAll", method = RequestMethod.POST)
	public ResponseEntity<?> getAll() throws Exception {
		List<ListPemakaiKontrasepsiRequest> result = familyPlanning.getAllData();
		if(result == null) {
			return new ResponseEntity<String>("Bad Request", HttpStatus.BAD_REQUEST);	
		}else {
			return ResponseEntity.ok().body(result);
		}
	}
	
}
