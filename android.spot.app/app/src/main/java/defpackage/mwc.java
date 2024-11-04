package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwc {
    public static final mwb a = new mwb();
    public final Object b;

    public /* synthetic */ mwc(Object obj) {
        this.b = obj;
    }

    public static final Object a(Object obj) {
        if (!(obj instanceof mwb)) {
            return obj;
        }
        return null;
    }

    public static final Throwable b(Object obj) {
        mwa mwaVar;
        if (obj instanceof mwa) {
            mwaVar = (mwa) obj;
        } else {
            mwaVar = null;
        }
        if (mwaVar == null) {
            return null;
        }
        return mwaVar.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof mwc) && amr.i(this.b, ((mwc) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.b;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.b;
        if (obj instanceof mwa) {
            return obj.toString();
        }
        return a.af(obj, "Value(", ")");
    }
}
