import java.util.*;

public class quizgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Question[] que = new Question[10];

        questionData(que);
        boolean winner = true;
        int num = 0;
        while (num < que.length && winner == true) {
            Question q = que[num];

            System.out.println(num + 1 + " )" + q.question);
            System.out.println("1 " + q.option1);
            System.out.println("2 " + q.option2);
            System.out.println("3 " + q.option3);
            System.out.println("4 " + q.option4);

            System.out.println("choose the correct option");

            boolean correctOpt = true;
            while (correctOpt == true) {
                int n = sc.nextInt();

                if (n == q.ans) {
                    System.out.println("correct option go to next Question");
                    System.out.println("\n\n");
                    correctOpt = false;
                    num++;

                } else if (n == 1 || n == 2 || n == 3 || n == 4) {
                    System.out.println(" not currect option game over");
                    System.out.println(" correct option is " + q.ans);
                    System.out.println("Your Score of Correct answers is " + num + "/10");
                    winner = false;
                    correctOpt = false;
                } else {
                    System.out.println("Try again Invalid option");
                }
            }
        }
    }

    public static void questionData(Question[] q) {
        Question q1 = new Question();
        q1.question = "I found _ book last night, ___ book is very useful.";
        q1.option1 = "the,a";
        q1.option2 = "the,the";
        q1.option3 = "a,the";
        q1.option4 = "a,a";
        q1.ans = 3;
        q[0] = q1;

        Question q2 = new Question();
        q2.question = "__ camel can go ___ long distance without water.";
        q2.option1 = " the,a";
        q2.option2 = "A,the";
        q2.option3 = "A,a";
        q2.option4 = "None of the above";
        q2.ans = 1;
        q[1] = q2;

        Question q3 = new Question();
        q3.question = "What do you normally have for __ breakfast?";
        q3.option1 = " the";
        q3.option2 = "a";
        q3.option3 = "no article";
        q3.option4 = "an";
        q3.ans = 1;
        q[2] = q3;

        Question q4 = new Question();
        q4.question = "In the coming years, ____ water is going to be scarce.";
        q4.option1 = " no article";
        q4.option2 = "an";
        q4.option3 = "the";
        q4.option4 = "a";
        q4.ans = 1;
        q[3] = q4;

        Question q5 = new Question();
        q5.question = "__ honest man is ___ noblest work of God.";
        q5.option1 = " A,the";
        q5.option2 = "The,the";
        q5.option3 = "An,the";
        q5.option4 = "A,a";
        q5.ans = 3;
        q[4] = q5;

        Question q7 = new Question();
        q7.question = " This is __ unique system of governance where everyone is the government.";
        q7.option1 = " an";
        q7.option2 = "the";
        q7.option3 = "a";
        q7.option4 = "some";
        q7.ans = 3;
        q[6] = q7;

        Question q8 = new Question();
        q8.question = " The teacher has been teaching for __ hour.";
        q8.option1 = " a";
        q8.option2 = "two";
        q8.option3 = "an";
        q8.option4 = "three";
        q8.ans = 3;
        q[7] = q8;

        q[5] = q2;

        Question q9 = new Question();
        q9.question = " The village possesses __ scenic beauty.";
        q9.option1 = " some";
        q9.option2 = "a";
        q9.option3 = "an";
        q9.option4 = "the";
        q9.ans = 2;
        q[8] = q9;
        q[9] = q1;
    }

}

class Question {
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    int ans;

}