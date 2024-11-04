package defpackage;

import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngt {
    public static final byte[] a = new byte[0];
    public static final ngb b;
    public static final ngp c;
    public static final TimeZone d;
    public static final String e;
    private static final mrk f;

    static {
        String[] strArr = (String[]) new String[0].clone();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str != null) {
                strArr[i] = moz.k(str).toString();
            } else {
                throw new IllegalArgumentException("Headers cannot be null");
            }
        }
        int s = mjo.s(0, strArr.length - 1, 2);
        if (s >= 0) {
            int i2 = 0;
            while (true) {
                String str2 = strArr[i2];
                String str3 = strArr[i2 + 1];
                msz.B(str2);
                msz.C(str3, str2);
                if (i2 == s) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        b = new ngb(strArr);
        nkp nkpVar = new nkp();
        byte[] bArr = a;
        nkpVar.B(bArr, 0);
        c = new ngo(nkpVar);
        msz.I(bArr, null, 0);
        moz mozVar = nla.c;
        nks nksVar = nks.a;
        mozVar.aM(mkm.aJ("efbbbf"), mkm.aJ("feff"), mkm.aJ("fffe"), mkm.aJ("0000ffff"), mkm.aJ("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        timeZone.getClass();
        d = timeZone;
        f = new mrk("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        String name = ngh.class.getName();
        name.getClass();
        String l = moz.l(name, "okhttp3.");
        if (moz.u(l, "Client")) {
            l = l.substring(0, l.length() - "Client".length());
            l.getClass();
        }
        e = l;
    }

    public static final boolean A(nll nllVar, TimeUnit timeUnit) {
        timeUnit.getClass();
        try {
            return v(nllVar, 100, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final void B(Exception exc, List list) {
        exc.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mjo.l(exc, (Exception) it.next());
        }
    }

    public static final int a(String str, char c2, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) == c2) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int b(String str, String str2, int i, int i2) {
        while (i < i2) {
            if (moz.s(str2, str.charAt(i))) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int c(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (mpd.a(charAt, 31) <= 0 || mpd.a(charAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int d(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int e(String str, int i, int i2) {
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static final int f(char c2) {
        if (c2 >= '0' && c2 < ':') {
            return c2 - '0';
        }
        if (c2 >= 'a' && c2 < 'g') {
            return c2 - 'W';
        }
        if (c2 >= 'A' && c2 < 'G') {
            return c2 - '7';
        }
        return -1;
    }

    public static final int g(nkr nkrVar) {
        return x(nkrVar.d()) | (x(nkrVar.d()) << 16) | (x(nkrVar.d()) << 8);
    }

    public static final int h(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (parseLong < 0) {
                    return 0;
                }
                return (int) parseLong;
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public static final long i(ngn ngnVar) {
        String b2 = ngnVar.f.b("Content-Length");
        if (b2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final String j(String str, Object... objArr) {
        int length = objArr.length;
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        format.getClass();
        return format;
    }

    public static final String k(ngd ngdVar, boolean z) {
        String str;
        if (moz.t(ngdVar.c, ":")) {
            str = "[" + ngdVar.c + "]";
        } else {
            str = ngdVar.c;
        }
        if (!z && ngdVar.d == msz.x(ngdVar.b)) {
            return str;
        }
        return str + ":" + ngdVar.d;
    }

    public static final String l(String str, int i, int i2) {
        int d2 = d(str, i, i2);
        String substring = str.substring(d2, e(str, d2, i2));
        substring.getClass();
        return substring;
    }

    @SafeVarargs
    public static final List m(Object... objArr) {
        objArr.getClass();
        Object[] objArr2 = (Object[]) objArr.clone();
        List unmodifiableList = DesugarCollections.unmodifiableList(mkm.P(Arrays.copyOf(objArr2, objArr2.length)));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List n(List list) {
        List unmodifiableList = DesugarCollections.unmodifiableList(new ArrayList(list));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final ngb o(List list) {
        ktf ktfVar = new ktf((byte[]) null, (byte[]) null);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nig nigVar = (nig) it.next();
            ktfVar.n(nigVar.g.d(), nigVar.h.d());
        }
        return ktfVar.m();
    }

    public static final void p(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (amr.i(e3.getMessage(), "bio == null")) {
            } else {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean q(String str) {
        return f.a(str);
    }

    public static final boolean r(ngd ngdVar, ngd ngdVar2) {
        if (amr.i(ngdVar.c, ngdVar2.c) && ngdVar.d == ngdVar2.d && amr.i(ngdVar.b, ngdVar2.b)) {
            return true;
        }
        return false;
    }

    public static final boolean s(String[] strArr, String[] strArr2, Comparator comparator) {
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                mqt mqtVar = new mqt(strArr2, 1);
                while (mqtVar.hasNext()) {
                    if (comparator.compare(str, (String) mqtVar.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean t(Socket socket, nkr nkrVar) {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !nkrVar.v();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean u(String str) {
        str.getClass();
        if (!moz.v(str, "Authorization") && !moz.v(str, "Cookie") && !moz.v(str, "Proxy-Authorization") && !moz.v(str, "Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final boolean v(nll nllVar, int i, TimeUnit timeUnit) {
        long j;
        boolean z;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (nllVar.dv().g()) {
            j = nllVar.dv().h() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        nllVar.dv().j(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            nkp nkpVar = new nkp();
            while (nllVar.a(nkpVar, 8192L) != -1) {
                nkpVar.s();
            }
            z = true;
        } catch (InterruptedIOException unused) {
            z = false;
        } catch (Throwable th) {
            nln dv = nllVar.dv();
            if (j == Long.MAX_VALUE) {
                dv.m();
            } else {
                dv.j(nanoTime + j);
            }
            throw th;
        }
        if (j == Long.MAX_VALUE) {
            nllVar.dv().m();
        } else {
            nllVar.dv().j(nanoTime + j);
        }
        return z;
    }

    public static final String[] w(String[] strArr, String[] strArr2, Comparator comparator) {
        strArr2.getClass();
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int i = 0;
            while (true) {
                if (i >= strArr2.length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final int x(byte b2) {
        return b2 & 255;
    }

    public static final void y(long j, long j2) {
        if (j >= 0 && j >= j2) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static /* synthetic */ int z(String str, char c2, int i, int i2) {
        if ((i2 & 4) != 0) {
            i = str.length();
        }
        return a(str, c2, 0, i);
    }
}
