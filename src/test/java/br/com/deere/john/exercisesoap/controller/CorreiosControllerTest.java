package br.com.deere.john.exercisesoap.controller;

import br.com.deere.john.exercisesoap.service.CorreiosSoapClient;
import br.com.deere.john.exercisesoap.soap.CalcPrazo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class CorreiosControllerTest {

    @Mock
    private CorreiosSoapClient correiosSoapClient;

    @InjectMocks
    private CorreiosController correiosController;

    @Test
    public void shouldCallCorreiosSoapClient() {
        ArgumentCaptor<CalcPrazo> calcPrazoArgumentCaptor = ArgumentCaptor.forClass(CalcPrazo.class);
        String nCdService = "040140";
        String nCepOrigem = "333333333";
        String nCepDestino = "44444444444";

        correiosController.calcPrazo(nCdService, nCepOrigem, nCepDestino);

        Mockito.verify(correiosSoapClient).calcPrecoPrazo(calcPrazoArgumentCaptor.capture());
        CalcPrazo calcPrazo = calcPrazoArgumentCaptor.getValue();


        assertEquals(nCdService, calcPrazo.getNCdServico());
        assertEquals(nCepOrigem, calcPrazo.getSCepOrigem());
        assertEquals(nCepDestino, calcPrazo.getSCepDestino());
    }

}