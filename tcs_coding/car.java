package tcs_coding;

import java.util.*;

public class car {
    private int carNumber;
    private int carQuantity;
    private String carModel;
    private int carOnroadprice;

    //constructor
    car(int carNumber, int carQuantity, String carModel, int carOnroadprice) {
        this.carNumber = carNumber;
        this.carQuantity = carQuantity;
        this.carModel = carModel;
        this.carOnroadprice = carOnroadprice;
    }

    //getters
    public int getCarNumber() {
        return carNumber;
    }
    public int getCarQuantity() {
        return carQuantity;
    }
    public String getCarModel() {
        return carModel;
    }
    public int getCarOnroadprice() {
        return carOnroadprice;
    }

    //setters


    //output format
    @Override
    public String toString() {
        return "CarNumber-"+carNumber+"\n"+
               "CarQuantity-"+carQuantity+"\n"+
               "CarModel-"+carModel+"\n"+
               "CarOnRoadPrice"+carOnroadprice;
    }
}

class cartypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of cars you want to add to the list: ");
        int n = sc.nextInt();
        car[] cars = new car[n];

        for(int i=0 ; i<n ; i++){
            int carNumber = sc.nextInt();
            int carQuantity = sc.nextInt();
            sc.nextLine();
            String carModel = sc.nextLine();
            int carOnroadprice = sc.nextInt();

            cars[i] = new car(carNumber, carQuantity, carModel, carOnroadprice);
        }

        sc.nextLine();
        String searchModel = sc.nextLine();
        car minPriceCar = findMinOnRoadPrice(cars);

        
        car searchedCar = searchCarModel(cars, searchModel);

        if(minPriceCar == null)
            System.out.println("No Car found with the mentioned attribute.");
        else    
            System.out.println(minPriceCar);

        if(searchedCar == null)
            System.out.println("No Car found with the mentioned attribute.");
        else
            System.out.println(searchedCar);

        sc.close();

    }

    public static car findMinOnRoadPrice(car[] cars){
        if(cars.length == 0) {
            return null;
        }

        car minPriceCar = cars[0];
        for(car car: cars) {
            if(car.getCarOnroadprice() < minPriceCar.getCarOnroadprice())
                minPriceCar = car;
        }
        return minPriceCar;
    }

    public static car searchCarModel(car[] cars, String searchModel) {
        for(car car: cars) {
            if(car.getCarModel().equalsIgnoreCase(searchModel))
                return car;
        }
        return null;
    }
}
