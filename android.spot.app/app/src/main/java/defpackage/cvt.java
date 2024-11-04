package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvt {
    public final String a;
    public final int b;

    public cvt(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvt)) {
            return false;
        }
        cvt cvtVar = (cvt) obj;
        if (amr.i(this.a, cvtVar.a) && this.b == cvtVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = this.b;
        a.N(i);
        return hashCode + i;
    }

    public final String toString() {
        return "IdAndState(id=" + this.a + ", state=" + ((Object) bpe.g(this.b)) + ')';
    }
}
