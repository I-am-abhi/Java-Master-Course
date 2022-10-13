package JavaEnums;

public class JavaEnumExperiment {
    enum Level{
        LOW,
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        //An enum is a special "class" that represents a
        // group of constants (unchangeable variables, like final variables).
        //To create an enum, use the enum keyword (instead of class or interface)
        // , and separate the constants with a comma. Note that they should be
        // in uppercase letters:
        Level myVar = Level.MEDIUM;
        System.out.println(myVar);

        switch(myVar){
            case LOW -> System.out.println("Low level");
            case MEDIUM -> System.out.println("Medium level");
            case HIGH -> System.out.println("High level");
        }

    }
}
