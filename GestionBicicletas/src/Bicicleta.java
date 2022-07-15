public class Bicicleta {
    private String marca;
    private String tipoModalidad;
    private String color;
    private String tipoGrupo;
    private String marcaRuedas;

    public Bicicleta(String marca, String tipoModalidad, String color, String tipoGrupo, String marcaRuedas){
        this.marca = marca;
        this.tipoModalidad = tipoModalidad;
        this.color = color;
        this.tipoGrupo = tipoGrupo;
        this.marcaRuedas = marcaRuedas;
    }

    @Override
    public String toString() {
        return "Bicicleta [color=" + color + ", marca=" + marca + ", marcaRuedas=" + marcaRuedas + ", tipoGrupo="
                + tipoGrupo + ", tipoModalidad=" + tipoModalidad + "]";
    }

}
