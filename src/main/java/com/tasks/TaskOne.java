package com.tasks;

public class TaskOne {

  private int result = 0;

  public int getResult(String aString) {
    if (aString.isBlank()) {
      return result;
    }
    for (int i = 0; i < aString.length(); i++) {
      countPalindromes(aString, i, i);
      countPalindromes(aString, i, i + 1);
    }
    return result;
  }

  private void countPalindromes(String aString, int startCharacterIndex, int endCharacterIndex) {
    while (startCharacterIndex >= 0 && endCharacterIndex < aString.length()) {
      char startCharacter = aString.charAt(startCharacterIndex);
      char endCharacter = aString.charAt(endCharacterIndex);
      if (startCharacter != endCharacter) {
        break;
      }
      result++;
      startCharacterIndex--;
      endCharacterIndex++;
    }
  }
}
