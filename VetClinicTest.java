import static org.junit.Assert.assertEquals;
import org.junit.*;

public class VetClinicTest {
  Zoo zoo;
  Animal animal;
  VetClinic vetClinic;

  @Before 
  public void before() {
    zoo = new Zoo("Parrot Corner");
    animal = new Animal();
    vetClinic = new VetClinic("Dr Doolittle");
  }

  @Test
  public void hasName() {
  assertEquals("Dr Doolittle", vetClinic.getName());
  }

  @Test
  public void startsWithNoAnimals() {
    assertEquals(0, vetClinic.animalCount());
  }

  @Test
  public void startsWithNoEnclosures() {
    assertEquals(0, vetClinic.enclosureCount());
  }

  @Test
  public void canAddAnimalAndEnclosure() {
    vetClinic.treatAnimal(animal, zoo);
    assertEquals(1, vetClinic.animalCount());
    assertEquals(1, vetClinic.enclosureCount());
  }

}
