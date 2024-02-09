import java.util.Scanner;

public class order {

	static Scanner scan = new Scanner(System.in);
	static String name;				//decalres string
	static String userteam;				//declares string
	static String[] teams = {"CLIPPERS" , "LAKERS"};	//declares string
	static String userdate;				//declares string
	static double userprice;			//declares string
	static String[] clipdates = { "MARCH 1ST" , "MARCH 9TH" , "MARCH 10TH" , "MARCH 12TH" , "MARCH 17TH" , "MARCH 24TH" , "MARCH 25TH" };		//declares string
	static String[] lakedates = { "MARCH 2ND" , "MARCH 4TH" , "MARCH 6TH" , "MARCH 8TH" , "MARCH 10TH" , "MARCH 16TH" , "MARCH 18TH" , "MARCH 22ND" , "MARCH 24TH" }; //declares string
	static double value = 50.00; 			//declares variable
	static int number;				//declares variable

	public static void getName(){
		System.out.println("Please enter your name");  //this lets users input their name
		name=scan.nextLine();			      	
		System.out.println(" Hello " + name);
		getTeam();
	}

	public static void getTeam(){
		System.out.println("Please select a Team:");   // This makes users choose what team they would like to see
		for(int i=0;i<teams.length;i++){
			System.out.println(i+1 +  ":" + teams[i]);
		}
	number=scan.nextInt();
	number = number -1;
	userteam = teams[number];
	System.out.println("You selected the " + teams[number]);
	getDates();
	}

	public static void getDates(){ 				//lets users which game date they would like to attend
		System.out.println("Please choose which date you would like to attend");
	if (teams[number].equals ("CLIPPERS")){
		for(int i=0;i<clipdates.length;i++){
                        System.out.println(i+1 + ":" + clipdates[i]);
			}
	number=scan.nextInt();
	userdate = clipdates[number-1];
        System.out.println("You selected the " + clipdates[number-1] + "game");
	getPrice();
		
	}else{
		for(int i=0;i<clipdates.length;i++){
                        System.out.println(i+1 + ":" + lakedates[i]);
			}
	number=scan.nextInt();
	userdate = lakedates[number-1];
        System.out.println("You selected the " + lakedates[number-1] + "game");
        getPrice();
		}
	}	

	public static void getPrice(){				//lets users choose amount of tickets they would like to purchase and also gives them place and date to pick them up
		System.out.println("Please choose how many tickets you would like to purchase");
		int userNumber =  scan.nextInt();
		userprice = value * userNumber;
		System.out.println( "You have selected to buy " + userNumber + " tickets for a total of " + (value * userNumber) + " USD "); 
		System.out.println( " Thank you for your order " + name + " \n ORDER SUMMARY \n You have purchased " + userNumber + " ticket(s) for " + userprice + " USD for the upcoming " + userteam + " game on " + userdate + " . Please pick up your tickets on " + userdate + " at 1PM at the box office. ");
	}

	public static void main(String[] args) {
		getName();

}
}
