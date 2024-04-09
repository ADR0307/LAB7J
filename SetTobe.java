package Ex2;

class SetTobe extends InstrumentMuzical {
    TipTobe tip_t;
    int nr_tobe;
    int nr_cinele;
    public SetTobe() {
        super("", 0);
    }

    public SetTobe(String producator, double pret, TipTobe tip_t, int nr_tobe, int nr_cinele) {
        super(producator, pret);
        this.tip_t = tip_t;
        this.nr_tobe = nr_tobe;
        this.nr_cinele = nr_cinele;
    }

    public TipTobe getTipTobe() {
        return tip_t;
    }

    public int getNrTobe() {
        return nr_tobe;
    }

    public int getNrCinele() {
        return nr_cinele;
    }

    public void setTipTobe(TipTobe tip_t) {
        this.tip_t = tip_t;
    }

    public void setNrTobe(int nr_tobe) {
        this.nr_tobe = nr_tobe;
    }

    public void setNrCinele(int nrCinele) {
        this.nr_cinele = nrCinele;
    }
    void afisareDetalii() {
        System.out.println("Set Tobe: Producator - " + producator + ", Pret - " + pret + ", Tip - " + tip_t + ", Numar Tobe - " + nr_tobe + ", Numar Cinele - " + nr_cinele);
    }
}
