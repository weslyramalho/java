package principal;

 /* @author wesly*/
public class Verifica {
    private int num;

    public Verifica(int num) {
        this.num = num;
        System.out.println("Antecessor: "+ antecessor(num)+ "\n"
                + "Sucessor: "+ sucessor(num));
    }
    
    public int antecessor(int num){
        return num - 1;
    }
    public int sucessor(int num){
        return num + 1;
    }
    
    
}
