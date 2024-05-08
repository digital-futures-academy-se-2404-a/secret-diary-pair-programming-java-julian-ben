package com.digitalfuturesacademy.secretdiary;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DiaryTest {
    @DisplayName("Test Add Entry")
    @Test
    public void addAnItemCheckThatEntriesLengthIncreasedBy1() {
        // Arrange
        Diary testDiary = new Diary();
        Entry testEntry = mock(Entry.class);
        //Act
        testDiary.addEntry(testEntry);
        //Assert
        assertEquals(testDiary.getEntries().size(), 1);
    }
    @Test
    public void addAnItemCheckThatEntriesContainsAddedEntry() {
        // Arrange
        Diary testDiary = new Diary();
        Entry testEntry = mock(Entry.class);
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

    @DisplayName("Get test entry")
    @Test
    public void checkThatWeCanReturnAnEntryByIdUsingGetEntry() {
        // Arrange
        Diary testDiary = new Diary();
        Entry testEntry = mock(Entry.class);
        when(testEntry.getId()).thenReturn(1);
        // Act
        testDiary.addEntry(testEntry);
        // Assert
        assertEquals(testDiary.getEntry(1), testEntry);
    }
        @DisplayName("Get test entry")
    @Test
    public void checkThatGetEntryReturnsNullWHereEntryNotInEntries() {
        // Arrange
        Diary testDiary = new Diary();
        Entry testEntry = mock(Entry.class);
        when(testEntry.getId()).thenReturn(1);
        // Act
        testDiary.addEntry(testEntry);
        // Assert
        assertNull(testDiary.getEntry(2));
    }
}
