public class VetClinic {

  private String name;
  private Animal[] clinic;
  private Zoo[] originalEnclosure;


  public VetClinic(String name){
    this.name = name;
    this.clinic = new Animal[10];
    this.originalEnclosure = new Zoo[10];

  }

  public String getName() {
    return this.name;
  }

  public int animalCount() {
      int count = 0;
      for (Animal animal : clinic) {
        if (animal != null) {
          count += 1;
        }
      }
      return count;
    }

    public int enclosureCount() {
        int count = 0;
        for (Zoo zoo : originalEnclosure) {
          if (zoo != null) {
            count += 1;
          }
        }
        return count;
      }

    public void treatAnimal(Animal animal, Zoo zoo) {
      /*if (isClinicFull()) return;*/
      int nextIndex = animalCount();
      clinic[nextIndex] = animal;
      int indexNext = enclosureCount();
      originalEnclosure[indexNext] = zoo;
    }



  }


  




