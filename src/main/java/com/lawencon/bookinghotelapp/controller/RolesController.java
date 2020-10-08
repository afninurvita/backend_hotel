package com.lawencon.bookinghotelapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lawencon.bookinghotelapp.model.Roles;
import com.lawencon.bookinghotelapp.service.RolesService;

@RestController
@RequestMapping("/roles")
public class RolesController {

	@Autowired
	private RolesService rolesService;
	
	@PostMapping("/")
	public ResponseEntity<?> insertRoles(@RequestBody String rolesStr) {
		Roles roles = new Roles();
		
		try {
			roles = new ObjectMapper().readValue(rolesStr, Roles.class);
			roles = rolesService.insert(roles);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(roles, HttpStatus.OK);
	}
	
	@GetMapping("/all")
	public ResponseEntity<?> getAllRoles() {
		List<Roles> listRoles = new ArrayList<>();
		
		try {
			listRoles = rolesService.getListRoles();
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(listRoles, HttpStatus.OK);
	}
}
