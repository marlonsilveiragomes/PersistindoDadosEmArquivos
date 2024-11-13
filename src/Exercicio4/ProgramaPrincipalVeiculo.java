package Exercicio4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ProgramaPrincipalVeiculo {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        carro.setMarca("Subaru");
        carro.setModelo("Impreza WRC");
        carro.setAnoFabricacao(1997);
        carro.setPrecoValor(90000.00);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonVeiculo = gson.toJson(carro);

        System.out.println();

        System.out.println("Veiculo Serializado para JSON");
        System.out.println(jsonVeiculo);
    }
}
