package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akx {
    public int a;

    public akx() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof akx) && this.a == ((akx) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "DeltaCounter(count=" + this.a + ')';
    }

    public /* synthetic */ akx(byte[] bArr) {
        this.a = 0;
    }
}
