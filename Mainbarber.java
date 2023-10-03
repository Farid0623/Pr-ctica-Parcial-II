public class Mainbarber {
    public static void main(String[] args) {
        ServiceBarber corte = new ServiceBarber("Corte de pelo", "Descripción del servicio de corte de pelo", 20.000);
        ServiceBarber uñas = new ServiceBarber("Manicura y pedicura", "Descripción del servicio de manicura y pedicura", 15.000);
        ServiceBarber tinte = new ServicioPeluqueria("Tinte de cabello", "Descripción del servicio de tinte de cabello", 35.000);

        corte.mostrarDescripcionServicio();
        uñas.mostrarDescripcionServicio();
        tinte.mostrarDescripcionServicio();
    }
}
}

}
