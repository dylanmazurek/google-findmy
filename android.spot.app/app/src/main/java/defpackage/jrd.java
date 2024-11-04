package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jrd {
    public static final jrg a;
    private static final String[] b = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [jrg] */
    static {
        jrh jrhVar;
        int i = 0;
        while (true) {
            if (i < 2) {
                jrhVar = null;
                try {
                    jrhVar = (jrg) Class.forName(b[i]).asSubclass(jrg.class).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable unused) {
                }
                if (jrhVar != null) {
                    break;
                } else {
                    i++;
                }
            } else {
                jrhVar = new jrh();
                break;
            }
        }
        a = jrhVar;
    }
}
