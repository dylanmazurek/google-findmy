package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhd implements ComponentCallbacks2, drk {
    private static final dsn e;
    protected final dgo a;
    protected final Context b;
    public final drj c;
    public final CopyOnWriteArrayList d;
    private final drq f;
    private final drp g;
    private final dsa h;
    private final Runnable i;
    private final drd j;
    private dsn k;

    static {
        dsn a = dsn.a(Bitmap.class);
        a.A();
        e = a;
        dsn.a(dqo.class).A();
    }

    public dhd(dgo dgoVar, drj drjVar, drp drpVar, Context context) {
        drd drnVar;
        drq drqVar = new drq();
        bqc bqcVar = dgoVar.e;
        this.h = new dsa();
        col colVar = new col(this, 8);
        this.i = colVar;
        this.a = dgoVar;
        this.c = drjVar;
        this.g = drpVar;
        this.f = drqVar;
        this.b = context;
        Context applicationContext = context.getApplicationContext();
        dhc dhcVar = new dhc(this, drqVar);
        if (bqx.b(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            drnVar = new dre(applicationContext, dhcVar);
        } else {
            drnVar = new drn();
        }
        this.j = drnVar;
        synchronized (dgoVar.c) {
            if (!dgoVar.c.contains(this)) {
                dgoVar.c.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
        if (dtq.i()) {
            dtq.h(colVar);
        } else {
            drjVar.a(this);
        }
        drjVar.a(drnVar);
        this.d = new CopyOnWriteArrayList(dgoVar.b.b);
        m(dgoVar.b.b());
    }

    public final dhb a(Class cls) {
        return new dhb(this.a, this, cls);
    }

    public final dhb b() {
        return a(Bitmap.class).f(e);
    }

    public final dhb c() {
        return a(Drawable.class);
    }

    public final dhb d(Object obj) {
        return c().e(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dsn e() {
        return this.k;
    }

    public final void f(View view) {
        g(new dst(view));
    }

    public final void g(dsw dswVar) {
        if (dswVar != null) {
            boolean o = o(dswVar);
            dsi c = dswVar.c();
            if (!o) {
                dgo dgoVar = this.a;
                synchronized (dgoVar.c) {
                    Iterator it = dgoVar.c.iterator();
                    while (it.hasNext()) {
                        if (((dhd) it.next()).o(dswVar)) {
                            return;
                        }
                    }
                    if (c != null) {
                        dswVar.d(null);
                        c.c();
                    }
                }
            }
        }
    }

    @Override // defpackage.drk
    public final synchronized void h() {
        this.h.h();
        Iterator it = dtq.f(this.h.a).iterator();
        while (it.hasNext()) {
            g((dsw) it.next());
        }
        this.h.a.clear();
        drq drqVar = this.f;
        Iterator it2 = dtq.f(drqVar.a).iterator();
        while (it2.hasNext()) {
            drqVar.a((dsi) it2.next());
        }
        drqVar.b.clear();
        this.c.b(this);
        this.c.b(this.j);
        dtq.e().removeCallbacks(this.i);
        dgo dgoVar = this.a;
        synchronized (dgoVar.c) {
            if (dgoVar.c.contains(this)) {
                dgoVar.c.remove(this);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    @Override // defpackage.drk
    public final synchronized void i() {
        l();
        this.h.i();
    }

    @Override // defpackage.drk
    public final synchronized void j() {
        k();
        this.h.j();
    }

    public final synchronized void k() {
        drq drqVar = this.f;
        drqVar.c = true;
        for (dsi dsiVar : dtq.f(drqVar.a)) {
            if (dsiVar.n()) {
                dsiVar.f();
                drqVar.b.add(dsiVar);
            }
        }
    }

    public final synchronized void l() {
        drq drqVar = this.f;
        drqVar.c = false;
        for (dsi dsiVar : dtq.f(drqVar.a)) {
            if (!dsiVar.l() && !dsiVar.n()) {
                dsiVar.b();
            }
        }
        drqVar.b.clear();
    }

    protected final synchronized void m(dsn dsnVar) {
        dsn dsnVar2 = (dsn) dsnVar.clone();
        dsnVar2.D();
        this.k = dsnVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void n(dsw dswVar, dsi dsiVar) {
        this.h.a.add(dswVar);
        drq drqVar = this.f;
        drqVar.a.add(dsiVar);
        if (!drqVar.c) {
            dsiVar.b();
        } else {
            dsiVar.c();
            drqVar.b.add(dsiVar);
        }
    }

    final synchronized boolean o(dsw dswVar) {
        dsi c = dswVar.c();
        if (c == null) {
            return true;
        }
        if (this.f.a(c)) {
            this.h.a.remove(dswVar);
            dswVar.d(null);
            return true;
        }
        return false;
    }

    public final synchronized String toString() {
        drp drpVar;
        drq drqVar;
        drpVar = this.g;
        drqVar = this.f;
        return super.toString() + "{tracker=" + String.valueOf(drqVar) + ", treeNode=" + String.valueOf(drpVar) + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
