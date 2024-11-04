package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.adm.R;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public abstract class dsy extends dsq {
    protected final View a;
    public final fql b;

    public dsy(View view) {
        bsc.q(view);
        this.a = view;
        this.b = new fql(view);
    }

    @Override // defpackage.dsq, defpackage.dsw
    public final dsi c() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof dsi) {
                return (dsi) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.dsq, defpackage.dsw
    public final void d(dsi dsiVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, dsiVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    @Override // defpackage.dsw
    public final void e(dso dsoVar) {
        fql fqlVar = this.b;
        int e = fqlVar.e();
        int d = fqlVar.d();
        if (fql.g(e, d)) {
            dsoVar.e(e, d);
            return;
        }
        if (!fqlVar.a.contains(dsoVar)) {
            fqlVar.a.add(dsoVar);
        }
        if (fqlVar.b == null) {
            ViewTreeObserver viewTreeObserver = ((View) fqlVar.c).getViewTreeObserver();
            fqlVar.b = new dsx(fqlVar, 0);
            viewTreeObserver.addOnPreDrawListener(fqlVar.b);
        }
    }

    @Override // defpackage.dsw
    public final void f(dso dsoVar) {
        this.b.a.remove(dsoVar);
    }

    public final String toString() {
        return "Target for: ".concat(this.a.toString());
    }
}
