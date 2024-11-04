package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class nrb implements nra {
    public final nra a;

    private nrb(nra nraVar) {
        this.a = nraVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nrb b(nra nraVar) {
        if (nraVar instanceof nqx) {
            return ((nqx) nraVar).a;
        }
        if (nraVar instanceof nrb) {
            return (nrb) nraVar;
        }
        if (nraVar == null) {
            return null;
        }
        return new nrb(nraVar);
    }

    @Override // defpackage.nra
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.nra
    public final int c(nqw nqwVar, CharSequence charSequence, int i) {
        return this.a.c(nqwVar, charSequence, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nrb) {
            return this.a.equals(((nrb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
