package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ifp {
    public boolean a;
    public byte b;
    public Object c;

    public ifp() {
        throw null;
    }

    public final void a() {
        boolean z = true;
        if (this.b == 1) {
            ifq ifqVar = new ifq(this.a, (jer) this.c);
            if (ifqVar.a.g() && ((Integer) ifqVar.a.c()).intValue() <= 0) {
                z = false;
            }
            hwx.U(z);
            return;
        }
        throw new IllegalStateException("Missing required properties: hasButton");
    }

    public final void b(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final void c(int i) {
        this.c = jer.i(Integer.valueOf(i));
    }

    public final void d(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public final dzt e() {
        if (this.b == 1) {
            return new dzt(this.a, (jer) this.c);
        }
        throw new IllegalStateException("Missing required properties: isManagedProfile");
    }

    public final void f(boolean z) {
        this.a = z;
        this.b = (byte) 1;
    }

    public ifp(byte[] bArr) {
        this.c = jdl.a;
    }

    public ifp(char[] cArr) {
    }
}
