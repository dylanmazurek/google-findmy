package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uf {
    public static final uf a = new uf(new um(null, null, false, null, 63));
    public final um b;

    public uf() {
        throw null;
    }

    public final uf a(uf ufVar) {
        um umVar = ufVar.b;
        uh uhVar = umVar.a;
        if (uhVar == null) {
            uhVar = this.b.a;
        }
        uh uhVar2 = uhVar;
        uk ukVar = umVar.d;
        if (ukVar == null) {
            ukVar = this.b.d;
        }
        uk ukVar2 = ukVar;
        um umVar2 = this.b;
        return new uf(new um(uhVar2, ukVar2, false, mkm.J(umVar2.f, umVar.f), 16));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof uf) && amr.i(((uf) obj).b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        String str;
        if (amr.i(this, a)) {
            return "EnterTransition.None";
        }
        um umVar = this.b;
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        uh uhVar = umVar.a;
        String str2 = null;
        if (uhVar != null) {
            str = uhVar.toString();
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",\nSlide - null,\nShrink - null,\nScale - ");
        uk ukVar = umVar.d;
        if (ukVar != null) {
            str2 = ukVar.toString();
        }
        sb.append(str2);
        return sb.toString();
    }

    public uf(um umVar) {
        this.b = umVar;
    }
}
