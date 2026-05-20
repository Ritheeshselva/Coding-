package Smart Ride Booking Platform;

public class req1 {
    import java.util.*;

public class Main{
    
abstract static class User{
    int id;
    String name;
    int phno;
    User(int id,String name,int phno){
        this.id=id;
        this.name=name;
        this.phno=phno;
    }
    abstract void login();
}

public static class Customer extends User{
    
    Customer(int id,String name,int phno){
        super(id,name,phno);
    }
    
    @Override
    public void login(){
        
        System.out.println("Welcome"+name+ "Have a good day");
    }
    
    public void bookRide(String place){
        
        System.out.println("Hi"+name+ "Enjoy Your ride to"+place);
    }
    
     public void cancelRide(){
         
        System.out.println("Successfully canceled your ride");
    }
    
     public void viewRide(){
        
        System.out.println("Tap To View Your Rides");
    }
    
}

public static class Driver extends User{
    
     Driver(int id,String name,int phno){
        super(id,name,phno);
    }

     @Override
    public void login(){
        
        System.out.println("Welcome"+name+ "Have a good day");
    }
    
     public void acceptRide(String Name, String place){
         
        System.out.println(Name+"Wants to go to"+ place);
    }
     public void completeRide(String Name,String place){
         
        System.out.println(Name+"Droped At"+place+"Successfuly");
    }
     public void updateRide(){
        
        System.out.println("Completed the Ride Successfuly");
    }
    
}

	public static void main(String[] args) {
		Customer obj1 = new Customer(1,"Ravi",99990890);
		Driver obj2 = new Driver(1,"RaviRam",78787969);
		
		obj1.login();
		obj1.bookRide("Salem");
		obj1.cancelRide();
		obj1.viewRide();
		
		obj2.login();
		obj2.acceptRide("Anbu","Steelplant-Rd");
		obj2.completeRide("Anbu","Steelplant-Rd");
		obj2.updateRide();
	}
}
}
