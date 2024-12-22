package com.vnk.Rest.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vnk.Rest.Entity.Travels;
import com.vnk.Rest.Repository.TravelRepo;
@Service
public class TravelServ implements TravelServInter{
	@Autowired
    private TravelRepo repo;
	@Override
	public String bookTravel(Travels travel) {
		repo.save(travel);
		return "Your ticket Successfully Boocked "+travel.getId() ;
	}
	
	@Override
	public List<Travels> view() {
		List<Travels> st=repo.findAll();
		return st;
	}

	@Override
	public String someDetails() {
		
		return repo.sDetails();
	}
	
	@Override
	public String updateDetails(String name,int id) {
		Optional<Travels> opt=repo.findById(id);
		
			if(!opt.isEmpty()) {
			Travels tr=opt.get();
			tr.setCName(name);
			repo.save(tr);
			return "Successfully Updated"+tr.toString();
			}else {
				return "Not found";
				}
	}

	@Override
	public String delete(int id) {
		if(repo.existsById(id)) {
		   repo.deleteById(id);
		   return "Cancel your ticket Successfully";
		}else {
			return "Yor Ticket Not Booked";
		}
	}

}
