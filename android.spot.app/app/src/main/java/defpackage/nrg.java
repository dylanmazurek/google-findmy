package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nrg {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public nrg(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            throw new IllegalArgumentException("Unknown mode: " + c);
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    private final long d(nno nnoVar, long j) {
        int i = this.c;
        if (i >= 0) {
            return ((non) nnoVar).k.h(j, i);
        }
        non nonVar = (non) nnoVar;
        return nonVar.k.e(nonVar.m.e(nonVar.k.h(j, 1), 1), this.c);
    }

    public final long a(nno nnoVar, long j) {
        try {
            return d(nnoVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                non nonVar = (non) nnoVar;
                if (!nonVar.n.v(j)) {
                    j = nonVar.n.e(j, 1);
                } else {
                    return d(nnoVar, j);
                }
            }
        }
    }

    public final long b(nno nnoVar, long j) {
        try {
            return d(nnoVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                non nonVar = (non) nnoVar;
                if (!nonVar.n.v(j)) {
                    j = nonVar.n.e(j, -1);
                } else {
                    return d(nnoVar, j);
                }
            }
        }
    }

    public final long c(nno nnoVar, long j) {
        non nonVar = (non) nnoVar;
        int a = this.d - nonVar.j.a(j);
        if (a != 0) {
            if (this.e) {
                if (a < 0) {
                    a += 7;
                }
            } else if (a > 0) {
                a -= 7;
            }
            return nonVar.j.e(j, a);
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nrg) {
            nrg nrgVar = (nrg) obj;
            if (this.a == nrgVar.a && this.b == nrgVar.b && this.c == nrgVar.c && this.d == nrgVar.d && this.e == nrgVar.e && this.f == nrgVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        return "[OfYear]\nMode: " + this.a + "\nMonthOfYear: " + this.b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + "\n";
    }
}
