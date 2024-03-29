package edu.sdccd.cisc191;

public class ArrayConsumer {
    private String[] array;
    public ArrayConsumer(String[] array) {
        this.array = array;
    }

    public String consume() {
        String consumed = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }

        return consumed;
    }
}
