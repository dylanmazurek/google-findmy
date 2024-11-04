package defpackage;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dlb extends Exception {
    private static final StackTraceElement[] a = new StackTraceElement[0];
    private static final long serialVersionUID = 1;
    private final List b;
    private dir c;
    private Class d;
    private String e;
    private int f;

    public dlb(String str) {
        this(str, Collections.emptyList());
    }

    private final void c(Throwable th, List list) {
        if (th instanceof dlb) {
            Iterator it = ((dlb) th).b.iterator();
            while (it.hasNext()) {
                c((Throwable) it.next(), list);
            }
            return;
        }
        list.add(th);
    }

    private static void d(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    private final void e(Appendable appendable) {
        d(this, appendable);
        dla dlaVar = new dla(appendable);
        List list = this.b;
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                dlaVar.append("Cause (");
                int i2 = i + 1;
                dlaVar.append(String.valueOf(i2));
                dlaVar.append(" of ");
                dlaVar.append(String.valueOf(size));
                dlaVar.append("): ");
                Throwable th = (Throwable) list.get(i);
                if (th instanceof dlb) {
                    ((dlb) th).e(dlaVar);
                } else {
                    d(th, dlaVar);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final List a() {
        ArrayList arrayList = new ArrayList();
        c(this, arrayList);
        return arrayList;
    }

    public final void b(dir dirVar, int i, Class cls) {
        this.c = dirVar;
        this.f = i;
        this.d = cls;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        Class cls = this.d;
        String str3 = "";
        if (cls == null) {
            str = "";
        } else {
            str = ", ".concat(cls.toString());
        }
        sb.append(str);
        int i = this.f;
        if (i == 0) {
            str2 = "";
        } else {
            str2 = ", ".concat(bpx.n(i));
        }
        sb.append(str2);
        dir dirVar = this.c;
        if (dirVar != null) {
            str3 = ", ".concat(dirVar.toString());
        }
        sb.append(str3);
        List<Throwable> a2 = a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" root causes:");
        }
        for (Throwable th : a2) {
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        e(System.err);
    }

    public dlb(String str, List list) {
        this.e = str;
        setStackTrace(a);
        this.b = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        e(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        e(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
