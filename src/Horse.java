import java.util.List;

public class Horse extends Animals{
    public Horse(String name, String dateOfBirth, List commands) {
        super(name, dateOfBirth, commands);
    }

    public Horse(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
}
