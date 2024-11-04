package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xt {
    private static final HashMap a;
    private static final awh b;

    static {
        f(true);
        a = f(false);
        int i = aon.a;
        b = xs.a;
    }

    public static final void a(aox aoxVar, abi abiVar, int i) {
        int i2;
        int i3;
        int i4 = i & 6;
        abi b2 = abiVar.b(-211209833);
        if (i4 == 0) {
            if (true != b2.B(aoxVar)) {
                i3 = 2;
            } else {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && b2.G()) {
            b2.r();
        } else {
            awh awhVar = b;
            int a2 = abd.a(b2);
            aox e = de.e(b2, aoxVar);
            abp abpVar = (abp) b2;
            aek L = abpVar.L();
            int i5 = axu.a;
            b2.v();
            if (abpVar.x) {
                b2.k(new xr(0));
            } else {
                b2.x();
            }
            agx.a(b2, awhVar, axt.d);
            agx.a(b2, L, axt.c);
            agx.a(b2, e, axt.b);
            mol molVar = axt.e;
            if (abpVar.x || !amr.i(abpVar.P(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                abpVar.Z(valueOf);
                b2.i(valueOf, molVar);
            }
            b2.n();
        }
        afv d = b2.d();
        if (d != null) {
            ((aeu) d).d = new bce(aoxVar, i, 1);
        }
    }

    public static final void b(awq awqVar, awr awrVar, awg awgVar, bln blnVar, int i, int i2, aon aonVar) {
        if (e(awgVar) == null) {
            awq.g(awrVar, aonVar.a(bef.m(awrVar.a, awrVar.b), bef.m(i, i2), blnVar), 0.0f);
            return;
        }
        throw null;
    }

    public static final /* synthetic */ void c(awg awgVar) {
        if (e(awgVar) == null) {
        } else {
            throw null;
        }
    }

    public static final awh d(aon aonVar) {
        awh awhVar = (awh) a.get(aonVar);
        if (awhVar == null) {
            return new xw(aonVar, false);
        }
        return awhVar;
    }

    private static final xq e(awg awgVar) {
        Object c = awgVar.c();
        if (c instanceof xq) {
            return (xq) c;
        }
        return null;
    }

    private static final HashMap f(boolean z) {
        HashMap hashMap = new HashMap(9);
        int i = aon.a;
        g(hashMap, z, aom.a);
        g(hashMap, z, aom.b);
        g(hashMap, z, aom.c);
        g(hashMap, z, aom.d);
        g(hashMap, z, aom.e);
        g(hashMap, z, aom.f);
        g(hashMap, z, aom.g);
        g(hashMap, z, aom.h);
        g(hashMap, z, aom.i);
        return hashMap;
    }

    private static final void g(HashMap hashMap, boolean z, aon aonVar) {
        hashMap.put(aonVar, new xw(aonVar, z));
    }
}
