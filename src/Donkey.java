import java.util.List;

public class Donkey extends Animals{
    public Donkey(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
    }

    public Donkey(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
}
