package akproject;

public class Case {

    private String modelName;
    private String manufacturer;
    private Dimension dimension;

    public Case(String modelName, String manufacturer, Dimension dimension) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.dimension = dimension;
    }

    public void pressPowerButton(){
        System.out.println("Power button is pressed");
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimension getDimension() {
        return dimension;
    }
}
