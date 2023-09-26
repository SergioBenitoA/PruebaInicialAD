public abstract class Cliente {
    String correo;
    String contraseña;
    double descuentos;

    public Cliente() {
    }

    public Cliente(String correo, String contraseña, double descuentos) {
        this.correo = correo;
        this.contraseña = contraseña;
        this.descuentos = descuentos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public double getDescuentos() {
        return descuentos;
    }

    public void setDescuentos(double descuentos) {
        this.descuentos = descuentos;
    }
}
