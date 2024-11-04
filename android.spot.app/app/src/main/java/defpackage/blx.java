package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class blx extends Throwable {
    public blx() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
