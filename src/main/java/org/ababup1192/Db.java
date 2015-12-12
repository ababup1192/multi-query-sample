package org.ababup1192;

public class Db {
    public static <T> Query<T> from(T alias){
        return new Query<>(alias);
    }

}
