public class Main {
    public static void main(String[] args) {
        System.out.println("Car Builder Assignment");
        System.out.println("Project setup complete. Car builders will be added next.");

        Car sportsCar = new SportCarBuilder()
                .setModel("Mustang")
                .setGps(false)
                .build();

        Car suv = new SuvBuilder()
                .setModel("Hyundai Santa Fe")
                .setGps(true)
                .build();

        System.out.println(sportsCar);
        System.out.println(suv);
    }
}