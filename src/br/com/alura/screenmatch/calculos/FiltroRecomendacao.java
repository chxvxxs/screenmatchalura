package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificacao classifica){
        if(classifica.getClassificacao()>=4){
            System.out.println("Está entre os preferidos do momento");
        }else if(classifica.getClassificacao()>=2){
            System.out.println("Muito bem avaliado no momento");
        }else{
            System.out.println("Não possui uma boa classificação");
        }
    }
}
