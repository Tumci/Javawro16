package pl.com.sda.rafal.zientara.apps.lesson3;

public abstract class Process<Input, Output> {
    protected Input data;

    public Process(Input data) {
        this.data = data;
    }

    public abstract Output execute();
}
