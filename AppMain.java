package com.mycompany.aula;

import java.util.ArrayList;
import java.util.List;

public class AppMain {

    public static void main(String[] args) {

        List<String> PautaNomes = new ArrayList();

        PautaNomes.add("Bernardo");
        PautaNomes.add("Vinicius");
        PautaNomes.add("Éris");

        for (int i = 0; i < PautaNomes.size(); i++) {
            PautaNomes.add(InOut.leString("Digite o seu nome: "));
        }

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

        for (String item : PautaNomes) {
            System.out.println(item);
        }

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

////////////////////////////////////////////////////////////////////////////////////
      
        int idade;
        int[] TodasIdades = new int[10];

        List TodasIdadesList = new ArrayList();

        idade = 8;
        TodasIdades[0] = 8;
        TodasIdadesList.add(8);

        System.out.println(idade);
        System.out.println(TodasIdades[0]);
        System.out.println(TodasIdadesList.get(0));

        String nome = "Bernardo";
        String[] TodosNomes = new String[10];
        List<String> TodosNomesList = new ArrayList();

    }
}
