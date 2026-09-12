public interface CarBuilder {
    CarBuilder setModel(String model);
    CarBuilder setEngine(String engine);
    CarBuilder setSeats(int seats);
    CarBuilder setGps(boolean gps);

    Car build();
}
