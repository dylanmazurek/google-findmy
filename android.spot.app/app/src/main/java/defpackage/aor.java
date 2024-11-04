package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aor implements aox {
    public final aox a;
    public final aox b;

    public aor(aox aoxVar, aox aoxVar2) {
        this.a = aoxVar;
        this.b = aoxVar2;
    }

    @Override // defpackage.aox
    public final /* synthetic */ aox a(aox aoxVar) {
        return aot.a(this, aoxVar);
    }

    @Override // defpackage.aox
    public final Object b(Object obj, mol molVar) {
        return this.b.b(this.a.b(obj, molVar), molVar);
    }

    @Override // defpackage.aox
    public final boolean c(moh mohVar) {
        if (this.a.c(mohVar) && this.b.c(mohVar)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aor) {
            aor aorVar = (aor) obj;
            if (amr.i(this.a, aorVar.a) && amr.i(this.b, aorVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "[" + ((String) b("", tu.c)) + ']';
    }
}
