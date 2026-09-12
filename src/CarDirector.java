public class CarDirector {
    public Car createCityCar(CarBuilder builder) {
        return builder
                .setSeats(4)
                .setGps(true)
                .build();
    }

    public Car createTravelCar(CarBuilder builder) {
        return builder
                .setSeats(5)
                .setGps(true)
                .build();
    }
}