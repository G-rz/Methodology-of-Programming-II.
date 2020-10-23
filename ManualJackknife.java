package user;

/**
 *
 * @author rick
 */
public class ManualJackknife extends jackknife {
    private String handle_material;
    private int handle_tempreture;
    private boolean lock;
    
    public static void askForTem() {
        System.out.println("What is the temperature of the knife handle you want to set?");
}

    /**
     * @return the handle_material
     */
    public String getHandle_material() {
        return handle_material;
    }
    
    /**
     * @param handle_material the handle_material to set
     */
    public void setHandle_material() {
        System.out.println("The handle material is a mixture of bamboo and wood.");
        Interval();
        this.handle_material = handle_material;
    }
    
    /**
     * @return the handle_tempreture
     */
    public int getHandle_tempreture() {
        return handle_tempreture;
    }
    
    /**
     * @param handle_tempreture the handle_tempreture to set
     */
    public void setHandle_tempreture(int handle_tempreture) {
        System.out.println("The temperature has been set to " + handle_tempreture +" degrees.");
        Interval();
        this.handle_tempreture = handle_tempreture;
    }
    
    /**
     * @return the lock
     */
    public boolean isLock() {
        return lock;
    }
    
    /**
     * @param lock the lock to set
     */
    public void setLock(boolean lock) {
        if (lock == true) {
            System.out.println("The knife is locked.");
        } else {
            System.out.println("The knife is not locked.");
        }
        Interval();
        this.lock = lock;
    }
}