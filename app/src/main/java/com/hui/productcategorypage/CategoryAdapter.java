package com.hui.productcategorypage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuhui2 on 2017/1/6.
 */

public class CategoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private Context mContext;
    private List<Category> list = new ArrayList<>();
    private LayoutInflater inflater;

    public CategoryAdapter(Context mContext,List<Category> list){
        this.mContext = mContext;
        this.list = list;
        inflater = LayoutInflater.from(mContext);
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        if (viewType == Category.SECOND_TYPE){
            return new SecondCategoryViewHolder(inflater.inflate(R.layout.item_category_second,parent,false));
        }else {
            return new ThirdCategoryViewHolder(inflater.inflate(R.layout.item_category_third,parent,false));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (getItemViewType(position)){
            case Category.SECOND_TYPE:
                SecondCategoryViewHolder secondCategoryViewHolder = (SecondCategoryViewHolder) holder;
                secondCategoryViewHolder.categorySecondTv.setText(list.get(position).getCategoryName());
                break;
            case Category.THIRD_TYPE:
                ThirdCategoryViewHolder thirdCategoryViewHolder = (ThirdCategoryViewHolder) holder;
                thirdCategoryViewHolder.categoryThirdTv.setText(list.get(position).getCategoryName());
                break;
        }
    }

    @Override
    public int getItemCount() {
        if (list!=null){
            return list.size();
        }else {
            return 0;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return list.get(position).getType();
    }
}
