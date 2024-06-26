package br.unicamp.ic.inf335;

import java.util.ArrayList;
import java.util.Collections;

import br.unicamp.ic.inf335.beans.ProdutoBean;

public class Brecho {

	private static ArrayList<ProdutoBean> produtos = new ArrayList<ProdutoBean>();
	
	public static void main(String[] args) {
		produtos.add(new ProdutoBean("CD00001","Celular Galaxy S10", "128 Gb, Preto, com Carregador",1250.0,"Poucos riscos, estado de novo."));
		produtos.add(new ProdutoBean("CD00002","Prod 2 ...", "Bla Bla Bla",1100.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00003","Prod 3 ...", "Bla Bla Bla",120.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00004","Prod 4 ...", "Bla Bla Bla",1300.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00005","Prod 5 ...", "Bla Bla Bla",9400.0,"Bla Bla Bla"));
		produtos.add(new ProdutoBean("CD00006","Prod 6 ...", "Bla Bla Bla",1500.0,"Bla Bla Bla"));
		
        // Imprime produtos antes da ordenação
        System.out.println("------------ Produtos ------------");
        imprimirProdutos(produtos);
		
        // Ordena produtos por preço
        Collections.sort(produtos, new Comparator<ProdutoBean>() {
            @Override
            public int compare(ProdutoBean p1, ProdutoBean p2) {
                return p1.getValor().compareTo(p2.getValor());
            }
        });

        // Imprime produtos após a ordenação
        System.out.println("------------ Produtos Ordenados ------------");
        imprimirProdutos(produtos);
		
		// Calcula Média
		Double media = 0.0;
		int i = 1;
		while (i<=produtos.size()) {
			media = produtos.get(i).getValor();
		}
		media = media / i;
		System.out.println("Media de Valores = " + media);
	}

}
