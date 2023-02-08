package IO.Deserialize;

import java.io.*;
import java.util.Objects;

class Animal implements Serializable {
    private final String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Animal[] massive = {new Animal("cat"), new Animal("dog")};
        byte[] animals = serializeAnimals(massive);
        Animal[] newmas = deserializeAnimalArray(animals);
        for (Animal i : newmas) {
            System.out.println(i.getName());
        }
    }

    public static byte[] serializeAnimals(Animal[] animals) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (ObjectOutputStream objectOutputStream =
                     new ObjectOutputStream(byteArrayOutputStream)) {
            objectOutputStream.writeInt(animals.length);
            for (int i = 0; i < animals.length; i++) {
                objectOutputStream.writeObject(animals[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals;
        try (ObjectInputStream in = new ObjectInputStream(new ByteArrayInputStream(data))) {
            animals = new Animal[in.readInt()];
            for (int i = 0; i < animals.length; i++) {
                animals[i] = (Animal) in.readObject();
            }

        } catch (IOException | ClassNotFoundException | ClassCastException | NegativeArraySizeException e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }

}