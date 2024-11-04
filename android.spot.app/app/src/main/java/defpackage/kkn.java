package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkn extends kll {
    public final kkm a;

    public kkn(kkm kkmVar) {
        this.a = kkmVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kkn) || ((kkn) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kkn.class, this.a);
    }

    public final String toString() {
        return "Ed25519 Parameters (variant: " + this.a.e + ")";
    }
}
