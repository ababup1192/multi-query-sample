package org.ababup1192;

public class QueryCondition {
    private String name;
    private Query query;

    public QueryCondition(String name, Query query) {
        this.name = name;
        this.query = query;
    }

    public <A> QueryWhere is(A value) {
        query.addCondition(new Condition<>(name, value, CompareType.EQUAL));
        return new QueryWhere(query);
    }

     public QueryWhere isNull() {
        query.addCondition(new Condition<>(name, null, CompareType.IS_NULL));
        return new QueryWhere(query);
    }


}
