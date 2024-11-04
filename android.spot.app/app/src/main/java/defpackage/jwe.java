package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
class jwe extends Throwable {
    public jwe() {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
