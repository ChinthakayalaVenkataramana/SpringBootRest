package com.vnk.Rest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vnk.Rest.Entity.Travels;

public interface TravelRepo extends JpaRepository<Travels, Integer> {
	@Query("select id,travelName from Travels")
	public String sDetails();
	@Query("select t from Travels t where cName=:name and id=:id1")
	public String update(@Param(value = "name") String name, @Param(value = "id1") int id1);
}
