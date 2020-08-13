package POJOS;

import java.util.HashSet;
import java.util.Set;

public class Cinema  implements java.io.Serializable {


     private int cinemaId;
     private String name;
     private int province;
     private String location;
     private Set managerses = new HashSet(0);
     private Set bookingses = new HashSet(0);

    public Cinema() {
    }

	
    public Cinema(int cinemaId, String name, int province, String location) {
        this.cinemaId = cinemaId;
        this.name = name;
        this.province = province;
        this.location = location;
    }
    public Cinema(int cinemaId, String name, int province, String location, Set managerses, Set bookingses) {
       this.cinemaId = cinemaId;
       this.name = name;
       this.province = province;
       this.location = location;
       this.managerses = managerses;
       this.bookingses = bookingses;
    }
   
    public int getCinemaId() {
        return this.cinemaId;
    }
    
    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public int getProvince() {
        return this.province;
    }
    
    public void setProvince(int province) {
        this.province = province;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    public Set getManagerses() {
        return this.managerses;
    }
    
    public void setManagerses(Set managerses) {
        this.managerses = managerses;
    }
    public Set getBookingses() {
        return this.bookingses;
    }
    
    public void setBookingses(Set bookingses) {
        this.bookingses = bookingses;
    }




}


