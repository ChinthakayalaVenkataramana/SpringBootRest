package com.vnk.Rest.Services;

import java.util.List;
import com.vnk.Rest.Entity.Travels;

public interface TravelServInter {
public String bookTravel(Travels traval);
public List<Travels> view();
public String someDetails();
public String updateDetails(String name,int id);
public String delete(int id);
}
