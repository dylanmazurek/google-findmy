package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jrh implements jrg {
    private static final int c(StackTraceElement[] stackTraceElementArr, Class cls) {
        String name = cls.getName();
        boolean z = false;
        for (int i = 3; i < stackTraceElementArr.length; i++) {
            if (stackTraceElementArr[i].getClassName().equals(name)) {
                z = true;
            } else if (z) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.jrg
    public final StackTraceElement a(Class cls) {
        jql.f(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int c = c(stackTrace, cls);
        if (c != -1) {
            return stackTrace[c];
        }
        return null;
    }

    @Override // defpackage.jrg
    public final StackTraceElement[] b(Class cls, int i) {
        boolean z;
        if (i != -1 && i <= 0) {
            z = false;
        } else {
            z = true;
        }
        jql.f(z, "maxDepth must be > 0 or -1");
        jql.f(true, "skipFrames must be >= 0");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int c = c(stackTrace, cls);
        if (c == -1) {
            return new StackTraceElement[0];
        }
        int length = stackTrace.length - c;
        if (i <= 0 || i >= length) {
            i = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i];
        System.arraycopy(stackTrace, c, stackTraceElementArr, 0, i);
        return stackTraceElementArr;
    }
}
