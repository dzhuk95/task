package com.tasks;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TaskOneTest {
  TaskOne task = new TaskOne();

  @ParameterizedTest
  @MethodSource("arguments")
  void getResultTest(String aString, int expectedResult) {
    int result = task.getResult(aString);
    Assertions.assertEquals(expectedResult, result);
  }

  private static Stream<Arguments> arguments() {
    return Stream.of(
        Arguments.of("", 0),
        Arguments.of("abc", 3),
        Arguments.of("aba", 4),
        Arguments.of("aaa", 6));
  }
}
