package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ims {
    final Object a;
    public final String b;
    public final imp[] c;
    HashMap d;
    public int e;
    private final mko f;
    private boolean g = true;

    public ims(String str, mko mkoVar, imp... impVarArr) {
        this.b = str;
        this.c = impVarArr;
        int length = impVarArr.length;
        HashMap hashMap = new HashMap(length > 0 ? 10 : 1);
        this.d = hashMap;
        if (length == 0) {
            hashMap.put(imk.b, a());
        }
        this.e = 0;
        this.f = mkoVar;
        this.a = new Object();
    }

    public abstract iml a();

    public final void d() {
        this.g = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(Object obj, imk imkVar) {
        synchronized (this.a) {
            iml imlVar = (iml) this.d.get(imkVar);
            if (imlVar == null) {
                imlVar = a();
                this.d.put(imkVar, imlVar);
            }
            imlVar.b(obj);
            this.e++;
        }
        imt imtVar = ((imu) this.f).c;
        if (imtVar != null) {
            imw imwVar = (imw) imtVar;
            int i = 10;
            if (imwVar.c.incrementAndGet() >= 100) {
                synchronized (imwVar.e) {
                    if (((imw) imtVar).c.get() >= 100) {
                        synchronized (((imw) imtVar).e) {
                            ScheduledFuture scheduledFuture = ((imw) imtVar).d;
                            if (scheduledFuture != null && !scheduledFuture.isDone() && !((imw) imtVar).d.isCancelled()) {
                                if (((imw) imtVar).d.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                    ((imw) imtVar).a();
                                    ((imw) imtVar).d = ((imw) imtVar).a.schedule(new ide(imtVar, i), 1L, TimeUnit.MILLISECONDS);
                                }
                            }
                            ((imw) imtVar).d = ((imw) imtVar).a.schedule(new ide(imtVar, i), 1L, TimeUnit.MILLISECONDS);
                        }
                        return;
                    }
                }
            }
            synchronized (imwVar.e) {
                ScheduledFuture scheduledFuture2 = ((imw) imtVar).d;
                if (scheduledFuture2 == null || scheduledFuture2.isDone() || ((imw) imtVar).d.isCancelled()) {
                    ((imw) imtVar).d = ((imw) imtVar).a.schedule(new ide(imtVar, i), ((imw) imtVar).b, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(Object... objArr) {
        boolean z;
        if (this.c.length == objArr.length) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        if (this.g) {
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                if (obj != null) {
                    if (!this.c[i].b.isInstance(obj)) {
                        String str = this.b;
                        String obj2 = obj.toString();
                        Class<?> cls = obj.getClass();
                        imp[] impVarArr = this.c;
                        String valueOf = String.valueOf(cls);
                        imp impVar = impVarArr[i];
                        throw new IllegalArgumentException("Streamz " + str + " has parameter {index: " + i + ", value: " + obj2 + ", type: " + valueOf + "}, but expected: {name: " + impVar.a + ", type: " + impVar.b.toString() + "}");
                    }
                } else {
                    throw new NullPointerException("Streamz " + this.b + " has null parameter: " + Arrays.toString(objArr));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(imp... impVarArr) {
        if (Arrays.equals(this.c, impVarArr)) {
            return;
        }
        throw new imv("Streamz " + this.b + " with field diffs: " + Arrays.toString(this.c) + " and " + Arrays.toString(impVarArr));
    }
}
