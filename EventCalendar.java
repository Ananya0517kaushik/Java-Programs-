import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.*;

public class EventCalendar extends JFrame {
    private Map<Date, List<String>> events;
    private DefaultListModel<String> listModel;
    private JList<String> eventList;

    public EventCalendar() {
        events = new HashMap<>();
        listModel = new DefaultListModel<>();
        eventList = new JList<>(listModel);
        JButton addEventButton = new JButton("Add Event");
        JButton viewEventButton = new JButton("View Events");

        setTitle("Event Calendar");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JScrollPane scrollPane = new JScrollPane(eventList);
        eventList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        add(scrollPane, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addEventButton);
        buttonPanel.add(viewEventButton);
        add(buttonPanel, BorderLayout.SOUTH);

        addEventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date selectedDate = getDateFromUserInput("Enter a date for the event (dd/MM/yyyy):");
                if (selectedDate != null) {
                    String eventName = JOptionPane.showInputDialog("Enter event name:");
                    if (eventName != null) {
                        addEvent(selectedDate, eventName);
                    }
                }
            }
        });

        viewEventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date selectedDate = getDateFromUserInput("View events for date (dd/MM/yyyy):");
                if (selectedDate != null) {
                    showEventsForDate(selectedDate);
                }
            }
        });
    }

    // Rest of your code for date handling, event management, and updateEventList remains unchanged.

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EventCalendar calendar = new EventCalendar();
            calendar.setVisible(true);
        });
    }
}
