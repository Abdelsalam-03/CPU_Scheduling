package ui;

import javax.swing.*;

import model.SchedulerConfiguration;

import java.awt.CardLayout;

public class App extends JFrame {

    private final CardLayout cardLayout = new CardLayout();
    private final JPanel pages = new JPanel(cardLayout);

    private SchedulerConfiguration configuration;

    public App() {
        setTitle("Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        pages.add(
                new ConfigurationPage(this::onConfigurationSubmit),
                "configuration"
        );

        pages.add(new JPanel(), "next");

        setContentPane(pages);

        cardLayout.show(pages, "configuration");
    }

    private void onConfigurationSubmit(
            SchedulerConfiguration configuration
    ) {
        this.configuration = configuration;

        cardLayout.show(pages, "next");
    }
}
