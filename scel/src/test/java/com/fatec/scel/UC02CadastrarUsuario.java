package com.fatec.scel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.fatec.scel.model.Livro;
import com.fatec.scel.model.Usuario;


public class UC02CadastrarUsuario {
	
	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome("Lucas");
			umUsuario.setRa("5555");

		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioComDadosValidos() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome("Lucas");
			umUsuario.setRa("5555");

		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
	}
	@Test
	public void CT03CadastrarUsuarioComDadosValidosNomeBranco() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome("");
			umUsuario.setRa("5555");

		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	@Test
	public void CT04CadastrarUsuarioComDadosValidosNomeNull() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome(null);
			umUsuario.setRa("5555");

		} catch (RuntimeException e) {
			// verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	@Test
	public void CT05CadastrarUsuarioComDadosValidosRABranco() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome("Lucas");
			umUsuario.setRa("");

		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	@Test
	public void CT06CadastrarUsuarioComDadosValidosRANull() {
		try {
			// cenario
			Usuario umUsuario = new Usuario();
			// acao
			umUsuario.setNome("Lucas");
			umUsuario.setRa(null);

		} catch (RuntimeException e) {
			// verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	@Test
	public void CT07CadastrarUsuarioObtemNome() {
		// cenario
					Usuario umUsuario= new Usuario();
		try {
			// acao
			umUsuario.setNome("Lucas");
			umUsuario.setRa("5555");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("Lucas", umUsuario.getNome());
	}
	@Test
	public void CT08CadastrarUsuarioObtemRA() {
		// cenario
					Usuario umUsuario= new Usuario();
		try {
			// acao
			umUsuario.setNome("Lucas");
			umUsuario.setRa("5555");
		} catch (RuntimeException e) {
			// verificacao
			fail("nao deve falhar");
		}
		assertEquals("5555", umUsuario.getRa());
	}
	

}
