
package principal;

/**
 *
 * @author wesly
 */
public class Funcionario {
    private String primeiroNome;
    private String sobrenome;
    private double salario;

    public Funcionario(String primeiroNome, String sobrenome, double salario) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.salario = salario;
        salarioAnual();
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
        this.salario = salario;
        }else{
            this.salario = 0.0;
        }
    }
    
    public void salarioAnual(){
        System.out.println("Funcionario: "+ primeiroNome + " " + sobrenome);
        System.out.println("O salario anual é: R$ "+ getSalario() *12);
    }
    
    public double aumento(){
        return salario = getSalario()+ (getSalario()*0.10);
    }
    
    
    
}
