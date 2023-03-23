import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void testAdd() {
        MoviesManager manager = new MoviesManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        String[] expected = {"Film I", "Film II", "Film III"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testLastFilm() {
        MoviesManager manager = new MoviesManager();


        manager.add("ZZZ");
        manager.add("GGG");
        manager.add("JDK");
        manager.add("FDS");
        String[] expected = {"FDS", "JDK", "GGG", "ZZZ"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testLastFilmEqualLimit() {
        MoviesManager manager = new MoviesManager();
        manager.add("A");
        manager.add("B");
        manager.add("C");
        manager.add("D");
        manager.add("X");
        manager.add("W");
        manager.add("Z");
        manager.add("Q");
        manager.add("R");
        manager.add("T");

        String[] expected = {"T", "R", "Q", "Z", "W", "X", "D", "C", "B", "A"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testLastFilmExceedingLimit() {
        MoviesManager manager = new MoviesManager();
        manager.add("A");
        manager.add("B");
        manager.add("C");
        manager.add("D");
        manager.add("X");
        manager.add("W");
        manager.add("Z");
        manager.add("Q");
        manager.add("R");
        manager.add("T");
        manager.add("S");
        String[] expected = {"S", "T","R", "Q", "Z", "W", "X", "D", "C", "B"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}