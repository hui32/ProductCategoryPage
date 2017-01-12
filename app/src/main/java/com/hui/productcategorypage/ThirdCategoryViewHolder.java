package com.hui.productcategorypage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by liuhui2 on 2017/1/6.
 */

public class ThirdCategoryViewHolder extends RecyclerView.ViewHolder{
    public TextView categoryThirdTv;
    public ThirdCategoryViewHolder(View itemView) {
        super(itemView);
        categoryThirdTv = (TextView) itemView.findViewById(R.id.tv_third_categoryname);
    }
}
