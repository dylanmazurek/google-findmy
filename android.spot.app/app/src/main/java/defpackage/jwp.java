package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jwp {
    static final jwp a = new jwp(null);
    volatile jwp next;
    volatile Thread thread;

    public jwp(byte[] bArr) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(jwp jwpVar) {
        jwq.k.c(this, jwpVar);
    }

    public jwp() {
        jwq.k.d(this, Thread.currentThread());
    }
}
