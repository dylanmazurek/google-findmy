package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Path;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.work.impl.WorkDatabase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bet {
    public final Object a;

    public bet(Object obj) {
        this.a = obj;
    }

    public static bet k(int i, int i2, int i3) {
        return new bet(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3), (byte[]) null);
    }

    public static bet l(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new bet(bvn.b(context, 1002), (byte[]) null);
        }
        return new bet((Object) null, (byte[]) null);
    }

    public static final void u(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
        }
    }

    public final boolean A() {
        return kv.d((Context) this.a);
    }

    public final be B() {
        return ((an) this.a).e;
    }

    public final void C() {
        ((an) this.a).e.K();
    }

    public final void D() {
        ((an) this.a).e.al(true);
    }

    public final void E(njz njzVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            bwy bwyVar = null;
            if (njzVar != null) {
                bwyVar = new bwy(njzVar, 0, null);
            }
            view.animate().setUpdateListener(bwyVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:            r3 = defpackage.beg.c(r8);        r4 = (defpackage.bfc) defpackage.bej.b(r8.c, defpackage.bfj.p);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:            if (r3 == null) goto L140;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:            if (r4 != null) goto L139;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0077, code lost:            throw null;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r7, defpackage.bfi r8, defpackage.mnb r9, java.util.function.Consumer r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bet.a(android.view.View, bfi, mnb, java.util.function.Consumer):void");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [adt, java.lang.Object] */
    public final void b(boolean z) {
        this.a.h(Boolean.valueOf(z));
    }

    public final void c() {
        ((HashMap) this.a).clear();
    }

    public final void d(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            bek.b(fr$$ExternalSyntheticApiModelOutline0.m108m(this.a), str);
        }
    }

    public final void e(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 23) {
            bek.e(fr$$ExternalSyntheticApiModelOutline0.m108m(this.a), charSequence);
        }
    }

    public final void f() {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void g(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void h(long j) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void i(bxa bxaVar) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            if (bxaVar != null) {
                view.animate().setListener(new bwz(bxaVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void j(float f) {
        View view = (View) ((WeakReference) this.a).get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final void m(czq czqVar) {
        this.a.add(czqVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final void n(Path path) {
        int size = this.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                czq czqVar = (czq) this.a.get(size);
                ThreadLocal threadLocal = dfb.a;
                if (czqVar != null && !czqVar.a) {
                    dfb.d(path, ((daa) czqVar.b).l() / 100.0f, ((daa) czqVar.c).l() / 100.0f, ((daa) czqVar.d).l() / 360.0f);
                }
            } else {
                return;
            }
        }
    }

    public final int o() {
        Object f = ((cih) this.a).f(new csf(this, 4));
        f.getClass();
        return ((Number) f).intValue();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.lang.Iterable] */
    public final mwv p(cvu cvuVar) {
        cvuVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((ctv) obj).b(cvuVar)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(mkm.ap(arrayList));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ctv) it.next()).a(cvuVar.j));
        }
        return mxc.a(new cto((mwv[]) mkm.ag(arrayList2).toArray(new mwv[0]), 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.lang.Iterable] */
    public final boolean q(cvu cvuVar) {
        cvuVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.a) {
            if (((ctv) obj).c(cvuVar)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            cqc.b();
            long j = ctr.a;
            mkm.ar(arrayList, null, null, null, cka.e, 31);
        }
        return arrayList.isEmpty();
    }

    public final void r(Runnable runnable) {
        ((Handler) this.a).removeCallbacks(runnable);
    }

    public final void s(long j, Runnable runnable) {
        ((Handler) this.a).postDelayed(runnable, j);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    public final List t() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        if (!it.hasNext()) {
            return arrayList;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [adt, java.lang.Object] */
    public final void v(int i) {
        this.a.h(new atr(i));
    }

    public final int w() {
        return ((Bitmap) this.a).getHeight();
    }

    public final int x() {
        return ((Bitmap) this.a).getWidth();
    }

    public final Object y(Object obj, Object obj2) {
        return ((LinkedHashMap) this.a).put(obj, obj2);
    }

    public final boolean z() {
        return ((LinkedHashMap) this.a).isEmpty();
    }

    public bet(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public bet(Context context) {
        this.a = context.getApplicationContext();
    }

    public bet(byte[] bArr) {
        this.a = new HashMap();
    }

    public bet() {
        this.a = new aee(false, agw.a);
    }

    public bet(int i, byte[] bArr) {
        this.a = new LinkedHashMap(i, 0.75f, true);
    }

    public bet(int[] iArr, float[] fArr, float[][] fArr2) {
        int length = fArr.length - 1;
        vc[][] vcVarArr = new vc[length];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (i < length) {
            int i4 = i + 1;
            int i5 = iArr[i];
            if (i5 == 0) {
                i3 = 3;
            } else if (i5 == 1) {
                i2 = 1;
                i3 = 1;
            } else if (i5 == 2) {
                i2 = 2;
                i3 = 2;
            } else if (i5 == 3) {
                i2 = i2 == 1 ? 2 : 1;
                i3 = i2;
            } else if (i5 == 4) {
                i3 = 4;
            } else if (i5 == 5) {
                i3 = 5;
            }
            int length2 = fArr2[i].length;
            int i6 = (length2 >> 1) + (length2 & 1);
            vc[] vcVarArr2 = new vc[i6];
            int i7 = 0;
            while (i7 < i6) {
                float f = fArr[i];
                float f2 = fArr[i4];
                float[] fArr3 = fArr2[i];
                int i8 = i7 + i7;
                float f3 = fArr3[i8];
                int i9 = i8 + 1;
                float f4 = fArr3[i9];
                float[] fArr4 = fArr2[i4];
                int i10 = i7;
                vc[] vcVarArr3 = vcVarArr2;
                vcVarArr3[i10] = new vc(i3, f, f2, f3, f4, fArr4[i8], fArr4[i9]);
                i7 = i10 + 1;
                i6 = i6;
                vcVarArr2 = vcVarArr3;
            }
            vcVarArr[i] = vcVarArr2;
            i = i4;
        }
        this.a = vcVarArr;
    }

    public bet(View view) {
        this.a = new WeakReference(view);
    }

    public bet(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new CopyOnWriteArrayList();
    }

    public bet(byte[] bArr, byte[] bArr2) {
        this.a = bpw.f(Looper.getMainLooper());
    }

    public bet(nca ncaVar) {
        ctj ctjVar;
        ctv[] ctvVarArr = new ctv[8];
        ctvVarArr[0] = new ctt((cuj) ncaVar.a);
        ctvVarArr[1] = new ctu((cud) ncaVar.e);
        ctvVarArr[2] = new cua((cuj) ncaVar.b);
        cuj cujVar = (cuj) ncaVar.d;
        ctvVarArr[3] = new ctw(cujVar);
        ctvVarArr[4] = new ctz(cujVar);
        ctvVarArr[5] = new cty((cuj) ncaVar.d);
        ctvVarArr[6] = new ctx((cuj) ncaVar.d);
        if (Build.VERSION.SDK_INT >= 28) {
            Object obj = ncaVar.c;
            long j = ctr.a;
            Object systemService = ((Context) obj).getSystemService("connectivity");
            systemService.getClass();
            ctjVar = new ctj((ConnectivityManager) systemService, ctr.a);
        } else {
            ctjVar = null;
        }
        ctvVarArr[7] = ctjVar;
        this.a = mkm.l(ctvVarArr);
    }

    public bet(WorkDatabase workDatabase, byte[] bArr) {
        workDatabase.getClass();
        this.a = workDatabase;
    }

    public bet(char[] cArr) {
        this.a = new ArrayList();
    }

    public bet(char[] cArr, byte[] bArr) {
        this.a = new LinkedHashMap();
    }

    public bet(byte[] bArr, char[] cArr) {
        this.a = new aqo();
    }

    public bet(int i) {
        this.a = new aee(new atr(i), agw.a);
    }

    public bet(short[] sArr) {
        this.a = new sl((byte[]) null);
    }
}
