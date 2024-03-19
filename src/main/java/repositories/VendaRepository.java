package repositories;

import com.google.gson.*;

import entities.Venda;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;




public class VendaRepository extends _BaseRepositoryImpl<Venda> {


    public Venda findById(int id) {
        return entities.stream()
                .filter(e -> e.getId() == id)
                .findAny()
                .orElse(null);
    }




    public void exportToJson() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH.mm");
        String formattedDateTime = LocalDateTime.now().format(formatter);



        var json = new Gson().toJson(entities);

        var file = new File("exports/", "todo_" + formattedDateTime + ".json");

        try {
            var fileWriter = new FileWriter(file);
            fileWriter.write(json);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}