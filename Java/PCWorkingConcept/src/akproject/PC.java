package akproject;
public class PC {

    private Monitor theMonitor;
    private Case theCase;
    private Motherboard theMotherboard;

    public PC(Monitor theMonitor, Case theCase, Motherboard theMotherboard) {
        this.theMonitor = theMonitor;
        this.theCase = theCase;
        this.theMotherboard = theMotherboard;
    }

    public Monitor getTheMonitor() {
        return theMonitor;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Motherboard getTheMotherboard() {
        return theMotherboard;
    }
}
