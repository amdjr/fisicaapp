
public class Formulas {

    private static final String RESULTADO = "resultado é %s";

    public static float forcaPeso(float massa, float acelGrav) {
        float fpeso = massa * acelGrav;
        System.out.printf(RESULTADO, fpeso);
        return fpeso;

    }

    public static float forcaCentripeta(float massa, float velocidade, float raio) {
        float fCent = massa * (velocidade * velocidade) / raio;
        System.out.printf(RESULTADO, fCent);
        return fCent;
    }

    public static float impulso(float forcaV, float tempo) {
        float imp = forcaV * tempo;
        System.out.printf(RESULTADO, imp);
        return imp;
    }

    public static float forcaElastica(float constanteElastica, float variacaoElastica) {
        float forcaEl = constanteElastica * variacaoElastica;
        System.out.printf(RESULTADO, forcaEl);
        return forcaEl;
    }

    public static float velocidadeMedia(float distancia, float tempo) {
        float velMedia = distancia / tempo;
        System.out.printf(RESULTADO, velMedia);
        return velMedia;
    }

    public static float funcaoMRU(float posicaoInicial, float velocidade, float tempo) {
        float funcMRU = posicaoInicial + velocidade * tempo;
        System.out.printf(RESULTADO, funcMRU);
        return funcMRU;
    }

    public static float funcaoMRUV(float velocidadeInicial, float aceleracao, float tempo) {
        float funcMRUV = velocidadeInicial + aceleracao * tempo;
        System.out.printf(RESULTADO, funcMRUV);
        return funcMRUV;
    }
}
