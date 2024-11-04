package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ecx {
    public int a;
    public int b;
    public String c;
    public boolean d;
    public jer e;
    public byte f;

    public ecx() {
        throw null;
    }

    public final void a(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 4);
    }

    public final void b(int i) {
        this.b = i;
        this.f = (byte) (this.f | 2);
    }

    public final void c(int i) {
        this.a = i;
        this.f = (byte) (this.f | 1);
    }

    public ecx(byte[] bArr) {
        this.e = jdl.a;
    }
}
