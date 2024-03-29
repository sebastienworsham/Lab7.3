package edu.sdccd.cisc191;

import java.util.ArrayList;

public class ArrayListConsumer
{
    private ArrayList<String> list;

    public ArrayListConsumer(ArrayList<String> list)
    {
        this.list = list;
    }


    public String consume()
    {
        list.remove(0);
        // TODO remove and return the 0th element from the array, shifting remaining elements up one
        return list.get(0);
    }

}
