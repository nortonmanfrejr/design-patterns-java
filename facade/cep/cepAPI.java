package nfilho.facade.cep;

public class cepAPI {


    // Utilizando o padrao de encapsulamento do singleton
    private static class cepInstance{
        public static cepAPI instancia = new cepAPI();
    }
    private cepAPI(){
        super();
    }
    public static cepAPI getInstancia(){
        return cepInstance.instancia;
    }

    public String recuperaCidade(String cep){
        return "Suzano";
    }
    public String recuperaEstado(String cep){
        return "SP";
    }

}
