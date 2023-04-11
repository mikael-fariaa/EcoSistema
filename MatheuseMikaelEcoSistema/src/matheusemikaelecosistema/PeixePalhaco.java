package matheusemikaelecosistema;

public class PeixePalhaco extends Peixe {
    @Override
    public void emitirSom(){
        System.out.println("Nao emiti som");
    }
    
    public void cacar(){
        System.out.println("Nao caça");
    }
    
    public void comendo(){
        System.out.println("Algas");
    }
}
