package com.example.flexiblestickyheaders;

import android.view.View;
import android.widget.TextView;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractSectionableItem;
import eu.davidea.flexibleadapter.items.IFlexible;
import eu.davidea.viewholders.FlexibleViewHolder;

public class FlexItem extends AbstractSectionableItem<FlexItem.FlexItemCouponVH, FlexHeader> {

    private SimpleClass simpleCLass;

    FlexItem(FlexHeader header, SimpleClass simpleCLass) {
        super(header);
        this.simpleCLass = simpleCLass;
    }

    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.item;
    }

    @Override
    public FlexItemCouponVH createViewHolder(View view, FlexibleAdapter<IFlexible> adapter) {
        return new FlexItemCouponVH(view, adapter);
    }

    @Override
    public void bindViewHolder(FlexibleAdapter<IFlexible> adapter, FlexItemCouponVH holder, int position, List<Object> payloads) {
        holder.tvTitle.setText(String.format("Item-%d", simpleCLass.getNumber()));
    }


    static class FlexItemCouponVH extends FlexibleViewHolder {
        TextView tvTitle;

        FlexItemCouponVH(View view, FlexibleAdapter adapter) {
            super(view, adapter);
            tvTitle = view.findViewById(R.id.tv_title);
        }
    }
}
