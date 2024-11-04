package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ug {
    public static final ug a = new ug(new um(null, null, false, null, 63));
    private static final ug c = new ug(new um(null, null, true, null, 47));
    public final um b;

    public ug() {
        throw null;
    }

    public final ug a(ug ugVar) {
        um umVar = ugVar.b;
        uh uhVar = umVar.a;
        if (uhVar == null) {
            uhVar = this.b.a;
        }
        uk ukVar = umVar.d;
        if (ukVar == null) {
            ukVar = this.b.d;
        }
        boolean z = true;
        if (!umVar.e && !this.b.e) {
            z = false;
        }
        um umVar2 = this.b;
        return new ug(new um(uhVar, ukVar, z, mkm.J(umVar2.f, umVar.f)));
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ug) && amr.i(((ug) obj).b, this.b)) {
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
            return "ExitTransition.None";
        }
        if (amr.i(this, c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        um umVar = this.b;
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(umVar.e);
        return sb.toString();
    }

    public ug(um umVar) {
        this.b = umVar;
    }
}
