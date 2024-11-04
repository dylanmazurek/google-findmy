package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kbl extends kll {
    public final kbk a;

    public kbl(kbk kbkVar) {
        this.a = kbkVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.a != kbk.c) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kbl) || ((kbl) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kbl.class, this.a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a.d + ")";
    }
}
