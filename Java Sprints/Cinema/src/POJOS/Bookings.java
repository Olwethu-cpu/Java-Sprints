package POJOS;

public class Bookings  implements java.io.Serializable {


     private Integer bookingId;
     private Cinema cinema;
     private Customers customers;
     private Movies movies;
     private String time;
     private String seat;

    public Bookings() {
    }

    public Bookings(Cinema cinema, Customers customers, Movies movies, String time, String seat) {
       this.cinema = cinema;
       this.customers = customers;
       this.movies = movies;
       this.time = time;
       this.seat = seat;
    }
   
    public Integer getBookingId() {
        return this.bookingId;
    }
    
    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }
    public Cinema getCinema() {
        return this.cinema;
    }
    
    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
    public Customers getCustomers() {
        return this.customers;
    }
    
    public void setCustomers(Customers customers) {
        this.customers = customers;
    }
    public Movies getMovies() {
        return this.movies;
    }
    
    public void setMovies(Movies movies) {
        this.movies = movies;
    }
    public String getTime() {
        return this.time;
    }
    
    public void setTime(String time) {
        this.time = time;
    }
    public String getSeat() {
        return this.seat;
    }
    
    public void setSeat(String seat) {
        this.seat = seat;
    }




}


