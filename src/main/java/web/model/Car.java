package web.model;

public class Car {
    //private Long id;
    private String model;
    private int series;
    private String type;

    public Car() {
    }

    public Car(String model, int series, String type) {
        this.model = model;
        this.series = series;
        this.type = type;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return this.series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", type=" + type +
                '}';
    }
}
