package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class daw extends day {
    private final String a;

    public daw(String str) {
        this.a = str;
    }

    @Override // defpackage.day
    public final float a(cyb cybVar) {
        dbp c = cybVar.c(this.a);
        if (c == null) {
            return 1.0f;
        }
        return moz.ab((c.b + c.c) / cybVar.j, 0.0f, 1.0f);
    }

    @Override // defpackage.day
    public final float b(cyb cybVar) {
        float f;
        dbp c = cybVar.c(this.a);
        if (c != null) {
            f = c.b;
        } else {
            f = 0.0f;
        }
        return moz.ab(f / cybVar.j, 0.0f, 1.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof daw) && amr.i(this.a, ((daw) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Marker(marker=" + this.a + ")";
    }
}
