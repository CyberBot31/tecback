package br.iesp.edu.api.service;

import br.iesp.edu.api.entity.Cadastro;
import br.iesp.edu.api.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository repository;

    public Cadastro salvar(Cadastro cadastro){
        cadastro = repository.save(cadastro);
        return cadastro;
    }

    public Cadastro atualizar(Cadastro cadastro){
        if(cadastro.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        cadastro = repository.save(cadastro);
        return cadastro;
    }

    public void excluir(Cadastro cadastro){
        if(cadastro.getId()==null){
            throw new RuntimeException("ID Nulo");
        }
        repository.delete(cadastro);
    }


    public void excluirPorID(Integer id){
        repository.deleteById(id);
    }

    public List<Cadastro> listarCadastros(){
        return repository.findAll();
    }

}
