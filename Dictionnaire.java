import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Dictionnaire extends Attack {
    public  User User1= new User("baba","abaaa");

    String s;
    int i = 0;

    public Dictionnaire() {
    }

    public String mdpCrack() throws Exception {
        InputStream doc = new FileInputStream("/Users/mac/Desktop/forceBrute/dico.txt");

        try (Scanner obj = new Scanner(doc)) {
            while (obj.hasNextLine()) {
                i++;
                System.out.println("iteration:" + i);
                Boolean bool;
                String mdp=obj.next();
                bool= User1.authenticate(mdp);
                System.out.println(bool);
                if (bool==true) {
                    System.out.println("mdpCraked value:"+mdp);
                    return mdp;
                }


                
            }
            obj.close();

        }
        return mdp;

    }

}
