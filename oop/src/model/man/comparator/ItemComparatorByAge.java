package model.man.comparator;

import model.family_tree.FamilyTreeItem;

import java.util.Comparator;

public class ItemComparatorByAge <E extends FamilyTreeItem> implements Comparator <E> {
    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(o1.getAge(),o2.getAge());
    }
}
