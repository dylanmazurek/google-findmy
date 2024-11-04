package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.google.ar.core.AugmentedFace;
import com.google.ar.core.Session;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.IllegalFormatException;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jck {
    public final Object a;

    public jck(Object obj) {
        this.a = obj;
    }

    public static long l(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                j += l(file2);
            }
        }
        return j;
    }

    private static String n(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return a.an(str2, str, " : ");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Map, java.lang.Object] */
    public final synchronized AugmentedFace a(long j, Session session) {
        ?? r0 = this.a;
        Long valueOf = Long.valueOf(j);
        AugmentedFace augmentedFace = (AugmentedFace) r0.get(valueOf);
        if (augmentedFace == null) {
            AugmentedFace augmentedFace2 = new AugmentedFace(j, session);
            this.a.put(valueOf, augmentedFace2);
            return augmentedFace2;
        }
        return augmentedFace;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    public final void b(jmg jmgVar) {
        hwx.O(!jmgVar.b(), "range must not be empty, but was %s", jmgVar);
        this.a.add(jmgVar);
    }

    public final Object c() {
        return ivc.M(((jxp) this.a).d);
    }

    public final void d() {
        ((jxp) this.a).c();
    }

    public final void e(Object obj, Executor executor) {
        executor.getClass();
        ((jxk) this.a).a((AutoCloseable) obj, executor);
    }

    public final jyz f(Callable callable, Executor executor) {
        return ((lzl) this.a).a(jbn.g(callable), executor);
    }

    public final jyz g(jxc jxcVar, Executor executor) {
        return ((lzl) this.a).b(jbn.b(jxcVar), executor);
    }

    public final jbx h(jxc jxcVar, Executor executor) {
        return jbx.d(((jck) this.a).g(jxcVar, executor));
    }

    public final void i(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", n((String) this.a, str, objArr));
        }
    }

    public final void j(Throwable th, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", n((String) this.a, str, objArr), th);
        }
    }

    public final void k(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", n((String) this.a, str, objArr));
        }
    }

    public final jyz m(IOException iOException, ilf ilfVar) {
        if (!(iOException.getCause() instanceof ljy)) {
            return ivc.D(iOException);
        }
        return jwb.h(ilfVar.a(ivc.E(this.a)), IOException.class, new jty(iOException, 1), jxv.a);
    }

    public jck(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public jck(byte[] bArr, byte[] bArr2) {
        this.a = "";
    }

    public jck(String str) {
        this.a = ("UID: [" + Process.myUid() + "]  PID: [" + Process.myPid() + "] ").concat(str);
    }

    public jck() {
        this.a = new jcj();
    }

    public jck(Matcher matcher) {
        matcher.getClass();
        this.a = matcher;
    }

    public jck(char[] cArr) {
        this.a = new ArrayList();
    }

    public jck(Field field) {
        this.a = field;
        field.setAccessible(true);
    }
}
