package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njq extends nju {
    public static final boolean a;
    private final List c;
    private final bso d;

    static {
        boolean z = false;
        if (mkm.aS() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        a = z;
    }

    public njq() {
        nka nkaVar;
        Method method;
        Method method2;
        nkc[] nkcVarArr = new nkc[2];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            cls.getClass();
            Class.forName("com.android.org.conscrypt.OpenSSLSocketFactoryImpl").getClass();
            Class.forName("com.android.org.conscrypt.SSLParametersImpl").getClass();
            nkaVar = new nka(cls, null);
        } catch (Exception e) {
            nju.b.k("unable to load android socket classes", 5, e);
            nkaVar = null;
        }
        nkcVarArr[0] = nkaVar;
        nkcVarArr[1] = new nkb(nka.a);
        List l = mkm.l(nkcVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (((nkc) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new bso(method3, method2, method);
    }

    @Override // defpackage.nju
    public final String a(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((nkc) obj).d(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        nkc nkcVar = (nkc) obj;
        if (nkcVar == null) {
            return null;
        }
        return nkcVar.a(sSLSocket);
    }

    @Override // defpackage.nju
    public final nkh b(X509TrustManager x509TrustManager) {
        njw aP = mkm.aP(x509TrustManager);
        if (aP != null) {
            return aP;
        }
        return super.b(x509TrustManager);
    }

    @Override // defpackage.nju
    public final void c(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        Iterator it = this.c.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((nkc) obj).d(sSLSocket)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        nkc nkcVar = (nkc) obj;
        if (nkcVar != null) {
            nkcVar.b(sSLSocket, str, list);
        }
    }

    @Override // defpackage.nju
    public final boolean d(String str) {
        NetworkSecurityPolicy networkSecurityPolicy;
        boolean isCleartextTrafficPermitted;
        NetworkSecurityPolicy networkSecurityPolicy2;
        boolean isCleartextTrafficPermitted2;
        if (Build.VERSION.SDK_INT >= 24) {
            networkSecurityPolicy2 = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted2 = networkSecurityPolicy2.isCleartextTrafficPermitted(str);
            return isCleartextTrafficPermitted2;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
            isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted();
            return isCleartextTrafficPermitted;
        }
        return true;
    }

    @Override // defpackage.nju
    public final nkj e(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            declaredMethod.getClass();
            return new njp(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.e(x509TrustManager);
        }
    }

    @Override // defpackage.nju
    public final void f(String str, Object obj) {
        bso bsoVar = this.d;
        if (obj != null) {
            try {
                Object obj2 = bsoVar.a;
                obj2.getClass();
                ((Method) obj2).invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        nju.l(this, str, 5, 4);
    }

    @Override // defpackage.nju
    public final Object g() {
        bso bsoVar = this.d;
        Object obj = bsoVar.b;
        if (obj == null) {
            return null;
        }
        try {
            Object invoke = ((Method) obj).invoke(null, null);
            Object obj2 = bsoVar.c;
            obj2.getClass();
            ((Method) obj2).invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.nju
    public final void h(Socket socket, InetSocketAddress inetSocketAddress) {
        socket.getClass();
        try {
            socket.connect(inetSocketAddress, 10000);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", e);
            }
            throw e;
        }
    }
}
