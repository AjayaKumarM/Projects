package akproject;

public class Motherboard {
    private String modelName;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;

    public Motherboard(String modelName, String manufacturer, int ramSlots, int cardSlots) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
    }

    public void loadProgram(String programName){
        System.out.println(programName+" is loading");
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }
}
