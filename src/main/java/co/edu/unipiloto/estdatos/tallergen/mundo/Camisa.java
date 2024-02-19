package co.edu.unipiloto.estdatos.tallergen.mundo;

public class Camisa extends Vestuario {

    public enum Marca {
        GET, POLO, NAUTICA,
    }

    private Marca marca;

    public Camisa(Marca marca, Talla pTalla, double pPrecio) {
        super(pTalla, pPrecio);
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Camisa " + marca.name() + " Talla " + talla + "($ " + precio + ")";
    }

}
