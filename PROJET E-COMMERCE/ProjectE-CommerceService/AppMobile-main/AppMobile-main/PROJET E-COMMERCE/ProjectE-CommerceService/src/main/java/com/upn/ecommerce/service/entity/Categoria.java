package com.upn.ecommerce.service.entity;

import javax.persistence.*;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length=100)
    private String nome;
    @Column
    private Boolean vigencia;
    @OneToOne
    private DocumentoAlmacenado foto;

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getVigencia() {
        return vigencia;
    }

    public DocumentoAlmacenado getFoto() {
        return foto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVigencia(Boolean vigencia) {
        this.vigencia = vigencia;
    }

    public void setFoto(DocumentoAlmacenado foto) {
        this.foto = foto;
    }
}
