package example.codeclan.com.eightball;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by user on 23/02/2017.
 */

public class TestAnswers {

    private ArrayList<String> sampleList;
    private Answer eightBall;

    @Before
    public void before(){
        sampleList = new ArrayList<String>();
        sampleList.add("Yes");
        sampleList.add("No");
        sampleList.add("Feck off!");
        eightBall = new Answer(sampleList);
    }

    @Test
    public void testAnswersLength() {
        assertEquals(3, eightBall.getAnswers().size());
    }

    @Test
    public void testGetAnswer() {
        assertEquals("Yes", eightBall.getAnswerAtIndex(0));
    }

    @Test
    public void testGetRandomAnswer(){
        assertTrue(sampleList.contains(eightBall.getAnswer()));
    }
    
    @Test
    public void testAddAnswerToList(){
        int originalLength = eightBall.getLength();
        eightBall.addAnswer("That would be an ecumenical matter");
        assertEquals(originalLength + 1, eightBall.getLength());
    }

    @Test
    public void testDefaultAnswersExist(){
        Answer eightBall2 = new Answer();
        assertNotNull(eightBall2.getAnswers());
    }

}
