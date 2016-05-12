package com.example.toolbar;

/**
 * Created by bear on 2016/5/12.
 */
public class MenuItem {
    public MenuItem(String text, boolean isSelected, int icon, int iconSelected) {
        this.text = text;
        this.isSelected = isSelected;
        this.icon = icon;
        this.iconSelected = iconSelected;
    }

    boolean isSelected;
    String text;
    int icon;
    int iconSelected;
}
