package gan.homework1;

public abstract class Fruit<T extends Number> {
    private T weight;

    protected Fruit(T weight) {
        this.weight = weight;
    }

    public T getWeight() {
        return weight;
    }
}
