package by.itstep;

import static spark.Spark.*;
/**
 * Created by st on 30.03.2019.
 */
public class Server {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello super world!");

        get("/", (req, res) -> "index");

        get("/calc/sum", (req, res) -> {
            int a = Integer.parseInt(req.queryParams("a"));
            int b = Integer.parseInt(req.queryParams("b"));
            return String.valueOf(a + b);
        });

        get("/calc/times", (req, res) -> {
            int a = Integer.parseInt(req.queryParams("a"));
            int b = Integer.parseInt(req.queryParams("b"));
            return String.valueOf(a * b);
        });
    }
}
