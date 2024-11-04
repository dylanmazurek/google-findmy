package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lmg {
    public static final /* synthetic */ int a = 0;

    static {
        ljh k = lix.c.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        ((lix) ljnVar).a = -315576000000L;
        if (!ljnVar.y()) {
            k.t();
        }
        ((lix) k.b).b = -999999999;
        ljh k2 = lix.c.k();
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar2 = k2.b;
        ((lix) ljnVar2).a = 315576000000L;
        if (!ljnVar2.y()) {
            k2.t();
        }
        ((lix) k2.b).b = 999999999;
        ljh k3 = lix.c.k();
        if (!k3.b.y()) {
            k3.t();
        }
        ljn ljnVar3 = k3.b;
        ((lix) ljnVar3).a = 0L;
        if (!ljnVar3.y()) {
            k3.t();
        }
        ((lix) k3.b).b = 0;
    }

    public static lix a(long j) {
        return b(j, 0);
    }

    public static lix b(long j, int i) {
        if (i <= -1000000000 || i >= 1000000000) {
            j = iqh.x(j, i / 1000000000);
            i %= 1000000000;
        }
        if (j > 0 && i < 0) {
            i += 1000000000;
            j--;
        }
        if (j < 0 && i > 0) {
            i -= 1000000000;
            j++;
        }
        ljh k = lix.c.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        ((lix) ljnVar).a = j;
        if (!ljnVar.y()) {
            k.t();
        }
        ((lix) k.b).b = i;
        lix lixVar = (lix) k.q();
        c(lixVar);
        return lixVar;
    }

    public static void c(lix lixVar) {
        long j = lixVar.a;
        int i = lixVar.b;
        if (j >= -315576000000L && j <= 315576000000L && i >= -999999999 && i < 1000000000) {
            if (j < 0 || i < 0) {
                if (j <= 0 && i <= 0) {
                    return;
                }
            } else {
                return;
            }
        }
        throw new IllegalArgumentException(String.format("Duration is not valid. See proto definition for valid values. Seconds (%s) must be in range [-315,576,000,000, +315,576,000,000]. Nanos (%s) must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds", Long.valueOf(j), Integer.valueOf(i)));
    }
}
