public class Main {
    public static void main(String[] args) {
        Car car = new Car(4, "Generic Car");
        Car mitsubishi = new Mitsubishi(6, "Outlander");
        Car holden = new Holden(8, "Commodore");
        Car ford = new Ford(4, "Mustang");

        // Display Car Info
        System.out.println("\n== Car Info ==");
        System.out.println(car);
        System.out.println(mitsubishi);
        System.out.println(holden);
        System.out.println(ford);

        // Call methods using polymorphism
        System.out.println("\n== Car Actions ==");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
    }
}
