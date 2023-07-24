package minesweeper;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 * Customize (subclass) the JButton to include
 * row/column numbers and status of each cell.
 */
public class Cell extends JButton {
   // Name-constants for JButton's colors and fonts
   
   public static final Icon unrev = new ImageIcon("src/resources/unrevealed.png");
   public static final Icon zero = new ImageIcon("src/resources/0.png");
   public static final Icon one = new ImageIcon("src/resources/1.png");
   public static final Icon two = new ImageIcon("src/resources/2.png");
   public static final Icon three = new ImageIcon("src/resources/3.png");
   public static final Icon four = new ImageIcon("src/resources/4.png");
   public static final Icon five = new ImageIcon("src/resources/5.png");
   public static final Icon six = new ImageIcon("src/resources/6.png");
   public static final Icon seven = new ImageIcon("src/resources/7.png");
   public static final Icon eight = new ImageIcon("src/resources/8.png");
   public static final Icon flag = new ImageIcon("src/resources/flag.png");
   public static final Icon mine = new ImageIcon("src/resources/mine.png");

   // All variables have package access
   int row, col;        // The row and column number of the cell
   boolean isRevealed;
   boolean isMined;
   boolean isFlagged;

   // Constructor
   public Cell(int row, int col) {
      super();   // JTextField
      this.row = row;
      this.col = col;
      // Set JButton's default display properties
   }

   public void init(boolean isMined) {
      isRevealed = false;
      isFlagged = false;
      this.isMined = isMined;
      super.setEnabled(true);  // enable button
      super.setBackground(Color.WHITE);
      super.setIcon(unrev);    // display blank
   }

   // Paint itself based on its status
   public void paint(int numMine) {
      if (this.isRevealed==true){
        switch (numMine) {
        case 0:
            super.setIcon(zero);
            break;
        case 1:
            super.setIcon(one);
            break;
        case 2:
            super.setIcon(two);
            break;
        case 3:
            super.setIcon(three);
            break;
        case 4:
            super.setIcon(four);
            break;
        case 5:
            super.setIcon(five);
            break;    
        case 6:
            super.setIcon(six);
            break;
        case 7:
            super.setIcon(seven);
            break;
        case 8:
            super.setIcon(eight);
            break;
        default:
        	super.setIcon(one);
            
        }

      }

      else if(this.isFlagged==true){
         super.setIcon(flag);
      }

      else if (this.isFlagged==false){
    	  super.setIcon(unrev);
      }

   }
   
   public void gameover() {
	   if (this.isMined) {
		   super.setIcon(mine);
	   }
   }
   
}
