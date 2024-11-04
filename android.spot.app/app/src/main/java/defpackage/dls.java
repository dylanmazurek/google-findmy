package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dls implements dlx {
    int a;
    public Class b;
    private final dlt c;

    public dls(dlt dltVar) {
        this.c = dltVar;
    }

    @Override // defpackage.dlx
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dls) {
            dls dlsVar = (dls) obj;
            if (this.a == dlsVar.a && this.b == dlsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.a * 31;
        Class cls = this.b;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        return "Key{size=" + this.a + "array=" + String.valueOf(this.b) + "}";
    }
}
