package ru.netology.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.repository.PostersMovie;

public class PostersManagerTest {

    PostersMovie film1 = new PostersMovie(11, "Бладшот", "боевик", 2020);
    PostersMovie film2 = new PostersMovie(22, "Впёред", "мультфильм", 2020);
    PostersMovie film3 = new PostersMovie(33, "Отель 'Белград'", "комедия", 2020);
    PostersMovie film4 = new PostersMovie(44, "Джентельмены", "боевик", 2019);
    PostersMovie film5 = new PostersMovie(55, "Человек-невидимка", "ужасы", 2020);
    PostersMovie film6 = new PostersMovie(66, "Тролли. Мировой тур", "мультфильм", 2020);
    PostersMovie film7 = new PostersMovie(77, "Номер один", "Комедия", 2020);
    PostersMovie film8 = new PostersMovie(12, "Дюна", "фантастика", 2021);
    PostersMovie film9 = new PostersMovie(23, "легенда о зеленом рыцаре", "фэнтези", 2020);
    PostersMovie film10 = new PostersMovie(34, "Последняя дуэль", "история", 2021);
    PostersMovie film11 = new PostersMovie(45, "Земля кочевников", "драма", 2020);
    PostersMovie film12 = new PostersMovie(56, "Власть пса", "драма", 2021);
    PostersMovie film13 = new PostersMovie(67, "Лига справедливости", "фантастика", 2021);
    PostersMovie film14 = new PostersMovie(78, "Аннет", "мюзикл", 2020);

