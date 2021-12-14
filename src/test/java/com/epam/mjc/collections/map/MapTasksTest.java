package com.epam.mjc.collections.map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MapTasksTest {
  @Test
  public void testMethodTask1() {
    Task1 task1 = new Task1();

    String actual = task1.implement();

    String expected = "1=Monday 2=Tuesday 3=Wednesday 4=Thursday 5=Friday 6=Saturday 7=Sunday";
    assertEquals(expected, actual);
  }

  @Test
  public void testMethodTask2() {
    Task2 task2 = new Task2();

    String actual = task2.implement();

    String expected =
        "Collection view is: Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
    assertEquals(expected, actual);
  }

  @Test
  public void testMethodTask3() {
    Task3 task3 = new Task3();

    String actual = task3.implement();

    String expected = "Key set values are: 1 2 3 4 5 6 7";
    assertEquals(expected, actual);
  }

  @Test
  public void testMethodTask4() {
    Task4 task4 = new Task4();

    String actual = task4.implement();

    String expected = "Orange Green Pink Red";
    assertEquals(expected, actual);
  }

  @Test
  public void testMethodTask5() {
    Task5 task5 = new Task5();

    String actual = task5.implement();

    String expected = "Thursday=4 Monday=1 Friday=5 Sunday=7 Wednesday=3 Tuesday=2 Saturday=6";
    assertEquals(expected, actual);
  }
}
