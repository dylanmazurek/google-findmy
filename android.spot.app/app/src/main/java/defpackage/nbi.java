package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nbi {
    private static final StackTraceElement a;
    private static final String b;
    private static final String c;

    static {
        Object n;
        Object n2;
        Exception exc = new Exception();
        String simpleName = a.class.getSimpleName();
        simpleName.getClass();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        a = new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            n = Class.forName("mnj").getCanonicalName();
        } catch (Throwable th) {
            n = mjo.n(th);
        }
        if (mky.a(n) != null) {
            n = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = (String) n;
        try {
            n2 = Class.forName("nbi").getCanonicalName();
        } catch (Throwable th2) {
            n2 = mjo.n(th2);
        }
        if (mky.a(n2) != null) {
            n2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        c = (String) n2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Throwable a(java.lang.Throwable r10, defpackage.mnm r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nbi.a(java.lang.Throwable, mnm):java.lang.Throwable");
    }

    public static final Throwable b(Throwable th) {
        Throwable a2;
        int i;
        StackTraceElement stackTraceElement;
        if (msy.b && (a2 = nar.a(th)) != null) {
            StackTraceElement[] stackTrace = a2.getStackTrace();
            int length = stackTrace.length;
            int i2 = length - 1;
            if (i2 >= 0) {
                while (true) {
                    int i3 = i2 - 1;
                    if (amr.i(c, stackTrace[i2].getClassName())) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    i2 = i3;
                }
            }
            i2 = -1;
            int e = e(stackTrace, b);
            if (e == -1) {
                i = 0;
            } else {
                i = length - e;
            }
            int i4 = (length - i2) - i;
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                if (i5 == 0) {
                    stackTraceElement = a;
                } else {
                    stackTraceElement = stackTrace[((i2 + 1) + i5) - 1];
                }
                stackTraceElementArr[i5] = stackTraceElement;
            }
            a2.setStackTrace(stackTraceElementArr);
            return a2;
        }
        return th;
    }

    public static final Throwable c(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            if (amr.i(cause.getClass(), th.getClass())) {
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    if (d(stackTraceElement)) {
                        return cause;
                    }
                }
            }
        }
        return th;
    }

    public static final boolean d(StackTraceElement stackTraceElement) {
        return moz.I(stackTraceElement.getClassName(), "_COROUTINE");
    }

    private static final int e(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (amr.i(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }
}
