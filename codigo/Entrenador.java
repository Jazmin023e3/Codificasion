public class Entrenador extends MiembroSeleccion {
    private String idFederacion;

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido() {
        System.out.println(nombre + " está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " está dirigiendo un entrenamiento.");
    }
}
