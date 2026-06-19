
package Modelo;

public class MenuNinos extends Menu {

    private double valorPorcionHelado;
    private double valorPorcionPastel;

    public MenuNinos(String nombrePlato, double valorInicialMenu,
                     double valorPorcionHelado, double valorPorcionPastel) {
        super(nombrePlato, valorInicialMenu);
        this.valorPorcionHelado = valorPorcionHelado;
        this.valorPorcionPastel = valorPorcionPastel;
        this.valorMenu = calcularValorMenu();
    }

    @Override
    public double calcularValorMenu() {
        return valorInicialMenu + valorPorcionHelado + valorPorcionPastel;
    }

    public double getValorPorcionHelado() {
        return valorPorcionHelado;
    }

    public void setValorPorcionHelado(double valorPorcionHelado) {
        this.valorPorcionHelado = valorPorcionHelado;
    }

    public double getValorPorcionPastel() {
        return valorPorcionPastel;
    }

    public void setValorPorcionPastel(double valorPorcionPastel) {
        this.valorPorcionPastel = valorPorcionPastel;
    }

    @Override
    public String menuDe() {
        return "Menú de Niños: incluye plato principal, porción de helado y porción de pastel.";
    }

    @Override
    public String toString() {
        return String.format(
            "  [Menú de Niños]\n" +
            "  Plato           : %s\n" +
            "  Valor inicial   : $%.2f\n" +
            "  Porción helado  : $%.2f\n" +
            "  Porción pastel  : $%.2f\n" +
            "  TOTAL MENÚ      : $%.2f",
            nombrePlato, valorInicialMenu,
            valorPorcionHelado, valorPorcionPastel, valorMenu
        );
    }
}
