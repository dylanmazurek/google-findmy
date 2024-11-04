package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nam extends RuntimeException {
    private final transient mnb a;

    public nam(mnb mnbVar) {
        this.a = mnbVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.a.toString();
    }
}
