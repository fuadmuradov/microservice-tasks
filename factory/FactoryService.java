package org.example.factory;

import static org.example.factory.ProgrammingLanguage.KOTLIN;
import static org.example.factory.ProgrammingLanguage.REACT;

public class FactoryService {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryByLanguage(REACT);
        Developer developer = developerFactory.createDeveloper();
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
