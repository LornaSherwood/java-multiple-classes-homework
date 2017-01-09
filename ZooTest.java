import static org.junit.Assert.assertEquals;
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
  public void reachesLimitAfter5Animals() {
    for(int i = 0; i < 5; i++) {
      zoo.addAnimals(animal);
    }
    assertEquals(true, zoo.enclosureIsFull());
  }

  /*@Test
  public void canReachLimit() {
    for(int i = 0; i < 10; i++)
    zoo.addAnimals(animal);
  assertEquals(5, zoo.animalCount());
  }*/

  @Test
  public void canEmptyEnclosure() {
    zoo.addAnimals(animal);
    zoo.emptyEnclosure();
    assertEquals(0, zoo.animalCount());
  }

}





