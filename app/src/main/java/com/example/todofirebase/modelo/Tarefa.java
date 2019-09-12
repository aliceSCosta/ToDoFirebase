package com.example.todofirebase.modelo;

public class Tarefa {

    private String uuid;
    private String nome;
    private boolean status;

    public Tarefa(){

    }

    public Tarefa(String uuid, String nome) {
        this.uuid = uuid;
        this.nome = nome;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "uuid='" + uuid + '\'' +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }
}
