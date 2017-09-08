package OCJP.interfaceMethods;

public interface Flying {
    default boolean hasLegs(){
        return true;
    }
}
