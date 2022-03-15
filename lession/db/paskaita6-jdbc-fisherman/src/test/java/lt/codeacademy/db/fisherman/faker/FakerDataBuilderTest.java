package lt.codeacademy.db.fisherman.faker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakerDataBuilderTest {

    @Test
    void genFishermanList_shouldHave_100data() {
        assertEquals(100, FakerDataBuilder.genFishermanList().size());
    }

    @Test
    void genFishermanList_idDataShouldNotHaveNullValues() {
        FakerDataBuilder.genFishermanList().forEach(s ->
                assertTrue(s.getId() != null));
    }

    @Test
    void genFishList_shouldHave_10000data() {
        assertEquals(10000, FakerDataBuilder.genFishList().size());
    }

    @Test
    void genFishList_idDataShouldNotHaveNullValues() {
        FakerDataBuilder.genFishList().forEach(s ->
                assertTrue(s.getId() != null));
    }
}
