package matheusemikaelecosistema;

public class MatheuseMikaelEcoSistema {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Ave a = new Ave();
        Peixe p = new Peixe();
        Cachorro c = new Cachorro();
        Cobra k = new Cobra();
        PeixePalhaco pp = new PeixePalhaco();
        Gaviao g = new Gaviao();
        Lobo l = new Lobo();
        DragaoDeKomodo d = new DragaoDeKomodo();
        Urubu u = new Urubu();
        Tubarao t = new Tubarao();
        
        
        c.cacar();
        c.comendo();
        c.emitirSom();
        l.cacar();
        l.comendo();
        l.emitirSom();
        k.comendo();
        k.cacar();
        k.emitirSom();
        d.comendo();
        d.emitirSom();
        d.cacar();
        
        
    }
    
}
