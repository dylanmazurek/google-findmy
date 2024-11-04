package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nka implements nkc {
    public static final njz a = new njz();
    private final Class b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;

    public nka(Class cls) {
        this.b = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.c = declaredMethod;
        this.d = cls.getMethod("setHostname", String.class);
        this.e = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.nkc
    public final String a(SSLSocket sSLSocket) {
        if (!d(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.e.invoke(sSLSocket, null);
            if (bArr == null) {
                return null;
            }
            return new String(bArr, mrh.a);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && amr.i(cause.getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.nkc
    public final void b(SSLSocket sSLSocket, String str, List list) {
        if (d(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, true);
                this.d.invoke(sSLSocket, str);
                Method method = this.f;
                nju njuVar = nju.b;
                nkp nkpVar = new nkp();
                for (String str2 : mkm.aR(list)) {
                    nkpVar.D(str2.length());
                    nkpVar.K(str2);
                }
                method.invoke(sSLSocket, nkpVar.x());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.nkc
    public final boolean c() {
        return njq.a;
    }

    @Override // defpackage.nkc
    public final boolean d(SSLSocket sSLSocket) {
        return this.b.isInstance(sSLSocket);
    }

    public nka(Class cls, byte[] bArr) {
        this(cls);
    }
}
