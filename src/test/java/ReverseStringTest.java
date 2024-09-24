import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {

    @Test
    public void reverseTestWithNull(){
        Assert.assertNull(ReverseString.reverseString(null));
    }

    @Test
    public void reverseTestWithDigits(){
        Assert.assertEquals("cbA321",ReverseString.reverseString("123Abc"));
    }

    @Test
    public void reverseTestHappy(){
        Assert.assertEquals("elppa",ReverseString.reverseString("apple"));
    }


}
