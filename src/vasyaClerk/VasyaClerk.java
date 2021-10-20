package vasyaClerk;

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine)
    {

        int changeNeeded = 0;
        int cashOnHand = 0;

        for (int i = 0; i < peopleInLine.length; i++) {

            System.out.println("");
            System.out.println("The person would like to buy a ticket, but only has a " + peopleInLine[i] + " dollar bill");
            System.out.println("Your current cash on hand is " + cashOnHand);


            if (peopleInLine[i] == 25) {

                changeNeeded = 0;

                System.out.println("The customer needs " + changeNeeded + " back in change");

                System.out.println("You sell them a ticket");    public static String Tickets(int[] peopleInLine)
                {

                    int changeNeeded = 0;
                    int cashOnHand = 0;

                    for (int i = 0; i < peopleInLine.length; i++) {

                        System.out.println("");
                        System.out.println("The person would like to buy a ticket, but only has a " + peopleInLine[i] + " dollar bill");
                        System.out.println("Your current cash on hand is " + cashOnHand);


                        if (peopleInLine[i] == 25) {

                            changeNeeded = 0;

                            System.out.println("The customer needs " + changeNeeded + " back in change");

                            System.out.println("You sell them a ticket");
                            cashOnHand += 25;
                            System.out.println("You have " + cashOnHand + " dollars on hand");

                        } else if (peopleInLine[i] == 50) {

                            changeNeeded = 25;

                            System.out.println("The customer needs " + changeNeeded + " back in change");

                            if (changeNeeded <= cashOnHand) {
                                System.out.println("You sell them a ticket");
                                cashOnHand += 25;
                                cashOnHand -= changeNeeded;
                                System.out.println("You have " + cashOnHand + " dollars on hand");
                            } else {
                                System.out.println("Change needed: " + changeNeeded);
                                System.out.println("Final cash on hand: " + cashOnHand);
                                return "NO";
                            }

                        } else if (peopleInLine[i] == 100) {

                            changeNeeded = 75;

                            System.out.println("The customer needs " + changeNeeded + " back in change");

                            if (changeNeeded <= cashOnHand) {
                                System.out.println("You sell them a ticket");
                                cashOnHand += 25;
                                cashOnHand -= changeNeeded;
                                System.out.println("You have " + cashOnHand + " dollars on hand");
                            } else {
                                System.out.println("Change needed: " + changeNeeded);
                                System.out.println("Final cash on hand: " + cashOnHand);
                                return "NO";
                            }
                        }

                    }

                    System.out.println("Final cash on hand: " + cashOnHand);
                    return "YES";

                }

                cashOnHand += 25;
                System.out.println("You have " + cashOnHand + " dollars on hand");

            } else if (peopleInLine[i] == 50) {

                changeNeeded = 25;

                System.out.println("The customer needs " + changeNeeded + " back in change");

                if (changeNeeded <= cashOnHand) {
                    System.out.println("You sell them a ticket");
                    cashOnHand += 25;
                    cashOnHand -= changeNeeded;
                    System.out.println("You have " + cashOnHand + " dollars on hand");
                } else {
                    System.out.println("Change needed: " + changeNeeded);
                    System.out.println("Final cash on hand: " + cashOnHand);
                    return "NO";
                }

            } else if (peopleInLine[i] == 100) {

                changeNeeded = 75;

                System.out.println("The customer needs " + changeNeeded + " back in change");

                if (changeNeeded <= cashOnHand) {
                    System.out.println("You sell them a ticket");
                    cashOnHand += 25;
                    cashOnHand -= changeNeeded;
                    System.out.println("You have " + cashOnHand + " dollars on hand");
                } else {
                    System.out.println("Change needed: " + changeNeeded);
                    System.out.println("Final cash on hand: " + cashOnHand);
                    return "NO";
                }
            }

        }

        System.out.println("Final cash on hand: " + cashOnHand);
        return "YES";

    }




    public static void main(String[] args) {
        System.out.println(VasyaClerk.Tickets(new int[]{25, 25, 50}));
        System.out.println(VasyaClerk.Tickets(new int[]{25, 100}));
        System.out.println(VasyaClerk.Tickets(new int[]{25, 25, 50, 50, 100}));
        System.out.println(VasyaClerk.Tickets(new int[]{50, 25, 50, 25, 100}));
        System.out.println(VasyaClerk.Tickets(new int[]{25, 25, 25, 100}));

    }
}
