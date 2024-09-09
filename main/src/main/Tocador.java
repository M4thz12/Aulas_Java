/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;



/**
 *
 * @author Fabio
 */
public class Tocador {

    public static void tocamp3(){

        FileInputStream in;
 try {
  //Inicializa o FileInputStream com o endereço do arquivo para tocar
  in = new FileInputStream("C:\\Users\\labsfiap\\Documents\\NetBeansProjects\\main\\src\\main\\sounds\\OLHA O MACACO, MACACOOOOOOOOOOOOOO.mp3");

  //Cria uma instancia da classe player passando para ele o InpuStream do arquivo
  Player p = new Player(in);

  //executa o som
  p.play();
 } catch (FileNotFoundException e) {
  e.printStackTrace();
 } catch (JavaLayerException e) {
  e.printStackTrace();
 }


    }

}
