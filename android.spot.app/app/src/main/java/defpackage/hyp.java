package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyp {
    public ftq a;
    public int b;
    public int c;
    public int d;
    public lim e;
    public String f;
    public byte g;

    public final void a(int i) {
        this.c = i;
        this.g = (byte) (this.g | 2);
    }

    public final void b(lim limVar) {
        if (limVar != null) {
            this.e = limVar;
            return;
        }
        throw new NullPointerException("Null sessionKey");
    }
}
