public class Main {
    public static void main(String[] args) {
        Double distance = 1500.0;
        String movement = "Earth";
        Factory factory = new Factory();
        PassengerCarrier passengerCarrier = null;
        if (movement.equalsIgnoreCase(Movement.Earth.name())) {
            if (distance < 2000) passengerCarrier = factory.create("Automobile").get();
            else  passengerCarrier = factory.create("Train").get();
        } else if (movement.equalsIgnoreCase(Movement.Water.name())) {
            passengerCarrier = factory.create("Airplane").get();
        }
        System.out.println(passengerCarrier);
    }
}