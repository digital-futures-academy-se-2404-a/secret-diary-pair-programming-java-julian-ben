package com.digitalfuturesacademy.secretdiary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    @DisplayName("Expect exception when cohort is empty string")
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
}
