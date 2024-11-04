package defpackage;

import android.bluetooth.BluetoothGatt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class icy implements bmh {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ icy(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.bmh
    public final Object a(bmf bmfVar) {
        BluetoothGatt connectGatt;
        fyz fyzVar;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                synchronized (((idb) obj).e) {
                    ((idb) obj).f = jer.i(bmfVar);
                }
                return null;
            case 1:
                Object obj2 = this.a;
                synchronized (((icv) obj2).h) {
                    ((icv) obj2).m = bmfVar;
                }
                return null;
            case 2:
                Object obj3 = this.a;
                synchronized (((idt) obj3).j) {
                    ((idt) obj3).r = bmfVar;
                    if (!((idt) obj3).n.c()) {
                        bmfVar.d(new iec("Failed to start service discovery."));
                        ((idt) obj3).r = null;
                    }
                }
                return null;
            case 3:
                Object obj4 = this.a;
                synchronized (((idt) obj4).j) {
                    ((idt) obj4).p.add(bmfVar);
                }
                return "disconnectFuture";
            case 4:
                Object obj5 = this.a;
                synchronized (((idt) obj5).j) {
                    if (((idt) obj5).n != null) {
                        ((jni) ((jni) idt.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "connectGatt", 539, "GattClientImpl.java")).r("BluetoothGatt is not null. Closing it.");
                        ((idt) obj5).n.a();
                    }
                    ((jni) ((jni) idt.a.b().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/GattClientImpl", "connectGatt", 542, "GattClientImpl.java")).r("Use LE transport");
                    connectGatt = ((idt) obj5).e.a.connectGatt(((idt) obj5).c, false, new idm((idt) obj5, bmfVar).a, 2);
                    if (connectGatt == null) {
                        fyzVar = null;
                    } else {
                        fyzVar = new fyz(connectGatt);
                    }
                    ((idt) obj5).n = fyzVar;
                    if (((idt) obj5).n == null) {
                        bmfVar.d(new iec("Disconnected."));
                    }
                }
                return null;
            case 5:
                Object obj6 = this.a;
                synchronized (((idt) obj6).j) {
                    ((idt) obj6).p.add(bmfVar);
                }
                return "turnToConnectOverFuture";
            case 6:
                Object obj7 = this.a;
                synchronized (((idt) obj7).j) {
                    ((idt) obj7).m.add(bmfVar);
                }
                return null;
            default:
                ((iex) this.a).b = bmfVar;
                return null;
        }
    }
}
