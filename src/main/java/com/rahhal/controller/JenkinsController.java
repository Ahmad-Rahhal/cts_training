package com.rahhal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jenkins")
public class JenkinsController {
	
@GetMapping
@RequestMapping(path = {"/getJenkins"})
public String welcomeJenkins() {
	return "Welcome to Jenkins";
}
@PostMapping
@RequestMapping(path = {"/postJenkins/{name}"})
public String welcomePostJenkins(@PathVariable String name) {
	return "Welcome " + name;
}

}
