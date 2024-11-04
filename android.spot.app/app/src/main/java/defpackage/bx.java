package defpackage;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewPropertyAnimator;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bx implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public bx(bpy bpyVar, Typeface typeface, int i) {
        this.c = i;
        this.a = bpyVar;
        this.b = typeface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v51, types: [buc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v30, types: [android.app.Application$ActivityLifecycleCallbacks, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = 0;
        switch (this.c) {
            case 0:
                cb cbVar = (cb) this.a;
                List list = cbVar.b;
                Object obj = this.b;
                if (list.contains(obj)) {
                    ca caVar = (ca) obj;
                    int i2 = caVar.h;
                    View view2 = caVar.a.P;
                    view2.getClass();
                    a.X(i2, view2, cbVar.a);
                    return;
                }
                return;
            case 1:
                Object obj2 = this.b;
                obj2.getClass();
                ((cb) this.a).d((ca) obj2);
                return;
            case 2:
                cb cbVar2 = (cb) this.a;
                List list2 = cbVar2.b;
                Object obj3 = this.b;
                list2.remove(obj3);
                cbVar2.c.remove(obj3);
                return;
            case 3:
                ?? r0 = this.a;
                Object obj4 = this.b;
                try {
                    r0.run();
                    return;
                } finally {
                    ((cv) obj4).a();
                }
            case 4:
                gzi gziVar = (gzi) this.b;
                es esVar = (es) gziVar.b;
                if (esVar.f == gziVar.a) {
                    Object obj5 = this.a;
                    ?? r02 = gziVar.c;
                    esVar.d = r02;
                    esVar.e = DesugarCollections.unmodifiableList(r02);
                    ((ez) obj5).a(esVar.a);
                    esVar.b();
                    return;
                }
                return;
            case 5:
                ?? r03 = this.a;
                int size = r03.size();
                while (i < size) {
                    ju juVar = (ju) r03.get(i);
                    Object obj6 = this.b;
                    mh mhVar = juVar.a;
                    int i3 = juVar.b;
                    int i4 = juVar.c;
                    int i5 = juVar.d;
                    int i6 = juVar.e;
                    View view3 = mhVar.b;
                    int i7 = i5 - i3;
                    int i8 = i6 - i4;
                    if (i7 != 0) {
                        view3.animate().translationX(0.0f);
                    }
                    if (i8 != 0) {
                        view3.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator animate = view3.animate();
                    lo loVar = (lo) obj6;
                    loVar.j.add(mhVar);
                    animate.setDuration(250L).setListener(new jq(loVar, mhVar, i7, view3, i8, animate)).start();
                    i++;
                }
                ((ArrayList) this.a).clear();
                ((lo) this.b).g.remove(this.a);
                return;
            case 6:
                ?? r04 = this.a;
                int size2 = r04.size();
                while (i < size2) {
                    jt jtVar = (jt) r04.get(i);
                    Object obj7 = this.b;
                    mh mhVar2 = jtVar.a;
                    View view4 = null;
                    if (mhVar2 == null) {
                        view = null;
                    } else {
                        view = mhVar2.b;
                    }
                    mh mhVar3 = jtVar.b;
                    if (mhVar3 != null) {
                        view4 = mhVar3.b;
                    }
                    if (view != null) {
                        ViewPropertyAnimator duration = view.animate().setDuration(250L);
                        lo loVar2 = (lo) obj7;
                        loVar2.l.add(jtVar.a);
                        duration.translationX(jtVar.e - jtVar.c);
                        duration.translationY(jtVar.f - jtVar.d);
                        duration.alpha(0.0f).setListener(new jr(loVar2, jtVar, duration, view)).start();
                    }
                    if (view4 != null) {
                        ViewPropertyAnimator animate2 = view4.animate();
                        lo loVar3 = (lo) obj7;
                        loVar3.l.add(jtVar.b);
                        animate2.translationX(0.0f).translationY(0.0f).setDuration(250L).alpha(1.0f).setListener(new js(loVar3, jtVar, animate2, view4)).start();
                    }
                    i++;
                }
                ((ArrayList) this.a).clear();
                ((lo) this.b).h.remove(this.a);
                return;
            case 7:
                ?? r05 = this.a;
                int size3 = r05.size();
                while (i < size3) {
                    mh mhVar4 = (mh) r05.get(i);
                    Object obj8 = this.b;
                    View view5 = mhVar4.b;
                    ViewPropertyAnimator animate3 = view5.animate();
                    lo loVar4 = (lo) obj8;
                    loVar4.i.add(mhVar4);
                    animate3.alpha(1.0f).setDuration(120L).setListener(new jp(loVar4, mhVar4, view5, animate3)).start();
                    i++;
                }
                ((ArrayList) this.a).clear();
                ((lo) this.b).f.remove(this.a);
                return;
            case 8:
                ((oc) this.b).k((ox) this.a);
                return;
            case 9:
                api.c((apk) this.a, (LongSparseArray) this.b);
                return;
            case 10:
                ((bpb) this.b).a = this.a;
                return;
            case 11:
                ((Application) this.b).unregisterActivityLifecycleCallbacks(this.a);
                return;
            case 12:
                try {
                    if (bpc.d != null) {
                        bpc.d.invoke(this.b, this.a, false, "AppCompat recreation");
                        return;
                    } else {
                        bpc.e.invoke(this.b, this.a, false);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 13:
                ((brj) this.a).b((Typeface) this.b);
                return;
            case 14:
                ((bpy) this.a).b((Typeface) this.b);
                return;
            case 15:
                this.b.a(this.a);
                return;
            case 16:
                Throwable th2 = (Throwable) this.b;
                Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in ".concat(String.valueOf(this.a)), th2);
                throw th2;
            case 17:
                chi chiVar = (chi) this.b;
                if (chiVar.f()) {
                    chiVar.c();
                } else {
                    chiVar.b(this.a);
                }
                chiVar.f = 3;
                return;
            case 18:
                Object obj9 = this.b;
                try {
                    this.a.run();
                    return;
                } finally {
                    ((cxd) obj9).a();
                }
            case 19:
                Object obj10 = this.a;
                Object obj11 = this.b;
                synchronized (((crd) obj11).i) {
                    Iterator it = ((crd) obj11).h.iterator();
                    while (it.hasNext()) {
                        ((cqs) it.next()).a((cvk) obj10, false);
                    }
                }
                return;
            default:
                cqc.b();
                int i9 = csn.d;
                cvu cvuVar = (cvu) this.a;
                String str = cvuVar.b;
                ((csn) this.b).a.c(cvuVar);
                return;
        }
    }

    public /* synthetic */ bx(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ bx(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public bx(Object obj, Object obj2, int i, char[] cArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
