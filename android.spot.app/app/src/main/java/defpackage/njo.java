package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class njo extends nju {
    public static final boolean a;
    private final List c;

    static {
        boolean z = false;
        if (mkm.aS() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        a = z;
    }

    public njo() {
        njv njvVar;
        nkc[] nkcVarArr = new nkc[2];
        if (mkm.aQ()) {
            njvVar = new njv();
        } else {
            njvVar = null;
        }
        nkcVarArr[0] = njvVar;
        nkcVarArr[1] = new nkb(nka.a);
        List l = mkm.l(nkcVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (((nkc) obj).c()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
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
        networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
        isCleartextTrafficPermitted = networkSecurityPolicy.isCleartextTrafficPermitted(str);
        return isCleartextTrafficPermitted;
    }
}
