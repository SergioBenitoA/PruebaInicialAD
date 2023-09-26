import org.w3c.dom.ls.LSOutput;

public class Anunciante extends Cliente{
    int anuncios;

    public Anunciante() {
    }

    public Anunciante(String correo, String contraseña, double descuentos, int anuncios) {
        super(correo, contraseña, descuentos);
        this.anuncios = anuncios;
    }

    public int getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(int anuncios) {
        this.anuncios = anuncios;
    }

    public String toString(){
        return "Usuario: " + correo + "\nContraseña: " + contraseña + "\nDescuentos " + descuentos + "\nNº Anuncios contratados: " + anuncios;
    }
}
