package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxa {
    public final Object a;

    public cxa() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof cxa) && amr.i(this.a, ((cxa) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "NetworkRequestCompat(wrapped=" + this.a + ')';
    }

    public cxa(Object obj) {
        this.a = obj;
    }

    public /* synthetic */ cxa(byte[] bArr) {
        this((Object) null);
    }
}
