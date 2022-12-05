package Uber;

public class Motorista extends Pessoa implements Usuario {

    // Atributos

    String nome;
    String user;
    String password;
    Boolean check;

    // Implements

    public void Login(String user, String password) {
        if (user.equals(user) && password.equals(password)) {
            check = true;
        } else {
            check = false;
        }
    }

    public void Logout(Boolean confirm) {
        if (confirm == true) {
            confirm = true;
        } else {
            confirm = false;
        }
    }

    // Getters

    public String getNome() {
        return nome;
    }

    // Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

}