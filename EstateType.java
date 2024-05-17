package org.example;

public enum EstateType {
    LAND("Torpaq"),
    APARTMENT("Manzil");

    private String description;
     EstateType(String desc){
        this.description = desc;
    }
}
