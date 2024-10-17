// Java code​​​​​​‌​‌‌‌‌‌‌​‌‌​​​‌‌‌​​‌​​​‌‌ below
/*******************************************************
Write your answer here, and then test your code.
Your job is to implement the filterColorsContainingE()
method.
********************************************************/ 

import java.util.List;
import java.util.stream.Collectors;

class Answer {

    /***************************************************
    Change these boolean values to control whether you see
    the expected result and/or hints.
    ****************************************************/ 
    static boolean showExpectedResult = false;
    static boolean showHints = false;


    static List<String> filterColorsContainingE(List<String> colors) {
        /*
        TODO: Use stream operations to filter the list of colors 
        into a new list that contains only the ones that contain 
        the letter 'e'.
         */
        return colors.stream()
            .filter(v->v.contains("e"))
            .collect(Collectors.toList());

        }

}
