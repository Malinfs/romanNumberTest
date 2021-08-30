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
    @Test
    void shouldConverteXto10(){
        assertEquals("X",toRoman(10));
    }
    @Test
    void shouldConverteXIto11(){
        assertEquals("XI",toRoman(11));
    }
    @Test
    void shouldConverteXVto15(){
        assertEquals("XV",toRoman(15));
    }
    @Test
    void shouldConverteIXXto19(){
        assertEquals("IXX",toRoman(19));
    }
    @Test
    void shouldConverteXXto20(){
        assertEquals("XX",toRoman(20));
    }
    @Test
    void shouldConverteXXIVto24(){
        assertEquals("XXIV",toRoman(24));
    }
    @Test
    void shouldConverteXXXto30(){
        assertEquals("XXX",toRoman(30));
    }
    @Test
    void shouldConverteXXXVIto36(){
        assertEquals("XXXVI",toRoman(36));
    }
    @Test
    void shouldConverteXXXIXto39(){
        assertEquals("XXXIX",toRoman(39));
    }



    private String toRoman(int number) {
        String result="";

        while (number> 0){
            if (number==39){
                result += "XXXIX";
                number -= 39;
            }
            if (number>29 && number<39){ //romersk tall 30
                result += "XXX";
                number -= 30;
            }

            if(number>19 && number<29){ //romersk tall 20
                result += "XX";
                number -= 20;
            }
            if(number==19){
                result +="IXX";
                number -= 19;
            }
            if (number>9 && number<19){ //romersk tall 10
                result+="X";
                number-=10;
            }
            if (number==9){
                result+="IX";
                number-=9;
            }

            if (number>4 && number<9){ //romersk tall 5
                result +="V";
                number-=5;
            }

            if (number==4){
                result+="IV";
                number -=4;
            }
            for (int i = 0; i < number; i++) {
                result += "I";
                number-=1;
            }

        }


        return result;
    }

}
