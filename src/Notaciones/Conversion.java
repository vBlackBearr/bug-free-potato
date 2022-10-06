/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notaciones;

import java.util.Stack;

/**
 *
 * @author TeamPotato:)
 */
public class Conversion {

    static StringBuilder conversionPrefijo(String expresion) {
        StringBuilder eprefija = new StringBuilder();
        StringBuilder einfija = new StringBuilder(expresion);

        einfija.reverse();

        Stack<Character> stack = new Stack<Character>();
        char[] carexp = new String(einfija).toCharArray();

        for (int i = 0; i < carexp.length; i++) {
            if (carexp[i] == '(') {
                carexp[i] = ')';
                i++;
            } else if (carexp[i] == ')') {
                carexp[i] = '(';
                i++;
            }
        }

        for (int i = 0; i < carexp.length; i++) {
            char car = carexp[i];

            if (jerarquia(car) > 0) {
                while (stack.isEmpty() == false && jerarquia(stack.peek()) >= jerarquia(car)) {
                    eprefija.append(stack.pop()).append(" ");
                }
                stack.push(car);
            } else if (car == ')') {
                char aux = stack.pop();
                while (aux != '(') {
                    eprefija.append(aux).append(" ");
                    aux = stack.pop();
                }
            } else if (car == '(') {
                stack.push(car);

            } else {
                eprefija.append(car).append(" ");
            }
        }

        for (int i = 0; i <= stack.size(); i++) {
            eprefija.append(stack.pop());
        }
        return eprefija.reverse();
    }

    static int jerarquia(char car) {
        switch (car) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
