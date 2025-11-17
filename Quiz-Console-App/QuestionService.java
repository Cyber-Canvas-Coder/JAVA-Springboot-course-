
import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is your name", "sayantan", "sayan", "shantanu", "sankha", "sayantan");
        questions[1] = new Question(2, "Which language runs in a web browser?", "Java", "C", "Python", "JavaScript",
                "JavaScript");

        questions[2] = new Question(3, "Who is the founder of Java?", "James Gosling", "Guido van Rossum",
                "Dennis Ritchie", "Bjarne Stroustrup", "James Gosling");

        questions[3] = new Question(4, "Which device is used to measure acceleration?", "MPU6050", "LM35", "HX711",
                "DS18B20", "MPU6050");

        questions[4] = new Question(5, "What is the capital of India?", "Mumbai", "New Delhi", "Kolkata", "Chennai",
                "New Delhi");

    }

    int i = 0;

    public void PlayQuiz() {
        for (Question q : questions) {
            System.out.println("Question no. " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println("a)" + q.getOpt1());
            System.out.println("b)" + q.getOpt2());
            System.out.println("c)" + q.getOpt3());
            System.out.println("d)" + q.getOpt4());
            System.out.print("Enter your answer: ");
            Scanner sc = new Scanner(System.in);
            selection[i++] = sc.nextLine();
            System.out.println();

        }

        for (String s : selection) {
            System.out.println("Your answers: ");
            System.out.println(s);
        }
    }

    public void printScore() {

        int score = 0;
        for (int i = 0; i < questions.length; i++) {

            Question que = questions[i];

            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }

        System.out.println("The score is: " + score);
    }
}