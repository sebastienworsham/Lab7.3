package edu.sdccd.cisc191;

public class ArrayProducer {
    private String[] array;
    public ArrayProducer(String[] array) {
        this.array = array;
    }

    public void produce(int i, String string) {
        array[i] = string;
    }
}
