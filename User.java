 public class User{
     String login;
     String password;
     public  User(String Login,String mdp){
        this.login=Login;
        this.password=mdp;
     }
     public void setLogin(String Login){
        this.login=Login;
     }
     public void setPassword(String Password){
         this.password=Password;
     }

     public boolean authenticate(String mdp){
         if(this.password.equals(mdp)){
             
             return true;
         }else{
             return false;
         }
     }
 }