package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeq {
    public final aby a;
    public final boolean b;
    public final agk c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public aeq(aby abyVar, Object obj, boolean z, agk agkVar, boolean z2) {
        this.a = abyVar;
        this.b = z;
        this.c = agkVar;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        abr.g("Unexpected form of a provided value");
        throw new mks();
    }
}
