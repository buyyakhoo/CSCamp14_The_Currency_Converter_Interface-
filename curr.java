import java.util.Scanner;
public class curr {
    public static void main(String[]args) {
        //lao china japan malaysia south korea
        Scanner sc = new Scanner(System.in);

        int money_baht = 0, money_oc = 0;

        //1. yen 2. won 3. ringkit 4. yuan 5. kip

        double[] data_ttc = new double[5];
        data_ttc[0] = 3.85; data_ttc[1] = 36.76; data_ttc[2] = 0.13; data_ttc[3] = 0.19278; data_ttc[4] = 413.50;

        double[] data_ctt = new double[5];
        data_ctt[0] = 0.26; data_ctt[1] = 0.027; data_ctt[2] = 7.86; data_ctt[3] = 5.19; data_ctt[4] = 0.0024;
        // int money_kip = 0;
        // int 

        String[] curr = {"Yen", "Won", "Ringkit", "Yuan", "Kip"};

        int quit_out = 0;

        try {    
            System.out.println("------------------------------------------------------");
            System.out.println();
            System.out.println("               CURRENCY CONVERTER                     ");
            System.out.println();
            System.out.println("------------------------------------------------------");
            System.out.println();

            while (quit_out == 0) {
                System.out.println("------------------------------------------------------");
                System.out.println();
                System.out.println("Choose the mode to continue");
                System.out.println("1. Baht to other currency ");
                System.out.println("2. Other currency to Baht");
                System.out.println("3. Quit");
                System.out.println();
                System.out.println("------------------------------------------------------");
                System.out.println();

                int choice_mode;
                System.out.print("Enter the choice: ");
                choice_mode = sc.nextInt();

                if (choice_mode == 1) {
                    int quit = 0;
                    while (quit == 0) {
                        
                        do {
                            System.out.print("Enter the amount (Baht): ");
                            money_baht = sc.nextInt();
                            if (money_baht < 0) {
                                System.out.println();
                                System.out.println("We don't allowed the negative number");
                                System.out.println();
                            }
                        }
                        while (money_baht < 0);
                        
                        int choice;

                        do {
                            System.out.println("------------------------------------------------------");
                            System.out.println();
                            System.out.println("Choose the currency to convert");
                            System.out.println("1. Yen (JPY)");
                            System.out.println("2. Won (KRW)");
                            System.out.println("3. Ringgit (MYR)");
                            System.out.println("4. Yuan (CNY)");
                            System.out.println("5. Kip (LAK)");
                            System.out.println();
                            System.out.println("------------------------------------------------------");
                            System.out.println();
                            System.out.print("Enter the choice: ");
                            choice = sc.nextInt() - 1;

                            if (choice < 0 || choice > 4) {
                                System.out.println();
                                System.out.println("The choice doesn't exist, please try again.");
                                System.out.println();
                            }
                        }
                        while (choice < 0 || choice > 4);

                        double result = money_baht * data_ttc[choice];

                        // System.out.println("Amount: " + result + " " +  curr[choice]);
                        System.out.println();
                        System.out.format("Amount : %.2f %s", result, curr[choice]);
                        System.out.println();

                        
                        do {
                            System.out.println("------------------------------------------------------");
                            System.out.println();
                            System.out.print("Are you want to quit the baht to other currency? (0: No, 1: Yes): ");
                            quit = sc.nextInt();
                            System.out.println();

                            if (quit < 0 || quit > 1) {
                                System.out.println();
                                System.out.println("The choice doesn't exist, please try again.");
                                System.out.println();
                            }
                        }
                        while (quit < 0 || quit > 1);

                        System.out.println();
                        System.out.println("------------------------------------------------------");
                        System.out.println();              

                    }

                } else if (choice_mode == 2) {

                    // System.out.print("Enter the amount (Baht): ");
                    // money_baht = sc.nextInt();

                    int quit = 0;
                    while (quit == 0) {
                        int choice;
                        
                        do {
                            System.out.println("------------------------------------------------------");
                            System.out.println();
                            System.out.println("Choose the currency to convert");
                            System.out.println("1. Yen (JPY)");
                            System.out.println("2. Won (KRW)");
                            System.out.println("3. Ringgit (MYR)");
                            System.out.println("4. Yuan (CNY)");
                            System.out.println("5. Kip (LAK)");
                            System.out.println();
                            System.out.println("------------------------------------------------------");
                            System.out.println();
                            System.out.print("Enter the choice: ");
                            choice = sc.nextInt() - 1;
                            if (choice < 0 || choice > 4) {
                                System.out.println();
                                System.out.println("The choice doesn't exist, please try again.");
                                System.out.println();
                            }
                        }
                        while (choice < 0 || choice > 4);

                        do {
                            System.out.format("Enter the amount (%s): ", curr[choice]);    
                            money_oc = sc.nextInt();
                            if (money_oc < 0) {
                                System.out.println();
                                System.out.format("We don't allowed negative number.");   
                                System.out.println();
                            }
                        }
                        while (money_oc < 0);
                        
                        
                        double result = money_oc * data_ctt[choice];

                        // System.out.println("Amount: " + result + " " +  curr[choice]);
                        System.out.format("Amount : %.2f Baht", result);
                
                        System.out.println();
                        System.out.println();

                        do {
                            System.out.println("------------------------------------------------------");
                            System.out.println();
                            System.out.print("Are you want to quit the other currency converter to baht? (0: No, 1: Yes): ");
                            quit = sc.nextInt();
                            System.out.println();

                            if (quit < 0 || quit > 1) {
                                System.out.println();
                                System.out.println("The choice doesn't exist, please try again.");
                                System.out.println();
                            }
                        }
                        while (quit < 0 || quit > 1);

                        System.out.println();
                        System.out.println("------------------------------------------------------");
                        System.out.println();
                    }


                } else if (choice_mode == 3) {  
                    quit_out = 1;

                } else {
                    System.out.println();
                    System.out.println("The choice doesn't exist, please try again.");
                    System.out.println();
                }

            }
        } catch (Exception e) {
            System.out.println("Sorry for the inconvinient. [Error]");
        }
      
    }
}
