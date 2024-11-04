package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dxw {
    public dxy a;
    public jer b;
    public byte c;
    private lps d;
    private boolean e;
    private dxz f;

    public dxw() {
        throw null;
    }

    public final dya a() {
        dxy dxyVar;
        lps lpsVar;
        dxz dxzVar;
        if (this.c == 3 && (dxyVar = this.a) != null && (lpsVar = this.d) != null && (dxzVar = this.f) != null) {
            return new dya(dxyVar, lpsVar, this.b, this.e, dxzVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" devicePinSource");
        }
        if (this.d == null) {
            sb.append(" locationWithAccuracy");
        }
        if ((this.c & 1) == 0) {
            sb.append(" focusOnLocation");
        }
        if ((this.c & 2) == 0) {
            sb.append(" hidden");
        }
        if (this.f == null) {
            sb.append(" markerOrder");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.e = z;
        this.c = (byte) (this.c | 1);
    }

    public final void c(lps lpsVar) {
        if (lpsVar != null) {
            this.d = lpsVar;
            return;
        }
        throw new NullPointerException("Null locationWithAccuracy");
    }

    public final void d(dxz dxzVar) {
        if (dxzVar != null) {
            this.f = dxzVar;
            return;
        }
        throw new NullPointerException("Null markerOrder");
    }

    public dxw(byte[] bArr) {
        this.b = jdl.a;
    }
}
