package OCJP.chapter3.sorting;

public class Rabbit implements Comparable<Rabbit> {

    private String name;
    private int id;

    public Rabbit(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Rabbit o) {
        return o.id;
    }
}
