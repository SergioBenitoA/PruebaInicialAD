import java.util.ArrayList;

public class Lista {
    ArrayList <Cliente> clientes = new ArrayList();
    public void añadir_usuario(Usuario e){
        clientes.add(e);
    }

    public void buscar_usuario(String id){
        boolean existe = false;
        for (Cliente e : clientes) {
            if(id.equals(e.getCorreo())){
                existe = true;
                if(e instanceof Usuario){
                    System.out.println(((Usuario) e).toString());
                }
            }
        }
        if(!existe){
            System.out.println("Ese cliente no esta en la lista");
        }
    }

    public void ingresos_totales(String correo){
        for (Cliente e : clientes) {
            if(correo.equals(e.getCorreo())){
                if(e instanceof Usuario){
                    double p;
                    double descuento = e.getDescuentos();
                    if(((Usuario) e).premium){
                        p = 35.5;
                    } else{
                        p = 20.5;
                    }
                    System.out.println("El ingreso total es de " + (p-descuento) + "€");
                }
            }
        }
    }
}
