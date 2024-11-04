package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kcg extends kll {
    public final kcf a;

    public kcg(kcf kcfVar) {
        this.a = kcfVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.a != kcf.c) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kcg) || ((kcg) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kcg.class, this.a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a.d + ")";
    }
}
