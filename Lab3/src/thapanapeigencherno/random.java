/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thapanapeigencherno;

import java.util.Random;

/**
 *
 * @author 958016904
 */
public class random {
        public static void main(String[] args) {
    Random rn = new Random();
            int random = rn.nextInt(4) + 1;
            System.out.println(random);
        }
}
