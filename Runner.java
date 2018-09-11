
/**
 * Runner for Problem Set 0.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Runner
{
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        Haiku haiku = new Haiku();
        ASCIIArt art = new ASCIIArt();
        TravelAgent agent = new TravelAgent();
        Calculator calc = new Calculator();
        PersonalityQuiz quiz = new PersonalityQuiz();
        ROT13 rot = new ROT13();
        ForLoopFactorial factorial = new ForLoopFactorial();
        GuessTheNumber number = new GuessTheNumber();
     
        String[] arg = {};
        
        System.out.println("Problem 0-0: Hello World");
        hello.main(arg);
        
        System.out.println("Problem 0-1: Haiku");
        haiku.main(arg);
        
        System.out.println("Problem 0-2: ASCII Art");
        art.main(arg);
        
        System.out.println("Problem 0-3: Travel Agent");
        agent.main(arg);
        
        System.out.println("Problem 0-4: Calculator");
        calc.main(arg);
        
        System.out.println("Problem 0-5: Personality Quiz");
        quiz.main(arg);
        
        System.out.println("Problem 0-6: ROT13");
        rot.main(arg);
        
        System.out.println("Problem 0-7: For Loop Factorial");
        factorial.main(arg);
        
        System.out.println("Problem 0-8: Guess the Number");
        number.main(arg);
    }
}
