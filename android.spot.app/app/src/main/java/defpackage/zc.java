package defpackage;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class zc extends mpe implements moh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zc(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, avs] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, avs] */
    /* JADX WARN: Type inference failed for: r8v56, types: [adt, java.lang.Object] */
    @Override // defpackage.moh
    public final /* synthetic */ Object a(Object obj) {
        Looper looper = null;
        boolean z = true;
        switch (this.b) {
            case 0:
                awq.f((awr) this.a, 0, 0, 0.0f);
                return mlh.a;
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                zd zdVar = (zd) this.a;
                zb zbVar = zdVar.h;
                if (zbVar == null) {
                    return false;
                }
                zbVar.b = booleanValue;
                zdVar.g();
                return true;
            case 2:
                aum aumVar = (aum) obj;
                long j = aumVar.c;
                yx yxVar = (yx) this.a;
                ?? a = yxVar.a.a();
                if (a != 0) {
                    zn znVar = yxVar.b;
                    long j2 = yxVar.c;
                    if (a.j() && zo.a(znVar, j2)) {
                        znVar.f();
                    }
                    return mlh.a;
                }
                aumVar.b();
                return mlh.a;
            case 3:
                aum aumVar2 = (aum) obj;
                long e = lb.e(aumVar2, false);
                yw ywVar = (yw) this.a;
                ?? a2 = ywVar.c.a();
                if (a2 != 0) {
                    zn znVar2 = ywVar.d;
                    long j3 = ywVar.e;
                    if (a2.j() && zo.a(znVar2, j3)) {
                        long e2 = aqk.e(ywVar.b, e);
                        ywVar.b = e2;
                        long e3 = aqk.e(ywVar.a, e2);
                        int i = zh.a;
                        if (znVar2.f()) {
                            ywVar.a = e3;
                            ywVar.b = 0L;
                        }
                    }
                }
                aumVar2.b();
                return mlh.a;
            case 4:
                apm apmVar = (apm) obj;
                if (!apmVar.k.t) {
                    return bad.SkipSubtreeAndContinueTraversal;
                }
                apm apmVar2 = apmVar.c;
                apmVar.c = null;
                apmVar.b = null;
                return bad.ContinueTraversal;
            case 5:
                awq.d((awq) obj, (awr) this.a, 0, 0);
                return mlh.a;
            case 6:
                ark arkVar = (ark) obj;
                arkVar.q(((arn) this.a).a);
                arkVar.r(((arn) this.a).b);
                arkVar.l(((arn) this.a).c);
                arkVar.v(0.0f);
                arkVar.w(0.0f);
                arkVar.p(0.0f);
                arkVar.n(((arn) this.a).d);
                arkVar.u(((arn) this.a).e);
                arkVar.s(((arn) this.a).f);
                arkVar.o(((arn) this.a).g);
                arkVar.x();
                arkVar.m(((arn) this.a).h);
                arkVar.t(((arn) this.a).i);
                arkVar.y();
                return mlh.a;
            case 7:
                auh auhVar = (auh) obj;
                mpn mpnVar = (mpn) this.a;
                if (mpnVar.a == null && auhVar.c) {
                    mpnVar.a = auhVar;
                }
                return true;
            case 8:
                if (((auh) obj).c) {
                    ((mpk) this.a).a = false;
                    return bad.CancelTraversal;
                }
                return bad.ContinueTraversal;
            case 9:
                Throwable th = (Throwable) obj;
                auy auyVar = (auy) this.a;
                msd msdVar = auyVar.a;
                if (msdVar != null) {
                    msdVar.i(th);
                }
                auyVar.a = null;
                return mlh.a;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                axa axaVar = (axa) entry.getValue();
                int a3 = ((awd) this.a).k.a(key);
                if (a3 >= 0 && a3 < ((awd) this.a).d) {
                    z = false;
                } else {
                    axaVar.a();
                }
                return Boolean.valueOf(z);
            case 11:
                awq.e((awq) obj, (awr) this.a);
                return mlh.a;
            case 12:
                awq awqVar = (awq) obj;
                ?? r0 = this.a;
                int size = r0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    awq.e(awqVar, (awr) r0.get(i2));
                }
                return mlh.a;
            case 13:
                axn axnVar = (axn) obj;
                if (axnVar.i()) {
                    if (axnVar.a().b) {
                        axnVar.f();
                    }
                    Map map = axnVar.a().f;
                    Object obj2 = this.a;
                    for (Map.Entry entry2 : map.entrySet()) {
                        ((axm) obj2).d((avc) entry2.getKey(), ((Number) entry2.getValue()).intValue(), axnVar.d());
                    }
                    azq azqVar = axnVar.d().u;
                    azqVar.getClass();
                    while (!amr.i(azqVar, ((axm) this.a).a.d())) {
                        Set<avc> keySet = ((axm) this.a).c(azqVar).keySet();
                        Object obj3 = this.a;
                        for (avc avcVar : keySet) {
                            axm axmVar = (axm) obj3;
                            axmVar.d(avcVar, axmVar.a(azqVar, avcVar), azqVar);
                        }
                        azqVar = azqVar.u;
                        azqVar.getClass();
                    }
                }
                return mlh.a;
            case 14:
                ((aiu) this.a).o((aov) obj);
                return true;
            case 15:
                Boolean f = ij.f((aqh) obj, ((apr) this.a).a);
                if (f != null) {
                    z = f.booleanValue();
                }
                return Boolean.valueOf(z);
            case 16:
                Boolean f2 = ij.f((aqh) obj, ((apr) this.a).a);
                if (f2 != null) {
                    z = f2.booleanValue();
                }
                return Boolean.valueOf(z);
            case 17:
                mnw mnwVar = (mnw) obj;
                Handler handler = ((baw) this.a).getHandler();
                if (handler != null) {
                    looper = handler.getLooper();
                }
                if (looper == Looper.myLooper()) {
                    mnwVar.a();
                } else {
                    Handler handler2 = ((baw) this.a).getHandler();
                    if (handler2 != null) {
                        handler2.post(new nl(mnwVar, 14));
                    }
                }
                return mlh.a;
            case 18:
                baw bawVar = ((bbj) this.a).b;
                return Boolean.valueOf(bawVar.getParent().requestSendAccessibilityEvent(bawVar, (AccessibilityEvent) obj));
            case 19:
                ((bbj) this.a).u((bdf) obj);
                return mlh.a;
            default:
                this.a.h(new Configuration((Configuration) obj));
                return mlh.a;
        }
    }
}
