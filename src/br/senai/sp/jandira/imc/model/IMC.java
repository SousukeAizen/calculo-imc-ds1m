package br.senai.sp.jandira.imc.model;

<<<<<<< HEAD
import java.util.Scanner;

public class IMC {

    String nomeDoAluno;
    double pesoDoAluno;
    double alturaDoAluno;
    double imc;
    String status;




    public void obterDados(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o nome do Aluno:  ");
        nomeDoAluno = leitor.nextLine();

        System.out.print("Qual o peso do Aluno (ex: 90Kg): ");
        String pesoDigitado = leitor.nextLine().replace(",", ".").replaceAll("[^0-9.]", "");
        pesoDoAluno = Double.parseDouble(pesoDigitado);

        System.out.print("Qual a altura do Aluno (ex: 1.80m): ");
        String alturaDigitada = leitor.nextLine().replace(",", ".").replaceAll("[^0-9.]", "");
        alturaDoAluno = Double.parseDouble(alturaDigitada);



        calcularDados();





    }

    public void calcularDados() {
        imc = pesoDoAluno / (alturaDoAluno * alturaDoAluno);

        if (imc < 18.5) {
            status = "abaixo do peso";
        } else if (imc >= 18.6 && imc <= 24.9) {
            status = "Peso ideal (parabéns)";
        } else if (imc >= 25.0 && imc <= 29.9) {
            status = "Levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            status = "Obesidade grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            status = "Obesidade grau II (severa)";
        } else {
            status = "Obesidade III (mórbida)";
        }


        exibirResultados();


    }

    public void exibirResultados(){
        System.out.println("\n--- RESULTADO ---");
        System.out.println("Aluno: " + nomeDoAluno);
        System.out.println("Peso: " + pesoDoAluno + " kg");
        System.out.println("Altura: " + alturaDoAluno + " m");
        System.out.printf("IMC Calculado: %.2f\n", imc);
        System.out.println("Status: " + status);
        System.out.println("---");





    }







    }




















=======
public class IMC {
}
>>>>>>> 4c61df1ca1d2ca4f733fe9831880d4b8c7c36c4b
