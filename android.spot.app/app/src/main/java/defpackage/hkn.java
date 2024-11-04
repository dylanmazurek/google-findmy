package defpackage;

import android.app.ActivityManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hkn implements jei {
    private final /* synthetic */ int a;

    public /* synthetic */ hkn(int i) {
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.ConcurrentMap] */
    @Override // defpackage.jei
    public final Object a(Object obj) {
        Bitmap bitmap = null;
        switch (this.a) {
            case 0:
                InputStream inputStream = (InputStream) obj;
                if (inputStream != null) {
                    bitmap = BitmapFactory.decodeStream(inputStream);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                return bitmap;
            case 1:
                return null;
            case 2:
                return ((hjy) obj).a();
            case 3:
                return ((hjy) obj).b();
            case 4:
                int i = hkx.b;
                ParcelFileDescriptor c = ((fuy) obj).c();
                if (c != null) {
                    try {
                        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(c);
                        try {
                            bitmap = BitmapFactory.decodeStream(autoCloseInputStream);
                            autoCloseInputStream.close();
                        } finally {
                        }
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                return bitmap;
            case 5:
                int i2 = hkx.b;
                fkb c2 = ((fux) obj).c();
                ArrayList arrayList = new ArrayList();
                fkc fkcVar = new fkc(c2);
                while (fkcVar.hasNext()) {
                    fkd fkdVar = (fkd) fkcVar.next();
                    if (!fkdVar.a.b()) {
                        arrayList.add(hky.a.a(fkdVar));
                    }
                }
                return jis.o(arrayList);
            case 6:
                return ((hmq) obj).a;
            case 7:
                return jer.h(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
            case 8:
                nei neiVar = (nei) obj;
                ljh k = nfh.d.k();
                if (!k.b.y()) {
                    k.t();
                }
                nfh nfhVar = (nfh) k.b;
                neiVar.getClass();
                nfhVar.b = neiVar;
                nfhVar.a |= 1;
                ljh k2 = nfg.c.k();
                if (!k2.b.y()) {
                    k2.t();
                }
                nfg nfgVar = (nfg) k2.b;
                nfgVar.a |= 2;
                nfgVar.b = true;
                nfg nfgVar2 = (nfg) k2.q();
                if (!k.b.y()) {
                    k.t();
                }
                nfh nfhVar2 = (nfh) k.b;
                nfgVar2.getClass();
                nfhVar2.c = nfgVar2;
                nfhVar2.a |= 2;
                return (nfh) k.q();
            case 9:
                ((jni) ((jni) ((jni) hmz.a.g()).i((RuntimeException) obj)).j("com/google/android/libraries/performance/primes/metrics/memory/MemoryMetricServiceImpl", "lambda$record$5", 422, "MemoryMetricServiceImpl.java")).r("Metric extension provider failed.");
                return null;
            case 10:
                return Integer.valueOf(Integer.parseInt((String) obj));
            case 11:
                Log.e("CheckboxChecker", "fetching usage reporting opt-in failed", (Throwable) obj);
                return true;
            case 12:
                return knc.a((String) obj);
            case 13:
                return null;
            case 14:
                return new huv((lhl) obj, lhg.CACHE_MISS);
            case 15:
                jer jerVar = (jer) obj;
                if (!jerVar.g()) {
                    return null;
                }
                return new huv((lhl) jerVar.c(), lhg.PERSISTENT_CACHE);
            case 16:
                return Integer.valueOf(Log.w("AccountRemovedRecv", "Failed to remove account snapshot: ", (IOException) obj));
            case 17:
                hwx.a();
                return (hwy) hxa.d.get((String) obj);
            case 18:
                Set set = (Set) obj;
                hnu hnuVar = hxc.j;
                boolean z = false;
                if (set != null && !set.isEmpty()) {
                    for (Map.Entry entry : hnuVar.a.entrySet()) {
                        if (set.contains(((jes) entry.getKey()).a)) {
                            boolean z2 = ((hxc) entry.getValue()).f;
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 19:
                return null;
            default:
                hwf hwfVar = (hwf) obj;
                if (hwfVar.a == 29514) {
                    ljh k3 = hws.d.k();
                    ljh k4 = hwq.j.k();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!k4.b.y()) {
                        k4.t();
                    }
                    hwq hwqVar = (hwq) k4.b;
                    hwqVar.a |= 8;
                    hwqVar.e = currentTimeMillis;
                    if (!k3.b.y()) {
                        k3.t();
                    }
                    hws hwsVar = (hws) k3.b;
                    hwq hwqVar2 = (hwq) k4.q();
                    hwqVar2.getClass();
                    hwsVar.b = hwqVar2;
                    hwsVar.a |= 1;
                    return (hws) k3.q();
                }
                throw hwfVar;
        }
    }
}
