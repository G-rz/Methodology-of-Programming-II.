package user;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rick
 */
public class jackknife {
    
    private String color;
    private String material;
    private int hardness;
    private boolean isOpen;
    private boolean charge;
    
    public static void Menu() {
        System.out.println(""
                + "Which knife do you want to use? \n"
                + "Menu \n"
                + "1.AutoJackknife    \n" //If you want to cut large objects (recommended)
                + "2.ManualJackknife  \n" //If you want to cut small objects (recommended)
                + "3.InertiaJackknife \n" //Entertainment show
                + "4.Quit"); // Quit
    }
    
    /**
     * @return the colorString
     */
    public String getColor() {
        return color;
    }
    
    /**
     * @param color the colorString to set
     */
    public void setColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one color:"
            + "\n 1.black"
            + "\n 2.white"
            + "\n 3.red"
            + "\n 4.blue"
            + "\n 5.pink"
            + "\n 6.yellow");
        int color = scanner.nextInt();
        switch (color) {
            case 1:
                this.color = "black";
                break;
            case 2:
                this.color = "white";
                break;
            case 3:
                this.color = "red";
                break;
            case 4:
                this.color = "blue";
                break;
            case 5:
                this.color = "pink";
                break;
            case 6:
                this.color = "yellow";
                break;
        }
    }
    
    /**
     * @return the matiearaString
     */
    public String getMaterial() {
        return material;
    }
    
    /**
     * @param material the matiearaString to set
     */
    public void setMaterial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose one material"
                + "\n 1.steel"
                + "\n 2.iron"
                + "\n 3.gold");
        int material = scanner.nextInt();
        if (material == 1) {
            System.out.println("steel selected");
        } else if (material == 2) {
            System.out.println("iron selected");
        } else {
            System.out.println("gold selected");
        }
        Interval();
    }
    
    /**
     * @return the hardness
     */
    public int getHardness() {
        return hardness;
    }
    
    /**
     * @param hardness the hardness to set
     */
    public void setHardness() {
        System.out.println("The hardness value is automatically matched according to the selected material");
        Interval();
        this.hardness = hardness;
    }
    
    /**
     * @return the isOpen
     */
    public boolean isOpen() {
        return isOpen;
    }
    
    /**
     * @param isOpen the isOpen to set
     */
    public void setOpen(boolean isOpen) {
        if (isOpen == true) {
            System.out.println("already open");
        } else {
            System.out.println("close");
        }   
        Interval();
        this.isOpen = isOpen;
    }
    
    /**
     * @return the charge
     */
    public boolean isCharge() {
        return charge;
    }
    
    /**
     * @param charge the charge to set
     */
    public void setCharge() {
        System.out.println("Fast charging...");
        Interval();
        this.charge = charge;
    }
    
    
    public static void Interval() {
        try {
            Thread.sleep(500); //Add time interval
        } catch (InterruptedException ex) {
            Logger.getLogger(jackknife.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
