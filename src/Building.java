import java.util.Objects;

public class Building
{
    private int region;
    private String address;

    public Building(ValuesForBuildings... args) {
        final int INDEX_LAYOUT = 0;
        this.setRegion(args[INDEX_LAYOUT].intValue);
        this.setAddress(args[INDEX_LAYOUT].strValue);
    }

    public Building() {
        this(new ValuesForBuildings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.region, this.address);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (this == otherObj) return true;
        if (otherObj == null) return false;
        if (getClass() != otherObj.getClass()) return false;
        if (!super.equals(otherObj)) return false;
        Building other = (Building) otherObj;
        return region == other.region
                && address.equals(other.address);
    }


    public double getRegion() {
        return this.region;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Building{" +
                "region=" + region +
                ", address='" + address + '\'' +
                '}';
    }
}


