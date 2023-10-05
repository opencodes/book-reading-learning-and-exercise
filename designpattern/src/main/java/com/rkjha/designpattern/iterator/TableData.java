package com.rkjha.designpattern.iterator;

import java.util.List;

public class TableData implements Iterator {
    private final List<RowItem> items;
    private int index = 0;

    public TableData(List<RowItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return index < items.size();
    }

    @Override
    public RowItem next() {
        index++;
        return this.items.get(index - 1);
    }
}
