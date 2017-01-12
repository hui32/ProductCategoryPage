package com.hui.productcategorypage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycleView;
    List<Category> lists = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        recycleView = (RecyclerView) findViewById(R.id.recyclerview);
        final CategoryAdapter mAdapter = new CategoryAdapter(this,lists);
        GridLayoutManager mLayoutManager = new GridLayoutManager(this,3);

        mLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int position) {
                switch (mAdapter.getItemViewType(position)){
                    case Category.SECOND_TYPE:
                        return 3;
                    case Category.THIRD_TYPE:
                        return 1;
                    default:
                        return 1;
                }
            }
        });
        recycleView.setLayoutManager(mLayoutManager);
        recycleView.setAdapter(mAdapter);

    }

    private void initData() {
        lists.add(new Category("饼干", 0));
        lists.add(new Category("奶油饼干", 1));
        lists.add(new Category("威化", 1));
        lists.add(new Category("曲奇", 1));
        lists.add(new Category("传统糕点", 0));
        lists.add(new Category("凤梨酥", 1));
        lists.add(new Category("杏仁饼", 1));
        lists.add(new Category("烧饼", 1));
        lists.add(new Category("花生酥", 1));
        lists.add(new Category("西式糕点", 0));
        lists.add(new Category("巧克力派", 1));
        lists.add(new Category("酥心卷", 1));
        lists.add(new Category("面包", 1));
        lists.add(new Category("泡芙", 1));
        lists.add(new Category("蛋挞", 1));
    }
}
