package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hyt {
    private Optional a;
    private Optional b;
    private long c;
    private byte d;

    public hyt() {
        throw null;
    }

    public final hyu a() {
        if (this.d == 1) {
            return new hyu(this.a, this.b, this.c);
        }
        throw new IllegalStateException("Missing required properties: timestamp");
    }

    public final void b(hys hysVar) {
        this.b = Optional.of(hysVar);
    }

    public final void c(jis jisVar) {
        this.a = Optional.of(jisVar);
    }

    public final void d(long j) {
        this.c = j;
        this.d = (byte) 1;
    }

    public hyt(byte[] bArr) {
        this.a = Optional.empty();
        this.b = Optional.empty();
    }
}
