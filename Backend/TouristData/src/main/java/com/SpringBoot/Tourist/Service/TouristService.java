package com.SpringBoot.Tourist.Service;

import java.util.List;
import com.SpringBoot.Tourist.Model.Tourist;
public interface TouristService
{

	List<Tourist> getAllTouritersByDesc();

	Tourist getStudentById(int id);

	Tourist addTourister(Tourist tour);

	
	

}
