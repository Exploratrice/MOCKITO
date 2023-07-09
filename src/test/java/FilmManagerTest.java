import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void currentFilm() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneFilm() {
        FilmManager manager = new FilmManager();

        manager.add("Number One");

        String[] expected = {"Number One"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addLessThanLimitFilms() {
        FilmManager manager = new FilmManager();

        manager.add("Number One");
        manager.add("Everybody Lies");
        manager.add("Matrix");
        manager.add("Hello");

        String[] expected = {"Number One", "Everybody Lies", "Matrix", "Hello"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addEqualLimitFilms() {
        FilmManager manager = new FilmManager();

        manager.add("Number One");
        manager.add("Everybody Lies");
        manager.add("Matrix");
        manager.add("Hello");
        manager.add("Bro");

        String[] expected = {"Number One", "Everybody Lies", "Matrix", "Hello", "Bro"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoreThanLimitFilms() {
        FilmManager manager = new FilmManager();

        manager.add("Number One");
        manager.add("Everybody Lies");
        manager.add("Matrix");
        manager.add("Hello");
        manager.add("Bro");
        manager.add("Cat");

        String[] expected = {"Number One", "Everybody Lies", "Matrix", "Hello", "Bro", "Cat"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addLessThanLimitFilmsReverse() {
        FilmManager manager = new FilmManager();

        manager.add("Number One");
        manager.add("Everybody Lies");
        manager.add("Matrix");
        manager.add("Hello");

        String[] expected = {"Hello", "Matrix", "Everybody Lies", "Number One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addEqualLimitFilmsReverse() {
        FilmManager manager = new FilmManager();

        manager.add("Number One");
        manager.add("Everybody Lies");
        manager.add("Matrix");
        manager.add("Hello");
        manager.add("Bro");

        String[] expected = {"Bro", "Hello", "Matrix", "Everybody Lies", "Number One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMoreThanLimitFilmsReverse() {
        FilmManager manager = new FilmManager();

        manager.add("Number One");
        manager.add("Everybody Lies");
        manager.add("Matrix");
        manager.add("Hello");
        manager.add("Bro");
        manager.add("Cat");

        String[] expected = {"Cat", "Bro", "Hello", "Matrix", "Everybody Lies", "Number One"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
