package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.adm.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gc extends BaseAdapter {
    final /* synthetic */ gd a;
    private int b = -1;

    public gc(gd gdVar) {
        this.a = gdVar;
        b();
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final gj getItem(int i) {
        ArrayList e = this.a.c.e();
        int i2 = this.b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (gj) e.get(i);
    }

    final void b() {
        gh ghVar = this.a.c;
        gj gjVar = ghVar.j;
        if (gjVar != null) {
            ArrayList e = ghVar.e();
            int size = e.size();
            for (int i = 0; i < size; i++) {
                if (((gj) e.get(i)) == gjVar) {
                    this.b = i;
                    return;
                }
            }
        }
        this.b = -1;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        int size = this.a.c.e().size();
        if (this.b < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((gu) view).f(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
