package nfilho.singleton;


/**
 *
 * @author nfilho
 *
 * */

public class eagerSingleton {

    private static eagerSingleton instancia = new eagerSingleton();

    private eagerSingleton(){
        super();
    }

    public static eagerSingleton getInstancia() {
        return instancia;
    }
}
