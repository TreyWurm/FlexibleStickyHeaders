package com.example.flexiblestickyheaders;

import android.view.View;

import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.items.AbstractHeaderItem;
import eu.davidea.viewholders.FlexibleViewHolder;

public class FlexHeader extends AbstractHeaderItem<FlexHeader.FlexItemFilterVH> {
    @Override
    public boolean equals(Object o) {
        return this == o;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.header;
    }

    @Override
    public void bindViewHolder(FlexibleAdapter adapter, FlexItemFilterVH holder, int position, List payloads) {
    }

    @Override
    public FlexItemFilterVH createViewHolder(View view, FlexibleAdapter adapter) {
        return new FlexItemFilterVH(view, adapter, true);
    }

    public static class FlexItemFilterVH extends FlexibleViewHolder {
        FlexItemFilterVH(View view, FlexibleAdapter adapter, boolean stickyHeader) {
            super(view, adapter, stickyHeader);
        }
    }
}
