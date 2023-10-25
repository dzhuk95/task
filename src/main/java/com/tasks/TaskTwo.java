package com.tasks;

import java.util.HashSet;
import java.util.Set;

public class TaskTwo {

  Set<String> strings = new HashSet<>();
  int aStringLength;
  int substringLength;
  int currentCharacterIndex = 0;
  String result;

  public String getResult(String aString) {
    aStringLength = aString.length();
    substringLength = aStringLength - 1;
    result = "";
    while (substringLength > 0) {
      if (currentCharacterIndex + substringLength > aStringLength) {
        strings.clear();
        currentCharacterIndex = 0;
        if (result.length() > 0) {
          return result;
        }
        substringLength--;
      } else {
        addValue(aString);
        currentCharacterIndex++;
      }
    }
    return result;
  }

  private void addValue(String aString) {
    String substring =
        aString.substring(currentCharacterIndex, currentCharacterIndex + substringLength);
    if (strings.isEmpty()) {
      strings.add(substring);
    } else {
      if (strings.contains(substring)) {
        result = substring;
      }
      strings.add(substring);
    }
  }
}
