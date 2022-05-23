package nfilho.singleton;


/**
 *
 * @see <a href="youtube.com.br"></a>
 *
 * @author nfilho
 *
 * */

public class lazyholderSingleton {

    private static class holderInstancia {
        public static lazyholderSingleton instancia = new lazyholderSingleton();

    }
    private lazyholderSingleton(){
        super();
    }

    public static lazyholderSingleton getInstancia() {
        return holderInstancia.instancia;
    }
}
