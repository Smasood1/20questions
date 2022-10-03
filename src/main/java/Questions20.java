import java.util.Arrays;

public class Questions20 {
    //question 1
    //in java index position 0 is considered 1 value, therefore even though there are 4 string names,
    //the index position is actually 3
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }

    //question 2
    //to get the 2nd to last index position we know .length gives us the final index number, therefore if we
    //subract by 2 we can get the 2nd to last index position.
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }

    //question 3
    //to get the first element in the string name we must return the index position 0 in the array
    public static String getFirstElement(String[] names) {
        return names[0];
    }

    //question 4

    public static String getLastElement(String[] names) {
        return names[names.length-1];
    }

    //question 5

    public static String getSecondToLastElement(String[] names) {
        return names[names.length-2];
    }

    //question 6
    //
    public static int getSum(int[] ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }
    //question 7

    public static int getAverage(int[] ints) {
        double total = 0;
        for (int i = 0; i < ints.length; i++) {
            total = total + ints[i];
        }
        double average = (total / ints.length);
        return (int) average;
    }

    //question 8
    public static String extractAllOddNumbers(int[] number) {
        String odd = " ";
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                odd = odd + number[i] + " ";
            }
        }
        return odd;
    }

    //question 9
    public static String extractAllEvenNumbers(int[] number) {
        String even = " ";
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 == 0) {
                even = even + (number[i]) + " ";
            }
        }
        return even;

    }

    //question 10
    public static boolean contains(String[] names, String element) {

        //Loop through array to check if element exists in the array
        //if name exists return true, else return false


        for (int i = 0; i < names.length; i++) {
            if (element == names[i]) {
                return true;

            }
        }
        return false;
    }


    //question 11
    //create a loop that checks through each index position of the array
    //creating a condition if the element exists in the string array then return the index position
    public static int getIndexByElement(String[] names, String element) {
        int container = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] == element) {
                container = i;

            }
        }
        return container;
    }


    //question 12
    //create a loop to loop through a start int and end int.
    //add a condition to test if the number is odd, to do this we add a function that gives us a remainder
    //and if this remainder is not =0 then it is odd
    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");

            }

        }
    }
    //question 13

    public static String printGivenStringTimesNumberGiven(String str, int n) {

        str = str.repeat(n);

        return str;
    }

    public static String repeatFirstThreeLetters(String str, int n){

        //declare
        String firstThreeChar;
        str = str.substring(0,3);

        firstThreeChar = str.repeat(n);



        return firstThreeChar;


    }

    // question 15

    // Write a java method to count all the words in a string

    public static int WordsInAStringCounter(String str) {
        String [] words = str.split("\\s+");


        return words.length;
    }

    //question 16

    //A, E, I, O, U, and sometimes Y
    public static int VowelsCounter(String str) {
        String sentence = str;
        sentence = sentence.toLowerCase();

        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            char characters = sentence.charAt(i);
            if(characters == 'a'|| characters == 'e'|| characters == 'i' ||characters == 'o' ||characters == 'u'||characters == 'y') {
                count++;
            }
        }
        return count;
    }


    //question 17
    //Swap the first element in an array with the last element in an array and return
    public static String[] swap(String[] stringArray) {
        String[] namesSwap = stringArray;
        //parameter string words is in array, now we can use index positions

        String x = stringArray[0];
        String y = stringArray[stringArray.length-1];

        namesSwap[0] = y;
        namesSwap[namesSwap.length-1]=x;

        return namesSwap;
    }



    //question 18

    public static String replaceCharacters(String str) {
        str = str.toLowerCase();

        str = str.replace('f','7');
        str = str.replace('s','$');
        str = str.replace('1','!');
        str = str.replace('a','@');


        return str;
    }





   // Question 19
      //        1    2    3    4     5    6    7                  1  2    3  4     5   6     7
    //        " The small brown dog hopped the fence " becomes " The Wu Tang Wu Hopped Wu Fence "
    public static String replaceWuTangTwoThreeDivisible(String stringInput) {

       String [] stringInputArray = stringInput.split(" ");
       String x = " ";
       for(int i = 0; i < stringInputArray.length; i++){
           if((i+1) % 2 == 0){
               stringInputArray[i] = "wu";
           }
           else if((i+1) % 3 == 0){
               stringInputArray[i] = "Tang";
           }

           x = x + stringInputArray[i] + " ";
       }
        return x;
    }
   // Question 20
    //n fibonacci series, next number is the sum of previous two numbers
   // for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
    public static String createStringOfFibonnaciUpToMax(int maxnumber) {

        int num1 = 0;
        int num2 = 1;

        String str = num1 + " " + num2;

        for(int i = 0; i < maxnumber; i++){
            int num3 = num1 + num2;

            num1 = num2;
            num2 = num3;
            if(maxnumber <= num3){
                break;
            }

            str += num3 + " ";
        }


        return str;
    }








    public static void main(String[] args) {
        String[] names = {"Saad", "Kyle", "Kareem", "Omar","Isaiah","Tom"};
        int[] number = {24, 52, 33, 64, 71, 19, 62};


        System.out.println("Q1 - Get last Index");
        System.out.println(getLastIndex(names));
        System.out.println("Question 2");
        System.out.println(getSecondToLastIndex(names));
        System.out.println("Question 3");
        System.out.println(getFirstElement(names));
        System.out.println("Question 4");
        System.out.println(getLastElement(names));
        System.out.println("Question 5");
        System.out.println(getSecondToLastElement(names));
        System.out.println("Question 6");
        System.out.println(getSum(number));
        System.out.println("Question 7");
        System.out.println(getAverage(number));
        System.out.println("Question 8");
        System.out.println(extractAllOddNumbers(number));
        System.out.println("Question 9");
        System.out.println(extractAllEvenNumbers(number));
        System.out.println("Question 10");
        System.out.println(contains(names,"Kyle"));
        System.out.println("Question 11");
        System.out.println(getIndexByElement(names,"Saad"));
        System.out.println("Question 12");
        printOddNumbersInRange(24,62);
        System.out.println("Question 13");
        System.out.println(printGivenStringTimesNumberGiven("Saad",4));
        System.out.println("Question 14");
        System.out.println(repeatFirstThreeLetters("lolwhat",5));
        System.out.println("Question 15");
        System.out.println(WordsInAStringCounter("Green Yllow Blue Green Black"));
        System.out.println("Question 16");
        System.out.println(VowelsCounter("yo my name is saad"));
        System.out.println("Question 17");
        System.out.println("The original Array of names: " + Arrays.toString(names));
        System.out.println(Arrays.toString(swap(names)));
        System.out.println("Question 18");
        System.out.println(replaceCharacters("The Farmer went to the store to get 1 dollar's worth of fertilizer"));
        System.out.println("Question 19");
        System.out.println("Original String: The small brown dog hopped the fence");
        System.out.println(replaceWuTangTwoThreeDivisible("The small brown dog hopped the fence"));
        System.out.println("Question 20");
        System.out.println(createStringOfFibonnaciUpToMax(534989999));
    }
}

