public class Bicicleta {
    private int id;
    private String marca;
    private String tipoModalidad;
    private String color;
    private String tipoGrupo;
    private String marcaRuedas;

    public Bicicleta(int id, String marca, String tipoModalidad, String color, String tipoGrupo, String marcaRuedas){
        this.id = id;
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

    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipoModalidad() {
        return tipoModalidad;
    }

    public String getColor() {
        return color;
    }

    public String getTipoGrupo() {
        return tipoGrupo;
    }

    public String getMarcaRuedas() {
        return marcaRuedas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTipoModalidad(String tipoModalidad) {
        this.tipoModalidad = tipoModalidad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoGrupo(String tipoGrupo) {
        this.tipoGrupo = tipoGrupo;
    }

    public void setMarcaRuedas(String marcaRuedas) {
        this.marcaRuedas = marcaRuedas;
    }

}
