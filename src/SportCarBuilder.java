public class SportCarBuilder extends AbstractCarBuilder{
    private static final String DEFAULT_MODEL = "Sports Car";
    private static final String DEFAULT_ENGINE = "V8";
    private static final int DEFAULT_SEATS = 2;
    private static final boolean DEFAULT_GPS = true;

    public SportCarBuilder(){
        super(DEFAULT_MODEL, DEFAULT_ENGINE, DEFAULT_SEATS, DEFAULT_GPS);
    }
}
