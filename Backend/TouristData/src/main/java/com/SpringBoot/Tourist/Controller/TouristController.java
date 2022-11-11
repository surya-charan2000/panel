package com.SpringBoot.Tourist.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.SpringBoot.Tourist.Model.Tourist;
import com.SpringBoot.Tourist.Service.TouristService;


@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/tourist")
public class TouristController 
{
	@Autowired
	private TouristService touristService;
	@GetMapping("/details")
	public List<Tourist> getAllTouristers()
	{
		return touristService.getAllTouritersByDesc();
	}
	@GetMapping("/details/{id}")
	public Tourist getTourister(@PathVariable("id") int id)
	{
		return touristService.getStudentById(id);
	}
	@PostMapping("/details")
	public void addTourister(@RequestBody Tourist tour)
	{
		touristService.addTourister(tour);
	}
	
}
