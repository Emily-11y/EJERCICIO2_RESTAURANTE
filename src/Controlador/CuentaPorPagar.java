/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Menu;
import java.util.ArrayList;

/**
 * Representa la cuenta por pagar de un cliente en el restaurante.
 * Contiene el listado de menús solicitados y calcula subtotal, IVA y total.
 */
public class CuentaPorPagar {

    private static final double PORCENTAJE_IVA = 12.0; // IVA del 12%

    private String nombreCliente;
    private ArrayList<Menu> listaMenus;
    private double subtotal;
    private double iva;
    private double valorTotal;

    public CuentaPorPagar(String nombreCliente) {
        this.nombreCliente = nombreCliente;
        this.listaMenus = new ArrayList<>();
        this.subtotal = 0.0;
        this.iva = 0.0;
        this.valorTotal = 0.0;
    }

    //Agrega un menú a la cuenta del cliente.
    public void agregarMenu(Menu menu) {
        listaMenus.add(menu);
        calcularTotales();
    }

    //Calcula el subtotal, IVA y total de la cuenta.
    private void calcularTotales() {
        subtotal = 0.0;
        for (Menu m : listaMenus) {
            subtotal += m.getValorMenu();
        }
        iva = subtotal * (PORCENTAJE_IVA / 100.0);
        valorTotal = subtotal + iva;
    }

    //Imprime la factura completa en consola.
    public void imprimirCuenta() {
        System.out.println("============================================");
        System.out.println("         RESTAURANTE - CUENTA DE PAGO       ");
        System.out.println("============================================");
        System.out.println(" Cliente: " + nombreCliente);
        System.out.println("--------------------------------------------");
        System.out.println(" DETALLE DE PEDIDOS:");
        System.out.println("--------------------------------------------");

        int i = 1;
        for (Menu m : listaMenus) {
            System.out.println(" Pedido #" + i + ":");
            System.out.println(m.toString());
            System.out.println();
            i++;
        }

        System.out.println("--------------------------------------------");
        System.out.printf(" Subtotal  : $%.2f%n", subtotal);
        System.out.printf(" IVA (%.0f%%) : $%.2f%n", PORCENTAJE_IVA, iva);
        System.out.println("--------------------------------------------");
        System.out.printf(" TOTAL     : $%.2f%n", valorTotal);
        System.out.println("============================================");
    }

    public String getNombreCliente() { 
        return nombreCliente; 
    }
    public ArrayList<Menu> getListaMenus() { 
        return listaMenus; 
    }
    public double getSubtotal() { 
        return subtotal; 
    }
    public double getIva() { 
        return iva; 
    }
    public double getValorTotal() { 
        return valorTotal; 
    }
}
