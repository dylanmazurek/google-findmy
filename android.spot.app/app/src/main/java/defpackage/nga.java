package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nga {
    public final ngr a;
    public final nfo b;
    public final List c;
    private final mkt d;

    public nga(ngr ngrVar, nfo nfoVar, List list, mnw mnwVar) {
        ngrVar.getClass();
        this.a = ngrVar;
        this.b = nfoVar;
        this.c = list;
        this.d = new mla(new nfz(mnwVar));
    }

    private static final String b(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        type.getClass();
        return type;
    }

    public final List a() {
        return (List) this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nga) {
            nga ngaVar = (nga) obj;
            if (ngaVar.a == this.a && amr.i(ngaVar.b, this.b) && amr.i(ngaVar.a(), a()) && amr.i(ngaVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + a().hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        List a = a();
        ArrayList arrayList = new ArrayList(mkm.ap(a));
        Iterator it = a.iterator();
        while (it.hasNext()) {
            arrayList.add(b((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        ngr ngrVar = this.a;
        nfo nfoVar = this.b;
        List list = this.c;
        ArrayList arrayList2 = new ArrayList(mkm.ap(list));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(b((Certificate) it2.next()));
        }
        return "Handshake{tlsVersion=" + ngrVar + " cipherSuite=" + nfoVar + " peerCertificates=" + obj + " localCertificates=" + arrayList2 + "}";
    }
}
