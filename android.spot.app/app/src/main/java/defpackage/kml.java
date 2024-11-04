package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kml implements kmm {
    private final kmp a;
    private final /* synthetic */ int b;

    public kml(kmp kmpVar, int i) {
        this.b = i;
        this.a = kmpVar;
    }

    @Override // defpackage.kmm
    public final Object a(String str) {
        int i = this.b;
        Exception exc = null;
        if (i != 0) {
            if (i != 1) {
                Iterator it = kmn.c("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
                while (it.hasNext()) {
                    try {
                        return this.a.a(str, (Provider) it.next());
                    } catch (Exception e) {
                        if (exc == null) {
                            exc = e;
                        }
                    }
                }
                throw new GeneralSecurityException("No good Provider found.", exc);
            }
            Iterator it2 = kmn.c("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            while (it2.hasNext()) {
                try {
                    return this.a.a(str, (Provider) it2.next());
                } catch (Exception unused) {
                }
            }
            return this.a.a(str, null);
        }
        return this.a.a(str, null);
    }

    @Override // defpackage.kmm
    public final Object b(String str, List list) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return a(str);
            }
            return a(str);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                return this.a.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return a(str);
    }
}
