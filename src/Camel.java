import java.util.List;

public class Camel extends Animals{
    public Camel(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
    }

    public Camel(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
}
