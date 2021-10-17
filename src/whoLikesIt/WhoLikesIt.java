//Description:
//
//        You probably know the "like" system from Facebook and other pages. People can "like" blog posts, pictures or other items. We want to create the text that should be displayed next to such an item.
//
//        Implement the function which takes an array containing the names of people that like an item. It must return the display text as shown in the examples:
//
//        []                                -->  "no one likes this"
//        ["Peter"]                         -->  "Peter likes this"
//        ["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
//        ["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
//        ["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this"
//

package whoLikesIt;

class WhoLikesIt {

        public static String whoLikesIt(String... names) {
            String sentence = "";

            switch (names.length) {
                case 0:   sentence = "no one likes this";
                    break;
                case 1:   sentence = names[0] + " likes this";
                    break;
                case 2:   sentence = names[0] + " and " + names[1] + " like this";
                    break;
                case 3:   sentence = names[0] + ", " + names[1] + " and " + names[2] + " like this";
                    break;
                default:  sentence = names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
            }
            return sentence;
        }


    public static void main(String[] args) {
        String arr[] = new String[] {};
        String arr2[] = new String[] {"Peter"};
        String arr3[] = new String[] {"Jacob", "Alex"};
        String arr4[] = new String[] {"Max", "John", "Mark"};
        String arr5[] = new String[] {"Alex", "Jacob", "Mark", "Max"};
        String arr6[] = new String[] {"Alex", "Jacob", "Mark", "Max", "Keith"};

        System.out.println(whoLikesIt(arr));
        System.out.println(whoLikesIt(arr2));
        System.out.println(whoLikesIt(arr3));
        System.out.println(whoLikesIt(arr4));
        System.out.println(whoLikesIt(arr5));
        System.out.println(whoLikesIt(arr6));

        System.out.println(whoLikesIt("Alex", "Jacob", "Mark", "Max", "Keith", "Sebastian"));
    }
}