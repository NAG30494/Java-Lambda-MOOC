package lesson2;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.*;

public class Lesson2Test {

  private Lesson2 lesson2;

  @Before
  public void init() {
    lesson2 = new Lesson2();
  }

  @Test
  public void toLowercaseEx1() {
    List<String> expected = Arrays.asList("the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog");
    Assert.assertThat(lesson2.exercise1(), Is.is(expected));
  }

  @Test
  public void toLowercaseOnlyOddEx2() {
    List<String> expected = Arrays.asList("the", "quick", "brown", "fox", "the", "dog");
    Assert.assertThat(lesson2.exercise2(), Is.is(expected));
  }

  @Test
  public void joinStringsEx3() {
    Assert.assertThat(lesson2.exercise3(), Is.is("quick-brown-fox"));
  }

  @Test
  public void countLinesEx4() throws IOException, URISyntaxException {
    Assert.assertEquals(14, lesson2.exercise4());
  }

  @Test
  public void noDupsEx5() throws IOException, URISyntaxException {
    List<String> words = lesson2.exercise5();
    int sizeNoDups = new HashSet(words).size();
    Assert.assertEquals(sizeNoDups, words.size());
  }

  @Test
  public void noDupsSortedEx6() throws IOException, URISyntaxException {
    List<String> words = lesson2.exercise6();
    List<String> sortedWords = new ArrayList<>(words);
    Collections.sort(sortedWords);
    Assert.assertThat(sortedWords, Is.is(words));

  }

  @Test
  public void noDupsSortedByLengthEx7() throws IOException, URISyntaxException {
    List<String> words = lesson2.exercise7();

    for (int i = 1; i < words.size(); i++) {
      Assert.assertTrue(words.get(i).length() >= words.get(i - 1).length());
    }

  }


}