package lab8;

import java.util.ArrayList;
import java.util.List;

/**
 * Клас для створення прямого добутку двох реляційних таблиць.
 */
public class CartesianProductBuilder {
    private RelationTable table1;
    private RelationTable table2;

    /**
     * Конструктор для ініціалізації будівника прямого добутку.
     *
     * @param table1 перша таблиця
     * @param table2 друга таблиця
     */
    public CartesianProductBuilder(RelationTable table1, RelationTable table2) {
        this.table1 = table1;
        this.table2 = table2;
    }

    /**
     * Створює таблицю, яка є результатом прямого добутку двох таблиць.
     *
     * @return таблиця результату
     */
    public RelationTable build() {
        RelationTable resultTable = new RelationTable("Прямий добуток");

        // Об'єднання стовпців
        resultTable.getColumns().addAll(table1.getColumns());
        resultTable.getColumns().addAll(table2.getColumns());

        // Обчислення рядків
        for (List<String> row1 : table1.getRows()) {
            for (List<String> row2 : table2.getRows()) {
                List<String> newRow = new ArrayList<>(row1);
                newRow.addAll(row2);
                resultTable.addRow(newRow);
            }
        }

        return resultTable;
    }
}