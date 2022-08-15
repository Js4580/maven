import org.junit.Test;

public class NetworkUtilsTest {
    @Test(timeout = 1_000, expected = ArithmeticException.class)
    public void getConnectionShouldReturnFasterThanOneSecond(){
        NetworkUtils.getConnection();
    }
}
