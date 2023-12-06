import org.junit.*;
public class MoodAnalyserTest {
    @Test
    public void testMood()
    {
        AnalyseMood mood = new AnalyseMood();
        String result = mood.findMood("In any mood");
        Assert.assertEquals("HAPPY",result);
        String result2 = mood.findMood("In sad mood");
        Assert.assertEquals("SAD",result2);
        String result3 = mood.findMood("");
        Assert.assertEquals("HAPPY",result3);
    }
}
