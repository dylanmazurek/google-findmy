package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ibc implements AutoCloseable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ibc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, jyz] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ibh] */
    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ((lrg) this.a).b();
                        return;
                    } else {
                        this.a.cancel(false);
                        return;
                    }
                }
                Object obj = this.a;
                idt idtVar = (idt) obj;
                synchronized (idtVar.j) {
                    if (((idt) obj).n == null) {
                        ((jni) ((jni) idt.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "disconnect", 952, "GattClientImpl.java")).r("Cannot disconnect, bluetoothGatt is null.");
                        ((idt) obj).j();
                        jyz jyzVar = jyv.a;
                        return;
                    } else {
                        ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "disconnect", 956, "GattClientImpl.java")).r("bluetoothGatt disconnecting");
                        fyz fyzVar = ((idt) obj).n;
                        ((idt) obj).n = null;
                        idtVar.d.schedule(new csf(fyzVar, 17), 200L, TimeUnit.MILLISECONDS);
                        return;
                    }
                }
            }
            this.a.close();
            return;
        }
        Object obj2 = this.a;
        synchronized (((ibf) obj2).f) {
            ((jni) ((jni) ibf.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "removeConnection", 254, "BleScannerImpl.java")).r("Removing connection.");
            int i2 = ((ibf) obj2).h;
            if (i2 <= 0) {
                ((jni) ((jni) ibf.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "removeConnection", 257, "BleScannerImpl.java")).s("Tried to remove connection, but connection count is %d", ((ibf) obj2).h);
                return;
            }
            int i3 = i2 - 1;
            ((ibf) obj2).h = i3;
            if (i3 == 0) {
                ((jni) ((jni) ibf.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/BleScannerImpl", "resumeAllScans", 414, "BleScannerImpl.java")).r("Resuming scans.");
                synchronized (((ibf) obj2).f) {
                    ((ibf) obj2).d(new eew(7));
                    if (!((ibf) obj2).g.isEmpty()) {
                        ((ibf) obj2).g();
                    }
                }
            }
        }
    }
}
