public class Main {
    public static void main(String[] args) {
        // Creamos un array de la clase madre, con hijos
        MiembroSeleccion[] equipo = new MiembroSeleccion[3];
        equipo[0] = new Futbolista(1, "Lionel", "Messi", 35, 10, "Delantero");
        equipo[1] = new Entrenador(2, "Pep", "Guardiola", 50, "1234FED");
        equipo[2] = new Masajista(3, "Juan", "Pérez", 40, "Fisioterapia", 10);

        // Usamos polimorfismo para que todos puedan concentrarse y viajar
        for (MiembroSeleccion miembro : equipo) {
            miembro.concentrarse();
            miembro.viajar();
        }

        // Métodos específicos
        ((Futbolista)equipo[0]).jugarPartido();
        ((Entrenador)equipo[1]).dirigirPartido();
        ((Masajista)equipo[2]).darMasaje();
    }
}
