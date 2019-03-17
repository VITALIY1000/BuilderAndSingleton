public class ApiService {

    private static ApiService instance;
    private static final Object lock = new Object();

    private ApiService() {}

    public static ApiService getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new ApiService();
                }
            }
        }
        return instance;
    }
}