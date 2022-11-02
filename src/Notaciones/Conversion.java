/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notaciones;

import java.util.ArrayList;
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
        char[] careaux = new String(einfija).toCharArray();
        ArrayList<Character> carexp = new ArrayList<Character>();
        for (int i = 0; i < careaux.length; i++) {
            if (jerarquia(careaux[i]) > 0) {
                
                carexp.add(' ');
                carexp.add(careaux[i]);
                carexp.add(' ');
            } else {
                carexp.add(careaux[i]);
            }
        }

        for (int i = 0; i < carexp.size(); i++) {
            if (carexp.get(i) == '(') {
                carexp.set(i, ')');
                i++;
            } else if (carexp.get(i) == ')') {
                carexp.set(i, '(');
                i++;
            }
        }

        String s = "";
        for (int i = 0; i < carexp.size(); i++) {
            s += carexp.get(i).toString();
        }


        for (int i = 0; i < carexp.size(); i++) {
            char car = carexp.get(i);

            if (jerarquia(car) > 0) {
                if ((stack.size() - 2) != -1) {
                    while (stack.isEmpty() == false && jerarquia(stack.get(stack.size() - 2)) >= jerarquia(car)) {
                        eprefija.append(stack.get(stack.size() - 2));
                        stack.remove(stack.size() - 2);
                        eprefija.append(stack.pop());
                    }
                }

                stack.push(car);
                i++;
                car = carexp.get(i);
                stack.push(car);
            } else if (car == ')') {
                char aux = stack.pop();
                while (aux != '(') {
                    eprefija.append(aux);
                    aux = stack.pop();
                }
            } else if (car == '(') {
                stack.push(car);
            } else {
                eprefija.append(car);
            }
        }

        while (!stack.isEmpty()) {
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
