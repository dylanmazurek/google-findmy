package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class axm {
    public final axn a;
    public boolean c;
    public boolean d;
    public boolean e;
    private axn g;
    public boolean b = true;
    public final Map f = new HashMap();

    public axm(axn axnVar) {
        this.a = axnVar;
    }

    public abstract int a(azq azqVar, avc avcVar);

    protected abstract long b(azq azqVar, long j);

    public abstract Map c(azq azqVar);

    public final void d(avc avcVar, int i, azq azqVar) {
        float b;
        float f = i;
        long k = a.k(f, f);
        while (true) {
            k = b(azqVar, k);
            azqVar = azqVar.u;
            azqVar.getClass();
            if (amr.i(azqVar, this.a.d())) {
                break;
            } else if (c(azqVar).containsKey(avcVar)) {
                float a = a(azqVar, avcVar);
                k = a.k(a, a);
            }
        }
        if (avcVar instanceof avp) {
            b = aqk.c(k);
        } else {
            b = aqk.b(k);
        }
        Map map = this.f;
        int round = Math.round(b);
        if (map.containsKey(avcVar)) {
            round = ((Number) avcVar.a.a(Integer.valueOf(((Number) mkm.G(this.f, avcVar)).intValue()), Integer.valueOf(round))).intValue();
        }
        map.put(avcVar, Integer.valueOf(round));
    }

    public final void e() {
        this.b = true;
        axn axnVar = this.a;
        axn b = axnVar.b();
        if (b == null) {
            return;
        }
        if (this.d) {
            axnVar.h();
        }
        if (this.e) {
            this.a.g();
        }
        b.a().e();
    }

    public final void f() {
        this.f.clear();
        this.a.e(new zc(this, 13));
        this.f.putAll(c(this.a.d()));
        this.b = false;
    }

    public final void g() {
        axn axnVar;
        axm a;
        axm a2;
        if (i()) {
            axnVar = this.a;
        } else {
            axn b = this.a.b();
            if (b != null) {
                axnVar = b.a().g;
                if (axnVar == null || !axnVar.a().i()) {
                    axn axnVar2 = this.g;
                    if (axnVar2 != null && !axnVar2.a().i()) {
                        axn b2 = axnVar2.b();
                        if (b2 != null && (a2 = b2.a()) != null) {
                            a2.g();
                        }
                        axn b3 = axnVar2.b();
                        if (b3 != null && (a = b3.a()) != null) {
                            axnVar = a.g;
                        } else {
                            axnVar = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.g = axnVar;
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.d = false;
        this.e = false;
        this.g = null;
    }

    public final boolean i() {
        if (!this.d && !this.e) {
            return false;
        }
        return true;
    }

    public final boolean j() {
        g();
        if (this.g != null) {
            return true;
        }
        return false;
    }
}
