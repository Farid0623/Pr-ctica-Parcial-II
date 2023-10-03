public class mainpeluqueria {
    public static void main(String[] args) {
    ServicioPeluqueria corte = new ServicioPeluqueria("Corte de pelo", "Descripción del servicio de corte de pelo", 10.0);
    ServicioPeluqueria uñas = new ServicioPeluqueria("Manicura y pedicura", "Descripción del servicio de manicura y pedicura", 15.0);
    ServicioPeluqueria tinte = new ServicioPeluqueria("Tinte de cabello", "Descripción del servicio de tinte de cabello", 20.0);

    corte.mostrarDescripcionServicio();
    uñas.mostrarDescripcionServicio();
    tinte.mostrarDescripcionServicio();
}
}
}
