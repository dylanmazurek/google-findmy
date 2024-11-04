package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mug extends CancellationException implements msq {
    public final transient muf a;

    public mug(String str, Throwable th, muf mufVar) {
        super(str);
        this.a = mufVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // defpackage.msq
    public final /* bridge */ /* synthetic */ Throwable a() {
        if (msy.a) {
            String message = getMessage();
            message.getClass();
            return new mug(message, this, this.a);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mug) {
            mug mugVar = (mug) obj;
            if (amr.i(mugVar.getMessage(), getMessage()) && amr.i(mugVar.a, this.a) && amr.i(mugVar.getCause(), getCause())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (msy.a) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i;
        String message = getMessage();
        message.getClass();
        int hashCode = (message.hashCode() * 31) + this.a.hashCode();
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }
}
