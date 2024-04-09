package Ex2;

public class Chitara extends InstrumentMuzical {
    TipChitare tip;
    int nrCorzi;

    public Chitara() {
        super("", 0);
    }
    public Chitara(String producator, double pret, TipChitare tipChitara, int nrCorzi) {
        super(producator, pret);
        this.tip = tipChitara;
        this.nrCorzi = nrCorzi;
    }

    @Override
    void afisareDetalii() {
        System.out.println("Chitara: Producator - " + producator + ", Pret - " + pret + ", Tip - " + tip + ", Numar Corzi - " + nrCorzi);
    }

    public TipChitare getTipChitara() {
        return tip;
    }

    public int getNrCorzi() {
        return nrCorzi;
    }

    public void setTipChitara(TipChitare tip) {
        this.tip = tip;
    }

    public void setNrCorzi(int nrCorzi) {
        this.nrCorzi = nrCorzi;
    }


}
