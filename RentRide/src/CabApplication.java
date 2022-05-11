import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import com.cab.model.Car;
import com.cab.model.Customer;
import com.cab.model.Driver;
import com.cab.service.CustomerService;
import com.cab.service.DriverService;

public class CabApplication {
	public static void main(String[] args) {
		ArrayList<Driver> driverList ;
		Scanner sc = new Scanner(System.in);
		double rideDistance;
		String carModel;
		
		Driver driver[] = new Driver[5];
		driver[0] = new Driver("A",4, 500,new Car("Sedan"));
		driver[1] = new Driver("B",3.3, 1000,new Car("HatchBack"));
		driver[2] = new Driver("C",3.8 ,200 ,new Car("FiveSeater"));
		driver[3] = new Driver("D",4.1,700,new Car("Sedan"));
		driver[4] = new Driver("E",4.7,430,new Car("HatchBack"));
		
		driverList = new ArrayList<>(Arrays.asList(driver));
		
		DriverService driverService = new DriverService(driverList);
		
		System.out.println("Enter ride distance");
		rideDistance = Double.parseDouble(sc.nextLine());
		System.out.println("Enter car Model");
		carModel = sc.nextLine();
		
		Customer customer = new Customer(rideDistance);
		
		
		CustomerService customerService = new CustomerService(driverService);
		Driver d = customerService.bookCar(rideDistance, carModel);
		if(d.equals(null)) {
			System.out.println("Please select other model");
		}else {
			System.out.println("Car booked"+d);
		}
	
		
	}
}
