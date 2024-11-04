package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gks {
    public final long a;
    public final String b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public gks() {
        throw null;
    }

    public static gkp a() {
        gkp gkpVar = new gkp();
        gkpVar.b(0L);
        gkpVar.h(1);
        gkpVar.g(1);
        gkpVar.f(1);
        gkpVar.i(1);
        gkpVar.c(0L);
        gkpVar.d(0L);
        return gkpVar;
    }

    public static gks b(long j, String str, long j2, int i, int i2, int i3, int i4, long j3) {
        gkp a = a();
        a.b(j);
        a.e(str);
        a.c(Long.valueOf(j2));
        a.h(i);
        a.g(i2);
        a.f(i3);
        a.i(i4);
        a.d(j3);
        return a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gks) {
            gks gksVar = (gks) obj;
            if (this.a == gksVar.a && this.b.equals(gksVar.b) && this.c == gksVar.c) {
                int i = this.e;
                int i2 = gksVar.e;
                if (i != 0) {
                    if (i == i2) {
                        int i3 = this.f;
                        int i4 = gksVar.f;
                        if (i3 != 0) {
                            if (i3 == i4) {
                                int i5 = this.g;
                                int i6 = gksVar.g;
                                if (i5 != 0) {
                                    if (i5 == i6) {
                                        int i7 = this.h;
                                        int i8 = gksVar.h;
                                        if (i7 != 0) {
                                            if (i7 == i8 && this.d == gksVar.d) {
                                                return true;
                                            }
                                        } else {
                                            throw null;
                                        }
                                    }
                                } else {
                                    throw null;
                                }
                            }
                        } else {
                            throw null;
                        }
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
        int i = this.e;
        a.V(i);
        int i2 = this.f;
        a.V(i2);
        int i3 = this.g;
        a.V(i3);
        int i4 = this.h;
        a.V(i4);
        long j2 = this.d;
        long j3 = this.c;
        return ((int) (j2 ^ (j2 >>> 32))) ^ (((((((((((hashCode * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ i3) * 1000003) ^ i4) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.e;
        String str4 = "null";
        if (i == 0) {
            str = "null";
        } else {
            str = kzy.f(i);
        }
        int i2 = this.f;
        if (i2 == 0) {
            str2 = "null";
        } else {
            str2 = kzy.g(i2);
        }
        int i3 = this.g;
        if (i3 == 0) {
            str3 = "null";
        } else {
            str3 = kzy.h(i3);
        }
        int i4 = this.h;
        if (i4 != 0) {
            str4 = kzv.L(i4);
        }
        return "ChimeThreadState{id=" + this.a + ", threadId=" + this.b + ", lastUpdatedVersion=" + this.c + ", readState=" + str + ", deletionStatus=" + str2 + ", countBehavior=" + str3 + ", systemTrayBehavior=" + str4 + ", modifiedTimestamp=" + this.d + "}";
    }

    public gks(long j, String str, long j2, int i, int i2, int i3, int i4, long j3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.d = j3;
    }
}
