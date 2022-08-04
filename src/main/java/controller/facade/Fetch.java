package controller.facade;

import java.io.*;

public class Fetch {

    public void post(String direction, Json json) {
        try {
            File file = new File(direction);
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(json.toString());
            fileWriter.write(",");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Json get(String direction) {
        try {
            // Variable para almacenar data
            StringBuilder data = new StringBuilder();

            // Buca el archivo
            File file = new File(direction);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);

            // Almacena data
            while (reader.readLine() != null) {
                data.append(reader.readLine()).append("\n");
            }
            fileReader.close();

            // retorna data en formato json
            return new Json(data.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete(String direction) {
        File file = new File(direction);
        if (file.delete()) {
            System.out.println("Archivo " + direction + " eliminado");
        }else{
            System.out.println("Archivo " + direction + " no se pudo eliminar");
        }
    }

    public void update(String direction, Json json) {
        try {
            FileWriter fileWriter = new FileWriter(direction);
            fileWriter.write(json.toString());
            fileWriter.write(",");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
