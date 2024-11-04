package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agv implements agy {
    public final Object a;

    public agv(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.agy
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof agv) && amr.i(this.a, ((agv) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "StaticValueHolder(value=" + this.a + ')';
    }
}
