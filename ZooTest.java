import static org.junit.Assert.*;
import org.junit.*;

public class ZooTest {
  Zoo zoo;
  Animal animal;

  @Before 
  public void before() {
    zoo = new Zoo("Parrot Corner");
    animal = new Animal();
  }

  @Test
  public void hasName(){
    assertEquals("Parrot Corner", zoo.getName()); 
  }

  @Test
  public void startsWithNoAnimals() {
    assertEquals(0, zoo.animalCount());
  }

  @Test
  public void canAddAnimals() {
    zoo.addAnimals(animal);
    assertEquals(1, zoo.animalCount());
  }

  @Test
  public void canEmptyEnclosure() {
    zoo.addAnimals(animal);
    zoo.emptyEnclosure();
    assertEquals(0, zoo.animalCount());
  }

}





