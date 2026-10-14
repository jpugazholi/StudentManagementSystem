package studentmanagementsystem;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class StudentManagement extends JFrame {

    private final JTextField idField = new JTextField();
    private final JTextField nameField = new JTextField();
    private final JTextField deptField = new JTextField();
    private final JTextField yearField = new JTextField();
    private final JTextField searchField = new JTextField(12);

    private final DefaultTableModel model =
            new DefaultTableModel(
                    new String[]{"ID", "Name", "Department", "Year"}, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

    private final JTable table = new JTable(model);
    private final ArrayList<Student> students = new ArrayList<>();

    public StudentManagement() {
        setTitle("Student Management System");
        setSize(850, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel form = new JPanel(new GridLayout(4, 2, 8, 8));
        form.setBorder(BorderFactory.createTitledBorder("Student Details"));

        form.add(new JLabel("Student ID:"));
        form.add(idField);
        form.add(new JLabel("Student Name:"));
        form.add(nameField);
        form.add(new JLabel("Department:"));
        form.add(deptField);
        form.add(new JLabel("Year:"));
        form.add(yearField);

        JButton addButton = new JButton("Add Student");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        JButton clearButton = new JButton("Clear");
        JButton searchButton = new JButton("Search ID");
        JButton showAllButton = new JButton("Show All");

        JPanel buttons = new JPanel(new FlowLayout());
        buttons.add(addButton);
        buttons.add(updateButton);
        buttons.add(deleteButton);
        buttons.add(clearButton);

        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        searchPanel.add(new JLabel("Search Student ID:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        searchPanel.add(showAllButton);

        JPanel top = new JPanel(new BorderLayout(5, 5));
        top.add(form, BorderLayout.CENTER);
        top.add(buttons, BorderLayout.SOUTH);

        add(top, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(searchPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> addStudent());
        updateButton.addActionListener(e -> updateStudent());
        deleteButton.addActionListener(e -> deleteStudent());
        clearButton.addActionListener(e -> clearFields());
        searchButton.addActionListener(e -> searchStudent());
        showAllButton.addActionListener(e -> refreshTable());

        table.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()
                    && table.getSelectedRow() != -1) {
                int row = table.getSelectedRow();
                idField.setText(model.getValueAt(row, 0).toString());
                nameField.setText(model.getValueAt(row, 1).toString());
                deptField.setText(model.getValueAt(row, 2).toString());
                yearField.setText(model.getValueAt(row, 3).toString());
            }
        });
    }

    private void addStudent() {
        String id = idField.getText().trim();
        String name = nameField.getText().trim();
        String dept = deptField.getText().trim();
        String year = yearField.getText().trim();

        if (id.isEmpty() || name.isEmpty()
                || dept.isEmpty() || year.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please fill in all fields.");
            return;
        }

        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                JOptionPane.showMessageDialog(this,
                        "Student ID already exists.");
                return;
            }
        }

        students.add(new Student(id, name, dept, year));
        refreshTable();
        clearFields();

        JOptionPane.showMessageDialog(this,
                "Student added successfully!");
    }

    private void updateStudent() {
        String id = idField.getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Select a student or enter the Student ID.");
            return;
        }

        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                String name = nameField.getText().trim();
                String dept = deptField.getText().trim();
                String year = yearField.getText().trim();

                if (name.isEmpty() || dept.isEmpty() || year.isEmpty()) {
                    JOptionPane.showMessageDialog(this,
                            "Please fill in all fields.");
                    return;
                }

                s.setName(name);
                s.setDepartment(dept);
                s.setYear(year);

                refreshTable();
                clearFields();
                JOptionPane.showMessageDialog(this,
                        "Student updated successfully!");
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Student ID not found.");
    }

    private void deleteStudent() {
        String id = idField.getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Select a student or enter the Student ID.");
            return;
        }

        for (Student s : students) {
            if (s.getId().equalsIgnoreCase(id)) {
                int choice = JOptionPane.showConfirmDialog(
                        this,
                        "Delete student " + s.getName() + "?",
                        "Confirm Delete",
                        JOptionPane.YES_NO_OPTION);

                if (choice == JOptionPane.YES_OPTION) {
                    students.remove(s);
                    refreshTable();
                    clearFields();
                    JOptionPane.showMessageDialog(this,
                            "Student deleted successfully!");
                }
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Student ID not found.");
    }

    private void searchStudent() {
        String id = searchField.getText().trim();

        if (id.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Enter a Student ID to search.");
            return;
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            if (model.getValueAt(i, 0).toString()
                    .equalsIgnoreCase(id)) {
                table.setRowSelectionInterval(i, i);
                table.scrollRectToVisible(
                        table.getCellRect(i, 0, true));
                return;
            }
        }

        JOptionPane.showMessageDialog(this, "Student ID not found.");
    }

    private void refreshTable() {
        model.setRowCount(0);

        for (Student s : students) {
            model.addRow(new Object[]{
                s.getId(),
                s.getName(),
                s.getDepartment(),
                s.getYear()
            });
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        deptField.setText("");
        yearField.setText("");
        table.clearSelection();
    }

 public static void main(String[] args) {
    JOptionPane.showMessageDialog(
        null,
        "GUI is working!"
    );

    SwingUtilities.invokeLater(() -> {
        new StudentManagement().setVisible(true);
    });
}
}