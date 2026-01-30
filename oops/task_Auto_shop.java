 abstract class Vehicle{
    protected String vehicleId;
    protected String brand;
    protected double rentPerDay;
    
    Vehicle(String vehicleId, String brand, double rentPerDay){
        this.vehicleId=vehicleId;
        this.brand=brand;
        this.rentPerDay=rentPerDay;
    }
    
   abstract double calculateRent(int days);
    
    void displayDetails(){
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Rent per day: " + rentPerDay);
    }
    
}

class Car extends Vehicle{
    int numberOfDoors;
    Car(String vehicleId, String brand, double rentPerDay, int numberOfDoors){
        super(vehicleId,brand,rentPerDay);
        this.numberOfDoors=numberOfDoors;
    }
    double calculateRent(int days){
          return rentPerDay * days;
    }
}

class Bike extends Vehicle{
    boolean hasHelmet;
    Bike(String vehicleId, String brand, double rentPerDay, boolean hasHelmet){
        super(vehicleId,brand,rentPerDay);
        this.hasHelmet=hasHelmet;
    }
    
    double calculateRent(int days){
          return (rentPerDay * days)-100;
    }
    
}

class Truck extends Vehicle{
    double loadCapacity;
    Truck(String vehicleId, String brand, double rentPerDay, double loadCapacity){
        super(vehicleId,brand,rentPerDay);
        this.loadCapacity=loadCapacity;
    }
    double calculateRent(int days){
          return (rentPerDay * days)+500;
    }
}
 public class Main{
public static void main(String []args){
        Vehicle v1 = new Car("C101", "Toyota", 2000, 4);
        Vehicle v2 = new Bike("B201", "Yamaha", 800, true);
        Vehicle v3 = new Truck("T301", "Volvo", 5000, 10);
        System.out.println(v1.calculateRent(3));
        System.out.println(v2.calculateRent(3));
        System.out.println(v3.calculateRent(3));
    
}   
}