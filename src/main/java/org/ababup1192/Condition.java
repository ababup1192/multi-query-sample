package org.ababup1192;

public class Condition<A> {
    private String name;
    private A value;
    private CompareType compareType;

    public Condition(String name, A value, CompareType compareType) {
        this.name = name;
        this.value = value;
        this.compareType = compareType;
    }

    public String getName(){
        return name;
    }

    public A getValue(){
        return value;
    }

    public CompareType getCompareType(){
        return compareType;
    }


}
