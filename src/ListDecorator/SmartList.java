package ListDecorator;


import java.util.List;

public class SmartList<E> extends AbstractListDecorator<E> {

    public SmartList(List<E> inner) {
        super(inner);
    }

    public E get(int index){

        while(super.size()<=index){
            super.add(null);
        }
        return (E) super.get(index);
    }

}
