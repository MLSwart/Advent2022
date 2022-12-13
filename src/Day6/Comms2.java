package Day6;

import java.util.*;

public class Comms2 {
    public static void main(String[] args) {

        String input = "mjqjpqmgbljsphdztnvjfqwrcgsmlb";

        char[] messageArray = new char[14];

        for (int n = 0; n < messageArray.length; n++) {

            messageArray[n] = input.charAt(n);
        }
        //sorteer array op alfabetische volgorde
        for (int p = 0; p < messageArray.length - 1; p++) {
            if (messageArray[p] > messageArray[p + 1]) {
                char cache = messageArray[p];
                messageArray[p] = messageArray[p + 1];
                messageArray[p + 1] = cache;
                p = -1;
            }

        }
        // is [0] uniek? [1] uniek? [2] uniek? ... [14] uniek?
        for (int k = 0; k < messageArray.length - 1; k++) {

            if (messageArray[k] == messageArray[k + 1])
                System.out.print(" " + messageArray[k]);
            boolean noDupes = false;

        }


    }
}
    /*  -is n gelijk aan n+1? => n++
        -is n gelijk aan n+2? => n++
        -is n gelijk aan n+3? => n++

        -is n+1 gelijk aan n+2? => n++
        -is n+1 gelijk aan n+3? => n++

        -is n+2 gelijk aan n+3? => n++

        Ik maak een nieuw array van n+13 characters van de string.
        Bevat nieuwArray stringArray[0]? stringArray[1]? enz

        (Sort array?) Count occurrences. Als een array een character meer dan 1x bevat: n++.

     */