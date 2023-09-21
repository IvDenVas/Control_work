import java.io.*;
public class AnimalService implements Writable, Readable{
    public AnimalService() {
    }
    @Override
    public void write(Object o, String name) throws RuntimeException, IOException {
        FileWriter writer = new FileWriter(name, true);
        writer.write(o.toString()+ "\n");
        System.out.println("Запись в файл завершена!");
        writer.close();
    }
    @Override
    public void readListOfClass(String name) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(new File(name)));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
    }

}
