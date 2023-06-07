package lista4repeticao;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade, idadetf=0, idadetm=0, qf=0, qm=0, qtf=0, qtm=0, qaf=0, qam=0, qcf=0, qcm=0,idfrequente013=0, idfrequente1318=0, idfrequente1829=0, idfrequente2949=0, idfrequente4959=0, idfrequente59=0, maiorfe;
		String sexo, gfilmes;
		float percentualma, mediapterror;	
		do {
		System.out.println("Digite a sua idade:");
       idade = scan.nextInt();
       if (idade==-1) {
       }
       System.out.println("Digite 'feminino' para mulher e 'masculino' para homem: ");
		sexo = scan.next();
		System.out.println("Digite seu gênero preferido de filme entre 'terror, 'acao' ou 'comedia':");
		gfilmes = scan.next();
		if (sexo.equals("feminino")) {
			  qf++;
			  if (gfilmes.equals("terror")) {
				  qtf++;
			      idadetf += idade;
				  }
			  } else if (gfilmes.equals("acao")) {
				  qaf++;
			  } else if (gfilmes.equals("comedia")) {
				  qcf++;
			  } else {
				  sexo.equals("masculino");
				  qm++;
			  } if (gfilmes.equals("terror")) {
					  qtm++;
					  idadetm += idade;
				  } else if (gfilmes.equals("ação")) {
					  qam++;
				  } else if ( gfilmes.equals("comédia"))
					  qcm++;
		} while (idade!=-1);
		 mediapterror = (idadetf + idadetm)/ (qtf+qtm);
		 System.out.println("A média de idade de pessoas que escolheram filme de terror é: " + mediapterror);
		 percentualma = (qam*100)/qm;
		  System.out.println("O percentual dos homens que escolheram filmes de ação é: " + percentualma);
		  if (qcm>qcf) {
			  System.out.println("Os homens preferem mais comédia");
		  }else if (qcf>qcm){
            System.out.println("As mulheres preferem mais comédia");
        } else
            System.out.println("O número de mulheres e homens que gostam de comédia é o mesmo");
       if ((idade>0) && (idade<=13)) {
           idfrequente013++;
       }else if ((idade>13)&& (idade<=18)) {
       idfrequente1318++;
       } else if ((idade>18)&& (idade<=29)) {
           idfrequente1829++;
       }else if ((idade>29)&& (idade<=49)) {
          idfrequente2949++;
       } else if ((idade>49)&& (idade<=59)) {
           idfrequente4959++;
       } else {
           idfrequente59++;
       }
      
       if ((idfrequente013>idfrequente1318) && (idfrequente013>idfrequente1829) && (idfrequente013>idfrequente2949) && (idfrequente013>idfrequente4959) && (idfrequente013>idfrequente59)) {
           System.out.println("A faixa etária de 0 a 13 anos é a mais frequente");
       } else if ((idfrequente1318>idfrequente013) && (idfrequente1318>idfrequente1829) && (idfrequente1318>idfrequente2949) && (idfrequente1318>idfrequente4959) && (idfrequente1318>idfrequente59)) {
           System.out.println("A faixa etária de 14 a 18 anos é a mais frequente");
       } else if ((idfrequente1829>idfrequente013) && (idfrequente1829>idfrequente1318) && (idfrequente1829>idfrequente2949) && (idfrequente1829>idfrequente4959) && (idfrequente1829>idfrequente59)) {
           System.out.println("A faixa etária de 19 a 29 anos é a mais frequente");
       } else if ((idfrequente2949>idfrequente013) && (idfrequente2949>idfrequente1318) && (idfrequente2949>idfrequente1829) && (idfrequente2949>idfrequente4959) && (idfrequente2949>idfrequente59)) {
           System.out.println("A faixa etária de 29 a 49 anos é a mais frequente");
       } else if ((idfrequente4959>idfrequente013) && (idfrequente4959>idfrequente1318) && (idfrequente4959>idfrequente1829) && (idfrequente4959>idfrequente2949) && (idfrequente4959>idfrequente59)) {
           System.out.println("A faixa etária de 49 a 59 anos é a mais frequente");
       } else if ((idfrequente59>idfrequente013) && (idfrequente59>idfrequente1318) && (idfrequente59>idfrequente1829) && (idfrequente59>idfrequente2949) && (idfrequente59>idfrequente4959)) {
           System.out.println("A faixa etária acima de 59 anos é a mais frequente");
       }
       scan.close();
  }
}



