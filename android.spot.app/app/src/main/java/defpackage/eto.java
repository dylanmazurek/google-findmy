package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eto {
    public final jis a;
    public final jis b;
    public final jis c;
    public final jis d;

    public eto() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eto) {
            eto etoVar = (eto) obj;
            if (hzc.L(this.a, etoVar.a) && hzc.L(this.b, etoVar.b) && hzc.L(this.c, etoVar.c) && hzc.L(this.d, etoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        jis jisVar = this.d;
        jis jisVar2 = this.c;
        jis jisVar3 = this.b;
        return "UiResources{titleResourceIds=" + this.a.toString() + ", detailsResourceIds=" + jisVar3.toString() + ", acceptResourceIds=" + jisVar2.toString() + ", declineResourceIds=" + jisVar.toString() + "}";
    }

    public eto(jis jisVar, jis jisVar2, jis jisVar3, jis jisVar4) {
        if (jisVar == null) {
            throw new NullPointerException("Null titleResourceIds");
        }
        this.a = jisVar;
        if (jisVar2 != null) {
            this.b = jisVar2;
            if (jisVar3 != null) {
                this.c = jisVar3;
                if (jisVar4 != null) {
                    this.d = jisVar4;
                    return;
                }
                throw new NullPointerException("Null declineResourceIds");
            }
            throw new NullPointerException("Null acceptResourceIds");
        }
        throw new NullPointerException("Null detailsResourceIds");
    }
}
