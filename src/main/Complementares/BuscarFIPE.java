import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuscarFIPE {

    private static Integer codigoMarca;
    private static String codigoFipe;

    static Map<String, Integer> marcas = new HashMap<String, Integer>();
    static Map<String, String> carros = new HashMap<String, String>();

    private static void setMarcas() {
        marcas.put("Fiat", 21);
        marcas.put("Ford", 22);
        marcas.put("Chevrolet", 23);
        marcas.put("Volkswagen", 59);
    }

    private static void setCarros() {
        carros.put("Fiat Marea", "001079-0/1999-1");
        carros.put("Fiat Uno", "001054-5/1997-1");
        carros.put("Ford Edge", "003344-8/2015-1");
        carros.put("Ford Fusion", "003378-2/2016-1");
        carros.put("Chevrolet Corsa", "004085-1/2001-1");
        carros.put("Chevrolet Onix", "004519-5/2021-1");
        carros.put("Volkswagen Fusca", "005027-0/1995-1");
        carros.put("Volkswagen Kombi", "005023-7/2006-1");
    }

    public static Veiculo consultar(String modelo) throws Exception {
        setCarros();
        setMarcas();

        getCodigoMarca(modelo);
        getCodigoFipe(modelo);

        String webService = "https://fipeapi.appspot.com/api/1/carros/veiculo/";
        String urlParaChamada = webService + codigoMarca + "/" + codigoFipe + ".json";

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != 200)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converterJsonEmString(resposta);

            Gson gson = new Gson();

            return gson.fromJson(jsonEmString, Veiculo.class);
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }

    private static void getCodigoMarca(String modelo)
    {
        Pattern padrao = Pattern.compile("^\\w+");
        Matcher matcher = padrao.matcher(modelo);
        while (matcher.find()){
            codigoMarca = marcas.get(matcher.group());
        }
    }

    private static void getCodigoFipe(String modelo)
    {
        codigoFipe = carros.get(modelo);
    }
}
