package assets;

import com.google.gson.annotations.SerializedName;

public class Moeda {
    public String getBaseCode() {
        return baseCode;
    }

    public String getUltimaAtualizacao() {
        return UltimaAtualizacao;
    }

    public String getValorAtual() {
        return valorAtual;
    }

    public String getTaxasDeConversão() {
        return taxasDeConversao;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public void setUltimaAtualizacao(String ultimaAtualizacao) {
        UltimaAtualizacao = ultimaAtualizacao;
    }

    public void setValorAtual(String valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void setTaxasDeConversao(String taxasDeConversao) {
        this.taxasDeConversao = taxasDeConversao;
    }

    @Override
    public String toString() {
        return
                "_".repeat(20) + "\n" +
                "Código da Moeda = " + baseCode + "\n" +
                "Ultima Atualizacao = " + UltimaAtualizacao + "\n" +
                "valor Atual = " + valorAtual + "\n" +
                "taxas De Conversão = " + taxasDeConversao + "\n" +
                "_".repeat(20);
    }

    @SerializedName("base_code")
    String baseCode;

    @SerializedName("time_last_update_utc")
    String UltimaAtualizacao;
    String valorAtual;
    String taxasDeConversao;
}
