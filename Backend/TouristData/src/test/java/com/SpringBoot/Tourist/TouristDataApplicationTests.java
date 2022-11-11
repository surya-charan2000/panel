package com.SpringBoot.Tourist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.SpringBoot.Tourist.Model.Tourist;
import com.SpringBoot.Tourist.Repository.TouristRepository;
import com.SpringBoot.Tourist.Service.TouristServiceImpl;

@SpringBootTest
class TouristDataApplicationTests
{
	
	@Autowired
	private TouristServiceImpl touristServiceImpl;
	
	@MockBean
	private TouristRepository touristRepository;
	
	@Test
	public void testCreateTourist()
	{
		Tourist tour=new Tourist(12,"vamsi","atluri","male",22,"gannavaram",5);
		when(touristRepository.save(tour)).thenReturn(tour);
		assertEquals(12, touristServiceImpl.addTourister(tour).getId());
	}
	
	@Test
	public void testgetTourister()
	{
		List<Tourist> list=List.of(new Tourist(11,"akhil","gaddam","male",21,"tiruvuru",4));
		when(touristRepository.findAllByOrderByFirstNameDesc()).thenReturn(list);
		assertEquals(1, touristServiceImpl.getAllTouritersByDesc().size());
	}
	

	

}
