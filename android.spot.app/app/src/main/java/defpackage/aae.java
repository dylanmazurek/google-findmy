package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aae {
    private final ym a;
    private final ym b;
    private final ym c;
    private final ym d;
    private final ym e;

    public aae() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aae)) {
            return false;
        }
        aae aaeVar = (aae) obj;
        if (amr.i(this.a, aaeVar.a) && amr.i(this.b, aaeVar.b) && amr.i(this.c, aaeVar.c) && amr.i(this.d, aaeVar.d) && amr.i(this.e, aaeVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", extraLarge=" + this.e + ')';
    }

    public aae(ym ymVar, ym ymVar2, ym ymVar3, ym ymVar4, ym ymVar5) {
        this.a = ymVar;
        this.b = ymVar2;
        this.c = ymVar3;
        this.d = ymVar4;
        this.e = ymVar5;
    }

    public /* synthetic */ aae(byte[] bArr) {
        this(aad.a, aad.b, aad.c, aad.d, aad.e);
    }
}
