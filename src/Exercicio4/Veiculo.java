package Exercicio4;

public class Veiculo {
    private String Marca;
    private String Modelo;
    private int anoFabricacao;
    private double precoValor;

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getPrecoValor() {
        return precoValor;
    }

    public void setPrecoValor(double precoValor) {
        this.precoValor = precoValor;
    }
}
