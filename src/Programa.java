import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Programa {
    public static void main(String[] args) {
        Titulo meuTitulo = new Titulo("A volta dos que não Foram", "Alcebiades Ladisvaw");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(meuTitulo);

        System.out.println(json);

    }
}
