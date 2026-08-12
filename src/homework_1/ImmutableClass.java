package homework_1;


public final class ImmutableClass {
    private final SomeClass sClass;

    public ImmutableClass(SomeClass sClass) {
        this.sClass = new SomeClass(sClass);
    }

    public SomeClass getSClass() {
        return new SomeClass(sClass);
    }
}