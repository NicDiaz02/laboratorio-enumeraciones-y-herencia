package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Computador extends Electronico {

    public enum Tipo {
        Linux, IOS, Windows, Android, Ubuntu
    }

    private Tipo tipo;

    public Computador(Tipo tipo, Gama pGama, double pPrecio) {
        super(pGama, pPrecio);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Computador " + tipo.name() + " - " + "Gama " + gama+"($ " + precio + ")";
    }

}
