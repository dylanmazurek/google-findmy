package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdf {
    public final String a;
    public final jer b;

    public hdf() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hdf) {
            hdf hdfVar = (hdf) obj;
            if (this.a.equals(hdfVar.a) && this.b.equals(hdfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TextViewData{title=" + this.a + ", titleContentDescription=" + this.b.toString() + "}";
    }

    public hdf(String str, jer jerVar) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
        if (jerVar != null) {
            this.b = jerVar;
            return;
        }
        throw new NullPointerException("Null titleContentDescription");
    }
}
