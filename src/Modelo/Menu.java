
package Modelo;
public abstract class Menu {

    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;

    public Menu(String nombrePlato, double valorInicialMenu) {
        this.nombrePlato = nombrePlato;
        this.valorInicialMenu = valorInicialMenu;
    }
    public abstract String menuDe();

    public abstract double calcularValorMenu();

    public String getNombrePlato() {
        return nombrePlato;
    }

    public double getValorMenu() {
        return valorMenu;
    }

    public double getValorInicialMenu() {
        return valorInicialMenu;
    }

    @Override
    public abstract String toString();
}

