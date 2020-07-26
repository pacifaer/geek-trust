import com.geek.reevon.controller.MainController;

public class Main {
    public static void main(String[] args) {
        MainController app = new MainController();
        System.out.println(app.process(args[0]));
    }
}
