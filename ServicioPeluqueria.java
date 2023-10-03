public class ServicioPeluqueria {
    CORTE("Corte de pelo", "Descripción del servicio de corte de pelo", 20.000),
    UÑAS("Manicura y pedicura", "Descripción del servicio de manicura y pedicura", 15.000),
    TINTE("Tinte de cabello", "Descripción del servicio de tinte de cabello", 35.000);

    private String nombre;
    private String descripcion;
    private double precio;

    private ServicioPeluqueria(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void mostrarDescripcionServicio() {
        System.out.println("Servicio: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Precio: " + precio);
    }
}

public class Main {
    public static void main(String[] args) {
        ServicioPeluqueria corte = ServicioPeluqueria.corte;
        ServicioPeluqueria uñas = ServicioPeluqueria.Uñas;
        ServicioPeluqueria tinte = ServicioPeluqueria.Tinte;

        corte.mostrarDescripcionServicio();
        uñas.mostrarDescripcionServicio();
        tinte.mostrarDescripcionServicio();
    }
}
}
