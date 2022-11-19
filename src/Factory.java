public class Factory {
    public Building initBuilding(BuildingType type) {
        Building building = null;
        switch (type) {
            case GARAGE -> building = new Garage();
            case HOUSE -> building = new House();
            case APARTMENT -> building = new Apartment();
        }
        return building;
    }
}
