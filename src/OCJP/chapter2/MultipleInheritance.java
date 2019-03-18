package OCJP.chapter2;

interface Top {
    default String name() { return "unnamed"; }
}
interface Left extends Top {
    default String name() { return getClass().getName(); }
}
interface Right extends Top {}

interface Bottom extends Left, Right {}

public class MultipleInheritance implements Bottom{
    public static void main( String[] args){
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        System.out.println(multipleInheritance.name());
    }
}
