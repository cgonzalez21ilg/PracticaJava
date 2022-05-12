package cat.ilg;

public class Persona {

    private String nom;
    private String dni;

    public Persona(){

    }
    public void canviarNom(String nom) {
        this.nom = nom;
    }

    public String obtenirDades() throws Exception {
        if (this.nom == null || this.dni == null){
            throw new Exception("Datos incompletos");
        }
        else {
            return "Persona llamada " + this.nom + " con DNI " + this.dni;
        }
    }
    public void assignarDni(String dni) throws Exception {
        if (this.dni == null) {
            this.dni = dni;
        }
        else {
            throw new Exception("Esta persona tiene otro DNI ");
        }
    }
}
