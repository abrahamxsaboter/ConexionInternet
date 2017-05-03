package iit3.dap.abrahamxsaboter.practica_conexioninternet;

import android.net.Uri;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkUtils {

    private static final String LOG_TAG = NetworkUtils.class.getSimpleName();
    // URI de base para la API de libros
    private static final String BOOK_BASE_URL = "https://www.googleapis.com/books/v1/volumes?";
    // Parámetro para la cadena de búsqueda
    private static final String QUERY_PARAM = "q";
    // Parámetro que limita los resultados de búsqueda
    private static final String MAX_RESULTS = "maxResults";
    // Parámetro a filtrar por tipo de impresión
    private static final String PRINT_TYPE = "printType";


    static String getBookInfo(String queryString){

        //conecta y lee los datos entrantes
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;

        //contiene la respuesta sin formato de la consulta y devolverla
        String bookJSONString = null;
        return bookJSONString;

        /*try {

 /*
            // Construye el URI de consulta, limitando los resultados a 10 elementos y libros impresos
            Uri builtURI = Uri.parse(BOOK_BASE_URL).buildUpon()
                    .appendQueryParameter(QUERY_PARAM, queryString)
                    .appendQueryParameter(MAX_RESULTS, "10")
                    .appendQueryParameter(PRINT_TYPE, "books")
                    .build();


           URL requestURL = new URL(builtURI.toString());

            urlConnection = (HttpURLConnection) requestURL.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream inputStream = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if (inputStream == null) {
                // Nothing to do.
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;

            while ((line = reader.readLine()) != null) {
*/
                /* Since it's JSON, adding a newline isn't necessary (it won't affect
                parsing) but it does make debugging a *lot* easier if you print out the
                completed buffer for debugging. */
/*                buffer.append(line + "\n");
            }
            if (buffer.length() == 0) {
                // Stream was empty. No point in parsing.
                return null;
            }
            bookJSONString = buffer.toString();
*/
/*        }
        catch (Exception ex) {
        }
        finally {
            return bookJSONString;
        }*/


    }
}
