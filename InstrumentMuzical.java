package Ex2;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Chitara.class),
        @JsonSubTypes.Type(value = SetTobe.class)
})
public abstract class InstrumentMuzical {
    String producator;
    double pret;

    public InstrumentMuzical(String producator, double pret) {
        this.producator = producator;
        this.pret = pret;
    }

    public String getProducator() {
        return producator;
    }

    public double getPret() {
        return pret;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }
    abstract void afisareDetalii();

}

