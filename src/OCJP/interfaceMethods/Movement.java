package OCJP.interfaceMethods;

public interface Movement {

    default boolean hasLegs(){
        return false;
    }

    static boolean canBark(){
        System.out.println("woof");
        return true;
    }
}
