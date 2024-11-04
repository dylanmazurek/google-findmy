package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hkx implements hjy {
    public static final /* synthetic */ int b = 0;
    private static final fxf k;
    private final Context c;
    private final fva d;
    private final Executor e;
    private final hjt f;
    private final fgp g;
    private final fhq i;
    private final fhq j;
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    private final fuz h = new fuz() { // from class: hkw
        @Override // defpackage.fuz
        public final void a() {
            Iterator it = hkx.this.a.iterator();
            while (it.hasNext()) {
                ((njz) it.next()).n();
            }
        }
    };

    static {
        fxf fxfVar = new fxf((char[]) null);
        fxfVar.a = 1;
        k = fxfVar;
    }

    public hkx(Context context, fhq fhqVar, fva fvaVar, fhq fhqVar2, hjt hjtVar, Executor executor, fgp fgpVar) {
        this.c = context;
        this.i = fhqVar;
        this.d = fvaVar;
        this.j = fhqVar2;
        this.e = executor;
        this.f = hjtVar;
        this.g = fgpVar;
    }

    public static Object g(jyz jyzVar, String str) {
        try {
            return ivc.M(jyzVar);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (!(cause instanceof fhc) && !(cause instanceof fhb)) {
                Log.e("OneGoogle", "Failed to load ".concat(str), e);
                return null;
            }
            throw e;
        }
    }

    private final jyz h(int i) {
        if (fhd.g(i)) {
            return ivc.D(new fhc("Google Play Services not available", this.g.h(this.c, i, null)));
        }
        return ivc.D(new fhb());
    }

    @Override // defpackage.hjy
    public final jyz a() {
        return b();
    }

    @Override // defpackage.hjy
    public final jyz b() {
        jyz z;
        fgp fgpVar = this.g;
        Context context = this.c;
        jyz a = this.f.a();
        int g = fgpVar.g(context, 10000000);
        if (g != 0) {
            z = h(g);
        } else {
            fhq fhqVar = this.i;
            fxf fxfVar = k;
            fht fhtVar = fhqVar.h;
            fwc fwcVar = new fwc(fhtVar, fxfVar);
            fhtVar.a(fwcVar);
            z = hog.z(fwcVar, jbn.a(new hkn(5)), jxv.a);
        }
        hjt hjtVar = this.f;
        jyz m = iuu.m(new csf(hjtVar, 9), ((hju) hjtVar).c);
        return iuu.E(a, z, m).f(new cye(a, m, z, 3), jxv.a);
    }

    @Override // defpackage.hjy
    public final jyz c(String str, int i) {
        return d(str, i);
    }

    @Override // defpackage.hjy
    public final jyz d(String str, int i) {
        int g = this.g.g(this.c, 10400000);
        if (g != 0) {
            return h(g);
        }
        fhq fhqVar = this.j;
        int E = hog.E(i);
        fht fhtVar = fhqVar.h;
        fwe fweVar = new fwe(fhtVar, str, E);
        fhtVar.a(fweVar);
        return hog.z(fweVar, new hkn(4), this.e);
    }

    @Override // defpackage.hjy
    public final void e(njz njzVar) {
        if (this.a.isEmpty()) {
            fva fvaVar = this.d;
            fjo d = fvaVar.d(this.h, fuz.class.getName());
            fvu fvuVar = new fvu(d);
            fsw fswVar = new fsw(fvuVar, 6);
            fsw fswVar2 = new fsw(fvuVar, 7);
            fjt fjtVar = new fjt();
            fjtVar.a = fswVar;
            fjtVar.b = fswVar2;
            fjtVar.c = d;
            fjtVar.f = 2720;
            fvaVar.p(fjtVar.a());
        }
        this.a.add(njzVar);
    }

    @Override // defpackage.hjy
    public final void f(njz njzVar) {
        this.a.remove(njzVar);
        if (this.a.isEmpty()) {
            this.d.g(fma.aX(this.h, fuz.class.getName()), 2721);
        }
    }
}
