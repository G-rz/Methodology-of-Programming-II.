package user;

import java.util.Scanner;
import static user.InertiaJackknife.Introduction;
import static user.ManualJackknife.askForTem;
import static user.jackknife.Interval;
import static user.jackknife.Menu;

/**
 *
 * @author Guo Ruizheng
 * Neptun YT6WA9
 */
public class User { //Creat user class
    
    private int num_of_users;
    private String child_or_adult;
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        User user = new User();
        user.setNum_of_users();
        user.setChild_or_adult();
        Menu();
        Scanner choice = new Scanner(System.in);
        String number = choice.next(); //Record the choice
        
        switch (number) {
            case "1": //User choice 1
                AutoJackknife auto = new AutoJackknife(); //Create variable
                System.out.println("Starting use?(y/n)");
                String item = choice.next();
                if (item.equals("y")) {
                    auto.setOpen(true);
                    auto.setMistouch();
                    auto.setColor();
                    auto.setMaterial();
                    auto.setHardness();
                    auto.setCharge();
                } else {
                    System.out.println("Back");
                }
                break;
            case "2": //User choice 2
                ManualJackknife manual = new ManualJackknife(); //Create variable
                manual.setHandle_material();
                askForTem();
                int num = choice.nextInt();
                manual.setHandle_tempreture(num);
                manual.setLock(true);
                break;
            case "3": //User choice 3
                Introduction();
                InertiaJackknife inertia = new InertiaJackknife(); //Create variable
                inertia.setSurrounding_safe(true);
                inertia.setAutomatic_friction();
                inertia.setAutomatically_adjust_shape();
                break;
            default: //User choice 4
                break;
        }
        
        System.out.println("Thanks for using!");
    }
    
    /**
     * @return the num_of_users
     */
    public int getNum_of_users() {
        return num_of_users;
    }
    
    /**
     * @param num_of_users the num_of_users to set
     */
    public void setNum_of_users() {
        System.out.println("How many users?");
        Scanner nums = new Scanner(System.in);
        int num = nums.nextInt();
        System.out.println("Ready to serve " + num + " users.");
        this.num_of_users = num_of_users;
    }
    
    /**
     * @return the child_or_adultString
     */
    public String getChild_or_adult() {
        return child_or_adult;
    }
    
    /**
     * @param child_or_adult the child_or_adultString to set
     */
    public void setChild_or_adult() {
        System.out.println("How many childs?");
        Scanner Childs = new Scanner(System.in);
        String numOfChilds = Childs.nextLine();
        if (numOfChilds.equals("0")) {
        } else {
            System.out.println(numOfChilds + " special knives for children have been prepared");
        }
        Interval();
        this.child_or_adult = child_or_adult;
    }
}

    

