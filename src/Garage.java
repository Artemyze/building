import java.util.Objects;

public class Garage extends Building implements setValues {
    private int carCapacity;
    private String description;
    public Garage(ValuesForBuildings... args) {
        super();
        //final int INDEX_LAYOUT = 1;
        //setCarCapacity(args[0].intValue);
        //setDescription(args[0].strValue);
    }
    public Garage() {
        this(new ValuesForBuildings());
    }



    public void setCarCapacity(int carCapacity) {
        this.carCapacity = carCapacity;
    }

    public int getCarCapacity() {
        return carCapacity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), carCapacity, description);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (!super.equals(otherObj)) return false;
        Garage other = (Garage) otherObj;
        return carCapacity == other.carCapacity
                && description.equals(other.description);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Garage{" +
                "carCapacity=" + carCapacity +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public void setAttributes(int type) {

    }
}
