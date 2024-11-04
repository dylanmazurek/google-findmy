package defpackage;

import android.view.View;
import com.google.android.apps.adm.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjr implements hjp {
    private final gee a;
    private final apc b;

    public hjr(haw hawVar, gee geeVar) {
        this.a = geeVar;
        this.b = new apc((hjp) this, new hjq(this, geeVar), hawVar);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, haw] */
    @Override // defpackage.hjp
    public final void a(View view, int i) {
        ijs.c();
        apc apcVar = this.b;
        hjh hjhVar = new hjh(apcVar, view, i);
        view.addOnAttachStateChangeListener(hjhVar);
        apcVar.x(view, i, apcVar.b.a());
        int[] iArr = bwn.a;
        if (view.isAttachedToWindow()) {
            hjhVar.onViewAttachedToWindow(view);
        }
    }

    @Override // defpackage.hjp
    public final void b(View view, int i) {
        ijs.c();
        this.a.a().a(view, g(i));
    }

    @Override // defpackage.hjp
    public final void c(View view, int i) {
        ijs.c();
        gbw a = this.a.a();
        gbl g = g(i);
        if (gbv.b(view) == null) {
            a.a(view, g);
        }
    }

    @Override // defpackage.hjp
    public final void d(View view, int i, gbm gbmVar) {
        boolean z;
        int i2;
        ijs.c();
        gbw a = this.a.a();
        gbl g = g(i);
        gbo gboVar = g.a;
        boolean z2 = false;
        if (gboVar == null) {
            z = true;
        } else {
            z = false;
        }
        hwx.X(z, "CVE %s has already been built.", gboVar);
        juv juvVar = ((gbs) g.b.b).c;
        if (juvVar == null) {
            juvVar = juv.e;
        }
        if ((juvVar.a & 2048) != 0) {
            z2 = true;
        }
        hwx.U(!z2);
        if (!g.b.ao(gbmVar.b)) {
            ljj ljjVar = g.b;
            int f = gbmVar.b.f();
            if (!ljjVar.b.y()) {
                ljjVar.t();
            }
            gbs gbsVar = (gbs) ljjVar.b;
            ljr ljrVar = gbsVar.b;
            if (!ljrVar.c()) {
                gbsVar.b = ljn.n(ljrVar);
            }
            gbsVar.b.g(f);
        }
        g.b.ap(gbmVar.b, gbmVar.a);
        g.a(gbmVar.b.f());
        g.a(gbmVar.b.hashCode());
        ljn ljnVar = (ljn) gbmVar.a;
        if (ljnVar.y()) {
            i2 = ljnVar.i();
        } else {
            int i3 = ljnVar.y;
            if (i3 == 0) {
                i3 = ljnVar.i();
                ljnVar.y = i3;
            }
            i2 = i3;
        }
        g.a(i2);
        a.a(view, g);
    }

    @Override // defpackage.hjp
    public final void e(View view) {
        ijs.c();
        gbw a = this.a.a();
        ijs.c();
        gbo b = gbv.b(view);
        if (b == null) {
            ddg ddgVar = a.a;
            frx.p(new NullPointerException("Tried to unbind a view without an associated CVE. This indicates a GIL instrumentation error. Is `ViewVisualElements#unbind` being invoked unconditionally when `ViewVisualElements#bind` is invoked conditionally?"));
            return;
        }
        gbv gbvVar = b.b;
        if (gbvVar.h.B()) {
            gbvVar.a.removeOnAttachStateChangeListener(gbvVar);
            View view2 = gbvVar.a;
            int[] iArr = bwn.a;
            if (view2.isAttachedToWindow()) {
                gbvVar.onViewDetachedFromWindow(gbvVar.a);
            }
        }
        gbvVar.e = null;
        gbvVar.a.setTag(R.id.ve_tag, null);
        hwx.U(!b.b.c);
        b.b = null;
    }

    @Override // defpackage.hjp
    public final void f(bym bymVar, View view) {
        fzo b = this.a.b();
        gbp gbpVar = (gbp) view.getTag(R.id.interaction_info_tag);
        if (gbpVar != null) {
            bymVar.o(gbpVar);
            view.setTag(R.id.interaction_info_tag, null);
        }
        final gbq gbqVar = new gbq((gbr) ((ljh) bymVar.a).q());
        final gbo b2 = gbv.b(view);
        ((gch) b).c.b(new gbc() { // from class: gcg
            /* JADX WARN: Type inference failed for: r4v7, types: [java.util.Set, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set, java.lang.Object] */
            @Override // defpackage.gbc
            public final List a() {
                boolean z;
                gbo gboVar = b2;
                juw a = gax.a();
                boolean z2 = false;
                if (gboVar != null) {
                    z = true;
                } else {
                    z = false;
                }
                hwx.V(z, "View is not instrumented.");
                ddg ddgVar = gboVar.f;
                if (!ddgVar.a.isEmpty()) {
                    for (njz njzVar : ddgVar.a) {
                        ijs.c();
                        gcc gccVar = (gcc) njzVar.a;
                        if (gccVar.c) {
                            ijs.f(gccVar.f);
                            new gcb(njzVar.a, 2).run();
                        } else {
                            Runnable runnable = gccVar.f;
                            if (runnable != null) {
                                ijs.f(runnable);
                                new gcb(njzVar.a, 3).run();
                            }
                        }
                    }
                }
                hwx.Y(gboVar.c(), "VE is not impressed: %s {attached=%s}", gboVar, Boolean.valueOf(gboVar.b.c));
                if (!gch.b) {
                    if (gboVar.d() == 1) {
                        z2 = true;
                    }
                    hwx.X(z2, "VE is not visible: %s", gboVar);
                }
                gbq gbqVar2 = gbq.this;
                ArrayList arrayList = new ArrayList();
                frx.y(gboVar, arrayList);
                return jis.q(new gcq(a, arrayList, gbqVar2, fzo.c()));
            }
        });
    }

    public final gbl g(int i) {
        gok c = this.a.c();
        ljh k = juv.e.k();
        if (!k.b.y()) {
            k.t();
        }
        juv juvVar = (juv) k.b;
        juvVar.a |= 8;
        juvVar.c = i;
        bym bymVar = new bym(k);
        Object obj = c.a;
        return new gbl(bymVar);
    }
}
