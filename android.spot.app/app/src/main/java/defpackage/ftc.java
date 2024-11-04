package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ftc {
    private final lim a;

    public ftc(byte[] bArr) {
        fma.aR(bArr);
        this.a = lim.t(bArr);
    }

    public final byte[] a() {
        return this.a.A();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((ftc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return kzy.p(this.a, jtf.f);
    }
}
