import java.util.Optional;

public class Factory {
    public Optional<PassengerCarrier> create(String typeOfPassengerCarrier){
        return switch (typeOfPassengerCarrier){
            case "Airplane" -> Optional.of(new Airplane());
            case "Train" -> Optional.of(new Train());
            case "Automobile" -> Optional.of(new Automobile());
            default -> Optional.empty();
        };
    }
}
