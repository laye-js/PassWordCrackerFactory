public class ForceBrute extends Attack {
  public  User User1= new User("baba","abaaa");

    public ForceBrute() {

    }


    public String mdpCracker() {
        String dico="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789";
        mdp="";
        boolean bool;
        for (int i = 0; i < dico.length(); i++) {
            for (int j = 0; j < dico.length(); j++) {
                for (int w = 0; w < dico.length(); w++) {
                    for (int k = 0; k < dico.length(); k++) {
                        for (int z = 0; z < dico.length(); z++) {
                           
                            mdp =dico.charAt(i) + "" + dico.charAt(j) + dico.charAt(w) + dico.charAt(k)
                                    + dico.charAt(z);
                                    System.out.println(""+mdp);
                            
                                  bool= User1.authenticate(mdp);
                                  
                                  System.out.println(bool);
                                  if (bool==true) {
                                      System.out.println("mdpCraked value:"+mdp);
                                      return mdp;
                                  }
                                    
                         } 

                        }
                        }
                    }
                }
                System.out.print(mdp);
                return mdp;

            }
        
    }

