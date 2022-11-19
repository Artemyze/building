public class ValuesForBuildings
{
    protected final static int DEFAULT_INT = 0;
    protected final static String DEFAULT_STRING = "Custom";
    String strValue;
    Integer intValue;

    public ValuesForBuildings(String strValue, Integer intValue) {
        this.strValue = strValue;
        this.intValue = intValue;
    }

    public ValuesForBuildings () {
        this(DEFAULT_STRING, DEFAULT_INT);
    }

}
