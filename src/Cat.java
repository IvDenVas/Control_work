import java.util.List;

public class Cat extends Animals{
    public Cat(String name, String dateOfBirth, List<String > commands) {
        super(name, dateOfBirth);
    }

    public Cat(String name, String dateOfBirth) {
        super(name, dateOfBirth);
    }
}
