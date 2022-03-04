import org.junit.*;
import static org.junit.Assert.*;

public class YatzyTest {
    @Test
    public void demoTest() {
        //Arrange
        int expected = 15;
        
        //Act
        int actual = 10;
        
        //Assert
        assertEquals(expected, actual);        
    }    
}
