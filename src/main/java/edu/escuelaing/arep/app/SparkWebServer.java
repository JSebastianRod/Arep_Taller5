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
        get("index", (req, res) -> getIndexResponseSen());
        get("/sen", (req, res) -> Math.sin((Double.parseDouble(req.queryParams("value")))));
        get("/cos", (req, res) -> Math.cos((Double.parseDouble(req.queryParams("value")))));
        get("/pal", (req, res) -> {
            String str = req.queryParams("value");
            String rstr = "";
            int strLength = str.length();
            for (int i = (strLength - 1); i >= 0; --i) {
                rstr = rstr + str.charAt(i);
            }

            if (str.toLowerCase().equals(rstr.toLowerCase())) {
                return " Es palindromo.";
            } else {
                return " No es palindromo.";
            }
        });
        get("/vec", (req, res) -> {
            double x = Double.parseDouble(req.queryParams("x"));
            double y = Double.parseDouble(req.queryParams("y"));

            double magnitud = Math.sqrt(x * x + y * y);

            return "La magnitud del vector es: " + magnitud;

        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

    public static String getIndexResponseSen() {
        String response = "\r\n"
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
                + "            <input type=\"text\" id=\"name\" name=\"name\" value=\"\"><br><br>\n"
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
                + "        <form action=\"/coseno\">\n"
                + "            <label for=\"name\">Funtion Coseno:</label><br>\n"
                + "            <input type=\"text\" id=\"nameCos\" name=\"name\" value=\" \"><br><br>\n"
                + "            <input type=\"button\" value=\"Submit\" onclick=\"loadGetMsgCos()\">\n"
                + "        </form>\n"
                + "        <div id=\"getrespmsgCos\"></div>\n"
                + "      <script>\n"
                + "            function loadGetMsgCos() {\n"
                + "                let nameVar = document.getElementById(\"nameCos\").value;\n"
                + "                const xhttp = new XMLHttpRequest();\n"
                + "                xhttp.onload = function() {\n"
                + "                    document.getElementById(\"getrespmsgCos\").innerHTML =\n"
                + "                    this.responseText;\n"
                + "                } \n"
                + "                xhttp.open(\"GET\", \"cos?value=\"+nameVar);\n"
                + "                xhttp.send();\n"
                + "            }\n"
                + "      </script>\n"
                + "        <form action=\"/palindromo\">\n"
                + "            <label for=\"name\">Funcion Palindromo:</label><br>\n"
                + "            <input type=\"text\" id=\"namePal\" name=\"name\" value=\" \"><br><br>\n"
                + "            <input type=\"button\" value=\"Submit\" onclick=\"loadGetMsgPal()\">\n"
                + "        </form>\n"
                + "        <div id=\"getrespmsgPal\"></div>\n"
                + "      <script>\n"
                + "            function loadGetMsgPal() {\n"
                + "                let nameVar = document.getElementById(\"namePal\").value;\n"
                + "                const xhttp = new XMLHttpRequest();\n"
                + "                xhttp.onload = function() {\n"
                + "                    document.getElementById(\"getrespmsgPal\").innerHTML =\n"
                + "                    this.responseText;\n"
                + "                } \n"
                + "                xhttp.open(\"GET\", \"pal?value=\"+nameVar);\n"
                + "                xhttp.send();\n"
                + "            }\n"
                + "      </script>\n"
                + "        <form action=\"/vector\">\n"
                + "            <label for=\"name\">Función Vector:</label><br>\n"
                + "            <input type=\"text\" id=\"value1\" name=\"name\" value=\" \"><br><br>\n"
                + "            <input type=\"text\" id=\"value2\" name=\"name\" value=\" \"><br><br>\n"
                + "            <input type=\"button\" value=\"Submit\" onclick=\"loadGetMsgVec()\">\n"
                + "        </form>\n"
                + "        <div id=\"getrespmsgVec\"></div>\n"
                + "      <script>\n"
                + "            function loadGetMsgVec() {\n"
                + "                let nameVar1 = document.getElementById(\"value1\").value;\n"
                + "                let nameVar2 = document.getElementById(\"value2\").value;\n"
                + "                const xhttp = new XMLHttpRequest();\n"
                + "                xhttp.onload = function() {\n"
                + "                    document.getElementById(\"getrespmsgVec\").innerHTML =\n"
                + "                    this.responseText;\n"
                + "                } \n"
                + "                xhttp.open(\"GET\", \"vec?x=\"+nameVar1+\"&y=\"+nameVar2);\n"
                + "                xhttp.send();\n"
                + "            }\n"
                + "      </script>\n"
                + "    </body>\n"
                + "</html>\n";
        return response;
    }

}