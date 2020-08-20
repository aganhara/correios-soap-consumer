package br.com.deere.john.exercisesoap.service;

import br.com.deere.john.exercisesoap.soap.CalcPrazo;
import br.com.deere.john.exercisesoap.soap.CalcPrazoResponse;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.soap.client.core.SoapActionCallback;


public class CorreiosSoapClient {

    private final String uri;
    private final Jaxb2Marshaller jaxb2Marshaller;

    public CorreiosSoapClient(String uri, Jaxb2Marshaller jaxb2Marshaller) {
        this.uri = uri;
        this.jaxb2Marshaller = jaxb2Marshaller;
    }

    public CalcPrazoResponse calcPrecoPrazo(CalcPrazo calcPrazo) {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate(jaxb2Marshaller);
        return (CalcPrazoResponse) webServiceTemplate.marshalSendAndReceive(uri, calcPrazo,
                new SoapActionCallback("http://tempuri.org/CalcPrazo"));
    }
}
