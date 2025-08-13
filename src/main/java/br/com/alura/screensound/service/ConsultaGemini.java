package br.com.alura.screensound.service;

import com.google.genai.types.GenerateContentResponse;
import com.google.genai.Client;

public class ConsultaGemini {

    public static String obterInformacao(String texto) {
        String apiKey = System.getenv("GEMINI_APIKEY");
        Client client = Client.builder().apiKey(apiKey).build();

        GenerateContentResponse response =
                null;
        response = client.models.generateContent(
                "gemini-2.0-flash",
                "Me fale sobre o artista " + texto,
                null);

        return response.text();
    }
}
