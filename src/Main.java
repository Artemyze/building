public class Main {
    public static void main(String[] args)
    {
        Building gar = (new Factory()).initBuilding(BuildingType.GARAGE);
        System.out.println(gar);
    }
}