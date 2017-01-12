package com.hui.productcategorypage;

/**
 * Created by liuhui2 on 2017/1/6.
 */

public class Category {
    public static final int SECOND_TYPE = 0;
    public static final int THIRD_TYPE = 1;

    private String categoryName;
    private int type;

    public Category(String name, int type) {
        this.categoryName = name;
        this.type = type;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public int getType() {
        return type;
    }
}
