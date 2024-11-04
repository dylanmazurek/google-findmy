package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gfn implements gft, gfu {
    public final Map a = new LinkedHashMap();
    public final Object b = new Object();
    public final Context c;
    public final hjq d;
    public final gok e;
    public final apc f;
    public final ddg g;
    private final gok h;

    public gfn(gok gokVar, Context context, gok gokVar2, ddg ddgVar, apc apcVar, hjq hjqVar) {
        this.h = gokVar;
        this.c = context;
        this.e = gokVar2;
        this.g = ddgVar;
        this.f = apcVar;
        this.d = hjqVar;
    }

    public static boolean h(gfs gfsVar) {
        gfr gfrVar = gfsVar.b;
        if (gfrVar == null) {
            gfrVar = gfr.g;
        }
        if (!gfrVar.equals(gfr.g)) {
            return true;
        }
        return false;
    }

    public static boolean i(gfs gfsVar) {
        if (!gfs.c.equals(gfsVar)) {
            return true;
        }
        return false;
    }

    public static boolean j(gfs gfsVar, gfj gfjVar) {
        kxq kxqVar = gfsVar.a;
        if (kxqVar == null) {
            kxqVar = kxq.b;
        }
        jad f = fzo.f(kxqVar);
        if (f == null) {
            return false;
        }
        if (!gfjVar.a && f.d) {
            return false;
        }
        return true;
    }

    public final jer a() {
        this.h.i();
        return jdl.a;
    }

    public final jyz b(gfj gfjVar, int i) {
        return iuu.p(c(), new gfm(this, gfjVar, i, 0), jxv.a);
    }

    public final jyz c() {
        return iuu.p(this.h.i(), new eji(this, 14), jxv.a);
    }

    public final jyz d() {
        return jbx.d(this.g.x()).b(IOException.class, new eji(this, 11), jxv.a);
    }

    public final void e(gfi gfiVar, Executor executor) {
        executor.getClass();
        synchronized (this.b) {
            this.a.put(gfiVar, executor);
        }
    }

    @Override // defpackage.gft
    public final void f() {
        jiy i;
        synchronized (this.b) {
            i = jiy.i(this.a);
        }
        jmw listIterator = i.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            Executor executor = (Executor) entry.getValue();
            gfi gfiVar = (gfi) entry.getKey();
            gfiVar.getClass();
            executor.execute(jbn.f(new gcb(gfiVar, 5)));
        }
    }

    @Override // defpackage.gfu
    public final void g() {
        jiy i;
        synchronized (this.b) {
            i = jiy.i(this.a);
        }
        jmw listIterator = i.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            Executor executor = (Executor) entry.getValue();
            gfi gfiVar = (gfi) entry.getKey();
            gfiVar.getClass();
            executor.execute(jbn.f(new gcb(gfiVar, 4)));
        }
    }
}
