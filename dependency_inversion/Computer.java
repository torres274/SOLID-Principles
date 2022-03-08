package dependency.inversion;

// this principle states refers to the decoupling of software modules, this way instead of high-level modules depending on low-level modules, both will depend on abstractions.
public class Computer {
    private final Keyboard keyboard;
    private final Monitor monitor;

    public Computer(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }

}
