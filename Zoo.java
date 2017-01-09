public class Zoo{
  private String name;
  private Animal[] enclosure;  /* tell it what the array is called, rather than Array */


  public Zoo(String name){
    this.name = name;
    this.enclosure = new Animal[5]; /* [null, null, null, null, null] to start */
  }

  public String getName(){
    return this.name;
  }

  public void addAnimals(Animal animal) {
    int nextIndex = animalCount();
    enclosure[nextIndex] = animal;
  }

  public int animalCount() {
    int count = 0;
    for (Animal animal : enclosure) {
      if (animal != null) {
        count += 1;
      }
    }
    return count;
  }

  public boolean enclosureIsFull() {
    return animalCount() == enclosure.length;

  }

  public void emptyEnclosure() {
    for (int i = 0; i < enclosure.length; i++)
      enclosure[i] = null;
  }


}

