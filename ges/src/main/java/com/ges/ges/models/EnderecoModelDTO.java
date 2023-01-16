package com.ges.ges.models;

public class EnderecoModelDTO {

    private int cep;
    private String UF;
    private String cidade;
    private String bairro;
    private String longradouro;
    private int numero;
    private String complemento;
    
    public int getCep() {
        return cep;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public String getUF() {
        return UF;
    }
    public void setUF(String uF) {
        UF = uF;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getLongradouro() {
        return longradouro;
    }
    public void setLongradouro(String longradouro) {
        this.longradouro = longradouro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

}
