package com.fatec.scel;

import static org.junit.Assert.*;

import org.junit.Test;

import com.fatec.scel.model.Livro;

public class UC01CadastrarLivro {

	@Test
	public void CT01CadastrarLivroComDadosValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de Softwar");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	
	@Test
	public void CT02CadastrarLivroComDadosinValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("");
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarLivroComDadosinValidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn(null);
		} catch (RuntimeException e) {
			// verificacao
			assertEquals("ISBN invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT02cadastrarLivroComISBN_em_branco(){
	//cenario
	Livro livro = new Livro();

	livro.setTitulo("Engenharia de Software");
	livro.setAutor("Pressman");
		try{
			//acao
				livro.setIsbn("");
				fail ("deveria lançar uma exceção");
			}catch(RuntimeException e){
			//verificacao
					assertEquals("ISBN invalido", e.getMessage());
			}
	}
	@Test
	public void CT03CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("");
			umLivro.setAutor("Pressman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT04CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de software");
			umLivro.setAutor("");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT05CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo(null);
			umLivro.setAutor("Presman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT06CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de software");
			umLivro.setAutor(null);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT07CadastrarLivroComDadosInvalidos() {
		try {
			// cenario
			Livro umLivro = new Livro();
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("");
			umLivro.setAutor(null);
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT08CadastrarLivroObtemISBN() {
		// cenario
					Livro umLivro = new Livro();
		try {
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de software");
			umLivro.setAutor("Presman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umLivro.getIsbn());
	}
	@Test
	public void CT09CadastrarLivroObtemTitulo() {
		// cenario
					Livro umLivro = new Livro();
		try {
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de software");
			umLivro.setAutor("Presman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umLivro.getTitulo());
	}
	@Test
	public void CT10CadastrarLivroObtemAutor() {
		// cenario
					Livro umLivro = new Livro();
		try {
			// acao
			umLivro.setIsbn("121212");
			umLivro.setTitulo("Engenharia de software");
			umLivro.setAutor("Presman");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("121212", umLivro.getAutor());
	}
}
