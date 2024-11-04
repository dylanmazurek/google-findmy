package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqt implements Handler.Callback {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dqt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    int i2 = message.what;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            return false;
                        }
                        synchronized (((fkw) this.a).c) {
                            fkv fkvVar = (fkv) message.obj;
                            fkx fkxVar = (fkx) ((fkw) this.a).c.get(fkvVar);
                            if (fkxVar != null && fkxVar.b == 3) {
                                Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + String.valueOf(fkvVar), new Exception());
                                ComponentName componentName = fkxVar.f;
                                if (componentName == null) {
                                    componentName = fkvVar.d;
                                }
                                if (componentName == null) {
                                    String str = fkvVar.c;
                                    fma.aR(str);
                                    componentName = new ComponentName(str, "unknown");
                                }
                                fkxVar.onServiceDisconnected(componentName);
                            }
                        }
                    } else {
                        synchronized (((fkw) this.a).c) {
                            fkv fkvVar2 = (fkv) message.obj;
                            fkx fkxVar2 = (fkx) ((fkw) this.a).c.get(fkvVar2);
                            if (fkxVar2 != null && fkxVar2.b()) {
                                if (fkxVar2.c) {
                                    fkxVar2.g.e.removeMessages(1, fkxVar2.e);
                                    fkw fkwVar = fkxVar2.g;
                                    fkwVar.f.b(fkwVar.d, fkxVar2);
                                    fkxVar2.c = false;
                                    fkxVar2.b = 2;
                                }
                                ((fkw) this.a).c.remove(fkvVar2);
                            }
                        }
                    }
                    return true;
                }
                int i3 = message.arg1;
                Object obj = this.a;
                synchronized (obj) {
                    fgg fggVar = (fgg) ((fge) obj).d.get(i3);
                    if (fggVar == null) {
                        Log.w("MessengerIpcClient", a.ae(i3, "Received response for unknown request: "));
                    } else {
                        ((fge) obj).d.remove(i3);
                        ((fge) obj).d();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            fggVar.c(new fgh("Not supported by GmsCore"));
                        } else {
                            fggVar.a(data);
                        }
                    }
                }
                return true;
            }
            asy asyVar = (asy) this.a;
            asyVar.b(asyVar.d);
            return true;
        }
        if (message.what == 1) {
            ((dqu) this.a).c((dqs) message.obj);
            return true;
        }
        if (message.what != 2) {
            return false;
        }
        ((dqu) this.a).c.g((dqs) message.obj);
        return false;
    }

    public /* synthetic */ dqt(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
