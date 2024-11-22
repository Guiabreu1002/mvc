package br.com.catolica.mvc.Main;

import br.com.catolica.mvc.Controller.UsuarioController;
import br.com.catolica.mvc.Enum.TipoUsuarioEnum;
import br.com.catolica.mvc.View.UsuarioView;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UsuarioController userController = new UsuarioController();
        UsuarioView userview = new UsuarioView();

        String nome = userview.inputNome();
        String email = userview.inputEmail();
        TipoUsuarioEnum tipo = userview.inputTipo();

        Map<String, Object> pseudoUser = new HashMap<>();
        pseudoUser.put("nome", nome);
        pseudoUser.put("email", email);
        pseudoUser.put("tipo",tipo);

        userController.inserirUsuario(pseudoUser);
    }
}
