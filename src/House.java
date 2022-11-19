import java.util.Objects;

class House extends Building
{
    private int amountFloorsOfHouse;
    private String nameOfManagingCompany;

    public House(ValuesForBuildings... args) {
        super(args);
        final int INDEX_LAYOUT = 1;
        setAmountFloorsOfHouse(args[INDEX_LAYOUT].intValue);
        setNameOfManagingCompany(args[INDEX_LAYOUT].strValue);
    }

    public House() {
        this(new ValuesForBuildings());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountFloorsOfHouse, nameOfManagingCompany);
    }

    @Override
    public boolean equals(Object otherObj) {
        if (!super.equals(otherObj)) return false;
        House other = (House) otherObj;
        return amountFloorsOfHouse == other.amountFloorsOfHouse
                && nameOfManagingCompany.equals(other.nameOfManagingCompany);
    }



    public void setAmountFloorsOfHouse(int amountFloorsOfHouse) {
        this.amountFloorsOfHouse = amountFloorsOfHouse;
    }

    public int getAmountFloorsOfHouse() {
        return amountFloorsOfHouse;
    }

    public String getNameOfManagingCompany() {
        return nameOfManagingCompany;
    }

    public void setNameOfManagingCompany(String nameOfManagingCompany) {
        this.nameOfManagingCompany = nameOfManagingCompany;
    }

    @Override
    public String toString() {
        return super.toString() +
                "House{" +
                "amountFloorsOfHouse=" + amountFloorsOfHouse +
                ", nameOfManagingCompany='" + nameOfManagingCompany + '\'' +
                '}';
    }
}
