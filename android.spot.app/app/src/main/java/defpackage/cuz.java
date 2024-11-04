package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cuz {
    public final String a;
    public final Long b;

    public cuz(String str, Long l) {
        this.a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuz)) {
            return false;
        }
        cuz cuzVar = (cuz) obj;
        if (amr.i(this.a, cuzVar.a) && amr.i(this.b, cuzVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Preference(key=" + this.a + ", value=" + this.b + ')';
    }
}
