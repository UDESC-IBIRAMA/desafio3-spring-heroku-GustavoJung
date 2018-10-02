
import model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrcar
 */
public interface ProdutosRepositorio extends JpaRepository<Veiculo,Long> {
    
}
