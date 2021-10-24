package splitInParts;

// The aim of this kata is to split a given string into different strings of equal size (note size of strings is passed to the method)
//
//        Example:
//
//        Split the below string into other strings of size #3
//
//        'supercalifragilisticexpialidocious'
//
//        Will return a new string
//        'sup erc ali fra gil ist ice xpi ali doc iou s'
//
//        Assumptions:
//
//        String length is always greater than 0
//        String has no spaces
//        Size is always positive
//

public class InParts {

    public static String splitInParts(String s, int partLength) {
        String splitString = "";

        for (int i = 0; i < s.length(); i += partLength ) {

            if (i + partLength >= s.length()) {

                splitString += s.substring(i);

            } else {

                splitString += s.substring(i, i + partLength) + " ";

            }

        }

        return splitString;
    }

    public static void main(String[] args) {
        splitInParts("supercalifragilisticexpialidocious", 3);
    }
}