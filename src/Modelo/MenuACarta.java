
package Modelo;
public class MenuACarta extends Menu {

    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicionalServicio;

    public MenuACarta(String nombrePlato, double valorInicialMenu,
            double valorPorcionGuarnicion, double valorBebida,
            double porcentajeAdicionalServicio) {
        super(nombrePlato, valorInicialMenu);
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
        this.valorBebida = valorBebida;
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
        this.valorMenu = calcularValorMenu();
    }

    @Override
    public String menuDe() {
        return "Menú a la Carta: incluye plato principal, guarnición, bebida y servicio adicional.";
    }

    @Override
    public double calcularValorMenu() {
        double adicionalServicio = valorInicialMenu * (porcentajeAdicionalServicio / 100.0);
        return valorInicialMenu + valorPorcionGuarnicion + valorBebida + adicionalServicio;
    }

    public double getValorPorcionGuarnicion() {
        return valorPorcionGuarnicion;
    }

    public void setValorPorcionGuarnicion(double valorPorcionGuarnicion) {
        this.valorPorcionGuarnicion = valorPorcionGuarnicion;
    }

    public double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public double getPorcentajeAdicionalServicio() {
        return porcentajeAdicionalServicio;
    }

    public void setPorcentajeAdicionalServicio(double porcentajeAdicionalServicio) {
        this.porcentajeAdicionalServicio = porcentajeAdicionalServicio;
    }

    @Override
    public String toString() {
        return String.format(
                "  [Menú a la Carta]\n"
                + "  Plato           : %s\n"
                + "  Valor inicial   : $%.2f\n"
                + "  Guarnición      : $%.2f\n"
                + "  Bebida          : $%.2f\n"
                + "  %% servicio      : %.1f%%\n"
                + "  TOTAL MENÚ      : $%.2f",
                nombrePlato, valorInicialMenu,
                valorPorcionGuarnicion, valorBebida,
                porcentajeAdicionalServicio, valorMenu
        );
    }
}
