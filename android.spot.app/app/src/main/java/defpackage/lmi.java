package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmi {
    public static final lln a;

    static {
        ljh k = lln.c.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        ((lln) ljnVar).a = -62135596800L;
        if (!ljnVar.y()) {
            k.t();
        }
        ((lln) k.b).b = 0;
        a = (lln) k.q();
        ljh k2 = lln.c.k();
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar2 = k2.b;
        ((lln) ljnVar2).a = 253402300799L;
        if (!ljnVar2.y()) {
            k2.t();
        }
        ((lln) k2.b).b = 999999999;
        ljh k3 = lln.c.k();
        if (!k3.b.y()) {
            k3.t();
        }
        ljn ljnVar3 = k3.b;
        ((lln) ljnVar3).a = 0L;
        if (!ljnVar3.y()) {
            k3.t();
        }
        ((lln) k3.b).b = 0;
        new lmh();
        h("now");
        h("getEpochSecond");
        h("getNano");
    }

    public static int a(lln llnVar, lln llnVar2) {
        f(llnVar);
        f(llnVar2);
        int compare = Long.compare(llnVar.a, llnVar2.a);
        if (compare != 0) {
            return compare;
        }
        return Integer.compare(llnVar.b, llnVar2.b);
    }

    public static long b(lln llnVar) {
        f(llnVar);
        return iqh.x(iqh.y(llnVar.a, 1000L), llnVar.b / 1000000);
    }

    public static long c(lln llnVar) {
        f(llnVar);
        return llnVar.a;
    }

    public static lln d(long j) {
        return e(j / 1000, (int) ((j % 1000) * 1000000));
    }

    public static lln e(long j, int i) {
        if (g(j)) {
            if (i <= -1000000000 || i >= 1000000000) {
                j = iqh.x(j, i / 1000000000);
                i %= 1000000000;
            }
            if (i < 0) {
                i += 1000000000;
                j = iqh.z(j, 1L);
            }
            ljh k = lln.c.k();
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            ((lln) ljnVar).a = j;
            if (!ljnVar.y()) {
                k.t();
            }
            ((lln) k.b).b = i;
            lln llnVar = (lln) k.q();
            f(llnVar);
            return llnVar;
        }
        throw new IllegalArgumentException(String.format("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(j)));
    }

    public static void f(lln llnVar) {
        long j = llnVar.a;
        boolean g = g(j);
        int i = llnVar.b;
        if (g && i >= 0 && i < 1000000000) {
        } else {
            throw new IllegalArgumentException(String.format("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(j), Integer.valueOf(i)));
        }
    }

    private static boolean g(long j) {
        if (j >= -62135596800L && j <= 253402300799L) {
            return true;
        }
        return false;
    }

    private static void h(String str) {
        try {
            Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
        }
    }
}
