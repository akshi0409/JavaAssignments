class MoodAnalysisException extends Exception{
    MoodAnalysisException(String msg)
    {
        super(msg);
    }
}
public class AnalyseMood {
    String message;
    AnalyseMood()
    {

    }
    AnalyseMood(String msg)
    {
        try {
            if(msg=="")
                throw new MoodAnalysisException("Invalid mood");
            else if (msg==null)
            {
                throw new MoodAnalysisException("Invalid moode");
            }
            else
                message = msg;
        }
        catch (MoodAnalysisException e)
        {
            System.out.println("Exception Caught: "+ e.getMessage());
        }
    }
    String findMood()
    {
        return "SAD";
    }
    String findMood(String msg)
    {
        try {
            if(msg=="") {
                throw new MoodAnalysisException("Empty mood");
            }
            else if (msg==null)
            {
                throw new MoodAnalysisException("Invalid mood");
            }
            else {
                message = msg;
                msg.toLowerCase();
                if(msg.contains("sad"))
                    return "SAD";
            }

        }
        catch (MoodAnalysisException e)
        {
            System.out.println("Exception Caught: "+ e.getMessage());
        }

        return "HAPPY";
    }
    public static void main(String[] args) {
        AnalyseMood mood = new AnalyseMood();
        System.out.println(mood.findMood("I am in any mood"));
        System.out.println(mood.findMood("I am in sad mood"));
        AnalyseMood mood1 = new AnalyseMood("I am in sad mood");
        System.out.println(mood1.findMood());
        AnalyseMood mood2 = new AnalyseMood("I am in any mood");
        System.out.println(mood2.findMood());
        System.out.println(mood.findMood(""));
        System.out.println(mood.findMood(null));
    }
}