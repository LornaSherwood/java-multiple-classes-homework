import java.util.*;

public class VetClinic {

  private String name;
  private ArrayList<Treatable> clinic;
  private Zoo[] originalEnclosure;

  public VetClinic(String name){
    this.name = name;
    this.clinic = new ArrayList<Treatable>();
  }

  public String getName(){
    return this.name;
  }

  public int animalCount(){
    return clinic.size();
  }

  public void treatAnimal(Treatable animal){
    clinic.add(animal);
  }

}


  




