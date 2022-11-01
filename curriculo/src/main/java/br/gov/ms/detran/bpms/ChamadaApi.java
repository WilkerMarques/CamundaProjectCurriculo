package br.gov.ms.detran.bpms;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.util.Random;

public class ChamadaApi implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        
        Random r = new Random();

        int low =1;
        int high =3;
        int result = r.nextInt(high-low) + low;

        List<String> lista = new ArrayList<String>();

        lista.add("Nome limpo");
        lista.add("Nome meio sujo");
        lista.add("Nome 100% sujo");

        execution.setVariable("avaliacao_antecedentes",lista.get(result));
        
    }
    
}
