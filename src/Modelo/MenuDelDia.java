
package Modelo;
public class MenuDelDia extends Menu {

    private double valorPostre;
    private double valorBebida;

    public MenuDelDia(String nombrePlato, double valorInicialMenu,
                      double valorPostre, double valorBebida) {
        super(nombrePlato, valorInicialMenu);
        this.valorPostre = valorPostre;
        this.valorBebida = valorBebida;
        this.valorMenu = calcularValorMenu();
    }

    @Override
    public String menuDe() {
        return "Menú del Día: incluye plato principal, postre y bebida.";
    }

    @Override
    public double calcularValorMenu() {
        return valorInicialMenu + valorPostre + valorBebida;
    }

    public double getValorPostre() {
        return valorPostre;
    }

    public void setValorPostre(double valorPostre) {
        this.valorPostre = valorPostre;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    @Override
    public String toString() {
        return String.format(
            "  [Menú del Día]\n" +
            "  Plato           : %s\n" +
            "  Valor inicial   : $%.2f\n" +
            "  Postre          : $%.2f\n" +
            "  Bebida          : $%.2f\n" +
            "  TOTAL MENÚ      : $%.2f",
            nombrePlato, valorInicialMenu,
            valorPostre, valorBebida, valorMenu
        );
    }
}
