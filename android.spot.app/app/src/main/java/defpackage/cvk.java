package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvk {
    public final String a;
    public final int b;

    public cvk(String str, int i) {
        str.getClass();
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvk)) {
            return false;
        }
        cvk cvkVar = (cvk) obj;
        if (amr.i(this.a, cvkVar.a) && this.b == cvkVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "WorkGenerationalId(workSpecId=" + this.a + ", generation=" + this.b + ')';
    }
}
