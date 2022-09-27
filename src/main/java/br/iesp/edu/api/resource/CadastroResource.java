package br.iesp.edu.api.resource;

import br.iesp.edu.api.entity.Cadastro;
import br.iesp.edu.api.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadastro")
public class CadastroResource {

    @Autowired
    private CadastroService service;

    @PostMapping
    public Cadastro salvar(@RequestBody Cadastro cadastro) {
        return service.salvar(cadastro);
    }

    @PutMapping
    public Cadastro atualizar(@RequestBody Cadastro cadastro) {
        return service.atualizar(cadastro);
    }

    @DeleteMapping
    public void excluir(@RequestBody Cadastro cadastro) {
        service.excluir(cadastro);
    }

    @DeleteMapping("/{id}")  // localhost:8080/filme/45
    public void excluirPorId(@PathVariable Integer id) {
        service.excluirPorID(id);
    }

    @GetMapping
    public List<Cadastro> listarCadastro() {
        return service.listarCadastros();
    }

}



