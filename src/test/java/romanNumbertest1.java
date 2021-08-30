import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class romanNumbertest1 {

    @Test
    void shouldConverteIto1(){
        assertEquals("I",toRoman(1));
    }
    @Test
    void shouldConverteIIto2(){
        assertEquals("II",toRoman(2));
    }

    private String toRoman(int i) {
        return "I";
    }

}
