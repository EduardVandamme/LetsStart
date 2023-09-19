package be.vives.ti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    @org.junit.jupiter.api.Test
    void appendIfMissing() {
        StringProccesor stringprocessor = new StringProccesor();
        String result = stringprocessor.appendIfMissing("hallo!", "!");
        assertEquals(result, "hallo!");
    }

    @Test
    void AppendIfMissingWithout() {
        StringProccesor stringprocessor = new StringProccesor();
        String result = stringprocessor.appendIfMissing("hallo", "!");
        assertEquals(result, "hallo!");
    }
}