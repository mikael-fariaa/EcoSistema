package matheusemikaelecosistema;

public class Cachorro extends Lobo {
    @Override
    public void emitirSom() {
        System.out.println("Au!Au!Au!");
    }
    
    public void cacar(){
        System.out.println("Caça gato");
    }
    
    public void comendo(){
        System.out.println("Comendo raçao");
    }
}
