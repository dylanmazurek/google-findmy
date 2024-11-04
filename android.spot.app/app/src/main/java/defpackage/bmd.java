package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmd {
    static final bmd a = new bmd(null);
    volatile bmd next;
    volatile Thread thread;

    public bmd(byte[] bArr) {
    }

    public final void a(bmd bmdVar) {
        bme.b.a(this, bmdVar);
    }

    public bmd() {
        bme.b.b(this, Thread.currentThread());
    }
}
