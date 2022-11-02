package App;

import java.util.ArrayList;
import java.util.Scanner;

import Dao.*;
import Models.*;

public class Controller {
	
	Scanner input = new Scanner(System.in);
	private int entrada;
	
	private Produto produto;
	private ArrayList<Produto> produtos;
	private Estoque estoque;
	
	public VencimentoDao vd= new VencimentoDao();
	public DescontoDao dd = new DescontoDao();
	public EstoqueDao ed = new EstoqueDao();
	public NotaFiscalDao nfd = new NotaFiscalDao();
	public ProdutoDao pd = new ProdutoDao();
	public PromocaoDao promod = new PromocaoDao();
	
	public void Menu()
	{
		while(entrada!=6)
		{
			System.out.println("####################Valida Produtos####################");
			System.out.println("Digita sua opção:");
			System.out.println("1.Cadastrar Produto");
			System.out.println("2.Inserir Produto no Estoque");
			System.out.println("6.Sair");
			entrada = input.nextInt();
			switch(entrada)
			{
				case 1:
					produto = pd.CadastrarProduto();
					pd.save(produto);
					break;
				case 2:
					estoque = ed.InserirProduto(pd,nfd);
					ed.save(estoque);
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
			}
		}
	}
}
