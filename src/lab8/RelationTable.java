package lab8;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для представлення реляційної таблиці.
 */
public class RelationTable {
    private String name;
    private List<String> columns;
    private List<List<String>> rows;

    /**
     * Конструктор для створення нової таблиці.
     *
     * @param name назва таблиці
     */
    public RelationTable(String name) {
        this.name = name;
        this.columns = new ArrayList<>();
        this.rows = new ArrayList<>();
    }

    /**
     * Додає новий стовпець до таблиці.
     *
     * @param column назва стовпця
     */
    public void addColumn(String column) {
        columns.add(column);
    }

    /**
     * Додає новий рядок до таблиці.
     *
     * @param row значення рядка у вигляді списку
     * @throws IllegalArgumentException якщо кількість значень у рядку не відповідає кількості стовпців
     */
    public void addRow(List<String> row) {
        if (row.size() != columns.size()) {
            throw new IllegalArgumentException("Кількість значень в рядку не відповідає кількості стовпців.");
        }
        rows.add(row);
    }

    /**
     * Повертає назву таблиці.
     *
     * @return назва таблиці
     */
    public String getName() {
        return name;
    }

    /**
     * Повертає список назв стовпців таблиці.
     *
     * @return список назв стовпців
     */
    public List<String> getColumns() {
        return columns;
    }

    /**
     * Повертає список рядків таблиці.
     *
     * @return список рядків
     */
    public List<List<String>> getRows() {
        return rows;
    }

    /**
     * Виводить таблицю у консоль.
     */
    public void printTable() {
        System.out.println("Таблиця: " + name);
        System.out.println(String.join("\t", columns));
        for (List<String> row : rows) {
            System.out.println(String.join("\t", row));
        }
    }
}
