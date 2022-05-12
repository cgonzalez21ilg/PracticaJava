package cat.ilg;
import java.util.ArrayList;
public class Estudiant extends Persona {

  private double nota;
  ArrayList<Double> notes = new ArrayList<>();

  public Estudiant() {

  }

  public void posarNota(double nota) {
    if (nota > 0 && nota < 10) {
      notes.add(nota);
    }
    else{
      System.out.println("La nota no es correcta");
    }
  }
  public String obtenirNotes (){
    String llista=" ";
    for (int i=0; i<notes.size(); i++ ){
      llista = llista + notes.get(i)+ " ";
    }
    return llista;
  }
  public double obtenirMitjana (){
    double suma = 0;
    for (int i=0; i<notes.size(); i++){
      suma= suma + notes.get(i);
    }

    return suma/notes.size();
  }
  public double obtenirMaxim(){
    double max = 0;
    for (int i=0; i<notes.size(); i++){
      if (notes.get(i) > max){
        max = notes.get(i);
      }
    }
    return max;
  }
  public double obtenirMinim(){
    double max = 10;
    for (int i=0; i<notes.size(); i++){
      if (notes.get(i) < max){
        max = notes.get(i);
      }
    }
    return max;
  }
  public String obtenirDades () throws Exception {
    //vull que em doni el mateix que persona + la nota
    if (super.obtenirDades() == "Dades de la persona incompletes") {
      throw new Exception("Dades de la persona incompletes");
    } else {
      return super.obtenirDades() + " te un " + obtenirNotes() + "la mitjana es " + obtenirMitjana() + " la nota mes alta es " + obtenirMaxim() + " i la mes baixa " + obtenirMinim();
    }
  }
}