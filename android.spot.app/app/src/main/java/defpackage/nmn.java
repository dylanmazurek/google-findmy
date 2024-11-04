package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.os.Build;
import j$.util.DesugarCollections;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;
import org.chromium.net.UrlRequest;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class nmn implements nmy {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nmn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.nmy
    public final void a() {
        long networkHandle;
        List list;
        int i = this.b;
        boolean z = false;
        if (i != 0) {
            Network network = null;
            ReadableByteChannel readableByteChannel = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            nmu nmuVar = (nmu) this.a;
                            if (((nmx) nmuVar.d).g.compareAndSet(1, 4)) {
                                Object obj = nmuVar.a;
                                Object obj2 = nmuVar.d;
                                ((nni) obj).onResponseStarted((UrlRequest) obj2, ((nmx) obj2).o);
                                return;
                            }
                            return;
                        }
                        String str = nmx.a;
                        ((UploadDataProvider) this.a).close();
                        return;
                    }
                    Object obj3 = this.a;
                    nmx nmxVar = (nmx) obj3;
                    if (nmxVar.q == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    String str2 = "http/1.1";
                    int i2 = 0;
                    while (true) {
                        String headerFieldKey = nmxVar.q.getHeaderFieldKey(i2);
                        if (headerFieldKey == null) {
                            break;
                        }
                        if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                            str2 = nmxVar.q.getHeaderField(i2);
                        }
                        if (!headerFieldKey.startsWith("X-Android")) {
                            arrayList.add(new AbstractMap.SimpleEntry(headerFieldKey, nmxVar.q.getHeaderField(i2)));
                        }
                        i2++;
                    }
                    int responseCode = nmxVar.q.getResponseCode();
                    nnf nnfVar = new nnf(new ArrayList(nmxVar.f), responseCode, nmxVar.q.getResponseMessage(), DesugarCollections.unmodifiableList(arrayList), str2);
                    if (responseCode >= 300 && responseCode < 400 && (list = (List) nnfVar.getAllHeaders().get("location")) != null) {
                        nmxVar.i(1, 2, new kvo(obj3, (String) list.get(0), nnfVar, 7, null));
                        return;
                    }
                    nmxVar.o = nnfVar;
                    nmxVar.d();
                    if (responseCode >= 400) {
                        InputStream errorStream = nmxVar.q.getErrorStream();
                        if (errorStream != null) {
                            readableByteChannel = nmi.a(errorStream);
                        }
                        nmxVar.n = readableByteChannel;
                        nmxVar.b.c();
                        return;
                    }
                    nmxVar.n = nmi.a(nmxVar.q.getInputStream());
                    nmxVar.b.c();
                    return;
                }
                nmx nmxVar2 = (nmx) this.a;
                if (nmxVar2.g.get() == 8) {
                    return;
                }
                URL url = new URL(nmxVar2.m);
                HttpURLConnection httpURLConnection = nmxVar2.q;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                    nmxVar2.q = null;
                }
                if (nmxVar2.u != -1 && Build.VERSION.SDK_INT >= 23) {
                    long j = nmxVar2.u;
                    Network[] allNetworks = ((ConnectivityManager) nmxVar2.r.d.getSystemService("connectivity")).getAllNetworks();
                    int length = allNetworks.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        Network network2 = allNetworks[i3];
                        networkHandle = network2.getNetworkHandle();
                        if (networkHandle == j) {
                            network = network2;
                            break;
                        }
                        i3++;
                    }
                    if (network != null) {
                        nmxVar2.q = (HttpURLConnection) network.openConnection(url);
                    } else {
                        throw new nnb();
                    }
                } else {
                    nmxVar2.q = (HttpURLConnection) url.openConnection();
                }
                nmxVar2.q.setInstanceFollowRedirects(false);
                if (!nmxVar2.e.containsKey("User-Agent")) {
                    nmxVar2.e.put("User-Agent", nmxVar2.d);
                }
                for (Map.Entry entry : nmxVar2.e.entrySet()) {
                    nmxVar2.q.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                nmxVar2.q.setRequestMethod(nmxVar2.i);
                nnh nnhVar = nmxVar2.j;
                if (nnhVar != null) {
                    nmxVar2.y = new nmp(nmxVar2, nmxVar2.k, nmxVar2.c, nmxVar2.q, nnhVar);
                    nmp nmpVar = nmxVar2.y;
                    if (nmxVar2.f.size() == 1) {
                        z = true;
                    }
                    nmpVar.a(new nmo(nmpVar, z, 1));
                    return;
                }
                nmxVar2.l = 10;
                nmxVar2.q.connect();
                nmxVar2.f();
                return;
            }
            Object obj4 = this.a;
            nmp nmpVar2 = (nmp) obj4;
            nmpVar2.c.read((UploadDataSink) obj4, nmpVar2.d);
            nmpVar2.b.execute(new mgs(obj4, 15, null));
            return;
        }
        nmp nmpVar3 = (nmp) this.a;
        if (nmpVar3.i == null) {
            nmpVar3.k.l = 10;
            nmpVar3.h.setDoOutput(true);
            nmpVar3.h.connect();
            nmpVar3.k.l = 12;
            nmpVar3.j = nmpVar3.h.getOutputStream();
            nmpVar3.i = Channels.newChannel(nmpVar3.j);
        }
        nmpVar3.a.set(0);
        nmpVar3.b();
    }
}
