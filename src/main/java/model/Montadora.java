/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

/**
 *
 * @author mrcar
 */
@Entity
public class Montadora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_montadora")
    private Long id_montadora;
    private String nome;
    @OneToMany( mappedBy = "montadora")
    private Collection <Veiculo> veiculo;

    public Long getId_montadora() {
        return id_montadora;
    }

    public void setId_montadora(Long id_montadora) {
        this.id_montadora = id_montadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Collection<Veiculo> getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Collection<Veiculo> veiculo) {
        this.veiculo = veiculo;
    }

    
    
    public Long getId() {
        return id_montadora;
    }

    public void setId(Long id) {
        this.id_montadora = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id_montadora != null ? id_montadora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Montadora)) {
            return false;
        }
        Montadora other = (Montadora) object;
        if ((this.id_montadora == null && other.id_montadora != null) || (this.id_montadora != null && !this.id_montadora.equals(other.id_montadora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Montadora[ id=" + id + " ]";
    }
    
}
