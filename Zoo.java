import java.util.*;

public class Zoo{
  private String name;
  private ArrayList<Displayable> enclosure;  

  public Zoo(String name){
    this.name = name;
    this.enclosure = new ArrayList<Displayable>(); 
  }

  public String getName(){
    return this.name;
  }

  public void addAnimals(Displayable exhibit) {
    enclosure.add(exhibit);
  }

  public int animalCount() {
    return enclosure.size();
  }

  public void emptyEnclosure() {
    enclosure.clear();
  }

}

