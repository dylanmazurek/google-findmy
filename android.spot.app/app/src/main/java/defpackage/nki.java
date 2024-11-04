package defpackage;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nki implements HostnameVerifier {
    public static final nki a = new nki();

    private nki() {
    }

    public static final List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return mlx.a;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && amr.i(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return mlx.a;
        }
    }

    public static final boolean b(String str, X509Certificate x509Certificate) {
        String str2;
        if (ngt.q(str)) {
            String bd = mkm.bd(str);
            List a2 = a(x509Certificate, 7);
            if (a2.isEmpty()) {
                return false;
            }
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                if (amr.i(bd, mkm.bd((String) it.next()))) {
                }
            }
            return false;
        }
        String d = d(str);
        List<String> a3 = a(x509Certificate, 2);
        if (a3.isEmpty()) {
            return false;
        }
        for (String str3 : a3) {
            if (d.length() != 0 && !moz.I(d, ".") && !moz.u(d, "..") && str3 != null && str3.length() != 0 && !moz.I(str3, ".") && !moz.u(str3, "..")) {
                if (!moz.u(d, ".")) {
                    str2 = d.concat(".");
                } else {
                    str2 = d;
                }
                if (!moz.u(str3, ".")) {
                    str3 = str3.concat(".");
                }
                String d2 = d(str3);
                if (!moz.t(d2, "*")) {
                    if (amr.i(str2, d2)) {
                    }
                } else if (moz.I(d2, "*.") && moz.x(d2, '*', 1, 4) == -1 && str2.length() >= d2.length() && !amr.i("*.", d2)) {
                    String substring = d2.substring(1);
                    substring.getClass();
                    if (moz.u(str2, substring)) {
                        int length = str2.length() - substring.length();
                        if (length > 0 && moz.z(str2, '.', length - 1, 4) != -1) {
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
        return true;
    }

    private static final boolean c(String str) {
        long j;
        char c;
        int length = str.length();
        if (length >= 0) {
            if (length <= str.length()) {
                long j2 = 0;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if (charAt >= 128) {
                        if (charAt < 2048) {
                            j = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            if (i2 < length) {
                                c = str.charAt(i2);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j2 += 4;
                                i += 2;
                            }
                        } else {
                            j = 3;
                        }
                        j2 += j;
                        i = i2;
                    }
                    j2++;
                    i = i2;
                }
                if (str.length() != ((int) j2)) {
                    return false;
                }
                return true;
            }
            throw new IllegalArgumentException("endIndex > string.length: " + length + " > " + str.length());
        }
        throw new IllegalArgumentException(a.am(length, "endIndex < beginIndex: ", " < 0"));
    }

    private static final String d(String str) {
        if (c(str)) {
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            lowerCase.getClass();
            return lowerCase;
        }
        return str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        str.getClass();
        sSLSession.getClass();
        if (c(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                certificate.getClass();
            } catch (SSLException unused) {
                return false;
            }
        }
        return b(str, (X509Certificate) certificate);
    }
}
