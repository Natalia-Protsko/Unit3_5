
/**
 * Created by nata on 13.04.2017.
 */
public class TestTax {
    public static void main(String[] args){

        if (args.length != 3){
            System.out.println("Sample usage of the program:" +
                    "  java TestTax 50000 NJ 2");
            System.exit(0);
        }

        Double grossIncome = Double.parseDouble(args[0]);
        String state = args[1];
        int dependents = Integer.parseInt(args[2]);


        Tax   t = new Tax(grossIncome, state, dependents);
        Tax   t2 = new Tax(65000, "TX", 4 );
        double dd = t2.convertToE(t2.calcTax());
        //Tax t3  = new Tax();

        double yourTax = t.calcTax(); //calculating tax

        // Printing the result
        System.out.println("Your tax is " + yourTax);
        double YourTaxE = Tax.convertToE(yourTax);

        double hisTax = t2.calcTax();
        System.out.println("His tax is " + hisTax);
        double hisTaxE = Tax.convertToE(hisTax);

    }
}

