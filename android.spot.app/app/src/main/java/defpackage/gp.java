package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gp implements AdapterView.OnItemClickListener, gx, gt {
    public Rect g;

    public static int A(ListAdapter listAdapter, Context context, int i) {
        int i2;
        int i3 = 0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i4 = 0;
        int i5 = 0;
        while (i3 < count) {
            int itemViewType = listAdapter.getItemViewType(i3);
            if (itemViewType != i5) {
                i2 = itemViewType;
            } else {
                i2 = i5;
            }
            if (itemViewType != i5) {
                view = null;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i3, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i4) {
                i4 = measuredWidth;
            }
            i3++;
            i5 = i2;
        }
        return i4;
    }

    public static ge y(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (ge) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (ge) listAdapter;
    }

    public static boolean z(gh ghVar) {
        int size = ghVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = ghVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gt
    public final int a() {
        return 0;
    }

    @Override // defpackage.gt
    public final boolean i(gj gjVar) {
        return false;
    }

    @Override // defpackage.gt
    public final boolean j(gj gjVar) {
        return false;
    }

    public abstract void l(gh ghVar);

    public abstract void o(View view);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        int i2;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        gh ghVar = y(listAdapter).a;
        MenuItem menuItem = (MenuItem) listAdapter.getItem(i);
        if (true != w()) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        ghVar.A(menuItem, this, i2);
    }

    public abstract void p(boolean z);

    public abstract void q(int i);

    public abstract void r(int i);

    public abstract void s(PopupWindow.OnDismissListener onDismissListener);

    public abstract void t(boolean z);

    public abstract void u(int i);

    protected boolean w() {
        return true;
    }

    @Override // defpackage.gt
    public final void c(Context context, gh ghVar) {
    }
}
