package akproject;

public class Main {
    public static void main(String[] args) {

        Case theCase = new Case("2932","Corsair",new Dimension(24,22,10));
        Monitor theMonitor = new Monitor("LQt34","BenQ",22,new Resolution(1920,1080));
        Motherboard theMotherboard = new Motherboard("RS123", "Asus",4,2);

        PC myPc = new PC(theMonitor, theCase, theMotherboard);

        myPc.getTheMonitor().drawPixelAt(123,124,"Black");
        myPc.getTheCase().pressPowerButton();
        myPc.getTheMotherboard().loadProgram("Windows");

    }
}
