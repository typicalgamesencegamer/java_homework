package ru.aston.hometask_1;


public final class ImmutableClass {
    private final SomeClass sClass;

    public ImmutableClass(SomeClass sClass) {
        if (sClass == null) {
            this.sClass = new SomeClass(0, new double[10]);
        }
        else {
            this.sClass = new SomeClass(sClass);
        }
    }

    public SomeClass getSClass() {
        return new SomeClass(sClass);
    }
}