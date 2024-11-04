package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fts {
    public final ftq a;

    private fts(ftq ftqVar) {
        this.a = ftqVar;
    }

    public static fts a(byte[] bArr) {
        return new fts(new ftq(bArr));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fts)) {
            return false;
        }
        return Objects.equals(this.a, ((fts) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return String.format("UwbDevice {%s}", this.a);
    }
}
