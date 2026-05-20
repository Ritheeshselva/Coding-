package Smart_Ride_Booking_Platform;

public class req2 {
    import java.util.*;

public class Main{
    
abstract static class Feecal{
  
    abstract  void Cal(int dis);
}

 public static class Bike extends Feecal{
     
     final int bikeCost = 10;
     
     @Override
      void Cal(int dis){
        
        int fee =  bikeCost * dis;
        
         System.out.println("The Cost :" +fee);
     }
     
 }
 
public static class Auto extends Feecal{
    
    final int autoCost = 15;
    
    @Override
     void Cal(int dis){
    int fee =  autoCost * dis;
    System.out.println("The Cost :" +fee);
    }
}

public static class MiniCab extends Feecal{
    
    final int MiniCabCost = 20;
    
    @Override
    void Cal(int dis){
    int fee =  MiniCabCost * dis;
    System.out.println("The Cost :" +fee);
    }
    
}

public static class SUV extends Feecal{
    
    final int SUVCost = 25;
    
    @Override
    void Cal(int dis){
    int fee =  SUVCost * dis;
    System.out.println("The Cost :" +fee);
    }
    
}

	public static void main(String[] args) {
	
	Bike obj1 = new Bike();
    Auto obj2 = new Auto();
    MiniCab obj3 = new MiniCab();
    SUV obj4 = new SUV();
	
	obj1.Cal(100);
	obj2.Cal(200);
	obj3.Cal(1000);
	obj4.Cal(500);
	}
}
}
