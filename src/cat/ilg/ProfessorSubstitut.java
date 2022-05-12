package cat.ilg;
import java.util.ArrayList;
import java.util.Date;
public class ProfessorSubstitut extends Professor{
    private Date dataInici;
    private Date dataFi;

    //ArrayList<Persona> persones = new ArrayList<Persona>();
    public void assignarSubstitucio(Persona persona) {
        persones.add(persona);
    }
    public void dataFi(Date dataFi) {
        this.dataFi = dataFi;
    }
    public void dataInici(Date dataInici) {
        this.dataInici = dataInici;
    }
    public String obtenirDades() throws Exception {
        return super.obtenirDades() + " Fecha de inicio : " + this.dataInici + " Fecha final: " + this.dataFi;
    }


}