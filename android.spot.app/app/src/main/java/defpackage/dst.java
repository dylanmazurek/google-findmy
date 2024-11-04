package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dst implements dsw {
    protected final View a;
    private final ksr b;

    public dst(View view) {
        bsc.q(view);
        this.a = view;
        this.b = new ksr(view);
    }

    @Override // defpackage.dsw
    public final dsi c() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof dsi) {
                return (dsi) tag;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.dsw
    public final void d(dsi dsiVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, dsiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.dsw
    public final void e(dso dsoVar) {
        ksr ksrVar = this.b;
        int j = ksrVar.j();
        int i = ksrVar.i();
        if (ksr.l(j, i)) {
            dsoVar.e(j, i);
            return;
        }
        if (!ksrVar.b.contains(dsoVar)) {
            ksrVar.b.add(dsoVar);
        }
        if (ksrVar.c == null) {
            ViewTreeObserver viewTreeObserver = ((View) ksrVar.a).getViewTreeObserver();
            ksrVar.c = new dsx(ksrVar, 1);
            viewTreeObserver.addOnPreDrawListener(ksrVar.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.dsw
    public final void f(dso dsoVar) {
        this.b.b.remove(dsoVar);
    }

    @Override // defpackage.dsw
    public final void k() {
        this.b.k();
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }

    @Override // defpackage.drk
    public final void h() {
    }

    @Override // defpackage.drk
    public final void i() {
    }

    @Override // defpackage.drk
    public final void j() {
    }

    @Override // defpackage.dsw
    public final void l() {
    }

    @Override // defpackage.dsw
    public final void m() {
    }

    @Override // defpackage.dsw
    public final void g(Object obj) {
    }
}
