package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gzo implements Comparable {
    public final jer a;
    public final jer b;

    public gzo() {
        throw null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(gzo gzoVar) {
        jmb jmbVar = jmb.a;
        jme jmeVar = jmbVar.b;
        if (jmeVar == null) {
            jmeVar = new jmc(jmbVar);
            jmbVar.b = jmeVar;
        }
        return jmeVar.compare((Comparable) this.a.f(), (Comparable) gzoVar.a.f());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gzo) {
            gzo gzoVar = (gzo) obj;
            if (this.a.equals(gzoVar.a) && this.b.equals(gzoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        jer jerVar = this.b;
        return "DecorationContent{badgeContent=" + String.valueOf(this.a) + ", ringContent=" + String.valueOf(jerVar) + "}";
    }

    public gzo(jer jerVar, jer jerVar2) {
        this.a = jerVar;
        this.b = jerVar2;
    }
}
