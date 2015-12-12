package org.ababup1192;

public class QueryWhere {
    private Query query;

    public QueryWhere(Query query){
        this.query = query;
    }

    public QueryCondition and(String name){
        return new QueryCondition(name, query);
    }

    public String select(){
        return query.select();
    }
}
