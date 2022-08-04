package controller.facade;

import java.io.*;

public class Fetch {
    /**
     *  Postcondición:
     *  Guarda datos en formato json en una dirección dada.
     */
    public static void post(String direction, Format format) {
        try {
            File file = new File(direction);
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(format.getStringFormat());
            fileWriter.write(",");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *  Postcondición:
     *  Obtiene datos en formato json de una dirección dada.
     */
    public static JSON get(String direction) {
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
            return new JSON(data.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *  Postcondición:
     *  Elimina datos de una dirección dada.
     */
    public static void delete(String direction) {
        File file = new File(direction);
        if (file.delete()) {
            System.out.println("Archivo " + direction + " eliminado");
        }else{
            System.out.println("Archivo " + direction + " no se pudo eliminar");
        }
    }

    /**
     *  Postcondición:
     *  Actualiza datos en formato json de una dirección dada.
     */
    public static void put(String direction, Format format) {
        try {
            FileWriter fileWriter = new FileWriter(direction);
            fileWriter.write(format.getStringFormat());
            fileWriter.write(",");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
