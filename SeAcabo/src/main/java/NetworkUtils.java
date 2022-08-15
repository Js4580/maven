public class NetworkUtils {
    public static void getConnection(){
        //скажем здесь у нас user получает соединение с сетью
        try {
            Thread.sleep(1_500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }
}
