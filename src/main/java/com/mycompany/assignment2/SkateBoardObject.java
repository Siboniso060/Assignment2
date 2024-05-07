/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment2;

/**
 *
 * @author user
 */
class SkateBoard extends Vehicle {
private double myBoardLength;
public SkateBoard() {
myBoardLength = 0;
}
public SkateBoard(double boardLength) {
setBoardLength(boardLength);
}
public double getBoardLength() {
return myBoardLength;
}
public void setBoardLength(double boardLength){
myBoardLength= boardLength;
}
}
public class SkateBoardObject{
public static void main(String[] args){
SkateBoard board = new SkateBoard();
board.setBoardLength(31.5);
System.out.println(board.getBoardLength());
board.setBrand("Ally");
board.setModel("Rocke");
System.out.println(board);
}
}
    

