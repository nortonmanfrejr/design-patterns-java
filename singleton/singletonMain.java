package nfilho.singleton;

public class singletonMain {

    public static void main(String[] args){
        lazySingleton lazy = lazySingleton.getInstancia();
        System.out.println(lazy);
        lazy = lazySingleton.getInstancia();
        System.out.println(lazy);
        lazyholderSingleton lholder = lazyholderSingleton.getInstancia();
        System.out.println(lholder);
        lholder = lazyholderSingleton.getInstancia();
        System.out.println(lholder);
        eagerSingleton eager = eagerSingleton.getInstancia();
        System.out.println(eager);
        eager = eagerSingleton.getInstancia();
        System.out.println(eager);
    }
}
