package br.com.deere.john.exercisesoap.controller;

import br.com.deere.john.exercisesoap.service.CorreiosSoapClient;
import br.com.deere.john.exercisesoap.soap.CalcPrazo;
import br.com.deere.john.exercisesoap.soap.CalcPrazoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorreiosController {
    @Autowired
    private CorreiosSoapClient correiosSoapClient;

    /**
     * Calcula o prazo de entrega a partir do tipo de serviço e CEP de origem e destino.
     */
    @GetMapping("/calcPrazo")
    public CalcPrazoResponse calcPrazo(@RequestParam("nCdService") String nCdService,
                                       @RequestParam("nCepOrigem") String nCepOrigem,
                                       @RequestParam("nCepDestino") String nCepDestino) {
        CalcPrazo calcPrazo = new CalcPrazo();
        calcPrazo.setNCdServico(nCdService);
        calcPrazo.setSCepOrigem(nCepOrigem);
        calcPrazo.setSCepDestino(nCepDestino);
        return correiosSoapClient.calcPrecoPrazo(calcPrazo);
    }
}
