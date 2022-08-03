package controller.facade;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Server {
    public void post(Json json) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter("database.json");
        printWriter.write(json.getJson());
        printWriter.close();
    }

    public Json get(String id){
        return null;
    }

    public void delete(String id){

    }

    public void update(String id){

    }
}
