public class Usuario extends Cliente {
    boolean premium;

    public Usuario() {
    }

    public Usuario(String correo, String contraseña, double descuentos, boolean premium) {
        super(correo, contraseña, descuentos);
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public String toString(){
        return "Usuario: " + correo + "\nContraseña: " + contraseña + "\nDescuentos " + descuentos + "\nEs premium: " + premium;
    }
}
