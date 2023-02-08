package Exceptions;

class Main {
    public static void main(String... args) {
        try (
                Car car = new Car()
        ) {
            car.drive();
        } catch (Exception e) {
            e.addSuppressed(e);
        }
    }

    public static class Car implements AutoCloseable {

        @Override
        public void close() {
            System.out.println("Машина закрывается...");
        }

        public void drive() {
            System.out.println("Машина поехала.");
        }
    }
}






