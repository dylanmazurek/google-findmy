package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jwo extends jwc {
    static final Unsafe a;
    static final long b;
    static final long c;
    static final long d;
    static final long e;
    static final long f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new jwn());
            }
            try {
                c = unsafe.objectFieldOffset(jwq.class.getDeclaredField("waiters"));
                b = unsafe.objectFieldOffset(jwq.class.getDeclaredField("listeners"));
                d = unsafe.objectFieldOffset(jwq.class.getDeclaredField("value"));
                e = unsafe.objectFieldOffset(jwp.class.getDeclaredField("thread"));
                f = unsafe.objectFieldOffset(jwp.class.getDeclaredField("next"));
                a = unsafe;
            } catch (NoSuchFieldException e2) {
                throw new RuntimeException(e2);
            }
        } catch (PrivilegedActionException e3) {
            throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
        }
    }

    @Override // defpackage.jwc
    public final jwg a(jwq jwqVar, jwg jwgVar) {
        jwg jwgVar2;
        do {
            jwgVar2 = jwqVar.listeners;
            if (jwgVar == jwgVar2) {
                break;
            }
        } while (!e(jwqVar, jwgVar2, jwgVar));
        return jwgVar2;
    }

    @Override // defpackage.jwc
    public final jwp b(jwq jwqVar, jwp jwpVar) {
        jwp jwpVar2;
        do {
            jwpVar2 = jwqVar.waiters;
            if (jwpVar == jwpVar2) {
                break;
            }
        } while (!g(jwqVar, jwpVar2, jwpVar));
        return jwpVar2;
    }

    @Override // defpackage.jwc
    public final void c(jwp jwpVar, jwp jwpVar2) {
        a.putObject(jwpVar, f, jwpVar2);
    }

    @Override // defpackage.jwc
    public final void d(jwp jwpVar, Thread thread) {
        a.putObject(jwpVar, e, thread);
    }

    @Override // defpackage.jwc
    public final boolean e(jwq jwqVar, jwg jwgVar, jwg jwgVar2) {
        return jwm.a(a, jwqVar, b, jwgVar, jwgVar2);
    }

    @Override // defpackage.jwc
    public final boolean f(jwq jwqVar, Object obj, Object obj2) {
        return jwm.a(a, jwqVar, d, obj, obj2);
    }

    @Override // defpackage.jwc
    public final boolean g(jwq jwqVar, jwp jwpVar, jwp jwpVar2) {
        return jwm.a(a, jwqVar, c, jwpVar, jwpVar2);
    }
}
