package com.main.resources.templates.panelContentApp;

import javax.swing.JPanel;

import com.partials.color;

public class wrapperPanel extends JPanel {

    public JPanel wrapperPanel = new JPanel();

    public wrapperPanel() {
        super();
        setOpaque(false);
        setSize(1080, 720);
        setLayout(null);

        wrapperPanel.setBounds(0, 0, 1080, 720);
        wrapperPanel.setLayout(null);

        add(wrapperPanel);
    }

}
