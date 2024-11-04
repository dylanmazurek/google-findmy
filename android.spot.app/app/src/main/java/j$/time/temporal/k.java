package j$.time.temporal;

import j$.util.Objects;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class k {
    static final q a = new p(0);
    static final q b = new p(1);
    static final q c = new p(2);
    static final q d = new p(3);
    static final q e = new p(4);
    static final q f = new p(5);
    static final q g = new p(6);

    public static int a(l lVar, o oVar) {
        s r = lVar.r(oVar);
        if (r.h()) {
            long w = lVar.w(oVar);
            if (r.i(w)) {
                return (int) w;
            }
            throw new RuntimeException("Invalid value for " + String.valueOf(oVar) + " (valid values " + String.valueOf(r) + "): " + w);
        }
        throw new RuntimeException("Invalid field " + String.valueOf(oVar) + " for get() method, use getLong() instead");
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.e(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.e(j2, temporalUnit);
    }

    public static Object c(l lVar, q qVar) {
        if (qVar != a && qVar != b && qVar != c) {
            return qVar.a(lVar);
        }
        return null;
    }

    public static s d(l lVar, o oVar) {
        if (oVar instanceof a) {
            if (lVar.g(oVar)) {
                return ((a) oVar).k();
            }
            throw new RuntimeException("Unsupported field: ".concat(String.valueOf(oVar)));
        }
        Objects.a(oVar, "field");
        return oVar.w(lVar);
    }

    public static q e() {
        return b;
    }

    public static q f() {
        return f;
    }

    public static q g() {
        return g;
    }

    public static q h() {
        return d;
    }

    public static q i() {
        return c;
    }

    public static q j() {
        return e;
    }

    public static q k() {
        return a;
    }
}
