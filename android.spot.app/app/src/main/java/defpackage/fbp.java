package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbp implements Runnable {
    final /* synthetic */ Map a;
    final /* synthetic */ String b;
    final /* synthetic */ long c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ String f;
    final /* synthetic */ fbr g;

    public fbp(fbr fbrVar, Map map, String str, long j, boolean z, boolean z2, String str2) {
        this.a = map;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = fbrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        double d;
        fbb g = this.g.g();
        fma.aM("getClientId can not be called from the main thread");
        String b = g.a.g().b();
        if (b != null) {
            Map map = this.a;
            if (TextUtils.isEmpty((CharSequence) map.get("cid"))) {
                map.put("cid", b);
            }
        }
        String str = (String) this.a.get("sf");
        if (str != null) {
            try {
                d = Double.parseDouble(str);
            } catch (NumberFormatException unused) {
                d = 100.0d;
            }
            if (fma.bm(d, (String) this.a.get("cid"))) {
                this.g.s("Sampling enabled. Hit sampled out. sample rate", Double.valueOf(d));
                return;
            }
        }
        this.g.c.c();
        this.a.remove("ate");
        this.a.remove("adid");
        fbs b2 = this.g.c.f().b();
        fma.bj(this.a, "an", b2.a);
        fma.bj(this.a, "av", b2.b);
        fma.bj(this.a, "aid", b2.c);
        fma.bj(this.a, "aiid", b2.d);
        this.a.put("v", "1");
        this.a.put("_v", fcm.b);
        fma.bj(this.a, "ul", this.g.l().b().a);
        Map map2 = this.a;
        fde l = this.g.l();
        l.H();
        fbx b3 = l.b();
        fma.bj(map2, "sr", b3.b + "x" + b3.c);
        if (!this.b.equals("transaction") && !this.b.equals("item")) {
            fdl fdlVar = this.g.a;
            synchronized (fdlVar.c) {
                long currentTimeMillis = System.currentTimeMillis();
                double d2 = fdlVar.a;
                if (d2 < 60.0d) {
                    double d3 = (currentTimeMillis - fdlVar.b) / 2000.0d;
                    if (d3 > 0.0d) {
                        d2 = Math.min(60.0d, d2 + d3);
                        fdlVar.a = d2;
                    }
                }
                fdlVar.b = currentTimeMillis;
                if (d2 >= 1.0d) {
                    fdlVar.a = d2 - 1.0d;
                } else {
                    String str2 = "Excessive " + fdlVar.d + " detected; call ignored.";
                    fdn fdnVar = fdn.a;
                    if (fdnVar != null) {
                        fdnVar.B(str2);
                    } else if (fdm.b()) {
                        Log.w((String) fdh.b.x(), str2);
                    }
                    nbw nbwVar = fdm.a;
                    this.g.n().c(this.a, "Too many hits sent too quickly, rate limiting invoked");
                    return;
                }
            }
        }
        long bg = fma.bg((String) this.a.get("ht"));
        if (bg == 0) {
            bg = this.c;
        }
        long j = bg;
        if (this.d) {
            this.g.n().x("Dry run enabled. Would have sent hit", new fdj(this.g, this.a, j, this.e));
            return;
        }
        String str3 = (String) this.a.get("cid");
        HashMap hashMap = new HashMap();
        fma.bk(hashMap, "uid", this.a);
        fma.bk(hashMap, "an", this.a);
        fma.bk(hashMap, "aid", this.a);
        fma.bk(hashMap, "av", this.a);
        fma.bk(hashMap, "aiid", this.a);
        fma.aR(str3);
        this.a.put("_s", String.valueOf(this.g.i().b(new fco(str3, this.f, !TextUtils.isEmpty((CharSequence) this.a.get("adid")), hashMap))));
        this.g.i().d(new fdj(this.g, this.a, j, this.e));
    }
}
