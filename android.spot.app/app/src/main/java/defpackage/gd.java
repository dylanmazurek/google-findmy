package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v7.view.menu.ExpandedMenuView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gd implements AdapterView.OnItemClickListener, gt {
    Context a;
    public LayoutInflater b;
    gh c;
    public ExpandedMenuView d;
    public gs e;
    public gc f;

    public gd(Context context) {
        this.a = context;
        this.b = LayoutInflater.from(context);
    }

    @Override // defpackage.gt
    public final int a() {
        return 0;
    }

    @Override // defpackage.gt
    public final Parcelable bL() {
        if (this.d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // defpackage.gt
    public final void c(Context context, gh ghVar) {
        if (this.a != null) {
            this.a = context;
            if (this.b == null) {
                this.b = LayoutInflater.from(context);
            }
        }
        this.c = ghVar;
        gc gcVar = this.f;
        if (gcVar != null) {
            gcVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gt
    public final void d(gh ghVar, boolean z) {
        gs gsVar = this.e;
        if (gsVar != null) {
            gsVar.a(ghVar, z);
        }
    }

    @Override // defpackage.gt
    public final void e(gs gsVar) {
        throw null;
    }

    @Override // defpackage.gt
    public final void f(boolean z) {
        gc gcVar = this.f;
        if (gcVar != null) {
            gcVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gt
    public final boolean g() {
        return false;
    }

    @Override // defpackage.gt
    public final boolean h(ha haVar) {
        if (!haVar.hasVisibleItems()) {
            return false;
        }
        gi giVar = new gi(haVar);
        gh ghVar = giVar.a;
        cp cpVar = new cp(ghVar.a);
        giVar.c = new gd(cpVar.a());
        gd gdVar = giVar.c;
        gdVar.e = giVar;
        giVar.a.g(gdVar);
        ListAdapter k = giVar.c.k();
        cl clVar = cpVar.a;
        clVar.q = k;
        clVar.r = giVar;
        View view = ghVar.g;
        if (view != null) {
            clVar.f = view;
        } else {
            clVar.d = ghVar.f;
            cpVar.k(ghVar.e);
        }
        cpVar.a.o = giVar;
        giVar.b = cpVar.b();
        giVar.b.setOnDismissListener(giVar);
        WindowManager.LayoutParams attributes = giVar.b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        giVar.b.show();
        gs gsVar = this.e;
        if (gsVar != null) {
            gsVar.b(haVar);
            return true;
        }
        return true;
    }

    @Override // defpackage.gt
    public final boolean i(gj gjVar) {
        return false;
    }

    @Override // defpackage.gt
    public final boolean j(gj gjVar) {
        return false;
    }

    public final ListAdapter k() {
        if (this.f == null) {
            this.f = new gc(this);
        }
        return this.f;
    }

    @Override // defpackage.gt
    public final void n(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.c.A(this.f.getItem(i), this, 0);
    }
}
