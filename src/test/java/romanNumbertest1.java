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
    @Test
    void shouldConverteIIIto3(){
        assertEquals("III",toRoman(3));
    }
    @Test
    void shouldConverteIVto4(){
        assertEquals("IV",toRoman(4));
    }
    @Test
    void shouldConverteVto5(){
        assertEquals("V",toRoman(5));
    }
    @Test
    void shouldConverteVIto6(){
        assertEquals("VI",toRoman(6));
    }
    @Test
    void shouldConverteVIIto7(){
        assertEquals("VII",toRoman(7));
    }
    @Test
    void shouldConverteVIIIto8(){
        assertEquals("VIII",toRoman(8));
    }
    @Test
    void shouldConverteIXto9(){
        assertEquals("IX",toRoman(9));
    }


    private String toRoman(int number) {
        String result="";

        if (number==9){
            result="IX";
            number-=9;
        }

        if (number>=5){
            result ="V";
            number-=5;
        }

        if (number==4){
            result="IV";
            number -=4;
        }

        for (int i = 0; i < number; i++) {
            result += "I";
        }
        return result;
    }

}
