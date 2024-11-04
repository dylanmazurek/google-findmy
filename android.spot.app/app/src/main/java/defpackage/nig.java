package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nig {
    public static final nks a;
    public static final nks b;
    public static final nks c;
    public static final nks d;
    public static final nks e;
    public static final nks f;
    public final nks g;
    public final nks h;
    public final int i;

    static {
        nks nksVar = nks.a;
        a = mkm.aK(":");
        b = mkm.aK(":status");
        c = mkm.aK(":method");
        d = mkm.aK(":path");
        e = mkm.aK(":scheme");
        f = mkm.aK(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nig(String str, String str2) {
        this(mkm.aK(str), mkm.aK(str2));
        str2.getClass();
        nks nksVar = nks.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nig)) {
            return false;
        }
        nig nigVar = (nig) obj;
        if (amr.i(this.g, nigVar.g) && amr.i(this.h, nigVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.g.hashCode() * 31) + this.h.hashCode();
    }

    public final String toString() {
        nks nksVar = this.h;
        return this.g.d() + ": " + nksVar.d();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nig(nks nksVar, String str) {
        this(nksVar, mkm.aK(str));
        nksVar.getClass();
    }

    public nig(nks nksVar, nks nksVar2) {
        this.g = nksVar;
        this.h = nksVar2;
        this.i = nksVar.b() + 32 + nksVar2.b();
    }
}
