package com.fatec.scel;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.validation.ConstraintViolationException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fatec.scel.model.Livro;
import com.fatec.scel.model.PapelDoUsuario;
import com.fatec.scel.model.Usuario;
import com.fatec.scel.model.UsuarioRepository;

import antlr.collections.List;

import java.util.HashSet;
import java.util.UUID;

import javax.validation.ConstraintViolationException;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UC02CadastrarUsuario {
	@Autowired
	private UsuarioRepository repository;
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	private Usuario usuario;

	@Test
	public void testStoreUser() {
		HashSet<PapelDoUsuario> papel = new HashSet<>();
		papel.add(PapelDoUsuario.PROFESSOR);
		repository.save(new Usuario(UUID.randomUUID(), "prof.edsonalmeida@fatec.sp.br", "pwd", papel));
		assertThat(repository.count()).isEqualTo(1L);
	}
	
}