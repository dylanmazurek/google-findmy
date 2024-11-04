package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class icg implements iay {
    private final jis b;
    private final jer c;
    private final bmf d;
    private final Set e = new HashSet();
    public boolean a = false;

    public icg(jis jisVar, jer jerVar, bmf bmfVar) {
        this.b = jisVar;
        this.c = jerVar;
        this.d = bmfVar;
    }

    @Override // defpackage.iay
    public final void a() {
        ((jni) ((jni) ici.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneScannerImpl$ScanForCallback", "onScanComplete", 460, "EddystoneScannerImpl.java")).s("Scan complete, seen %d different Eddystone Ids.", this.e.size());
    }

    @Override // defpackage.iay
    public final void b(int i) {
        ((jni) ((jni) ici.a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneScannerImpl$ScanForCallback", "onScanFailed", 443, "EddystoneScannerImpl.java")).s("Scan failed with errorcode %d ", i);
        this.d.d(new iee(a.ae(i, "Scan failed, error code: ")));
    }

    @Override // defpackage.iay
    public final void c() {
        this.a = true;
    }

    @Override // defpackage.iay
    public final void d() {
        this.a = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, jei] */
    /* JADX WARN: Type inference failed for: r9v17, types: [jer] */
    @Override // defpackage.iay
    public final void f(fze fzeVar) {
        jis g;
        if (this.c.g()) {
            Object c = this.c.c();
            lim c2 = iji.c(fzeVar.a().getServiceData(ifs.b));
            if (!c2.z()) {
                int i = 4;
                int a = c2.a(0) >> 4;
                jdl jdlVar = jdl.a;
                if (c2.z()) {
                    int i2 = jis.d;
                    g = jmi.a;
                } else {
                    jin jinVar = new jin();
                    int i3 = 1;
                    while (true) {
                        if (i3 < c2.d()) {
                            int a2 = (c2.a(i3) & 255) >> i;
                            int a3 = c2.a(i3) & 15;
                            int i4 = i3 + 1;
                            int i5 = a2 + i4;
                            if (c2.d() < i5) {
                                g = jmi.a;
                                break;
                            }
                            lim j = c2.j(i4, i5);
                            lim j2 = c2.j(i3, i5);
                            if (j != null) {
                                if (j2 != null) {
                                    jinVar.h(new ifu(a3, j, j2));
                                    i3 = i5;
                                    i = 4;
                                } else {
                                    throw new NullPointerException("Null headerAndData");
                                }
                            } else {
                                throw new NullPointerException("Null data");
                            }
                        } else {
                            g = jinVar.g();
                            break;
                        }
                    }
                }
                jer jerVar = jdlVar;
                jer jerVar2 = jerVar;
                jer jerVar3 = jerVar2;
                int i6 = 0;
                while (i6 < ((jmi) g).c) {
                    ifu ifuVar = (ifu) g.get(i6);
                    jis jisVar = g;
                    int i7 = ifuVar.a;
                    if (i7 != 0 && i7 != 2) {
                        if (i7 == 1) {
                            jerVar = jer.i(ifuVar.b);
                        } else if (i7 != 3 && i7 != 4) {
                            if ((a & 15) > 0 && i7 == 6) {
                                jerVar3 = jer.i(ifuVar.c);
                            }
                        } else {
                            jerVar2 = jer.i(ifuVar.c);
                        }
                    } else {
                        jdlVar = jer.i(ifuVar.b);
                    }
                    i6++;
                    g = jisVar;
                }
                if (jdlVar.g() && jerVar.g()) {
                    Object c3 = jdlVar.c();
                    lim limVar = (lim) jerVar.c();
                    lim limVar2 = (lim) c3;
                    lim limVar3 = (lim) c;
                    if (hqt.g(limVar3, limVar2, limVar, jerVar2, jerVar3) || hqt.g(ifv.c(limVar3, (byte) 6), limVar2, limVar, jerVar2, jerVar3) || hqt.g(ifv.c(limVar3, (byte) 5), limVar2, limVar, jerVar2, jerVar3)) {
                        this.d.c(new ibv(2, ihy.COMPONENTLESS, fzeVar));
                        ((jni) ((jni) ici.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneScannerImpl$ScanForCallback", "onScanResult", 420, "EddystoneScannerImpl.java")).u("Found device by AK, address: %s.", fzeVar.b().a());
                        return;
                    }
                } else {
                    if (jdlVar.g()) {
                        ((jni) ((jni) ifv.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/ScanUtil", "matchesAccountKey", 137, "ScanUtil.java")).r("Skipping FP advertisement with Bloom filter but without a salt");
                    }
                    if (jerVar.g()) {
                        ((jni) ((jni) ifv.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/ScanUtil", "matchesAccountKey", 140, "ScanUtil.java")).r("Skipping FP advertisement with salt but without Bloom filter");
                    }
                }
            }
        }
        lim b = ifv.b(fzeVar.a());
        if (!b.z() && !this.e.contains(b)) {
            this.e.add(b);
            jis jisVar2 = this.b;
            int i8 = ((jmi) jisVar2).c;
            for (int i9 = 0; i9 < i8; i9++) {
                hxh hxhVar = (hxh) jisVar2.get(i9);
                if (((Boolean) hxhVar.c.a(b)).booleanValue()) {
                    bmf bmfVar = this.d;
                    int i10 = hxhVar.a;
                    bmfVar.c(new ibv(3, (ihy) hxhVar.b, fzeVar));
                    ((jni) ((jni) ici.a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneScannerImpl$ScanForCallback", "onScanResult", 436, "EddystoneScannerImpl.java")).u("Found device, address: %s.", fzeVar.b().a());
                }
            }
        }
    }

    @Override // defpackage.iay
    public final /* synthetic */ void e() {
    }
}
