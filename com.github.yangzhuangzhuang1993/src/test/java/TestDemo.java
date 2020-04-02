import miniCode.Demo;
import org.junit.Test;

public class TestDemo {
    @Test
    public void testInputAll(){
        Demo.textInputAll("ilikesamsungmobile");
        Demo.textInputAll("");
        Demo.textInputAll("lof");
    }
}
