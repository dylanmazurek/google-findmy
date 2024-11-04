package defpackage;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class llu {
    public static final boolean a;
    static final long b;
    static final boolean c;
    private static final Unsafe d;
    private static final Class e;
    private static final boolean f;
    private static final llt g;
    private static final long h;

    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    static {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.llu.<clinit>():void");
    }

    private llu() {
    }

    private static Field A(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void B(Class cls) {
        if (a) {
            g.a.arrayIndexScale(cls);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte a(long j) {
        return g.a(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double b(Object obj, long j) {
        return g.b(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float c(Object obj, long j) {
        return g.c(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(Object obj, long j) {
        return g.j(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long e(ByteBuffer byteBuffer) {
        return g.k(byteBuffer, h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long f(Object obj, long j) {
        return g.k(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object g(Class cls) {
        try {
            return d.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object h(Object obj, long j) {
        return g.a.getObject(obj, j);
    }

    public static Field i() {
        Field A = A(Buffer.class, "effectiveDirectAddress");
        if (A == null) {
            Field A2 = A(Buffer.class, "address");
            if (A2 != null && A2.getType() == Long.TYPE) {
                return A2;
            }
            return null;
        }
        return A;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe j() {
        try {
            return (Unsafe) AccessController.doPrivileged(new llq());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(long j, byte[] bArr, long j2, long j3) {
        g.d(j, bArr, j2, j3);
    }

    public static void l(Throwable th) {
        Logger.getLogger(llu.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void m(Object obj, long j, boolean z) {
        g.e(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void n(byte[] bArr, long j, byte b2) {
        g.f(bArr, b + j, b2);
    }

    public static void o(Object obj, long j, byte b2) {
        int i = ((~((int) j)) & 3) << 3;
        long j2 = j & (-4);
        int i2 = (b2 & 255) << i;
        s(obj, j2, i2 | ((~(255 << i)) & d(obj, j2)));
    }

    public static void p(Object obj, long j, byte b2) {
        int i = (((int) j) & 3) << 3;
        long j2 = j & (-4);
        int i2 = (b2 & 255) << i;
        s(obj, j2, i2 | ((~(255 << i)) & d(obj, j2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void q(Object obj, long j, double d2) {
        g.g(obj, j, d2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void r(Object obj, long j, float f2) {
        g.h(obj, j, f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s(Object obj, long j, int i) {
        g.l(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void t(Object obj, long j, long j2) {
        g.m(obj, j, j2);
    }

    public static void u(Object obj, long j, Object obj2) {
        g.a.putObject(obj, j, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean v(Class cls) {
        try {
            Class cls2 = e;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            Class cls3 = Integer.TYPE;
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls3, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean w(Object obj, long j) {
        return g.i(obj, j);
    }

    public static boolean x(Object obj, long j) {
        if (((byte) ((d(obj, j & (-4)) >>> ((int) (((~j) & 3) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    public static boolean y(Object obj, long j) {
        if (((byte) ((d(obj, j & (-4)) >>> ((int) ((3 & j) << 3))) & 255)) != 0) {
            return true;
        }
        return false;
    }

    private static int z(Class cls) {
        if (a) {
            return g.a.arrayBaseOffset(cls);
        }
        return -1;
    }
}
