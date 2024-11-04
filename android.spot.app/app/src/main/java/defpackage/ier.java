package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ier {
    public jer a;
    public jer b;
    public boolean c;
    public byte d;

    public ier() {
        throw null;
    }

    public final void a(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public final hdl b() {
        if (this.d == 1) {
            return new hdl(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: hasCaptionStyle");
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) 1;
    }

    public ier(byte[] bArr) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.b = jdlVar;
    }
}
