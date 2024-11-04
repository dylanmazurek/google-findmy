package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibf implements ibg {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/BleScannerImpl");
    static final long b;
    static final long c;
    private static final ScanSettings l;
    private static final jtw m;
    private static final ScanFilter n;
    private static final ScanFilter o;
    private static final jis p;
    public ScheduledFuture d;
    public final jzd e;
    public final nca j;
    public final bym k;
    private ScheduledFuture q;
    private Iterator t;
    private final hot v;
    public final Object f = new Object();
    public final Set g = new CopyOnWriteArraySet();
    private final Set r = new CopyOnWriteArraySet();
    private final Set s = new CopyOnWriteArraySet();
    public int h = 0;
    public ibe i = ibe.IDLE;
    private final fzd u = new ibd(this);

    static {
        ScanSettings.Builder legacy;
        ScanSettings build;
        if (Build.VERSION.SDK_INT >= 26) {
            legacy = new ScanSettings.Builder().setReportDelay(0L).setScanMode(2).setLegacy(false);
            build = legacy.build();
        } else {
            build = new ScanSettings.Builder().setReportDelay(0L).setScanMode(2).build();
        }
        l = build;
        b = TimeUnit.SECONDS.toMillis(30L) / 4;
        c = TimeUnit.MINUTES.toMillis(14L);
        m = new jtt();
        ScanFilter build2 = new ScanFilter.Builder().setServiceData(ifs.a, new byte[0], new byte[0]).build();
        n = build2;
        ScanFilter build3 = new ScanFilter.Builder().setServiceData(ifs.b, new byte[0], new byte[0]).build();
        o = build3;
        p = jis.r(build2, build3);
    }

    public ibf(bym bymVar, nca ncaVar, jzd jzdVar, hot hotVar) {
        this.k = bymVar;
        this.j = ncaVar;
        this.e = jzdVar;
        this.v = hotVar;
        i();
    }

    private final void i() {
        final jtw jtwVar = m;
        final jfk jfkVar = jfk.a;
        Iterable iterable = new Iterable() { // from class: jtr
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return new jts(jtw.this, jfkVar);
            }
        };
        hwx.K(true, "limit is negative");
        this.t = new jkb(iterable).iterator();
    }

    private final void j() {
        synchronized (this.f) {
            this.s.clear();
            this.s.addAll(this.g);
            this.s.addAll(this.r);
        }
    }

    private final fze k() {
        fze fzeVar;
        if (this.k != null) {
            if (!lyh.a.a().h((Context) this.v.a) && !this.k.q()) {
                throw new ieg("Bluetooth is not enabled");
            }
            BluetoothLeScanner bluetoothLeScanner = ((BluetoothAdapter) this.k.a).getBluetoothLeScanner();
            if (bluetoothLeScanner == null) {
                fzeVar = null;
            } else {
                fzeVar = new fze(bluetoothLeScanner);
            }
            if (fzeVar != null) {
                return fzeVar;
            }
            throw new ieg("BLE scanner is not available");
        }
        throw new ieg("Bluetooth is not available");
    }

    @Override // defpackage.iaz
    public final void a(iay iayVar) {
        synchronized (this.f) {
            if (this.g.contains(iayVar)) {
                ((jni) ((jni) a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "startScan", 166, "BleScannerImpl.java")).r("This scan is already in progress.");
                return;
            }
            this.g.add(iayVar);
            jnk jnkVar = a;
            ((jni) ((jni) jnkVar.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "startScan", 170, "BleScannerImpl.java")).s("Added scan callback, count = %d", this.g.size());
            j();
            if (this.h == 0) {
                if (!this.i.equals(ibe.IDLE)) {
                    iayVar.e();
                }
                g();
            } else {
                iayVar.c();
                ((jni) ((jni) jnkVar.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "startScan", 179, "BleScannerImpl.java")).r("Trying to start scan while connected.");
            }
        }
    }

    @Override // defpackage.iaz
    public final void b(iay iayVar) {
        jnk jnkVar = a;
        ((jni) ((jni) jnkVar.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "stopScan", 186, "BleScannerImpl.java")).r("Stopping scan.");
        synchronized (this.f) {
            if (this.g.remove(iayVar)) {
                ((jni) ((jni) jnkVar.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "stopScan", 189, "BleScannerImpl.java")).s("Removed scan callback, count = %d", this.g.size());
                j();
                iayVar.a();
            } else {
                ((jni) ((jni) jnkVar.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "stopScan", 194, "BleScannerImpl.java")).r("This scan was not in progress.");
            }
            if (this.g.isEmpty()) {
                ((jni) ((jni) jnkVar.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "stopScan", 197, "BleScannerImpl.java")).r("No more scans left.");
                h(false);
            }
        }
    }

    @Override // defpackage.ibg
    public final jbw c(final fyy fyyVar, final ibj ibjVar) {
        return jbw.c(new idf(this, fyyVar, 1), jxv.a).e(new jxj() { // from class: ibb
            /* JADX WARN: Type inference failed for: r3v0, types: [jzd, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map, java.lang.Object] */
            @Override // defpackage.jxj
            public final jxp a(jck jckVar, Object obj) {
                jbw e;
                nca ncaVar = ibf.this.j;
                String a2 = fyyVar.a();
                Object obj2 = ncaVar.b;
                Object obj3 = ncaVar.d;
                ?? r3 = ncaVar.e;
                fma fmaVar = (fma) ncaVar.c;
                bym bymVar = (bym) obj3;
                idt idtVar = new idt((Context) obj2, bymVar, r3, fmaVar, ncaVar.a, a2, ibjVar);
                hwx.V(true, "ConnectParams must be present when connecting to a device.");
                synchronized (idtVar.j) {
                    if (idtVar.n != null) {
                        e = jbw.b(ivc.D(new iec("Already connecting.")));
                    } else if (idtVar.w == null) {
                        e = jbw.b(ivc.D(new ieg("Unable to obtain a BluetoothAdapter.")));
                    } else {
                        ((ibj) ((jeu) idtVar.g).a).d.booleanValue();
                        if (!idtVar.w.q()) {
                            e = jbw.b(ivc.D(new ieg("Bluetooth is not enabled.")));
                        } else {
                            e = jbw.c(new idf(idtVar, ivc.u(new ide(idtVar, 0), 10L, 10L, TimeUnit.SECONDS, idtVar.d), 0), idtVar.d).e(new idg(idtVar, 0), idtVar.d);
                        }
                    }
                }
                return e.a;
            }
        }, this.e);
    }

    public final void d(buc bucVar) {
        synchronized (this.f) {
            Iterator it = this.s.iterator();
            while (it.hasNext()) {
                try {
                    bucVar.a((iay) it.next());
                } catch (Throwable th) {
                    ((jni) ((jni) ((jni) ((jni) a.f().h(flv.a, 284)).F()).i(th)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "forEachScanCallback", 461, "BleScannerImpl.java")).r("Exception in scan callback");
                }
            }
        }
    }

    public final void e(final int i) {
        ScheduledFuture scheduledFuture = this.d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.d = null;
        }
        synchronized (this.f) {
            f(ibe.IDLE);
        }
        if (this.t.hasNext()) {
            Long l2 = (Long) this.t.next();
            ((jni) ((jni) a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "retryStartScan", 433, "BleScannerImpl.java")).u("Retrying scan in %s ms.", l2);
            this.e.schedule(new hsi(this, 19), l2.longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        ((jni) ((jni) a.f().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "retryStartScan", 437, "BleScannerImpl.java")).s("Failed to start scan %s times.", 3);
        synchronized (this.f) {
            d(new buc() { // from class: iba
                @Override // defpackage.buc
                public final void a(Object obj) {
                    jnk jnkVar = ibf.a;
                    ((iay) obj).b(i);
                }
            });
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                b((iay) it.next());
            }
        }
    }

    public final void f(ibe ibeVar) {
        ((jni) ((jni) a.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "setState", 394, "BleScannerImpl.java")).y("State change: %s -> %s", this.i, ibeVar);
        this.i = ibeVar;
    }

    public final void g() {
        synchronized (this.f) {
            jnk jnkVar = a;
            ((jni) ((jni) jnkVar.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "startScanInternal", 288, "BleScannerImpl.java")).u("startScanInternal(), state = %s", this.i);
            if (this.i.equals(ibe.IDLE)) {
                f(ibe.ACTIVE);
                ((jni) ((jni) jnkVar.e().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "startScanInternal", 291, "BleScannerImpl.java")).r("Starting native scan.");
                try {
                    fze k = k();
                    jis jisVar = p;
                    ScanSettings scanSettings = l;
                    fzd fzdVar = this.u;
                    ((BluetoothLeScanner) k.a).startScan(jisVar, scanSettings, fzdVar.a);
                    ScheduledFuture scheduledFuture = this.q;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.q = this.e.schedule(new hsi(this, 20), c, TimeUnit.MILLISECONDS);
                    if (this.d != null) {
                        ((jni) ((jni) jnkVar.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "scheduleScanStops", 330, "BleScannerImpl.java")).r("Unexpected: scheduling restriction period end task, while the previous one is still active");
                        this.d.cancel(false);
                        this.d = null;
                    }
                    this.d = this.e.schedule(new ide(this, 1), b, TimeUnit.MILLISECONDS);
                    d(new eew(5));
                } catch (ieq e) {
                    ((jni) ((jni) ((jni) a.g().h(flv.a, 284)).i(e)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "startScanInternal", (char) 296, "BleScannerImpl.java")).r("Failed to start native scan; will retry");
                    e(-1);
                }
            } else if (this.i.equals(ibe.ACTIVE_WAITING_TO_STOP)) {
                f(ibe.ACTIVE);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:9|(4:13|(1:15)|16|17)|18|(1:20)|21|22|23|24|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bd, code lost:            r13 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:            f(defpackage.ibe.ACTIVE_OK_TO_STOP);        ((defpackage.jni) ((defpackage.jni) ((defpackage.jni) defpackage.ibf.a.f().h(defpackage.flv.a, 284)).i(r13)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "stopScanInternal", 383, "BleScannerImpl.java")).r("Unable to stop native scan.");     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(boolean r13) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ibf.h(boolean):void");
    }
}
