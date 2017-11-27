package OCJA.interfaceMethods;

public interface Flying {
    default boolean hasLegs(){
        return true;
    }
}
