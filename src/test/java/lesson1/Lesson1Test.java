package lesson1;


import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Lesson1Test {

  Lesson1 lesson1;

  @Before
  public void init() {
    lesson1 = new Lesson1();
  }

  @Test
  public void stringWithFirstLetter() {

    Assert.assertEquals("abcdef", lesson1.exercise1());
  }

  @Test
  public void removeOdds() {

    List<String> expected = Arrays.asList("echo");
    Assert.assertThat(lesson1.exercise2(), Is.is(expected));
  }

  @Test
  public void toUppercase()

  {
    List<String> expected = Arrays.asList("ALPHA", "BRAVO", "CHARLIE", "DELTA", "ECHO", "FOXTROT");
    Assert.assertThat(lesson1.exercise3(), Is.is(expected));
  }

  @Test
  public void mapToString(){
    Assert.assertEquals("a1b2c3",lesson1.exercise4());
  }

}