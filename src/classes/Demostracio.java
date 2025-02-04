package classes;

/**
 * Author: Pol Caballe
 */

public class Demostracio extends Accio {
    private Data dataDisseny;
    private boolean valida;
    private short nVegades;
    private int cost;

    public Demostracio(String c, String t, String r, int nAssoc, Data d, boolean valida, short nVegades, int cost) {
        super(c, t, r, nAssoc);
        this.dataDisseny = d; this.valida = valida; this.nVegades = nVegades; this.cost = cost;
    }

    public Data getDataDisseny () {
        return dataDisseny;
    }

    public boolean esValida() {
        return valida;
    }

    public short getNVegades() {
        return nVegades;
    }

    public int getCost() {
        return cost;
    }

}