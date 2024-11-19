package assets;

import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class Moeda {

    @SerializedName("base_code")
    private String baseCode;

    @SerializedName("time_last_update_utc")
    private String UltimaAtualizacao;

    private String valorAtual;

    @SerializedName("conversion_rates")
    private Map<String, Double> taxasDeConversao; // Corrigido para Map

    // Getters e Setters
    public String getBaseCode() {
        return baseCode;
    }

    public String getUltimaAtualizacao() {
        return UltimaAtualizacao;
    }

    public String getValorAtual() {
        return valorAtual;
    }

    public Map<String, Double> getTaxasDeConversao() {
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

    public void setTaxasDeConversao(Map<String, Double> taxasDeConversao) {
        this.taxasDeConversao = taxasDeConversao;
    }

    @Override
    public String toString() {
        return
                "_".repeat(20) + "\n" +
                        "Código da Moeda = " + baseCode + "\n" +
                        "Última Atualização = " + UltimaAtualizacao + "\n" +
                        "Valor Atual = " + valorAtual + "\n" +
                        "Taxas de Conversão = " + taxasDeConversao + "\n" +
                        "_".repeat(20);
    }
}
