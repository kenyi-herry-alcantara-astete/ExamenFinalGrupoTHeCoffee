package controller.facade;

public interface Format {
    String getStringFormat();
}

class JSON implements Format{
    private final String json;

    public JSON(String json){
        this.json = json;
    }

    /**
     * postcondición:
     * retorna datos string con formato json
     */
    @Override
    public String getStringFormat() {
        return json;
    }
}

class XML implements Format{

    @Override
    public String getStringFormat() {
        return null;
    }
}

