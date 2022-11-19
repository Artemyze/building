import java.util.*;

public class Apartment extends House
{
    private int numberOfApartment;
    private String nameOfOwner;

    public Apartment(ValuesForBuildings... args) {
        super(args);
        final int INDEX_LAYOUT = 2;
        setNumberOfApartment(args[INDEX_LAYOUT].intValue);
        setNameOfOwner(args[INDEX_LAYOUT].strValue);
    }
    public Apartment() {
        this(new ValuesForBuildings(), new ValuesForBuildings(), new ValuesForBuildings());
    }

    public void setNumberOfApartment(int numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public int getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfApartment, nameOfOwner);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (!super.equals(otherObj)) return false;
        Apartment other = (Apartment) otherObj;
        return numberOfApartment == other.numberOfApartment
                && nameOfOwner.equals(other.nameOfOwner);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Apartment{" +
                "numberOfApartment=" + numberOfApartment +
                ", nameOfOwner='" + nameOfOwner + '\'' +
                '}';
    }
}