    //Тестируем вывод всех значений
    @Test
    public void testFindAllAllValue() {
        PostersManager posters = new PostersManager();
        posters.save(film1);
        posters.save(film2);
        posters.save(film3);
        posters.save(film4);
        posters.save(film5);
        posters.save(film6);
        posters.save(film7);
        posters.save(film8);
        posters.save(film9);
        posters.save(film10);
        posters.save(film11);
        posters.save(film12);
        posters.save(film13);
        posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                film1,
                film2,
                film3,
                film4,
                film5,
                film6,
                film7,
                film8,
                film9,
                film10,
                film11,
                film12,
                film13,
                film14

        };
        PostersMovie[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllNotValue() {
        PostersManager posters = new PostersManager();
        //posters.save(film1);
        //posters.save(film2);
        //posters.save(film3);
        //posters.save(film4);
        //posters.save(film5);
        //posters.save(film6);
        //posters.save(film7);
        //posters.save(film8);
        //posters.save(film9);
        //posters.save(film10);
        //posters.save(film11);
        //posters.save(film12);
        //posters.save(film13);
        //posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                //film1,
                //film2,
                //film3,
                //film4,
                //film5,
                //film6,
                //film7,
                //film8,
                //film9,
                //film10,
                //film11,
                //film12,
                //film13,
                //film14

        };
        PostersMovie[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllOneValue() {
        PostersManager posters = new PostersManager();
        //posters.save(film1);
        //posters.save(film2);
        //posters.save(film3);
        //posters.save(film4);
        //posters.save(film5);
        //posters.save(film6);
        //posters.save(film7);
        //posters.save(film8);
        //posters.save(film9);
        //posters.save(film10);
        posters.save(film11);
        //posters.save(film12);
        //posters.save(film13);
        //posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                //film1,
                //film2,
                //film3,
                //film4,
                //film5,
                //film6,
                //film7,
                //film8,
                //film9,
                //film10,
                film11,
                //film12,
                //film13,
                //film14

        };
        PostersMovie[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllTwoValue() {
        PostersManager posters = new PostersManager();
        posters.save(film1);
        //posters.save(film2);
        //posters.save(film3);
        //posters.save(film4);
        //posters.save(film5);
        //posters.save(film6);
        //posters.save(film7);
        //posters.save(film8);
        //posters.save(film9);
        //posters.save(film10);
        //posters.save(film11);
        //posters.save(film12);
        //posters.save(film13);
        posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                film1,
                //film2,
                //film3,
                //film4,
                //film5,
                //film6,
                //film7,
                //film8,
                //film9,
                //film10,
                //film11,
                //film12,
                //film13,
                film14

        };


        PostersMovie[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllThreeValue() {
        PostersManager posters = new PostersManager();
        posters.save(film1);
        //posters.save(film2);
        //posters.save(film3);
        //posters.save(film4);
        //posters.save(film5);
        //posters.save(film6);
        posters.save(film7);
        //posters.save(film8);
        //posters.save(film9);
        //posters.save(film10);
        //posters.save(film11);
        //posters.save(film12);
        //posters.save(film13);
        posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                film1,
                //film2,
                //film3,
                //film4,
                //film5,
                //film6,
                film7,
                //film8,
                //film9,
                //film10,
                //film11,
                //film12,
                //film13,
                film14

        };

        PostersMovie[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAllFourValue() {
        PostersManager posters = new PostersManager();
        posters.save(film1);
        posters.save(film2);
        //posters.save(film3);
        //posters.save(film4);
        //posters.save(film5);
        //posters.save(film6);
        //posters.save(film7);
        //posters.save(film8);
        //posters.save(film9);
        //posters.save(film10);
        //posters.save(film11);
        //posters.save(film12);
        posters.save(film13);
        posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                film1,
                film2,
                //film3,
                //film4,
                //film5,
                //film6,
                //film7,
                //film8,
                //film9,
                //film10,
                //film11,
                //film12,
                film13,
                film14

        };


        PostersMovie[] actual = posters.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    //тестируем вывод последих афиш со значением по умолчанию (10)
    @Test
    public void testDefaultLimit() {
        PostersManager posters = new PostersManager();
        posters.save(film1);
        posters.save(film2);
        posters.save(film3);
        posters.save(film4);
        posters.save(film5);
        posters.save(film6);
        posters.save(film7);
        posters.save(film8);
        posters.save(film9);
        posters.save(film10);
        posters.save(film11);
        posters.save(film12);
        posters.save(film13);
        posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                film14,
                film13,
                film12,
                film11,
                film10,
                film9,
                film8,
                film7,
                film6,
                film5,
                //film4,
                //film3,
                //film2,
                //film1
        };

        PostersMovie[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    // Тестрируем вывод последних афиш с определяемым значением
    @Test
    public void testSetLimitNull() {
        PostersManager posters = new PostersManager(0);
        posters.save(film1);
        posters.save(film2);
        posters.save(film3);
        posters.save(film4);
        posters.save(film5);
        posters.save(film6);
        posters.save(film7);
        posters.save(film8);
        posters.save(film9);
        posters.save(film10);
        posters.save(film11);
        posters.save(film12);
        posters.save(film13);
        posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                //film14,
                //film13,
                //film12,
                //film11,
                //film10,
                //film9,
                //film8,
                //film7,
                //film6,
                //film5,
                //film4,
                //film3,
                //film2,
                //film1
        };

        PostersMovie[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSetLimitOne() {
        PostersManager posters = new PostersManager(1);
        posters.save(film1);
        posters.save(film2);
        posters.save(film3);
        posters.save(film4);
        posters.save(film5);
        posters.save(film6);
        posters.save(film7);
        posters.save(film8);
        posters.save(film9);
        posters.save(film10);
        posters.save(film11);
        posters.save(film12);
        posters.save(film13);
        //posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                //film14,
                film13,
                //film12,
                //film11,
                //film10,
                //film9,
                //film8,
                //film7,
                //film6,
                //film5,
                //film4,
                //film3,
                //film2,
                //film1
        };

        PostersMovie[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSetLimitTwo() {
        PostersManager posters = new PostersManager(2);
        posters.save(film1);
        posters.save(film2);
        posters.save(film3);
        posters.save(film4);
        posters.save(film5);
        posters.save(film6);
        posters.save(film7);
        posters.save(film8);
        posters.save(film9);
        //posters.save(film10);
        posters.save(film11);
        //posters.save(film12);
        //posters.save(film13);
        //posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                //film14,
                //film13,
                //film12,
                film11,
                //film10,
                film9,
                //film8,
                //film7,
                //film6,
                //film5,
                //film4,
                //film3,
                //film2,
                //film1
        };

        PostersMovie[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSetLimitThree() {
        PostersManager posters = new PostersManager(3);
        posters.save(film1);
        posters.save(film2);
        posters.save(film3);
        posters.save(film4);
        posters.save(film5);
        posters.save(film6);
        posters.save(film7);
        posters.save(film8);
        //posters.save(film9);
        //posters.save(film10);
        //posters.save(film11);
        //posters.save(film12);
        posters.save(film13);
        posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{
                film14,
                film13,
                //film12,
                //film11,
                //film10,
                //film9,
                film8,
                //film7,
                //film6,
                //film5,
                //film4,
                //film3,
                //film2,
                //film1
        };

        PostersMovie[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    //Тестируем вывод афиш, когда их меньше, чем установленный лимит вывода
    @Test
    public void testSetLimit() {
        PostersManager posters = new PostersManager(4);
        //posters.save(film1);
        //posters.save(film2);
        //posters.save(film3);
        posters.save(film4);
        //posters.save(film5);
        //posters.save(film6);
        //posters.save(film7);
        posters.save(film8);
        //posters.save(film9);
        //posters.save(film10);
        //posters.save(film11);
        //posters.save(film12);
        //posters.save(film13);
        //posters.save(film14);

        PostersMovie[] expected = new PostersMovie[]{

                //film14,
                //film13,
                //film12,
                //film11,
                //film10,
                //film9,
                film8,
                //film7,
                //film6,
                //film5,
                film4,
                //film3,
                //film2,
                //film1
        };

        PostersMovie[] actual = posters.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
