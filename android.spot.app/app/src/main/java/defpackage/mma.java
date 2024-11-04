package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mma {
    public final int a;
    public final Object b;

    public mma(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mma)) {
            return false;
        }
        mma mmaVar = (mma) obj;
        if (this.a == mmaVar.a && amr.i(this.b, mmaVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (this.a * 31) + hashCode;
    }

    public final String toString() {
        return "IndexedValue(index=" + this.a + ", value=" + this.b + ")";
    }
}
