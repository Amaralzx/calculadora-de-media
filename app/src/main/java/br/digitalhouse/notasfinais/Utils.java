package br.digitalhouse.notasfinais;

import android.widget.EditText;

public class Utils {
    public float converteValor(EditText caixaDeTexto){
        float valorMedia = Float.parseFloat(caixaDeTexto.getText().toString());
        return valorMedia;

    }
    public float calcularMedia(EditText notaP, EditText notaS, EditText notaT, EditText notaQ){
        float notaPrimeiroconvertida = converteValor(notaP);
        float notaSegundoconvertida = converteValor(notaS);
        float notaTerceiroconvertida = converteValor(notaT);
        float notaQuartoconvertida = converteValor(notaQ);
        float notasSomadas = notaPrimeiroconvertida + notaSegundoconvertida + notaTerceiroconvertida
                + notaQuartoconvertida;
        float media = notasSomadas / 4;
        return media;
    }
}
