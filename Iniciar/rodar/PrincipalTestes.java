package rodar;

import java.util.ArrayList;
import java.util.List;

import easyaccept.EasyAcceptFacade;
import facade.Facade;

public class PrincipalTestes {

	public static void main(String[] args) {

		List<String> arquivos = new ArrayList<String>();

//		arquivos.add("testes/CE01.txt");
//		arquivos.add("testes/CE02.txt");
//		arquivos.add("testes/CE03.txt");
//		arquivos.add("testes/CE04.txt");
//		arquivos.add("testes/CE05.txt");
//		
		arquivos.add("testes/US01.txt");
//		arquivos.add("testes/US02.txt");
//		arquivos.add("testes/US03.txt");
//		arquivos.add("testes/US04.txt");
//		arquivos.add("testes/US05.txt");
//		arquivos.add("testes/US06.txt");
//		arquivos.add("testes/US07.txt");
		
		
		//

		// instanciar fachada
		Facade fachada = new Facade();

		// instanciar fachada do EasyAccept
		EasyAcceptFacade eaFacade = new EasyAcceptFacade(fachada, arquivos);

		// executar os testes
		eaFacade.executeTests();

		// imprimir
		System.out.println(eaFacade.getCompleteResults());

	}

}
