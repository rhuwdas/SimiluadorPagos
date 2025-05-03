public class Pago {
    private int  meces;
    private int pagoMensual;
    private int pagoTotal;
    private float precioProducto;
    public Pago(int meces, int pagoMensual, float precioProducto) {
        this.meces = meces;
        this.pagoMensual = pagoMensual;
        this.precioProducto = precioProducto;
    }
    public Pago(){
        meces = 0;
        pagoMensual = 0;
        this.pagoTotal = 0;

    }

    public void setPrecioProducto(float precioProducto) {
        this.precioProducto = precioProducto;
    }
    public void setMeces(int meces) {
        this.meces = meces;
    }
    public int getMeces() {
        return meces;
    }
    /*public String calcularPagos(){
        String PagoMesuales = "Mes\tCantidad";
        int cantidad = 100;
        for (int mes = 1; mes <= this.meces; mes++) {
            PagoMesuales += "\n"+mes+ "\t"+ cantidad ;
            this.pagoTotal += cantidad;
            cantidad = cantidad *2;
        }
        return PagoMesuales;
    }*/
    public String calcularPagos(){
        String PagoMesuales = "Mes\tCantidad";
        float costo = 1.15F;
        precioProducto = precioProducto * costo ;
        PagoMesuales += "\n 1 \t"+ precioProducto ;
        this.pagoTotal += precioProducto;
        int cantidad = 2;
        for (int mes = 2; mes <= this.meces; mes++) {
            precioProducto = precioProducto * cantidad;
            PagoMesuales += "\n"+mes+ "\t"+ precioProducto ;

            this.pagoTotal *= cantidad;
        }
        return PagoMesuales;
    }
    public int getPagoTotal(){
        return pagoTotal;
    }

    public int getPagoMensual() {
        return pagoMensual;
    }

    public void setPagoTotal(int pagoTotal) {
        this.pagoTotal = pagoTotal;
    }
}
