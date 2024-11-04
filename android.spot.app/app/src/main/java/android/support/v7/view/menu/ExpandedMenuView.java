package android.support.v7.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.gg;
import defpackage.gh;
import defpackage.gj;
import defpackage.gv;
import defpackage.ksr;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, gg, gv {
    private static final int[] a = {R.attr.background, R.attr.divider};
    private gh b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // defpackage.gv
    public final void a(gh ghVar) {
        this.b = ghVar;
    }

    @Override // defpackage.gg
    public final boolean b(gj gjVar) {
        throw null;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.b.z((gj) getAdapter().getItem(i), 0);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        ksr F = ksr.F(context, attributeSet, a, i, 0);
        if (F.A(0)) {
            setBackgroundDrawable(F.u(0));
        }
        if (F.A(1)) {
            setDivider(F.u(1));
        }
        F.y();
    }
}
