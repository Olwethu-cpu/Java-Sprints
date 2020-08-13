package POJOS;

public class Managers  implements java.io.Serializable {


     private int managerId;
     private Cinema cinema;
     private String name;
     private String username;
     private String password;

    public Managers() {
    }

    public Managers(int managerId, Cinema cinema, String name, String username, String password) {
       this.managerId = managerId;
       this.cinema = cinema;
       this.name = name;
       this.username = username;
       this.password = password;
    }
   
    public int getManagerId() {
        return this.managerId;
    }
    
    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }
    public Cinema getCinema() {
        return this.cinema;
    }
    
    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


