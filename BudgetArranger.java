import java.util.Scanner;

public class BudgetArranger {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Please enter your salary");
        Double salary= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your other income");
        Double otherIncome= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your Dept");
        Double dept= Double.parseDouble(scanner.nextLine());


        System.out.println("Please enter your year car expenses");
        Double carYearExpenses= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your year tax expenses");
        Double yearTax= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your rent ");
        Double rent= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your month food supply expenses");
        Double eat= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your month clothes, telephone, internet expences");
        Double clothes= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your month electricity, water, drugs and medicine expences");
        Double drugs= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your day eating expenses");
        Double dayEating= Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter your day tavel expences");
        Double travel= Double.parseDouble(scanner.nextLine());


        Double allIcome=salary+otherIncome;
        Double dayIcome=allIcome/30;
        Double allExpensesForADay=(carYearExpenses/365)+(dept/30)+(yearTax/365)+(rent/30)+(eat/30)+(clothes/30)+
                (drugs/30)+dayEating+travel;

        Double allTravelExpensesForDay=(carYearExpenses/365)+travel;



        System.out.printf(" All month income is %.2f lv %n All month Expenses are %.2f leva",allIcome, (allExpensesForADay*30));
        System.out.println("");
        System.out.printf(" Your day income is %.2f lv %n Your day Expenses are %.2f leva, so you can save %.2f leva each day",(allIcome/30), allExpensesForADay, ((allIcome/30)-allExpensesForADay));
        System.out.println("");
        System.out.printf(" Yo can save %.2f lv for a month and  %.2f leva for an year", ((((allIcome/30)-allExpensesForADay))*30),((((allIcome/30)-allExpensesForADay))*365));
        System.out.println("");
        System.out.printf(" Your day food expenses are %.3f procents from your day income ",(((((eat/30))+dayEating)/dayIcome) *100));
        System.out.println("");
        System.out.printf(" Your day travel expenses are %.3f procents from your day income ",(allTravelExpensesForDay/dayIcome*100));
        System.out.println("");
        System.out.printf(" all your expenses are %.3f procents from your  income ",((((allExpensesForADay*30))/allIcome) *100));



    }
}
