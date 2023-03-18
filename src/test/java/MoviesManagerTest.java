import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

 public class MoviesManagerTest {

@Test
public void testAdd(){
    MoviesManager manager= new MoviesManager();
    manager.add("Film I");
    manager.add("Film II");
    manager.add("Film III");
    String [] expected ={"Film I","Film II","Film III"};
    String [] actual= manager.findAll();

    Assertions.assertArrayEquals(expected,actual);

}
@Test
     public  void  testLastFilm (){
         MoviesManager manager= new MoviesManager();


         manager.add("ZZZ");
         manager.add("GGG");
         manager.add("JDK");
         manager.add("FDS");
         String [] expected ={"FDS","JDK","GGG","ZZZ"};
         String [] actual= manager.findLast();

         Assertions.assertArrayEquals(expected,actual);
     }
}