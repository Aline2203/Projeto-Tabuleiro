package Manipuladores;

import java.util.ArrayList;

import SalvarXml.PersistenciaXml;
import entidades.Jogo;
import entidades.Tabuleiro;
import excecoes.DamasException;

public class ManipuladorXml {
	
	private PersistenciaXml<Jogo> jogos;
	private PersistenciaXml<Tabuleiro> tabuleiros ;
	
	private ArrayList<Jogo> listaJogos = new ArrayList<>();
	private ArrayList<Tabuleiro> listaTabuleiros = new ArrayList<>();
	
	private String urlJogos = "jogos.xml";
	private String urlTabuleiros = "tabuleiros.xml";
	
	public ManipuladorXml() {
		jogos = new PersistenciaXml<>();
		tabuleiros = new PersistenciaXml<>();
		
		listaJogos.addAll(jogos.recuperar(urlJogos));
		listaTabuleiros.addAll(tabuleiros.recuperar(urlTabuleiros));
	}
	
	public Jogo recuperarJogo(String idJogo) throws DamasException{
		for (Jogo jogo : listaJogos) {
			if(jogo.getIdJogo().equals(idJogo)){
				return jogo;
			}
		}
		return null;
	}
	
	
	public Tabuleiro recuperarTabuleiro(String idTabuleiro) throws DamasException{
		for (Tabuleiro t : listaTabuleiros) {
			if(t.getId().equals(idTabuleiro)){
				return t;
			}
		}
		return null;
	}
	
	public void salvarTabuleiro(Tabuleiro ta){
		listaTabuleiros.add(ta);
		tabuleiros.salvar(listaTabuleiros, urlTabuleiros);
	}
	
	public void salvarJogo(Jogo ta){
		listaJogos.add(ta);
		jogos.salvar(listaJogos, urlJogos);
	}
	
	public void removerTabuleiro(Tabuleiro ta){
		listaTabuleiros.remove(ta);
		tabuleiros.salvar(listaTabuleiros, urlTabuleiros);
	}
	
	public void removerJogo(Jogo ta){
		listaJogos.remove(ta);
		jogos.salvar(listaJogos, urlJogos);
	}
	
	public void removerAllDados(){
		listaJogos = new ArrayList<>();
		listaTabuleiros = new ArrayList<>();
				
		jogos.salvar(listaJogos, urlJogos);
		tabuleiros.salvar(listaTabuleiros, urlTabuleiros);
	}

}
