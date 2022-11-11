package com.SpringBoot.Tourist.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBoot.Tourist.Model.Tourist;
import com.SpringBoot.Tourist.Repository.TouristRepository;

@Service
public class TouristServiceImpl implements TouristService
{
	@Autowired
	private TouristRepository touristRepository;
	@Override
	public List<Tourist> getAllTouritersByDesc() 
	{
		return touristRepository.findAllByOrderByFirstNameDesc();
	}

	@Override
	public Tourist getStudentById(int id) 
	{
		return touristRepository.findById(id);
	}

	@Override
	public Tourist addTourister(Tourist tour) 
	{
		
		touristRepository.save(tour);
		return tour;
	}

	
	
		
}
