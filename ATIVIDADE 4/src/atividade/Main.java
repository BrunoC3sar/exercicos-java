package atividade;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

        Gerente gerente = new Gerente(55,"Maradona","9988556677","Gerente Regional",5525.50, 0.15,"Norte-Nordeste",0);   
        Vendedor vendedor = new Vendedor(20,"Neymar jr.","7788559944","Vendedor Interno", 1550.50, gerente,0,0.05,0);
        Vendedor vendedor2 = new Vendedor(26,"C.Ronaldo","8855223366","Vendedor Externo", 1550.50, gerente,0,0.05,0);

        List<Vendas> vendas = new ArrayList<>();
        List<Vendas> vendas02 = new ArrayList<>();
        List<Vendedor> vendedores = new ArrayList<>();

        
        vendedores.add(vendedor);
        vendedores.add(vendedor2);

        
        gerente.setVendedores(vendedores);

        
        Vendas vendas1 = new Vendas(622);
        Vendas vendas2 = new Vendas(700);
        Vendas vendas3 = new Vendas(900);
        Vendas vendas4 = new Vendas(500);
        Vendas vendas5 = new Vendas(900);
        Vendas vendas6 = new Vendas(300);
        Vendas vendas7 = new Vendas(900);
        Vendas vendas8 = new Vendas(299);
        Vendas vendas9 = new Vendas(600);
        Vendas vendas10 = new Vendas(987);

       
        vendas.add(vendas1);
        vendas.add(vendas2);
        vendas.add(vendas3);
        vendas.add(vendas4);
        vendas.add(vendas5);

        
        vendas02.add(vendas6);
        vendas02.add(vendas7);
        vendas02.add(vendas8);
        vendas02.add(vendas9);
        vendas02.add(vendas10);

        vendedor.setVendas(vendas);

        vendedor2.setVendas(vendas02);

        vendedor.getTotalVendas();
        vendedor.getTotalComissao();

        vendedor2.getTotalVendas();
        vendedor2.getTotalComissao();

        gerente.getComissaoTotalGerente();

        System.out.println();
        System.out.println(vendedor.getNome()+" "+vendedor.getVendas()+ " " + vendedor.getSalario());
        System.out.println();
        System.out.println(vendedor2.getNome()+" "+vendedor2.getVendas()+ " " + vendedor2.getSalario());
        System.out.println();
        System.out.println(gerente.getNome()+" "+gerente.getSalario());

    }

}
