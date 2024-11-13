package Exercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class GravacaoArquivo {
    public static void main(String[] args) {

        String data = "Conteúdo a ser gravado no Arquivo.";

        try (FileWriter writer = new FileWriter("arquivo.txt")) {
            writer.write(data);
            System.out.println("Dados gravados com sucesso");

        } catch (IOException exception) {

            exception.printStackTrace();
        }

    }

}

