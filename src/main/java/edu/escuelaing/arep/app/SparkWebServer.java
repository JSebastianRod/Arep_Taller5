package edu.escuelaing.arep.app;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

public class SparkWebServer {
    static Map<String, Serviciostr> servicios = new HashMap<String, Serviciostr>();

    public static void main(String... args) {
        port(getPort());
        get("hello", (req, res) -> "Hello Docker!");
        System.out.println("Inicio");
        get("index", (req, res) -> getIndexResponseSen() );
        get("/sen", (req, res) -> Math.sin((Double.parseDouble(req.queryParams("value")))));
        get("/cos", (req, res) -> Math.cos((Double.parseDouble(req.queryParams("value")))));
        get("/pal", (req, res) -> {
            String str = req.queryParams("value");
            String rstr = "";
            int strLength = str.length();
            for (int i = (strLength - 1); i >=0; --i) {
                rstr = rstr + str.charAt(i);
              }
          
              if (str.toLowerCase().equals(rstr.toLowerCase())) {
                return " Es palindromo.";
              }
              else {
                return " No es palindromo.";
              }

        });
    }

    
    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    public static String getIndexResponseSen() {
        String response = 
                "\r\n"
                + "<!DOCTYPE html>\n"
                + "<html\n>"
                + "    <head\n>"
                + "        <title>Form Example</title\n>"
                + "        <meta charset=\"UTF-8\"\n>"
                + "        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "    </head>\n"
                + "    <body>\n"
                + "        <h1>Ejercicio Bonus Parcial</h1>\n"
                + "        <h2>Indique la funcion</h2>\n"
                + "        <form action=\"/hello\">\n"
                + "            <label for=\"name\">Funtion Seno:</label><br>\n"
                + "            <input type=\"text\" id=\"name\" name=\"name\" value=\" \"><br><br>\n"
                + "            <input type=\"button\" value=\"Submit\" onclick=\"loadGetMsg()\">\n"
                + "        </form>\n"
                + "        <div id=\"getrespmsg\"></div>\n"
                + "      <script>\n"
                + "            function loadGetMsg() {\n"
                + "                let nameVar = document.getElementById(\"name\").value;\n"
                + "                const xhttp = new XMLHttpRequest();\n"
                + "                xhttp.onload = function() {\n"
                + "                    document.getElementById(\"getrespmsg\").innerHTML =\n"
                + "                    this.responseText;\n"
                + "                } \n"
                + "                xhttp.open(\"GET\", \"sen?value=\"+nameVar);\n"
                + "                xhttp.send();\n"
                + "            }\n"
                + "      </script>\n"
                + "        <form action=\"/hello\">\n"
                + "            <label for=\"name\">Funtion Coseno:</label><br>\n"
                + "            <input type=\"text\" id=\"name\" name=\"name\" value=\" \"><br><br>\n"
                + "            <input type=\"button\" value=\"Submit\" onclick=\"loadGetMsg()\">\n"
                + "        </form>\n"
                + "        <div id=\"getrespmsg\"></div>\n"
                + "      <script>\n"
                + "            function loadGetMsg() {\n"
                + "                let nameVar = document.getElementById(\"name\").value;\n"
                + "                const xhttp = new XMLHttpRequest();\n"
                + "                xhttp.onload = function() {\n"
                + "                    document.getElementById(\"getrespmsg\").innerHTML =\n"
                + "                    this.responseText;\n"
                + "                } \n"
                + "                xhttp.open(\"GET\", \"cos?value=\"+nameVar);\n"
                + "                xhttp.send();\n"
                + "            }\n"
                + "      </script>\n"
                + "    </body>\n"
                + "</html>\n";
        return response;
    }


}