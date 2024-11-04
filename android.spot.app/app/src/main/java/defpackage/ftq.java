package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftq {
    private static final jtf b = jtf.f.i();
    public final byte[] a;

    public ftq(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ftq)) {
            return false;
        }
        return Arrays.equals(this.a, ((ftq) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return b.k(this.a);
    }
}
