public class Main {
    public static void main(String[] args) {
        System.out.println("Car Builder Assignment");

        Car sportsCar = new SportCarBuilder()
                .setModel("Mustang")
                .setGps(false)
                .build();

        Car suv = new SuvBuilder()
                .setModel("Hyundai Santa Fe")
                .setGps(true)
                .build();

        CarDirector director = new CarDirector();

        Car cityCar =  director.createCityCar(new SuvBuilder());
        Car travelCar = director.createTravelCar(new SuvBuilder());

        System.out.println(sportsCar);
        System.out.println(suv);

        System.out.println("City configuration: " + cityCar);
        System.out.println("Travel configuration: " + travelCar);
    }
}