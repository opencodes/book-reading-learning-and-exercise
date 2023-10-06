package com.rkjha.designpattern.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class RunCode {
    public static void main(String[] args) {
        List<RowItem> rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < 10; i++) {
            rowItems.add(new RowItem("1", "Title - " + i, "Description 1"));
        }
        TableData tableData = new TableData(rowItems);
        while (tableData.hasNext()) {
            RowItem rowItem = tableData.next();
            System.out.println(rowItem.title);
        }
    }
}
