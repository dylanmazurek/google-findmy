package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acs implements agy {
    public final adt a;

    public acs(adt adtVar) {
        this.a = adtVar;
    }

    @Override // defpackage.agy
    public final Object a() {
        return this.a.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof acs) && amr.i(this.a, ((acs) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
