package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetConsumer {
    private HashSet<String> set;
    public HashSetConsumer(HashSet<String> set) {
        this.set = set;
    }

    public boolean consume (String string) {
        boolean containsString;

        if (set.contains(string)) {
            set.remove(string);
            return true;
        } else {
            return false;
        }
    }
}
