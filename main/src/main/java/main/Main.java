package main;

import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Lotfi D Exia A1
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
    	final ModelFacade model = new ModelFacade();
        final ViewFacade view = new ViewFacade(); 
        final ControllerFacade controller = new ControllerFacade(view,model);
        //méthode pour lancer le jeux

/*        try {
            controller.start();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }  */
    }

}
