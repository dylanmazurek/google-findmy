package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class noj implements Comparable, noh {
    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(noh nohVar) {
        throw null;
    }

    public int b(nns nnsVar) {
        throw null;
    }

    protected abstract nnq e(int i, nno nnoVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noh)) {
            return false;
        }
        noh nohVar = (noh) obj;
        nohVar.g();
        for (int i = 0; i < 3; i++) {
            if (c(i) != nohVar.c(i) || h(i) != nohVar.h(i)) {
                return false;
            }
        }
        return moz.az(d(), nohVar.d());
    }

    public boolean f(nns nnsVar) {
        throw null;
    }

    @Override // defpackage.noh
    public final nns h(int i) {
        return e(i, d()).r();
    }

    public int hashCode() {
        int i = 157;
        for (int i2 = 0; i2 < 3; i2++) {
            i = (((i * 23) + c(i2)) * 23) + h(i2).hashCode();
        }
        return i + d().hashCode();
    }
}
