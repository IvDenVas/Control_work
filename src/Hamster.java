import java.util.List;

public class Hamster extends Animals{
    public Hamster(String name, String dateOfBirth, List commands) {
        super(name, dateOfBirth, commands);
    }

    public Hamster(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
}
