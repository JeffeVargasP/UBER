package Uber;

public class ExecUber {
    
    public static void main(String[] args) {
        
        Motorista motoca = new Motorista();
        Passageiro pass = new Passageiro();
        Viagem viagem = new Viagem();
        CalculadoraTarifa calcTF = new CalculadoraTarifa();

        motoca.setNome("Kashima");
        pass.setNome("Jefferson");
        pass.setOrigem("Pompéia - SP");
        pass.setDestino("Ivaiporã - PR");
        viagem.setKM(500);
        calcTF.setValue(viagem.getKM());  
        motoca.Login(motoca.getNome(), "1234");
        pass.Login(pass.getNome(), "4321");

        System.out.println("Motorista "+motoca.getNome()+" levou o passageiro "+pass.getNome());
        System.out.println("Da sua origem "+pass.getOrigem()+" até o seu destino "+pass.getDestino());
        System.out.println("Distância de "+viagem.getKM()+" KM no valor de R$"+calcTF.getValue());

    }

}
