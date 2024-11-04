package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.SSLSessionCache;
import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.EventLog;
import android.util.Log;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnManagerParamBean;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.impl.client.EntityEnclosingRequestWrapper;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HttpContext;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izp implements HttpClient {
    public final ThreadLocal a = new ThreadLocal();
    private final izj b;
    private final izl c;
    private final ContentResolver d;
    private final String e;

    public izp(Context context, String str) {
        SocketFactory izoVar;
        String concat = (str + " (" + Build.DEVICE + " " + Build.ID + ")").concat("; gzip");
        HttpRequestInterceptor httpRequestInterceptor = izj.a;
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, false);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, false);
        SSLSessionCache sSLSessionCache = new SSLSessionCache(context);
        HttpProtocolParams.setUserAgent(basicHttpParams, concat);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", izq.a, 80));
        schemeRegistry.register(new Scheme("https", izj.a(sSLSessionCache), 443));
        ConnManagerParamBean connManagerParamBean = new ConnManagerParamBean(basicHttpParams);
        connManagerParamBean.setConnectionsPerRoute(new ConnPerRouteBean(4));
        connManagerParamBean.setMaxTotalConnections(8);
        izj izjVar = new izj(new izw(basicHttpParams, schemeRegistry), basicHttpParams);
        this.b = izjVar;
        this.c = new izl(this, izjVar);
        this.d = context.getContentResolver();
        this.e = str;
        SchemeRegistry schemeRegistry2 = getConnectionManager().getSchemeRegistry();
        for (String str2 : schemeRegistry2.getSchemeNames()) {
            Scheme unregister = schemeRegistry2.unregister(str2);
            SocketFactory socketFactory = unregister.getSocketFactory();
            if (socketFactory instanceof LayeredSocketFactory) {
                izoVar = new izn(this, (LayeredSocketFactory) socketFactory);
            } else {
                izoVar = new izo(this, socketFactory);
            }
            schemeRegistry2.register(new Scheme(str2, izoVar, unregister.getDefaultPort()));
        }
    }

    public static RequestWrapper a(HttpRequest httpRequest) {
        RequestWrapper requestWrapper;
        try {
            if (httpRequest instanceof HttpEntityEnclosingRequest) {
                requestWrapper = new EntityEnclosingRequestWrapper((HttpEntityEnclosingRequest) httpRequest);
            } else {
                requestWrapper = new RequestWrapper(httpRequest);
            }
            requestWrapper.resetHeaders();
            return requestWrapper;
        } catch (ProtocolException e) {
            throw new ClientProtocolException(e);
        }
    }

    public final HttpResponse b(HttpUriRequest httpUriRequest) {
        HttpResponse a;
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            HttpEntity httpEntity = null;
            this.a.set(null);
            if (fyo.c(this.d, "http_stats", false)) {
                int myUid = Process.myUid();
                long uidTxBytes = TrafficStats.getUidTxBytes(myUid);
                long uidRxBytes = TrafficStats.getUidRxBytes(myUid);
                a = this.c.a(httpUriRequest);
                if (a != null) {
                    httpEntity = a.getEntity();
                }
                HttpEntity httpEntity2 = httpEntity;
                if (httpEntity2 != null) {
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    a.setEntity(new ezy(httpEntity2, this.e, myUid, uidTxBytes, uidRxBytes, elapsedRealtime2 - elapsedRealtime, elapsedRealtime2));
                }
            } else {
                a = this.c.a(httpUriRequest);
            }
            HttpResponse httpResponse = a;
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            try {
                long elapsedRealtime3 = SystemClock.elapsedRealtime() - elapsedRealtime;
                if (this.a.get() == null && statusCode >= 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                EventLog.writeEvent(203002, Long.valueOf(elapsedRealtime3), Integer.valueOf(statusCode), this.e, Integer.valueOf(i));
            } catch (Exception e) {
                Log.e("GoogleHttpClient", "Error recording stats", e);
            }
            return httpResponse;
        } finally {
        }
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        a(httpRequest);
        Object obj = this.c.a;
        RequestWrapper a = a(httpRequest);
        int i = izf.a;
        return ((izj) obj).execute(httpHost, a);
    }

    @Override // org.apache.http.client.HttpClient
    public final ClientConnectionManager getConnectionManager() {
        return this.b.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpParams getParams() {
        return this.b.getParams();
    }

    @Override // org.apache.http.client.HttpClient
    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler) {
        izl izlVar = this.c;
        RequestWrapper a = a(httpRequest);
        Object obj = izlVar.b;
        izm izmVar = new izm(responseHandler);
        Object obj2 = izlVar.a;
        int i = izf.a;
        return ((izj) obj2).execute(httpHost, a, izmVar);
    }

    @Override // org.apache.http.client.HttpClient
    public final Object execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        izl izlVar = this.c;
        RequestWrapper a = a(httpRequest);
        Object obj = izlVar.b;
        izm izmVar = new izm(responseHandler);
        Object obj2 = izlVar.a;
        int i = izf.a;
        return ((izj) obj2).execute(httpHost, a, izmVar, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        a(httpRequest);
        Object obj = this.c.a;
        RequestWrapper a = a(httpRequest);
        int i = izf.a;
        return ((izj) obj).execute(httpHost, a, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return execute(httpUriRequest, (HttpContext) null);
    }

    @Override // org.apache.http.client.HttpClient
    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler) {
        izl izlVar = this.c;
        Object obj = izlVar.b;
        izm izmVar = new izm(responseHandler);
        int i = izf.a;
        return ((izj) izlVar.a).execute(httpUriRequest, izmVar);
    }

    @Override // org.apache.http.client.HttpClient
    public final Object execute(HttpUriRequest httpUriRequest, ResponseHandler responseHandler, HttpContext httpContext) {
        izl izlVar = this.c;
        Object obj = izlVar.b;
        return ((izj) izlVar.a).execute(httpUriRequest, new izm(responseHandler), httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        ezz ezzVar;
        String concat;
        String uri = httpUriRequest.getURI().toString();
        fab a = fab.a(this.d);
        Matcher matcher = a.c.matcher(uri);
        if (matcher.lookingAt()) {
            int i = 0;
            while (i < a.b.length) {
                int i2 = i + 1;
                if (matcher.group(i2) != null) {
                    ezzVar = a.b[i];
                    break;
                }
                i = i2;
            }
        }
        ezzVar = ezz.a;
        if (ezzVar.e) {
            concat = null;
        } else {
            String str = ezzVar.d;
            concat = str != null ? str.concat(String.valueOf(uri.substring(ezzVar.c.length()))) : uri;
        }
        if (concat == null) {
            Log.w("GoogleHttpClient", "Blocked by " + ezzVar.b + ": " + uri);
            throw new izk(ezzVar);
        }
        if (concat == uri) {
            return b(httpUriRequest);
        }
        try {
            URI uri2 = new URI(concat);
            RequestWrapper k = amr.k(httpUriRequest);
            k.setURI(uri2);
            return b(k);
        } catch (URISyntaxException e) {
            throw new RuntimeException("Bad URL from rule: ".concat(String.valueOf(ezzVar.b)), e);
        }
    }
}
