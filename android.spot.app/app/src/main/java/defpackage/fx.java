package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fx implements gt {
    protected final Context a;
    public Context b;
    public gh c;
    public final LayoutInflater d;
    public gs e;
    public gv f;
    public int g;

    public fx(Context context) {
        this.a = context;
        this.d = LayoutInflater.from(context);
    }

    @Override // defpackage.gt
    public final int a() {
        return this.g;
    }

    public View b(gj gjVar, View view, ViewGroup viewGroup) {
        throw null;
    }

    @Override // defpackage.gt
    public void c(Context context, gh ghVar) {
        throw null;
    }

    @Override // defpackage.gt
    public void d(gh ghVar, boolean z) {
        throw null;
    }

    @Override // defpackage.gt
    public final void e(gs gsVar) {
        throw null;
    }

    @Override // defpackage.gt
    public void f(boolean z) {
        throw null;
    }

    @Override // defpackage.gt
    public boolean g() {
        throw null;
    }

    @Override // defpackage.gt
    public boolean h(ha haVar) {
        throw null;
    }

    @Override // defpackage.gt
    public final boolean i(gj gjVar) {
        return false;
    }

    @Override // defpackage.gt
    public final boolean j(gj gjVar) {
        return false;
    }
}
