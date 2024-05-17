package org.example.singleton;

public enum Connection {
    INSTANCE,
    INSTANCE2;
    private static String queryString = "query String";

    public void addQuery(String query){
        queryString += (query+"\n");
    }

    public String displayQuery(){
        return queryString;
    }
}
