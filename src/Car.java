public final class Car {
    private final String model;
    private final String engine;
    private final int seats;
    private final boolean gps;

    public Car(String model, String engine, int seats, boolean gps){
        if (model == null || model.isBlank()){
            throw new IllegalArgumentException("Model must not be blank");
        }
        if (engine == null || engine.isBlank()){
            throw new IllegalArgumentException("Engine must not be blank");
        }
        if (seats <= 0){
            throw new IllegalArgumentException("Seats must be posistive");
        }

        this.model = model;
        this.engine = engine;
        this.seats = seats;
        this.gps = gps;
    }

    public String getModel() {
        return model;
    }

    public String getEngine(){
        return engine;
    }

    public int getSeats(){
        return seats;
    }

    public boolean hasGps(){
        return gps;
    }

    @Override
    public String toString(){
        return "Car{model = " + model + ", engine = " + engine
                + ", seats = " + seats + ", gps = " + gps + "}";
    }
}
