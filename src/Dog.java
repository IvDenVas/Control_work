import java.util.List;

public class Dog extends Animals{
    public Dog(String name, String dateOfBirth, List<String> commands) {
        super(name, dateOfBirth, commands);
    }
    public Dog(String name, String dateOfBirth) {
        super(name,dateOfBirth);
    }


}
