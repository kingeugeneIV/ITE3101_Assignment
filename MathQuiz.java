import java.util.*;

public class MathQuiz {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		Random rnd = new Random();
		int firstnum, secondnum, choice, questions, answer, rightans, qnum, num, i;
		double right, marks;
		right = 0;
		int newsize = args.length;								//convert string array to int array
		int [] array1 = new int [newsize];						//declare int array length = string array length
		for ( i=0 ; i < newsize ; i++){						
			array1[i] = Integer.parseInt(args[i]);			//input int array data from string array
		}													//end convert string array to int array												
	System.out.print("1)" + " " + "Addition" + "\n" + "2)" + " " + "Subtraction" + "\n" + "3)" + " " + "Multiplication" + "\n" + "4)" + " " +"Factorial" + "\n" + "9)" + " " + "Quit" + "\n\n" + "Enter you choice: ");
	choice = sc.nextInt();						//get user choice
			switch ( choice ) {
					case 9 : System.out.println("Good Bye!"); //Quit
						System.exit(0);						
			}
	System.out.print("Enter number of questions : ");
	questions = sc.nextInt(); //get number of question
			switch ( choice )
			{
				case 1 :	//Addition
						for ( qnum = 1 ; qnum <= questions ; qnum++ ) {
									firstnum = rnd.nextInt(newsize);			//get first random index
									secondnum = rnd.nextInt(newsize);			//get second random index							
										rightans = array1[firstnum] + array1[secondnum];  
										System.out.println("Q" + qnum + ": " + array1[firstnum] + " + " + array1[secondnum]);
										System.out.print("Your answer is : ");
										answer = sc.nextInt();
									if ( rightans == answer) {
										right++;
									}
						}
						break ; //end Addition
				case 2 :	//Subtraction
						for ( qnum = 1 ; qnum <= questions ; qnum++ ) {
									firstnum = rnd.nextInt(newsize);		//get first random index
									secondnum = rnd.nextInt(newsize);		//get second random index
									if ( array1[firstnum] >= array1[secondnum] ){
										rightans = array1[firstnum] - array1[secondnum];
										System.out.println("Q" + qnum + ": " + array1[firstnum] + " - " + array1[secondnum]);
									}
									else {
										rightans = array1[secondnum] - array1[firstnum];
										System.out.println("Q" + qnum + ": " + array1[secondnum] + " - " + array1[firstnum]);
									}										
										System.out.print("Your answer is : ");
										answer = sc.nextInt();
									if ( rightans == answer) {
										right++;
									}
						}						
						break; //end Subtraction
				case 3 :	//Multiplication
						for ( qnum = 1 ; qnum <= questions ; qnum++ ) {
									firstnum = rnd.nextInt(newsize);			//get first random index
									secondnum = rnd.nextInt(newsize);			//get second random index
										rightans = array1[firstnum] * array1[secondnum];
										System.out.println("Q" + qnum + ": " + array1[firstnum] + " * " + array1[secondnum]);
										System.out.print("Your answer is : ");
										answer = sc.nextInt();
									if ( rightans == answer) {
										right++;
									}
						}						
						break; //end Multiplication
				case 4 :	//Factorial
						for ( qnum = 1 ; qnum <= questions ; qnum++){
								firstnum = rnd.nextInt(newsize);			//get random index
										num = array1[firstnum];
										int factorial = num;
										for ( i = 1; i < num ; i++ ) {
												factorial = factorial * i;			
										}
										System.out.println("Q" + qnum + ": " + array1[firstnum] + "!");
										System.out.print("Your answer is : ");
										answer = sc.nextInt();
									if ( factorial == answer) {
										right++;
									}
						}						
						break; //end Factorial
			}
		marks = right / questions ; 			//Calculate the number of questions answered correctly
		System.out.println("You've answered " + questions + " question(s)" + "\n" + Math.round(right) + " of them are correct." + "\n" + "And your mark is " + marks*100 + "%" + "\n" + "Good Bye!"); //show the result in command prompt						
	} //end main
} //end class MathQuiz