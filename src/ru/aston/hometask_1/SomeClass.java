package ru.aston.hometask_1;

public class SomeClass  {
    private int number;
    private double[] numbers;

    public SomeClass(int number, double[] numbers) {
        this.number = number;
        if (numbers == null) {
            this.numbers = new double[10];
        }
        else {
            this.numbers = numbers.clone();
        }
    }

    public SomeClass(SomeClass original) {
        if (original == null) {
            this.number = 0;
            this.numbers = new double[10];
        }
        else {
            this.number = original.number;
            if (original.numbers == null) {
                this.numbers = new double[10];
            }
            else {
                this.numbers = original.numbers.clone();
            }
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }

    public void setNumbers(double[] numbers) {
        if (numbers != null) {
            this.numbers = numbers.clone();
        }
    }
    public void getNumbers() {
        for (double number : numbers) {
            System.out.println(number);
        }
    }
}