import users.Edward;
import util.GenerateResume;

public class Main {
    public static void main(String[] args){
        GenerateResume r = new GenerateResume(new Edward());

        r.write();
    }
}