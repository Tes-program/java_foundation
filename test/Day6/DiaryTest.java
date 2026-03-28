package Day6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {
    Diary diary;
    MyString pin;

    @BeforeEach
    void setUp() {
        pin = new MyString('p', 'i', 'n');
        diary = new Diary(pin);
    }

    @Test
    public void newDiary_isLockedTest() {
        assertTrue(diary.isLocked());
    }

    @Test
    public void unlockedDiary_diaryIsUnlockedTest() {
        assertTrue(diary.isLocked());
        diary.unlockWith(pin);
        assertFalse(diary.isLocked());
    }

}