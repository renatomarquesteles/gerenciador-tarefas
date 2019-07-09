package br.com.renatomarquesteles.gerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.renatomarquesteles.gerenciadortarefas.modelos.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	
	Usuario findByEmail(String email);

}
