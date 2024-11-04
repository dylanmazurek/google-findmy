package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mus extends naw implements mtz {
    public final String c(String str) {
        StringBuilder sb = new StringBuilder("List{");
        sb.append(str);
        sb.append("}[");
        Object f = f();
        f.getClass();
        boolean z = true;
        for (naz nazVar = (naz) f; !amr.i(nazVar, this); nazVar = nazVar.g()) {
            if (nazVar instanceof muj) {
                muj mujVar = (muj) nazVar;
                if (!z) {
                    sb.append(", ");
                }
                sb.append(mujVar);
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.mtz
    public final boolean dd() {
        return true;
    }

    @Override // defpackage.naz
    public final String toString() {
        if (msy.a) {
            return c("Active");
        }
        return super.toString();
    }

    @Override // defpackage.mtz
    public final mus a() {
        return this;
    }
}
