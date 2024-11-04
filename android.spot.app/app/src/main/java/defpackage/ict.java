package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ict {
    public jer a;
    private long b;
    private boolean c;
    private byte d;

    public ict() {
        throw null;
    }

    public final icu a() {
        if (this.d != 3) {
            StringBuilder sb = new StringBuilder();
            if ((this.d & 1) == 0) {
                sb.append(" notificationTimeoutMillis");
            }
            if ((this.d & 2) == 0) {
                sb.append(" shouldRequestMtu");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new icu(this.b, this.a, this.c);
    }

    public final void b(long j) {
        this.b = j;
        this.d = (byte) (this.d | 1);
    }

    public final void c(boolean z) {
        this.c = z;
        this.d = (byte) (this.d | 2);
    }

    public ict(byte[] bArr) {
        this.a = jdl.a;
    }
}
