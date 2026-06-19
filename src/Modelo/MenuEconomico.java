
package Modelo;
public class MenuEconomico extends Menu {

    private double porcentajeDescuento;

    public MenuEconomico(String nombrePlato, double valorInicialMenu,
                         double porcentajeDescuento) {
        super(nombrePlato, valorInicialMenu);
        this.porcentajeDescuento = porcentajeDescuento;
        this.valorMenu = calcularValorMenu();
    }

    @Override
    public double calcularValorMenu() {
        double descuento = valorInicialMenu * (porcentajeDescuento / 100.0);
        return valorInicialMenu - descuento;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String menuDe() {
        return "Menú Económico: incluye plato principal con descuento especial.";
    }

    @Override
    public String toString() {
        double descuento = valorInicialMenu * (porcentajeDescuento / 100.0);
        return String.format(
            "  [Menú Económico]\n" +
            "  Plato           : %s\n" +
            "  Valor inicial   : $%.2f\n" +
            "  Descuento (%.1f%%): -$%.2f\n" +
            "  TOTAL MENÚ      : $%.2f",
            nombrePlato, valorInicialMenu,
            porcentajeDescuento, descuento, valorMenu
        );
    }
}

