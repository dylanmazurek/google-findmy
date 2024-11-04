package defpackage;

import android.animation.ValueAnimator;
import android.os.Trace;
import android.view.MenuItem;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bxi implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public bxi(View view, lrs lrsVar, bxe bxeVar, ValueAnimator valueAnimator, int i) {
        this.e = i;
        this.a = view;
        this.b = lrsVar;
        this.c = bxeVar;
        this.d = valueAnimator;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, android.view.MenuItem] */
    /* JADX WARN: Type inference failed for: r1v10, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v52, types: [mjq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [jxd, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                Object obj = this.a;
                View view = (View) obj;
                bxk.f(view, (lrs) this.b, (bxe) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 1:
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((ga) this.d).a.f = true;
                    ((gh) ((hxh) obj2).c).i(false);
                    ((ga) this.d).a.f = false;
                }
                ?? r0 = this.b;
                if (r0.isEnabled() && r0.hasSubMenu()) {
                    ((gh) this.c).z(r0, 4);
                    return;
                }
                return;
            case 2:
                Object obj3 = this.c;
                ?? r1 = this.b;
                Object obj4 = this.a;
                Object obj5 = this.d;
                boolean f = bzo.f();
                if (f) {
                    try {
                        bzo.e((String) obj3);
                    } finally {
                        if (f) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    r1.a();
                    ((cfk) obj4).i(cqh.a);
                    ((bmf) obj5).c(cqh.a);
                } catch (Throwable th) {
                    ((cfk) obj4).i(new cqe(th));
                    ((bmf) obj5).d(th);
                }
                if (f) {
                    return;
                } else {
                    return;
                }
            case 3:
                ?? r02 = this.b;
                int i = crh.a;
                Iterator it = r02.iterator();
                while (it.hasNext()) {
                    ((crf) it.next()).b(((cvk) this.c).a);
                }
                crh.a((hph) this.d, (WorkDatabase) this.a, r02);
                return;
            case 4:
                jni jniVar = (jni) ((jni) dvt.a.g()).j("com/google/android/apps/adm/api/FmdClient", "lambda$executeActionInternal$1", 226, "FmdClient.java");
                String name = lpk.a(((lpo) this.a).a).name();
                lqf b = lqf.b(((lqd) this.c).c);
                if (b == null) {
                    b = lqf.UNRECOGNIZED;
                }
                Object obj6 = this.b;
                Object obj7 = this.d;
                jniVar.z("Timeout while executing action %s [requestTrackingId: %s] for device of type %d", name, obj6, Integer.valueOf(b.a()));
                dvt dvtVar = (dvt) obj7;
                lqz lqzVar = dvtVar.f;
                String str = (String) obj6;
                jer a = dvtVar.a(str);
                eao eaoVar = (eao) lqzVar.a();
                jer a2 = eaoVar.b.a(str);
                if (a2.g()) {
                    lqd lqdVar = ((dvm) a2.c()).a.b;
                    if (lqdVar == null) {
                        lqdVar = lqd.d;
                    }
                    jni jniVar2 = (jni) ((jni) eao.a.g()).j("com/google/android/apps/adm/devices/DeviceActionResultHandlerImpl", "onTimeout", 66, "DeviceActionResultHandlerImpl.java");
                    lpo lpoVar = ((dvm) a2.c()).a.c;
                    if (lpoVar == null) {
                        lpoVar = lpo.c;
                    }
                    jniVar2.u("Timed out executing action of type %s", lpk.a(lpoVar.a));
                    Map map = eaoVar.c;
                    lqf b2 = lqf.b(lqdVar.c);
                    if (b2 == null) {
                        b2 = lqf.UNRECOGNIZED;
                    }
                    ehw ehwVar = (ehw) map.get(b2);
                    ehwVar.getClass();
                    ehwVar.c(str);
                } else {
                    ((jni) ((jni) eao.a.g()).j("com/google/android/apps/adm/devices/DeviceActionResultHandlerImpl", "onTimeout", 73, "DeviceActionResultHandlerImpl.java")).u("Timed out executing an unknown action with tracking ID %s", obj6);
                }
                jer a3 = dvtVar.a(str);
                if (a3.g() && !a.equals(a3)) {
                    return;
                }
                dvtVar.e.d(str);
                return;
            case 5:
                ((jni) ((jni) hwb.a.a((Level) this.c).i((Throwable) this.a)).j("com/google/android/libraries/phenotype/client/Phlogger", "lambda$logInternal$0", 49, "Phlogger.java")).B((String) this.d, (Object[]) this.b);
                return;
            case 6:
                Object obj8 = this.d;
                ?? r4 = this.b;
                Object obj9 = this.c;
                igg iggVar = (igg) this.a;
                bmf bmfVar = (bmf) obj8;
                bmfVar.a(new ide(iuu.t(new igf(iggVar, (jjr) obj9, (jxd) r4, bmfVar, 0), iggVar.e.b), 8), iggVar.e.b);
                return;
            case 7:
                Object obj10 = this.d;
                Object obj11 = this.b;
                ((mcu) this.c).c((mca) this.a, (mdr) obj11, (mbc) obj10);
                return;
            case 8:
                Object obj12 = this.d;
                Object obj13 = this.c;
                ((men) this.b).a.a((mca) this.a, (mdr) obj13, (mbc) obj12);
                return;
            case 9:
                ((mjc) this.b).z = true;
                Object obj14 = this.d;
                Object obj15 = this.c;
                ((mjc) this.b).v.a((mca) this.a, (mdr) obj15, (mbc) obj14);
                return;
            default:
                synchronized (this.c) {
                    if (((mjp) this.d).b == 0) {
                        try {
                            this.a.b(this.b);
                            ((mjr) this.c).a.remove(this.a);
                            if (((mjr) this.c).a.isEmpty()) {
                                ((mjr) this.c).b.shutdown();
                                ((mjr) this.c).b = null;
                            }
                        } catch (Throwable th2) {
                            ((mjr) this.c).a.remove(this.a);
                            if (((mjr) this.c).a.isEmpty()) {
                                ((mjr) this.c).b.shutdown();
                                ((mjr) this.c).b = null;
                            }
                            throw th2;
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ bxi(dvt dvtVar, lpo lpoVar, String str, lqd lqdVar, int i) {
        this.e = i;
        this.d = dvtVar;
        this.a = lpoVar;
        this.b = str;
        this.c = lqdVar;
    }

    public bxi(ga gaVar, hxh hxhVar, MenuItem menuItem, gh ghVar, int i) {
        this.e = i;
        this.d = gaVar;
        this.a = hxhVar;
        this.b = menuItem;
        this.c = ghVar;
    }

    public /* synthetic */ bxi(igg iggVar, jjr jjrVar, jxd jxdVar, bmf bmfVar, int i) {
        this.e = i;
        this.a = iggVar;
        this.c = jjrVar;
        this.b = jxdVar;
        this.d = bmfVar;
    }

    public bxi(Object obj, mca mcaVar, mdr mdrVar, mbc mbcVar, int i) {
        this.e = i;
        this.a = mcaVar;
        this.c = mdrVar;
        this.d = mbcVar;
        this.b = obj;
    }

    public /* synthetic */ bxi(String str, mnw mnwVar, cfn cfnVar, bmf bmfVar, int i) {
        this.e = i;
        this.c = str;
        this.b = mnwVar;
        this.a = cfnVar;
        this.d = bmfVar;
    }

    public /* synthetic */ bxi(List list, cvk cvkVar, hph hphVar, WorkDatabase workDatabase, int i) {
        this.e = i;
        this.b = list;
        this.c = cvkVar;
        this.d = hphVar;
        this.a = workDatabase;
    }

    public /* synthetic */ bxi(Level level, Throwable th, String str, Object[] objArr, int i) {
        this.e = i;
        this.c = level;
        this.a = th;
        this.d = str;
        this.b = objArr;
    }

    public bxi(mcu mcuVar, mca mcaVar, mdr mdrVar, mbc mbcVar, int i) {
        this.e = i;
        this.a = mcaVar;
        this.b = mdrVar;
        this.d = mbcVar;
        this.c = mcuVar;
    }

    public bxi(mjr mjrVar, mjp mjpVar, mjq mjqVar, Object obj, int i) {
        this.e = i;
        this.d = mjpVar;
        this.a = mjqVar;
        this.b = obj;
        this.c = mjrVar;
    }
}
