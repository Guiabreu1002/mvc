package br.com.catolica.mvc.Contract;

import br.com.catolica.mvc.Enum.TipoUsuarioEnum;
import br.com.catolica.mvc.Model.Usuario;

import java.util.List;
import java.util.Map;

public interface IUsuarioController {
    boolean verificarTipo(TipoUsuarioEnum tipo);

    void inserirUsuario(Map<String, Object> psUser);

    List<Usuario> listarTodos ();

    List<Usuario> BuscarUsuarioPorNome(String nome);

    Usuario buscarPorEmail(String email);

    List<Usuario> buscarPorTipo(TipoUsuarioEnum tipo);

    boolean removerPorId (String id);

    void atualizarDados(Map<String, Object> dados);

    boolean verificarEmail (String email);


}
