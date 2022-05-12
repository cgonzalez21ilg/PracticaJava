package cat.ilg;

public class Professor extends Persona {
    public Professor (){
    }
    private double sou;

    public void setSou(double sou) throws Exception {
        if (sou < 3000 && sou > 0) {
            this.sou= sou;
        }

        else {
            throw new Exception("El sueldo es incorrecto");
        }
    }
    public String obtenirDades() throws Exception {
        return super.obtenirDades() + " Con sueldo: " + this.sou;
    }
}