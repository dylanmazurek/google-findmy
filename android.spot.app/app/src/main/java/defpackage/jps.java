package defpackage;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jps {
    public static final jpu a;

    static {
        String[] strArr;
        strArr = jpu.d;
        a = a(strArr);
    }

    private static jpu a(String[] strArr) {
        jqd jqdVar;
        try {
            jqdVar = jqe.a;
        } catch (NoClassDefFoundError unused) {
            jqdVar = null;
        }
        if (jqdVar != null) {
            return jqdVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (jpu) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
