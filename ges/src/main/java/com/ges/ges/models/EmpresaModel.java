package com.ges.ges.models;

import java.math.BigInteger;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empresa")
public class EmpresaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mercado;
    private String site;
    private String razaoSocial;
    private String nomeFantasia;
    private Float capitalSocial;
    private String cnpj;
    private int cnae;
    private String cnaeDescricao;
    private String email;
    private int telefone;
    @ManyToOne
    @JoinColumn(nullable = false)
    private EnderecoModel endereco;
    private Boolean foiDeletada;

    public Boolean getFoiDeletada() {
        return foiDeletada;
    }

    public void setFoiDeletada(Boolean status) {
        this.foiDeletada = status;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public String getMercado() {
        return mercado;
    }
    public void setMercado(String mercado) {
        this.mercado = mercado;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
    public Float getCapitalSocial() {
        return capitalSocial;
    }
    public void setCapitalSocial(Float capitalSocial) {
        this.capitalSocial = capitalSocial;
    }
    public int getCnae() {
        return cnae;
    }
    public void setCnae(int cnae) {
        this.cnae = cnae;
    }
    public String getCnaeDescricao() {
        return cnaeDescricao;
    }
    public void setCnaeDescricao(String cnaeDescricao) {
        this.cnaeDescricao = cnaeDescricao;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
}
