package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyj {
    public Integer a;
    public lkq b;
    public Throwable c;
    private boolean d;
    private boolean e;
    private byte f;

    public final gyl a() {
        if (this.f != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.f & 1) == 0) {
                sb.append(" isRetryableError");
            }
            if ((this.f & 2) == 0) {
                sb.append(" isAuthError");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new gyl(this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(boolean z) {
        this.e = z;
        this.f = (byte) (this.f | 2);
    }

    public final void c(boolean z) {
        this.d = z;
        this.f = (byte) (this.f | 1);
    }
}
