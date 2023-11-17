import java.awt.*;

import javax.swing.*;

class Mymenu extends JFrame {

    JMenuBar mb;
    JMenu file, edit, search;
    JMenuItem undo, redo, cut, copy, paste;

    /**
     * 
     */
    Mymenu() {

        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        mb = new JMenuBar();

        c.add( "North",mb);

        file = new JMenu("file");
        edit = new JMenu("edit");
        search = new JMenu("search");

        mb.add(file);
        mb.add(edit);
        mb.add(search);

        undo = new JMenuItem("undo");
        redo = new JMenuItem("redo");
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");

        edit.add(undo);
        edit.add(redo);
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

   

    public static void main(String[] args) {
        Mymenu mm = new Mymenu();
        mm.setTitle("jmenu demo");
        mm.setSize(500, 400);
        mm.setVisible(true);

    }

}