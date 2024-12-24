package lab8;

import java.util.List;

/**
 * Головний клас для демонстрації роботи з реляційними таблицями
 * та обчислення прямого добутку між ними.
 */
public class Main {
    public static void main(String[] args) {
        // Створення першої таблиці
        RelationTable table1 = new RelationTable("Table1");
        table1.addColumn("ID");
        table1.addColumn("Name");
        table1.addRow(List.of("1", "Alice"));
        table1.addRow(List.of("2", "Bob"));

        // Створення другої таблиці
        RelationTable table2 = new RelationTable("Table2");
        table2.addColumn("Product");
        table2.addColumn("Price");
        table2.addRow(List.of("Laptop", "1000"));
        table2.addRow(List.of("Phone", "500"));

        // Створення прямого добутку
        CartesianProductBuilder builder = new CartesianProductBuilder(table1, table2);
        RelationTable resultTable = builder.build();

        // Вивід таблиць
        table1.printTable();
        table2.printTable();
        resultTable.printTable();
    }
}
