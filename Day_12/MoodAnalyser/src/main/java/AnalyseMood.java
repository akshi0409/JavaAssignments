public class AnalyseMood {
    String findMood(String message)
    {
        message.toLowerCase();
        if(message.contains("sad"))
            return "SAD";
        else return "HAPPY";
    }
    public static void main(String[] args) {
        AnalyseMood mood = new AnalyseMood();
        System.out.println(mood.findMood("I am in any mood"));
    }
}