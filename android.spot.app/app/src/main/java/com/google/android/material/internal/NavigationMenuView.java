package com.google.android.material.internal;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import defpackage.gh;
import defpackage.gv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements gv {
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        V(new LinearLayoutManager());
    }

    @Override // defpackage.gv
    public final void a(gh ghVar) {
    }
}
