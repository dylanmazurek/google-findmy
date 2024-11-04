package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ewi {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ewi() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewi)) {
            return false;
        }
        ewi ewiVar = (ewi) obj;
        if (this.a != ewiVar.a || this.b != ewiVar.b || this.c != ewiVar.c) {
            return false;
        }
        int i = ewiVar.d;
        return true;
    }

    public final int hashCode() {
        return ((((this.a * 31) + this.b) * 31) + this.c) * 31;
    }

    public final String toString() {
        return "MapPadding(top=" + this.a + ", bottom=" + this.b + ", left=" + this.c + ", right=0)";
    }

    public ewi(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = 0;
    }

    public /* synthetic */ ewi(byte[] bArr) {
        this(0, 0, 0);
    }
}
