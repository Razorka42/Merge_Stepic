package org.stepic.java;

import java.io.*;
import java.util.Objects;

public class SerializedAnimals {
    static class Animal implements Serializable {
        private final String name;

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

    public static void main(String[] args) throws IOException {
        int size = 5;
        Animal animal1 = new Animal("lion");
        Animal animal2 = new Animal("cat");
        Animal animal3 = new Animal("dog");
        Animal animal4 = new Animal("leopard");
        Animal animal5 = new Animal("monkey");
        Animal[] animals = new Animal[]{animal1, animal2, animal3, animal4, animal5};
        ByteArrayOutputStream animalsOut = new ByteArrayOutputStream();
        ObjectOutputStream animalsOos = new ObjectOutputStream(animalsOut);
        animalsOos.writeInt(size);
        // animalsOos.writeObject(animals);
        animalsOos.writeObject(animal1);
        animalsOos.writeObject(animal2);
        animalsOos.writeObject(animal3);
        animalsOos.writeObject(animal4);
        animalsOos.writeObject(animal5);
        animalsOos.flush();
        animalsOos.close();
        byte[] data = animalsOut.toByteArray();
        Animal[] result = deserializeAnimalArray(data);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i].name);
        }
    }

    public static Animal[] deserializeAnimalArray(byte[] data) {
        int deserializatedSize;
        Animal[] deserializatedAnimals;

        try (ObjectInputStream animalsOis = new ObjectInputStream(new ByteArrayInputStream(data))) {
            deserializatedSize = animalsOis.readInt();
            deserializatedAnimals = new Animal[deserializatedSize];
            for (int i = 0; i < deserializatedSize; i++) {
                deserializatedAnimals[i] = (Animal) animalsOis.readObject();
            }

        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Класс не найден");
        } catch (IOException e) {
            throw new IllegalArgumentException("Ошибка вывода");
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("Неправильный класс");
        }
        return deserializatedAnimals;
    }
}
