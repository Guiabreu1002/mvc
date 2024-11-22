package br.com.catolica.mvc.Controller;

import br.com.catolica.mvc.Contract.IUsuarioController;
import br.com.catolica.mvc.Enum.TipoUsuarioEnum;
import br.com.catolica.mvc.Model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UsuarioController implements IUsuarioController {

    ArrayList<Usuario> bancoDeDados = new ArrayList<>();


    @Override
    public boolean verificarTipo(TipoUsuarioEnum tipo) {
        return false;
    }

    @Override
    public void inserirUsuario(Map<String, Object> psUser) {
        if (verificarEmail(psUser.get("email").toString())) {

        }
    }

    @Override
    public List<Usuario> listarTodos() {
        return List.of();
    }

    @Override
    public List<Usuario> BuscarUsuarioPorNome(String nome) {
        return List.of();
    }

    @Override
    public Usuario buscarPorEmail(String email) {
        return null;
    }

    @Override
    public List<Usuario> buscarPorTipo(TipoUsuarioEnum tipo) {
        return List.of();
    }

    @Override
    public boolean removerPorId(String id) {
        return false;
    }

    @Override
    public void atualizarDados(Map<String, Object> dados) {

    }

    @Override
    public boolean verificarEmail(String email) {
        return false;
    }
}
