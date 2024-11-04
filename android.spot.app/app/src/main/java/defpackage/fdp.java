package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import j$.net.URLEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdp extends fcl {
    public static final byte[] a = "\n".getBytes();
    public final fdv b;
    private final String d;

    public fdp(fcn fcnVar) {
        super(fcnVar);
        this.d = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", fcm.a, Build.VERSION.RELEASE, fma.bi(Locale.getDefault()), Build.MODEL, Build.ID);
        this.b = new fdv();
    }

    private static final void O(StringBuilder sb, String str, String str2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(str, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(str2, "UTF-8"));
    }

    public final URL K(fdj fdjVar, String str) {
        String str2;
        if (fdjVar.f) {
            k();
            String f = fdc.f();
            k();
            str2 = f + fdc.g() + "?" + str;
        } else {
            k();
            String h = fdc.h();
            k();
            str2 = h + fdc.g() + "?" + str;
        }
        try {
            return new URL(str2);
        } catch (MalformedURLException e) {
            v("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final void L(HttpURLConnection httpURLConnection) {
        InputStream inputStream;
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            do {
            } while (inputStream.read(new byte[1024]) > 0);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    v("Error closing http connection input stream", e);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    v("Error closing http connection input stream", e2);
                }
            }
            throw th;
        }
    }

    public final boolean M() {
        NetworkInfo networkInfo;
        fbm.b();
        H();
        try {
            networkInfo = ((ConnectivityManager) f().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException unused) {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        y("No network connectivity");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int N(java.net.URL r6, byte[] r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Error closing http post connection output stream"
            defpackage.fma.aR(r7)
            int r1 = r7.length
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "POST bytes, url"
            r5.t(r3, r2, r6)
            F()
            r2 = 0
            java.net.HttpURLConnection r6 = r5.c(r6)     // Catch: java.lang.Throwable -> L4d java.io.IOException -> L50
            r3 = 1
            r6.setDoOutput(r3)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r6.setFixedLengthStreamingMode(r1)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r6.connect()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            java.io.OutputStream r2 = r6.getOutputStream()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r2.write(r7)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r5.L(r6)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r1 = 200(0xc8, float:2.8E-43)
            if (r7 != r1) goto L3c
            fcj r7 = r5.i()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r7.e()     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r7 = 200(0xc8, float:2.8E-43)
        L3c:
            java.lang.String r1 = "POST status"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            r5.s(r1, r3)     // Catch: java.lang.Throwable -> L46 java.io.IOException -> L48
            goto L5b
        L46:
            r7 = move-exception
            goto L6f
        L48:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
            goto L52
        L4d:
            r7 = move-exception
            r6 = r2
            goto L6f
        L50:
            r7 = move-exception
            r6 = r2
        L52:
            java.lang.String r1 = "Network POST connection error"
            r5.C(r1, r7)     // Catch: java.lang.Throwable -> L6b
            r7 = 0
            r4 = r2
            r2 = r6
            r6 = r4
        L5b:
            if (r2 == 0) goto L65
            r2.close()     // Catch: java.io.IOException -> L61
            goto L65
        L61:
            r1 = move-exception
            r5.v(r0, r1)
        L65:
            if (r6 == 0) goto L6a
            r6.disconnect()
        L6a:
            return r7
        L6b:
            r7 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L6f:
            if (r2 == 0) goto L79
            r2.close()     // Catch: java.io.IOException -> L75
            goto L79
        L75:
            r1 = move-exception
            r5.v(r0, r1)
        L79:
            if (r6 == 0) goto L7e
            r6.disconnect()
        L7e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fdp.N(java.net.URL, byte[]):int");
    }

    @Override // defpackage.fcl
    protected final void a() {
        z("Network initialized. User agent", this.d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b(fdj fdjVar, boolean z) {
        String valueOf;
        fma.aR(fdjVar);
        StringBuilder sb = new StringBuilder();
        try {
            for (Map.Entry entry : fdjVar.a.entrySet()) {
                String str = (String) entry.getKey();
                if (!"ht".equals(str) && !"qt".equals(str) && !"AppUID".equals(str) && !"z".equals(str) && !"_gmsv".equals(str)) {
                    O(sb, str, (String) entry.getValue());
                }
            }
            O(sb, "ht", String.valueOf(fdjVar.d));
            G();
            O(sb, "qt", String.valueOf(System.currentTimeMillis() - fdjVar.d));
            k();
            if (z) {
                long bg = fma.bg(fdjVar.a("_s", "0"));
                if (bg != 0) {
                    valueOf = String.valueOf(bg);
                } else {
                    valueOf = String.valueOf(fdjVar.c);
                }
                O(sb, "z", valueOf);
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            v("Failed to encode name or value", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final HttpURLConnection c(URL url) {
        URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            k();
            httpURLConnection.setConnectTimeout(((Integer) fdh.v.x()).intValue());
            k();
            httpURLConnection.setReadTimeout(((Integer) fdh.w.x()).intValue());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.d);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }

    public final URL d() {
        k();
        String f = fdc.f();
        k();
        try {
            return new URL(f.concat((String) fdh.m.x()));
        } catch (MalformedURLException e) {
            v("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }

    public final URL e(fdj fdjVar) {
        String concat;
        if (fdjVar.f) {
            k();
            String f = fdc.f();
            k();
            concat = f.concat(fdc.g());
        } else {
            k();
            String h = fdc.h();
            k();
            concat = h.concat(fdc.g());
        }
        try {
            return new URL(concat);
        } catch (MalformedURLException e) {
            v("Error trying to parse the hardcoded host url", e);
            return null;
        }
    }
}
