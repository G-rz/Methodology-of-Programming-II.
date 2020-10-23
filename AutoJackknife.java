package user;

/**
 *
 * @author rick
 */
public class AutoJackknife extends jackknife {
    
    private int spring_length;
    private int spring_hardness;
    private boolean mistouch;
 
    /**
     * @return the spring_length
     */
    public  int getSpring_length() {
        return spring_length;
    }

    /**
     * @param spring_length the spring_length to set
     */
    public void setSpring_length() {
        System.out.println("The length of the spring is automatically matched successfully");
        this.spring_length = spring_length;
    }

    /**
     * @return the spring_hardnees
     */
    public int getSpring_hardnees() {
        return spring_hardness;
    }

    /**
     * @param spring_hardnees the spring_hardnees to set
     */
    public void setSpring_hardnees() {
        System.out.println("The hardness of the spring is automatically matched successfully");
        Interval();
        this.spring_hardness = spring_hardness;
    }

    /**
     * @return the mistouch
     */
    public boolean isMistouch() {
        return mistouch;
    }

    /**
     * @param mistouch the protect_self to set
     */
    public void setMistouch() {
        System.out.println("Anti-mistouch function is activated");
        this.mistouch = mistouch;
    }
}