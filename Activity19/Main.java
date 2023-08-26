package Activity19;

public class Main {
    public static void main(String[] args) {


        // Create two Truck objects
        Truck truck1 = new Truck();
        truck1.setModel(2022);
        truck1.setName("Ford F-150");
        truck1.setColor("Red");

        Truck truck2 = new Truck();
        truck2.setModel(2023);
        truck2.setName("Chevrolet Silverado");
        truck2.setColor("Blue");

        // Print Truck objects
        System.out.println("Truck 1:");
        System.out.println("Model: " + truck1.getModel());
        System.out.println("Name: " + truck1.getName());
        System.out.println("Color: " + truck1.getColor());

        System.out.println("\nTruck 2:");
        System.out.println("Model: " + truck2.getModel());
        System.out.println("Name: " + truck2.getName());
        System.out.println("Color: " + truck2.getColor());



        // Create a Van object
        Van van = new Van();
        van.setModel(2022);
        van.setName("Mercedes-Benz Sprinter");
        van.setColor("White");

        // Print Van object
        System.out.println("\nVan:");
        System.out.println("Model: " + van.getModel());
        System.out.println("Name: " + van.getName());
        System.out.println("Color: " + van.getColor());
    }
}
