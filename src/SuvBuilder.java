public class SuvBuilder extends AbstractCarBuilder{
    private static final String DEFAULT_MODEL = "SUV";
    private static final String DEFAULT_ENGINE = "Hybrid";
    private static final int DEFAULT_SETS = 7;
    private static final boolean DEFAULT_GPS = true;

    public SuvBuilder(){
        super(DEFAULT_MODEL, DEFAULT_ENGINE, DEFAULT_SETS, DEFAULT_GPS);
    }
}
