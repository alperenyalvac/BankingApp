package guis;
import db_objs.User;

import javax.swing.*;

/*
    Creating an abstract class helps us setup the blueprint that our GUIs will follow, for example
    in each of the GUIs they will be the same size and will need to invoke their own addGuiComponents()
    which will be unique to each subclass
 */

public abstract class BaseFrame extends JFrame {
    // store user information
    protected User user;

    public BaseFrame(String title) {
        initialize(title);
    }
    public BaseFrame(String title, User user) {
        // initialize user
        this.user = user;

        initialize(title);
    }


    private void initialize(String title) {

        setTitle(title);

        setSize(420, 600);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(null);

        setResizable(false);

        setLocationRelativeTo(null);

        addGuiComponents();
    }

    protected abstract void addGuiComponents();
}


















