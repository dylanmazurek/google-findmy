package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqe extends boz {
    private final Throwable a;

    public cqe(Throwable th) {
        this.a = th;
    }

    public final String toString() {
        return "FAILURE (" + this.a.getMessage() + ")";
    }
}
