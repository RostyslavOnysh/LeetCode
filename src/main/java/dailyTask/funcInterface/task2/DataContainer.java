package dailyTask.funcInterface.task2;

class DataContainer<T> {
    private T value;

    public DataContainer(T value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
