package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class aij {
    public final int b;
    public final int c;

    public aij(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public String a(int i) {
        return "IntParameter(" + i + ')';
    }

    public abstract void b(aik aikVar, aaw aawVar, agb agbVar, afp afpVar);

    public String c(int i) {
        return "ObjectParameter(" + i + ')';
    }

    public final String toString() {
        int i = mpo.a;
        String c = new mox(getClass()).c();
        if (c == null) {
            return "";
        }
        return c;
    }

    public /* synthetic */ aij(int i, int i2, int i3) {
        this(1 == (i3 & 1) ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }
}
