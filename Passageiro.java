package Uber;

public class Passageiro extends Pessoa implements Usuario {
    
    // Atributos

    String origem;
    String destino;
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

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    // Setters

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

}