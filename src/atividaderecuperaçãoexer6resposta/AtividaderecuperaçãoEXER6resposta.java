package atividaderecuperaçãoexer6resposta;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Felipe
 */
public class AtividaderecuperaçãoEXER6resposta {
    public static void main(String[] args) {
        double quantComb, totGas, totAlc;
        int comb;
        final double GAS = 6.04;
        final double ALC = 5.70;
        Scanner ler = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        
        System.out.println("Quanto combustivel foi abastecido?");
        quantComb = ler.nextDouble();
        System.out.println("Digite:\n 1 GASOLINA\n 2 ÁLCOOL\n ->");
        comb = ler.nextInt();
        switch(comb){
            case 1:
                   totGas = quantComb * GAS;
                   System.out.println("Quantide abastecida" +quantComb
                           + "\nTotal de Gasolina é" 
                           + "\n R$" +f.format(totGas)+ "(SEM DESCONTO)");
                   if(quantComb<=25){
                       totGas = totGas * 0.35;
                       System.out.println("Quantidade abastecida:" +quantComb
                           + "\nTotal de Gasolina é" 
                           + "\n R$" +f.format(totGas)+ "(COM DESCONTO - 3.5%)");
                   }else{
                       totGas = totGas * 0.52;
                       System.out.println("Quantidade abastecida:" +quantComb
                           + "\nTotal de Gasolina é"
                           + "\nR$" +f.format(totGas)+ "(COM DESCONTO - 5.2%)");
                   }//fim do else case 1 
                   
                   break;
                   
            case 2:
                totAlc = quantComb * ALC;
                System.out.println("Quantidade abastecida:" +quantComb
                           + "\nTotal de Álcool é"
                           + "\nR$" +f.format(totAlc)+ "(SEM DESCONTO)");
                if(quantComb<=25){
                    totAlc = totAlc * 0.25;
                    System.out.println("Quantidade abastecida:" +quantComb
                           + "\nTotal de Álcool é"
                           + "\n R$" +f.format(totAlc)+ "(COM DESCONTO - 2.5%)");
                }else{
                    totAlc = totAlc * 0.45;
                    System.out.println("Quantidade abastecida:" +quantComb
                           + "\nTotal de Álcool é"
                           + "\nR$" +f.format(totAlc)+ "(COM DESCONTO - 4.5%)");
                }//FIM DO ELSE CASE 2
                break;
        }//fim do switch
    }//fim do string 
}//fim da programação
