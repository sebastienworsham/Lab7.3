package edu.sdccd.cisc191;

import java.util.HashSet;

public class HashSetProducer {
    HashSet<String> set;
    public HashSetProducer(HashSet<String> set) {
        this.set = set;
    }

    public Boolean produce(String string) {
        Boolean containString;
        if (set.contains(string)) {
            return false;

        } else {
            set.add(string);
            return true;
        }
    }
}
