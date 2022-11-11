package com.SpringBoot.Tourist.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.Tourist.Model.Tourist;

@Repository
public interface TouristRepository extends JpaRepository<Tourist, Integer>
{
	public Tourist findById(int id);
	public List<Tourist> findAllByOrderByFirstNameDesc();
}
