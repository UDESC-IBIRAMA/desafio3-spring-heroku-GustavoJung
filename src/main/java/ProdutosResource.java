
import java.util.List;
import java.util.Optional;
import model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrcar
 */

@RestController
@RequestMapping("/veiculos")
public class ProdutosResource {
    
    @Autowired
    private ProdutosRepositorio produtos;
    
    @GetMapping("{id}")
    public Optional<Veiculo> buscar(@PathVariable Long id){
        return produtos.findById(id);
    }
    
    @GetMapping
    public List<Veiculo>pesquisar(){
        return produtos.findAll();
    }
    
    @PostMapping
    public Veiculo salvar(@RequestBody Veiculo produto){
        return produtos.save(produto);
    }
    
    @DeleteMapping("{id}")
    public void deletar(@PathVariable Long id){
        produtos.deleteById(id);
    }
    
}
