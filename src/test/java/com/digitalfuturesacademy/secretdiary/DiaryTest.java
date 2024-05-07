package com.digitalfuturesacademy.secretdiary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @DisplayName("Test Add Entry")
    @Test
    public void addAnItemCheckThatEntriesLengthIncreasedBy1() {
        // Arrange
        Diary testDiary = new Diary();
        String testEntry = "";
        //Act
        testDiary.addEntry(testEntry);
        //Assert
        assertEquals(testDiary.getEntries().size(), 1);
    }
    @Test
    public void addAnItemCheckThatEntriesContainsAddedEntry() {
        // Arrange
        Diary testDiary = new Diary();
        String testEntry = "Test";
        //Act
        testDiary.addEntry(testEntry);
        //Assert
        assertTrue(testDiary.getEntries().contains(testEntry));
    }
        @Test
    public void addAnItemCheckThatPassingNullThrowsIllegalArgumentException() {
        // Arrange
        Diary testDiary = new Diary();
        //Assert
        assertThrows(IllegalArgumentException.class, ()->testDiary.addEntry(null));
    }
}
