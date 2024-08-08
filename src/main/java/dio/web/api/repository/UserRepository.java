package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository  //Injeção dos recursos de repositório ao banco de dados
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");

        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir"));
        System.out.println(id);
    }

    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("teste", "senha"));
        usuarios.add(new Usuario("zezinho", "master"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - recebendo o id: %d para localizar"));
        return new Usuario("teste", "senha");
    }

    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - recebendo o username: %s para localizar"));
        return  new Usuario("teste", "senha");
    }
}
