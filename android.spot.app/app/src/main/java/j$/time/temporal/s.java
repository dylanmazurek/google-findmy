package j$.time.temporal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class s implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    private s(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    private String c(long j, o oVar) {
        if (oVar != null) {
            return "Invalid value for " + String.valueOf(oVar) + " (valid values " + String.valueOf(this) + "): " + j;
        }
        return "Invalid value (valid values " + String.valueOf(this) + "): " + j;
    }

    public static s j(long j, long j2) {
        if (j <= j2) {
            return new s(j, j, j2, j2);
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public static s k(long j, long j2) {
        if (j <= j2) {
            if (1 <= j2) {
                return new s(1L, 1L, j, j2);
            }
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        long j = this.a;
        long j2 = this.b;
        if (j <= j2) {
            long j3 = this.c;
            long j4 = this.d;
            if (j3 <= j4) {
                if (j2 <= j4) {
                    return;
                } else {
                    throw new InvalidObjectException("Minimum value must be less than maximum value");
                }
            }
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
    }

    public final int a(long j, o oVar) {
        if (h() && i(j)) {
            return (int) j;
        }
        throw new RuntimeException(c(j, oVar));
    }

    public final void b(long j, o oVar) {
        if (i(j)) {
        } else {
            throw new RuntimeException(c(j, oVar));
        }
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (this.a == sVar.a && this.b == sVar.b && this.c == sVar.c && this.d == sVar.d) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        if (this.a == this.b && this.c == this.d) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (this.a >= -2147483648L && this.d <= 2147483647L) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a + (j << 16) + (j >> 48);
        long j3 = this.c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final boolean i(long j) {
        if (j >= this.a && j <= this.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.a;
        sb.append(j);
        long j2 = this.b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.c;
        sb.append(j3);
        long j4 = this.d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
