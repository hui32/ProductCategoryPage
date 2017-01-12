package com.hui.productcategorypage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by liuhui2 on 2017/1/6.
 */

public class SecondCategoryViewHolder extends RecyclerView.ViewHolder{

    public TextView categorySecondTv;
    public SecondCategoryViewHolder(View itemView) {
        super(itemView);
        categorySecondTv = (TextView) itemView.findViewById(R.id.tv_second_categoryname);
    }
}
