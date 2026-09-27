package org.example.car;

public class Car {
    private static int counter;

    private String color;
    private String model;

    public Car() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public void drive() {
        System.out.println("Едем!");
    }

    public void stop() {
        System.out.println("Останавливаемся!");
    }

    public String getInfo() {
        return "Информация. Цвет: " + color + " Модель: " + model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == "BMV" || model == "audi") {
            this.model = model;
        } else {
            System.out.println("Ошибка");
        }
    }
}
