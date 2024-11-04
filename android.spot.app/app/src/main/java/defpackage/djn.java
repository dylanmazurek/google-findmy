package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djn implements dje {
    private final dnf a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;

    public djn(dnf dnfVar, int i) {
        this.a = dnfVar;
        this.b = i;
    }

    private static int b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    private final InputStream e(URL url, int i, URL url2, Map map) {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new dik("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpURLConnection.setConnectTimeout(this.b);
                httpURLConnection.setReadTimeout(this.b);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                this.c = httpURLConnection;
                try {
                    httpURLConnection.connect();
                    this.d = this.c.getInputStream();
                    if (this.e) {
                        return null;
                    }
                    int b = b(this.c);
                    int i2 = b / 100;
                    if (i2 == 2) {
                        HttpURLConnection httpURLConnection2 = this.c;
                        try {
                            if (TextUtils.isEmpty(httpURLConnection2.getContentEncoding())) {
                                this.d = new dtf(httpURLConnection2.getInputStream(), httpURLConnection2.getContentLength());
                            } else {
                                this.d = httpURLConnection2.getInputStream();
                            }
                            return this.d;
                        } catch (IOException e) {
                            throw new dik("Failed to obtain InputStream", b(httpURLConnection2), e);
                        }
                    }
                    if (i2 == 3) {
                        String headerField = this.c.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField)) {
                            try {
                                URL url3 = new URL(url, headerField);
                                d();
                                return e(url3, i + 1, url, map);
                            } catch (MalformedURLException e2) {
                                throw new dik("Bad redirect url: ".concat(String.valueOf(headerField)), b, e2);
                            }
                        }
                        throw new dik("Received empty or null redirect url", b);
                    }
                    if (b == -1) {
                        throw new dik("Http request failed", -1);
                    }
                    try {
                        throw new dik(this.c.getResponseMessage(), b);
                    } catch (IOException e3) {
                        throw new dik("Failed to get a response message", b, e3);
                    }
                } catch (IOException e4) {
                    throw new dik("Failed to connect or obtain data", b(this.c), e4);
                }
            } catch (IOException e5) {
                throw new dik("URL.openConnection threw", 0, e5);
            }
        }
        throw new dik("Too many (> 5) redirects!", -1);
    }

    @Override // defpackage.dje
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.dje
    public final void cr() {
        this.e = true;
    }

    @Override // defpackage.dje
    public final void d() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.c;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.c = null;
    }

    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        SystemClock.elapsedRealtimeNanos();
        try {
            dnf dnfVar = this.a;
            if (dnfVar.f == null) {
                if (TextUtils.isEmpty(dnfVar.e)) {
                    String str = dnfVar.d;
                    if (TextUtils.isEmpty(str)) {
                        URL url = dnfVar.c;
                        bsc.q(url);
                        str = url.toString();
                    }
                    dnfVar.e = Uri.encode(str, "@#&=*+-_.,:!?()/~'%;$");
                }
                dnfVar.f = new URL(dnfVar.e);
            }
            URL url2 = dnfVar.f;
            dng dngVar = this.a.b;
            if (((dnk) dngVar).c == null) {
                synchronized (dngVar) {
                    if (((dnk) dngVar).c == null) {
                        HashMap hashMap = new HashMap();
                        for (Map.Entry entry : ((dnk) dngVar).b.entrySet()) {
                            List list = (List) entry.getValue();
                            StringBuilder sb = new StringBuilder();
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                String a = ((dnh) list.get(i)).a();
                                if (!TextUtils.isEmpty(a)) {
                                    sb.append(a);
                                    if (i != list.size() - 1) {
                                        sb.append(',');
                                    }
                                }
                            }
                            String sb2 = sb.toString();
                            if (!TextUtils.isEmpty(sb2)) {
                                hashMap.put((String) entry.getKey(), sb2);
                            }
                        }
                        ((dnk) dngVar).c = DesugarCollections.unmodifiableMap(hashMap);
                    }
                }
            }
            djdVar.b(e(url2, 0, null, ((dnk) dngVar).c));
        } catch (IOException e) {
            djdVar.e(e);
        }
    }

    @Override // defpackage.dje
    public final int g() {
        return 2;
    }
}
