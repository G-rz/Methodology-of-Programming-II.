package user;

/**
 *
 * @author rick
 */
public class InertiaJackknife extends jackknife {
    private boolean surrounding_safe;
    private boolean automatic_friction; 
    //Automatically adjust the friction force to make the knife more smooth and not stuck
    private boolean automatically_adjust_shape;
    //Automatically adjust the shape to obtain smaller air resistance
    
    public static void Introduction() {
        System.out.println("\n Inertial knives are performance props, which have"
                         + "\n the function of identifying whether the surroundings"
                         + "\n are safe and keeping the display smooth");
        Interval();
    }
    /**
     * @return the surrounding_safe
     */
    public boolean isSurrounding_safe() {
        return surrounding_safe;
    }

    /**
     * @param surrounding_safe the surrounding_safe to set
     */
    public void setSurrounding_safe(boolean surrounding_safe) {
         if (surrounding_safe == true) {
            System.out.println("Surrounding is safe");
        } else {
            System.out.println("Surrounding is not safe, show is canceled");
        }
        Interval();
        this.surrounding_safe = surrounding_safe;
    }

    /**
     * @return the automatic_friction
     */
    public boolean isAutomatic_friction() {
        return automatic_friction;
    }

    /**
     * @param automatic_friction the automatic_friction to set
     */
    public void setAutomatic_friction() {
            System.out.println("Automatic friction adjustment is turned on");
            Interval();
        automatic_friction = automatic_friction;
    }

    /**
     * @return the automatically_adjust_shape
     */
    public boolean isAutomatically_adjust_shape() {
        return automatically_adjust_shape;
    }

    /**
     * @param automatically_adjust_shape the automatically_adjust_shape to set
     */
    public void setAutomatically_adjust_shape() {
        System.out.println("Auto shape adjustment is turned on");
        automatically_adjust_shape = automatically_adjust_shape;
    }
}

