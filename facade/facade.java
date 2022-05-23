package nfilho.facade;

import nfilho.facade.cep.cepAPI;
import nfilho.facade.crm.crmService;

public class facade {

    public void migraCliente(String nome, String cep){

        String cidade = cepAPI.getInstancia().recuperaCidade(cep);
        String estado = cepAPI.getInstancia().recuperaEstado(cep);

        crmService.gravaCliente(nome, cep, cidade, estado);

        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
