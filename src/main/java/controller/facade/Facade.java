package controller.facade;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controller.memento.Container;
import model.Item;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }
}*/

public class Facade {
    public void saveContainer(Container container) throws FileNotFoundException {
        Json containerJson = Converter.coverterJson(container);
        Server server = new Server();
        server.post(containerJson);

        /*if(containerJson != null){
            return containerJson.getJson();
        }
        return "error al guardar";*/
    }

    /*public static void main(String[] args) {
        Facade facade = new Facade();
        Container container = new Container();
        //container.addItem("pollo", 10, 1);
        //container.addItem("limon", 5, 2);
        if (facade.saveContainer(container) != null) {
            System.out.println("guardado");
        }else{
            System.out.println("error al guardar");
        }
    }*/
}

/*public static void main(String[] args) throws FileNotFoundException {
 *//* Book book = new Book("el feo", 250);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String book1json = gson.toJson(book);
        System.out.println(book1json);

        PrintWriter printWriter = new PrintWriter(new File("book.json"));
        printWriter.write(book1json);
        printWriter.close();*//*

        //Item item1 = new Item("pollo", 10, 1);
        //Item item2 = new Item("limon", 5, 2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        Container container = new Container();

        container.addItem("pollo", 10, 1);
        container.addItem("limon", 5, 2);

        String containerjson = gson.toJson(container);
        System.out.println(containerjson);

       *//* Book book = new Book("el feo", 250);
        Gson gson = new Gson();

        List<Book> books = new ArrayList<>();
        books.add(book);

       String containerjson = gson.toJson(books);
        System.out.println(containerjson);*//*
    }*/
