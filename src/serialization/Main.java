package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources", "users.out");
//        writeObj(path);
        readObj(path);

        User user = new User(1,"");
        user.clone();
//        Object obj2 = obj1;
    }

    public static void writeObj(Path path) throws IOException {
        var bob = new User(22, "Bob");

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()));
        objectOutputStream.writeObject(bob);
        objectOutputStream.close();
    }

    public static void readObj(Path path) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()));
        var obj = objectInputStream.readObject();

        System.out.println(obj);
    }
}

// Reflection API
