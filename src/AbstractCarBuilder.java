public abstract class AbstractCarBuilder implements CarBuilder{
    private String model;
    private String engine;
    private int seats;
    private  boolean gps;

    protected AbstractCarBuilder(String model, String engine, int seats, boolean gps){
        this.model = model;
        this.engine = engine;
        this.seats = seats;
        this.gps = gps;
    }

    @Override
    public CarBuilder setModel(String model){
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder setEngine(String engine){
        this.engine = engine;
        return this;
    }

    @Override
    public CarBuilder setSeats(int seats){
        this.seats = seats;
        return this;
    }

    @Override
    public  CarBuilder setGps(boolean gps){
        this.gps = gps;
        return this;
    }

    @Override
    public Car build(){
        return new Car(model, engine, seats, gps);
    }

}