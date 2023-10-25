package com.tasks;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TaskTwoTest {

  TaskTwo task = new TaskTwo();

  @ParameterizedTest
  @MethodSource("arguments")
  void getResultTest(String aString, String expectedResult) {
    String result = task.getResult(aString);
    Assertions.assertEquals(expectedResult, result);
  }

  private static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of("aa", "a"),
        Arguments.of("abab", "ab"),
        Arguments.of("ababa", "aba"),
        Arguments.of("nick", ""),
        Arguments.of("Mississippi", "issi"),
        Arguments.of("stuff", "f"));
  }
}
