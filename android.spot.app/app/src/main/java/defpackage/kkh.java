package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkh extends kll {
    public final kkf a;
    public final kkd b;
    public final kke c;
    public final kkg d;

    public kkh(kkf kkfVar, kkd kkdVar, kke kkeVar, kkg kkgVar) {
        this.a = kkfVar;
        this.b = kkdVar;
        this.c = kkeVar;
        this.d = kkgVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.d != kkg.d) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kkh)) {
            return false;
        }
        kkh kkhVar = (kkh) obj;
        if (kkhVar.a != this.a || kkhVar.b != this.b || kkhVar.c != this.c || kkhVar.d != this.d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kkh.class, this.a, this.b, this.c, this.d);
    }

    public final String toString() {
        return "ECDSA Parameters (variant: " + this.d.e + ", hashType: " + this.c.d + ", encoding: " + this.a.c + ", curve: " + this.b.d + ")";
    }
}
