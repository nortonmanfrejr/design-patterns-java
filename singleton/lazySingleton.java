package nfilho.singleton;


/**
 *
 * @author nfilho
 *
 * */

public class lazySingleton {

    private static lazySingleton instancia;

    private lazySingleton(){
        super();
    }

    public static lazySingleton getInstancia() {
        if(instancia == null){
            instancia = new lazySingleton();
        }
        return instancia;
    }
}
