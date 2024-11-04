package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krt {
    public final String a;
    public final long b;
    public final int c;

    public krt() {
        throw null;
    }

    public static krs a() {
        krs krsVar = new krs();
        krsVar.b(0L);
        return krsVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krt) {
            krt krtVar = (krt) obj;
            String str = this.a;
            if (str != null ? str.equals(krtVar.a) : krtVar.a == null) {
                if (this.b == krtVar.b) {
                    int i = this.c;
                    int i2 = krtVar.c;
                    if (i != 0 ? i == i2 : i2 == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            a.N(i2);
            i = i2;
        }
        return ((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i;
    }

    public final String toString() {
        String str;
        int i = this.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "null";
                } else {
                    str = "AUTH_ERROR";
                }
            } else {
                str = "BAD_CONFIG";
            }
        } else {
            str = "OK";
        }
        long j = this.b;
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + j + ", responseCode=" + str + "}";
    }

    public krt(String str, long j, int i) {
        this.a = str;
        this.b = j;
        this.c = i;
    }
}
