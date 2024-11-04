package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jnv extends Exception {
    public jnv(Throwable th, jok jokVar, StackTraceElement[] stackTraceElementArr) {
        super(jokVar.toString(), th);
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
