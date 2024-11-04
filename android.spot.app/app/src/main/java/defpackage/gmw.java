package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmw {
    public Long a;
    private long b;
    private byte c;

    public final gnd a() {
        if (this.c == 1) {
            return new gnd(this.a, this.b);
        }
        throw new IllegalStateException("Missing required properties: startTime");
    }

    public final void b(long j) {
        this.b = j;
        this.c = (byte) 1;
    }
}
