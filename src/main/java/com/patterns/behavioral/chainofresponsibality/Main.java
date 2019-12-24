package com.patterns.behavioral.chainofresponsibality;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init(){
        server = new Server();
        server.register("admin@example.com","admin_pass");
        server.register("user@example.com","user_pass");
        Middleware middleware = new ThrowableMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());
        server.setMiddleware(middleware);

    }
    @SneakyThrows
    public static void main(String[] args) {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
