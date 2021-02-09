import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BuscarCEP {
    static String webService = "https://viacep.com.br/ws/";

    public static Endereco buscaEnderecoPeloCEP(String cep) throws Exception {
        String urlParaChamada = webService + cep + "/json";

        try {
            URL url = new URL(urlParaChamada);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != 200)
                throw new RuntimeException("HTTP error code : " + conexao.getResponseCode());

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream())));
            String jsonEmString = Util.converterJsonEmString(resposta);

            Gson gson = new Gson();

            return gson.fromJson(jsonEmString, Endereco.class);
        } catch (Exception e) {
            throw new Exception("ERRO: " + e);
        }
    }
}
