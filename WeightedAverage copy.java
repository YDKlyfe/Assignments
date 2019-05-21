/* Design an algorithm to find the weighted average of six test scores and the weighted average of six assignment scores and then get the master average between the two weighted averages.
The six test scores and their respective weights are given in the following format: 

75  0.10
95  0.20
85  0.25
55  0.25
65  0.10 
70  0.10
The six assignment scores and their respective weights are given in the following format: 

55  0.05
65  0.10
65  0.15
60  0.25
55  0.25 
50  0.20
*/

public class WeightedAverage {

    public static void main(String[] args) {
        
        
        //Test scores
        int testScore1 = 75;
        int testScore2 = 95; 
        int testScore3 = 85;
        int testScore4 = 55;
        int testScore5 = 65;
        int testScore6 = 70; 
        double weightTestScore1 = 0.10;
        double weightTestScore2 = 0.20;
        double weightTestScore3 = 0.25;
        double weightTestScore4 = 0.25;
        double weightTestScore5 = 0.10;
        double weightTestScore6 = 0.10;
    
        double average1 = testScore1 * weightTestScore1 + testScore2 * weightTestScore2 + testScore3 * weightTestScore3 + testScore4 * weightTestScore4 + testScore5 * weightTestScore5 + testScore6 * weightTestScore6;
        System.out.println("The weighted average score for tests is " + average1);
        
        //Assignments scores
         int assignment1 = 55;
         int assignment2 = 65;
         int assignment3 = 65;
         int assignment4 = 60;
         int assignment5 = 55;
         int assignment6 = 50;
         double weightAssignment1 = 0.05;
         double weightAssignment2 = 0.10;
         double weightAssignment3 = 0.15;
         double weightAssignment4 = 0.25;
         double weightAssignment5 = 0.25;
         double weightAssignment6 = 0.20;
         
         double average2 = assignment1 * weightAssignment1 + assignment2 * weightAssignment2 + assignment3 * weightAssignment3 + assignment4 * weightAssignment4 + assignment5 * weightAssignment5 + assignment6 * weightAssignment6;
         System.out.println ("The weighted average score for assignment is " +average2);
         
         double totalAverage = (average1 + average2) / 2;
         System.out.println("The master averages score is " + totalAverage);
    }
      
}
