package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjj {
    public final bip a;
    public final biz b;
    public final int c = 0;
    public final int d = 1;
    public final Object e = null;

    public /* synthetic */ bjj(bip bipVar, biz bizVar) {
        this.a = bipVar;
        this.b = bizVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjj)) {
            return false;
        }
        bjj bjjVar = (bjj) obj;
        if (!amr.i(this.a, bjjVar.a) || !amr.i(this.b, bjjVar.b)) {
            return false;
        }
        int i = bjjVar.c;
        if (!a.m(0, 0)) {
            return false;
        }
        int i2 = bjjVar.d;
        if (!a.m(1, 1)) {
            return false;
        }
        Object obj2 = bjjVar.e;
        if (amr.i(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        bip bipVar = this.a;
        if (bipVar == null) {
            hashCode = 0;
        } else {
            hashCode = bipVar.hashCode();
        }
        return ((((hashCode * 31) + this.b.g) * 961) + 1) * 31;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) biv.a()) + ", fontSynthesis=" + ((Object) biw.a()) + ", resourceLoaderCacheKey=null)";
    }
}
