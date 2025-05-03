import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Pago objPago = new Pago();
        System.out.println("Introduce el nombre del producto:  ");
        String nombreProd = sc.nextLine();
        System.out.println("Introduce el precio del producto:  ");
        float precioProd = sc.nextFloat();
        objPago.setPrecioProducto(precioProd);
        System.out.println("Introduce el numero de meces a pagar:  ");
        int mecesPagar = sc.nextInt();
        objPago.setMeces(mecesPagar);
        System.out.println("tabla mensual");
        System.out.println(objPago.calcularPagos());
        System.out.println("Total a pagar:"+ objPago.getPagoTotal());

    }
}