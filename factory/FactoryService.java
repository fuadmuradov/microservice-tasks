package org.example.factory;

import static org.example.factory.ProgrammingLanguage.*;

public class FactoryService {
    public static void main(String[] args) {
        var developerFactory = createDeveloperFactoryByLanguage(JAVA);
        var developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
    public static DeveloperFactory createDeveloperFactoryByLanguage(ProgrammingLanguage language){
       return switch (language){
            case JAVA -> new JavaDeveloperFactory();
           case KOTLIN -> new KotlinDeveloperFactory();
           case REACT -> new ReactDeveloperFactory();
        };
    }
}
