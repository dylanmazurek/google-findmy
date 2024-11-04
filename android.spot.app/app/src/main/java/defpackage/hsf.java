package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsf extends hsd implements hnl, hpg {
    public final Context a;
    public final lqz b;
    public final lqz d;
    public final mko e;
    public final hri h;
    private final hpd i;
    private final jzd j;
    public final Object c = new Object();
    public ArrayList f = new ArrayList(0);
    public final AtomicInteger g = new AtomicInteger();

    public hsf(hpe hpeVar, Context context, hnq hnqVar, jzd jzdVar, lqz lqzVar, lqz lqzVar2, mko mkoVar, Executor executor, hri hriVar) {
        this.h = hriVar;
        this.i = hpeVar.a(executor, lqzVar, mkoVar);
        this.a = context;
        this.j = jzdVar;
        this.b = lqzVar;
        this.d = lqzVar2;
        this.e = mkoVar;
        hnqVar.a(this);
    }

    @Override // defpackage.hsd
    public final void a(final hsb hsbVar) {
        String str;
        String str2;
        if (hsbVar.b <= 0 && hsbVar.c <= 0 && hsbVar.d <= 0 && hsbVar.e <= 0 && hsbVar.p <= 0 && hsbVar.r <= 0) {
            ((jni) ((jni) hmz.a.g()).j("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordAsFuture", 98, "NetworkMetricServiceImpl.java")).r("skip logging NetworkEvent due to empty bandwidth/latency data");
            jyz jyzVar = jyv.a;
            return;
        }
        hpd hpdVar = this.i;
        String str3 = hsbVar.g;
        if (str3 != null && hsbVar.h) {
            str = str3 + "/" + hsbVar.f;
        } else {
            str = hsbVar.f;
        }
        String str4 = hsbVar.k;
        if (ivc.o(str)) {
            str = "";
        } else {
            Matcher matcher = hsc.a.matcher(str);
            if (matcher.find()) {
                str = matcher.group(1);
            } else {
                Matcher matcher2 = hsc.c.matcher(str);
                if (matcher2.find()) {
                    str = matcher2.group(1);
                } else {
                    Matcher matcher3 = hsc.b.matcher(str);
                    if (matcher3.find() && str4 != null && !str4.startsWith("application/")) {
                        str = matcher3.group(1);
                    }
                }
            }
        }
        int i = hsbVar.t;
        if (i == 0) {
            str2 = null;
        } else {
            switch (i) {
                case 1:
                    str2 = "NONE";
                    break;
                case 2:
                    str2 = "MOBILE";
                    break;
                case 3:
                    str2 = "WIFI";
                    break;
                case 4:
                    str2 = "MOBILE_MMS";
                    break;
                case 5:
                    str2 = "MOBILE_SUPL";
                    break;
                case 6:
                    str2 = "MOBILE_DUN";
                    break;
                case 7:
                    str2 = "MOBILE_HIPRI";
                    break;
                case 8:
                    str2 = "WIMAX";
                    break;
                case 9:
                    str2 = "BLUETOOTH";
                    break;
                case 10:
                    str2 = "DUMMY";
                    break;
                case 11:
                    str2 = "ETHERNET";
                    break;
                case 12:
                    str2 = "MOBILE_FOTA";
                    break;
                case 13:
                    str2 = "MOBILE_IMS";
                    break;
                case 14:
                    str2 = "MOBILE_CBS";
                    break;
                case 15:
                    str2 = "WIFI_P2P";
                    break;
                case 16:
                    str2 = "MOBILE_IA";
                    break;
                case 17:
                    str2 = "MOBILE_EMERGENCY";
                    break;
                case 18:
                    str2 = "PROXY";
                    break;
                default:
                    str2 = "VPN";
                    break;
            }
        }
        jen jenVar = new jen(":");
        final long a = hpdVar.a(new jel(jenVar, jenVar).d(str, hsbVar.k, str2, null));
        if (a == -1) {
            jyz jyzVar2 = jyv.a;
        } else {
            this.g.incrementAndGet();
            ivc.J(new jxc() { // from class: hse
                @Override // defpackage.jxc
                public final jyz a() {
                    ArrayList arrayList;
                    jyz b;
                    NetworkInfo activeNetworkInfo;
                    long j = a;
                    hsf hsfVar = hsf.this;
                    try {
                        int J = a.J(((nfd) hsfVar.e.a()).c);
                        hsb hsbVar2 = hsbVar;
                        if (J != 0 && J == 5) {
                            hsbVar2.s = jer.i(Long.valueOf(j));
                        }
                        Context context = hsfVar.a;
                        hsbVar2.l = hsfVar.h.a();
                        int i2 = -1;
                        try {
                            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                            if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                                i2 = activeNetworkInfo.getType();
                            }
                        } catch (SecurityException e) {
                            ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/network/NetworkCapture", "getNetworkType", '$', "NetworkCapture.java")).r("Failed to get network type, Please add: android.permission.ACCESS_NETWORK_STATE to AndroidManifest.xml");
                        }
                        int s = mpp.s(i2);
                        if (s == 0) {
                            s = 1;
                        }
                        hsbVar2.t = s;
                        int i3 = ((hsa) hsfVar.b.a()).a;
                        synchronized (hsfVar.c) {
                            hsfVar.f.ensureCapacity(i3);
                            hsfVar.f.add(hsbVar2);
                            if (hsfVar.f.size() >= i3) {
                                arrayList = hsfVar.f;
                                hsfVar.f = new ArrayList(0);
                            } else {
                                arrayList = null;
                            }
                        }
                        if (arrayList == null) {
                            b = jyv.a;
                        } else {
                            b = hsfVar.b(((hsc) hsfVar.d.a()).c(arrayList));
                        }
                        return b;
                    } finally {
                        hsfVar.g.decrementAndGet();
                    }
                }
            }, this.j);
        }
    }

    public final jyz b(nfe nfeVar) {
        try {
            jer jerVar = ((hsa) this.b.a()).b;
        } catch (Exception e) {
            ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricServiceImpl", "recordMetric", (char) 191, "NetworkMetricServiceImpl.java")).r("Exception while getting network metric extension!");
        }
        hpd hpdVar = this.i;
        hoy a = hoz.a();
        a.e(nfeVar);
        a.b = null;
        return hpdVar.b(a.a());
    }

    public final jyz c() {
        if (this.g.get() > 0) {
            return ivc.G(new eli(this, 10), 1L, TimeUnit.SECONDS, this.j);
        }
        synchronized (this.c) {
            if (this.f.isEmpty()) {
                return jyv.a;
            }
            ArrayList arrayList = this.f;
            this.f = new ArrayList(0);
            return ivc.J(new etm(this, arrayList, 6, null), this.j);
        }
    }

    @Override // defpackage.hnl
    public final void i(hmq hmqVar) {
        c();
    }

    @Override // defpackage.hpg
    public final /* synthetic */ void Y() {
    }

    @Override // defpackage.hnl
    public final /* synthetic */ void j(hmq hmqVar) {
    }
}
