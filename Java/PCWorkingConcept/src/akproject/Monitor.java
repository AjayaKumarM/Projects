package akproject;

public class Monitor {

    private String modelName;
    private String manufacturer;
    private int size;
    private Resolution resolution;

    public Monitor(String modelName, String manufacturer, int size, Resolution resolution) {
        this.modelName = modelName;
        this.manufacturer = manufacturer;
        this.size = size;
        this.resolution = resolution;
    }

    public void drawPixelAt(int x, int y, String color){
        System.out.println("Drawing pixel at "+x+", "+y+" with color "+color );
    }

    public String getModelName() {
        return modelName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
