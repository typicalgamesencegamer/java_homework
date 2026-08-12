package homework_1;

public class SomeClass  {
    private int number;
    private double[] numbers;

    public SomeClass(int number, double[] numbers) {
        this.number = number;
        this.numbers = numbers.clone();
    }

    public SomeClass(SomeClass original) {
        this.number = original.number;
        this.numbers = original.numbers.clone();
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int getNumber() {
        return this.number;
    }

    public void setNumber(double number) {
        this.numbers[0] =  number;
    }
    public void getNumbers() {
        for (double number : numbers) {
            System.out.println(number);
        }
    }



}