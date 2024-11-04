package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class diu {
    public static final dit a = new dis();
    public final Object b;
    public final dit c;
    public final String d;
    public volatile byte[] e;

    public diu(String str, Object obj, dit ditVar) {
        bsc.o(str);
        this.d = str;
        this.b = obj;
        bsc.q(ditVar);
        this.c = ditVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof diu) {
            return this.d.equals(((diu) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "Option{key='" + this.d + "'}";
    }
}
