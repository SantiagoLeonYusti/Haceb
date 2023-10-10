package com.haceb.utils;
/*
 * @(#) IndexRandom.java 11.0
 * Copyright 2023 SQA. Todos los derechos reservados.
 */


import java.util.concurrent.ThreadLocalRandom;


public class IndexRandom {
    public static int numeroAleatorioEnRango(int minimo, int maximo) {
// nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo);
    }
}
