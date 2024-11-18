package br.com.alura.conversor.main.MoedaObj;

public class moeda {
    String codigoDaMoeda;
    String ultimaAtualizacao;
    String conversao;

    public String getCodigoDaMoeda() {
        return codigoDaMoeda;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public String getConversao() {
        return conversao;
    }

    @Override
    public String toString() {
        return "conversao{" +
                "codigoDaMoeda= '" + codigoDaMoeda + '\'' +
                ", ultimaAtualizacao='" + ultimaAtualizacao + '\'' +
                ", conversao='" + conversao + '\'' +
                '}';
    }
}
