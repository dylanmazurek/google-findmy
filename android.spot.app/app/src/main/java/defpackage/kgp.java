package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kgp {
    private final Class a;
    private final knb b;

    public kgp(Class cls, knb knbVar) {
        this.a = cls;
        this.b = knbVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kgp)) {
            return false;
        }
        kgp kgpVar = (kgp) obj;
        if (!kgpVar.a.equals(this.a) || !kgpVar.b.equals(this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }

    public final String toString() {
        knb knbVar = this.b;
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(knbVar);
    }
}
