package org.ababup1192;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Query<T> {
    private final IdentityHashMap<Field, String> map = new IdentityHashMap<>();
    private final List<Condition> conditions = new ArrayList<>();

    public Query(T alias) {
        for (Field field : alias.getClass().getFields()) {
            map.put(field, field.getName());
        }
    }

    public QueryCondition filter(String name) {
        return new QueryCondition(name, this);
    }

    public void addCondition(Condition condition) {
        conditions.add(condition);
    }

    public String select() {

        return String.join(", ", conditions.stream()
                .map(condition -> {
                    if (condition.getCompareType() == CompareType.IS_NULL){
                         return condition.getName() + " = null";
                    }else {
                       return condition.getName() + " " + condition.getCompareType().getString()
                                + " " + condition.getValue();
                    }
                })
                .collect(Collectors.toList()));
    }

}
