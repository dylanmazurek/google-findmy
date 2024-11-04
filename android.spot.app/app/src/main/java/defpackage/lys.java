package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lys {
    public static final lys a;
    public final lzj b;
    public final Executor c;
    public final List d;
    public final Integer e;
    public final Integer f;
    private final Object[][] g;
    private final Boolean h;

    static {
        lyq lyqVar = new lyq();
        lyqVar.c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);
        lyqVar.d = Collections.emptyList();
        a = new lys(lyqVar);
    }

    public lys(lyq lyqVar) {
        this.b = lyqVar.a;
        this.c = lyqVar.b;
        this.g = lyqVar.c;
        this.d = lyqVar.d;
        this.h = lyqVar.e;
        this.e = lyqVar.f;
        this.f = lyqVar.g;
    }

    public static lyq a(lys lysVar) {
        lyq lyqVar = new lyq();
        lyqVar.a = lysVar.b;
        lyqVar.b = lysVar.c;
        lyqVar.c = lysVar.g;
        lyqVar.d = lysVar.d;
        lyqVar.e = lysVar.h;
        lyqVar.f = lysVar.e;
        lyqVar.g = lysVar.f;
        return lyqVar;
    }

    public final lys b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.M(z, "invalid maxsize %s", i);
        lyq a2 = a(this);
        a2.f = Integer.valueOf(i);
        return new lys(a2);
    }

    public final lys c(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.M(z, "invalid maxsize %s", i);
        lyq a2 = a(this);
        a2.g = Integer.valueOf(i);
        return new lys(a2);
    }

    public final lys d(lyr lyrVar, Object obj) {
        int i;
        lyrVar.getClass();
        obj.getClass();
        lyq a2 = a(this);
        int i2 = 0;
        while (true) {
            Object[][] objArr = this.g;
            if (i2 < objArr.length) {
                if (lyrVar.equals(objArr[i2][0])) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        Object[][] objArr2 = this.g;
        if (i2 == -1) {
            i = 1;
        } else {
            i = 0;
        }
        a2.c = (Object[][]) Array.newInstance((Class<?>) Object.class, objArr2.length + i, 2);
        Object[][] objArr3 = this.g;
        System.arraycopy(objArr3, 0, a2.c, 0, objArr3.length);
        if (i2 == -1) {
            Object[][] objArr4 = a2.c;
            int length = this.g.length;
            Object[] objArr5 = new Object[2];
            objArr5[0] = lyrVar;
            objArr5[1] = obj;
            objArr4[length] = objArr5;
        } else {
            Object[][] objArr6 = a2.c;
            Object[] objArr7 = new Object[2];
            objArr7[0] = lyrVar;
            objArr7[1] = obj;
            objArr6[i2] = objArr7;
        }
        return new lys(a2);
    }

    public final Object e(lyr lyrVar) {
        lyrVar.getClass();
        int i = 0;
        while (true) {
            Object[][] objArr = this.g;
            if (i < objArr.length) {
                if (lyrVar.equals(objArr[i][0])) {
                    return this.g[i][1];
                }
                i++;
            } else {
                return lyrVar.a;
            }
        }
    }

    public final boolean f() {
        return Boolean.TRUE.equals(this.h);
    }

    public final lys g(mjo mjoVar) {
        ArrayList arrayList = new ArrayList(this.d.size() + 1);
        arrayList.addAll(this.d);
        arrayList.add(mjoVar);
        lyq a2 = a(this);
        a2.d = DesugarCollections.unmodifiableList(arrayList);
        return new lys(a2);
    }

    public final String toString() {
        Class<?> cls;
        jeq q = ivc.q(this);
        q.b("deadline", this.b);
        q.b("authority", null);
        q.b("callCredentials", null);
        Executor executor = this.c;
        if (executor != null) {
            cls = executor.getClass();
        } else {
            cls = null;
        }
        q.b("executor", cls);
        q.b("compressorName", null);
        q.b("customOptions", Arrays.deepToString(this.g));
        q.f("waitForReady", f());
        q.b("maxInboundMessageSize", this.e);
        q.b("maxOutboundMessageSize", this.f);
        q.b("streamTracerFactories", this.d);
        return q.toString();
    }
}
