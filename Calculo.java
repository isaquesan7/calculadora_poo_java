
package calculadorafinal;

import java.text.DecimalFormat;

public class Calculo extends C_abs_class implements C_interface{
    
    String digito, res;
    double resultado, valor1, valor2;
    boolean soma, subtracao, multiplicacao, divisao, subporc, somporc, multporc, divporc, porcentagem;
    
    String formatado = "##.###";
    DecimalFormat df = new DecimalFormat(formatado);
    
    Calculo(){
        
        resultado = 0;
        valor1 = 0;
        valor2 = 0;
        digito = "";
        res = "";
        soma = false;
        subtracao = false;
        multiplicacao = false;
        divisao = false;
        subporc = false;
        somporc = false;
        multporc = false;
        divporc = false;
        porcentagem = false;
        
    }
    
    public void DesativarSinais(){
        soma = false;
        subtracao = false;
        multiplicacao = false;
        divisao = false;
        subporc = false;
        somporc = false;
        multporc = false;
        divporc = false;
        porcentagem = false;
    }
    
    public String getNumero(){
        return digito;
    }
    
    public void setNumero(String digito){
        this.digito = digito;
    }
    
    public void addNumero(String numero){
            setNumero(digito + numero);
    }

    @Override
    public void Soma(String numero) {
        this.valor1 = Double.parseDouble(numero);
        soma = true;
        setNumero("");
    }

    @Override
    public void Subtracao(String numero) {
        this.valor1 = Double.parseDouble(numero);
        subtracao = true;
        setNumero("");
    }

    @Override
    public void Multiplicacao(String numero) {
        this.valor1 = Double.parseDouble(numero);
        multiplicacao = true;
        setNumero("");
    }

    @Override
    public void Divisao(String numero) {
        this.valor1 = Double.parseDouble(numero);
        divisao = true;
        setNumero("");
    }

    @Override
    public void Porcentagem(String numero) {
        numero = numero.replaceAll("[/+-/x/%/=/]", "");
        this.valor1 = Double.parseDouble(numero);
        porcentagem = true;
        setNumero("");
    }
    
    public String Calcular(String numero){
        
        valor2 = Double.parseDouble(numero);
        if(soma == true){
            resultado = valor1 + valor2;
        }
        if(subtracao == true){
            resultado = valor1 - valor2;
        }
        if(multiplicacao == true){
            resultado = valor1 * valor2;
        }
        if(divisao == true){
            if(valor2 == 0){
                resultado = 0;
            }else{
                resultado = valor1 / valor2;
            }
        }
        if(subporc == true){
            valor2 = (valor1 * valor2) / 100;
            resultado = valor1 - valor2;              
        }
        if(somporc == true){
            valor2 = (valor1 * valor2) / 100;
            resultado = valor1 + valor2;              
        }
        if(multporc == true){
            resultado = (valor1 * valor2) / 100;            
        }
        if(divporc == true){
            if(valor2 == 0){
                resultado = 0;
            }else{
            valor2 =  valor2 / 100;
            resultado = valor1 / valor2;
            }
        }
        if(porcentagem == true){
            resultado = (valor1/100) * valor2;              
        }

        DesativarSinais();

        res = "" + df.format(resultado);
        
        return res;
    }
}
