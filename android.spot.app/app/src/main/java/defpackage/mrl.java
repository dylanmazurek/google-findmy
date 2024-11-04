package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mrl implements Comparable {
    public static final long a;
    public static final long b;
    public final long c;

    static {
        int i = mrm.a;
        a = mpd.h(4611686018427387903L);
        b = mpd.h(-4611686018427387903L);
    }

    public /* synthetic */ mrl(long j) {
        this.c = j;
    }

    public static final long a(long j) {
        if (e(j) && d(j)) {
            return b(j);
        }
        return c(j, mrn.c);
    }

    public static final long b(long j) {
        return j >> 1;
    }

    public static final long c(long j, mrn mrnVar) {
        mrn mrnVar2;
        mrnVar.getClass();
        if (j == a) {
            return Long.MAX_VALUE;
        }
        if (j == b) {
            return Long.MIN_VALUE;
        }
        if (f(j)) {
            mrnVar2 = mrn.a;
        } else {
            mrnVar2 = mrn.c;
        }
        return mpd.f(b(j), mrnVar2, mrnVar);
    }

    public static final boolean d(long j) {
        if (!g(j)) {
            return true;
        }
        return false;
    }

    public static final boolean e(long j) {
        if ((((int) j) & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean f(long j) {
        if ((((int) j) & 1) == 0) {
            return true;
        }
        return false;
    }

    public static final boolean g(long j) {
        if (j != a && j != b) {
            return false;
        }
        return true;
    }

    public static final boolean h(long j) {
        if (j < 0) {
            return true;
        }
        return false;
    }

    public static final long i(long j, long j2) {
        mqj mqjVar = new mqj(-4611686018426L, 4611686018426L);
        long k = mpd.k(j2);
        long j3 = j + k;
        if (mqjVar.d(j3)) {
            long j4 = j2 - mpd.j(k);
            long j5 = mpd.j(j3);
            int i = mrm.a;
            long j6 = j5 + j4;
            return j6 + j6;
        }
        return mpd.h(moz.ai(j3, -4611686018427387903L, 4611686018427387903L));
    }

    private static final void j(StringBuilder sb, int i, int i2, int i3, String str) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String A = moz.A(String.valueOf(i2), i3);
            int i4 = -1;
            int length = A.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (A.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) A, 0, i6);
            } else {
                sb.append((CharSequence) A, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        long j = ((mrl) obj).c;
        long j2 = this.c;
        long j3 = j2 ^ j;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j2) & 1) - (1 & ((int) j));
            if (h(j2)) {
                return -i;
            }
            return i;
        }
        if (j2 < j) {
            return -1;
        }
        if (j2 != j) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mrl) && this.c == ((mrl) obj).c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return a.l(this.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mrl.toString():java.lang.String");
    }
}
