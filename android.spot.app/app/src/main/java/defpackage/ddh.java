package defpackage;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;
import com.bumptech.glide.manager.LifecycleLifecycle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddh {
    public final Object a;

    public ddh(Handler handler) {
        this.a = new fiz(handler, 1, null);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void a(dfq dfqVar, dfy dfyVar) {
        int i = dfz.a;
        this.a.execute(new cri(dfqVar, new bso(dfyVar), 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void b(dir dirVar, dkx dkxVar) {
        ?? r0 = this.a;
        if (dkxVar.equals(r0.get(dirVar))) {
            r0.remove(dirVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [dij, java.lang.Object] */
    public final synchronized dij c(Class cls) {
        for (elo eloVar : this.a) {
            if (((Class) eloVar.b).isAssignableFrom(cls)) {
                return eloVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    public final synchronized void d(Class cls, dij dijVar) {
        this.a.add(new elo(cls, dijVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.Map, java.lang.Object] */
    public final dhd e(Context context, dgo dgoVar, cex cexVar, boolean z) {
        dtq.g();
        dtq.g();
        dhd dhdVar = (dhd) this.a.get(cexVar);
        if (dhdVar == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(cexVar);
            dhd dhdVar2 = new dhd(dgoVar, lifecycleLifecycle, new drm(), context);
            this.a.put(cexVar, dhdVar2);
            lifecycleLifecycle.a(new drl(this, cexVar));
            if (!z) {
                return dhdVar2;
            }
            dhdVar2.i();
            return dhdVar2;
        }
        return dhdVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, dqz] */
    public final synchronized dqz f(Class cls, Class cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return dra.a;
        }
        for (apc apcVar : this.a) {
            if (apcVar.t(cls, cls2)) {
                return apcVar.a;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + String.valueOf(cls) + " to " + String.valueOf(cls2));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    public final synchronized List g(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (apc apcVar : this.a) {
            if (apcVar.t(cls, cls2) && !arrayList.contains(apcVar.b)) {
                arrayList.add(apcVar.b);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    public final synchronized void h(Class cls, Class cls2, dqz dqzVar) {
        this.a.add(new apc((Object) cls, (Object) cls2, (Object) dqzVar, (byte[]) null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final synchronized dhp i(ByteBuffer byteBuffer) {
        dhp dhpVar;
        dhpVar = (dhp) this.a.poll();
        if (dhpVar == null) {
            dhpVar = new dhp();
        }
        dhpVar.b = null;
        Arrays.fill(dhpVar.a, (byte) 0);
        dhpVar.c = new dho();
        dhpVar.d = 0;
        dhpVar.b = byteBuffer.asReadOnlyBuffer();
        dhpVar.b.position(0);
        dhpVar.b.order(ByteOrder.LITTLE_ENDIAN);
        return dhpVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final synchronized void j(dhp dhpVar) {
        dhpVar.b = null;
        dhpVar.c = null;
        this.a.offer(dhpVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void k(dfq dfqVar, bso bsoVar) {
        dfqVar.g();
        int i = dfz.a;
        this.a.execute(new cri(dfqVar, bsoVar, 4));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ckd] */
    public final cji l(String str) {
        String obj = moz.k(str).toString();
        int length = obj.length();
        ?? r2 = this.a;
        if (length >= 3) {
            String substring = obj.substring(0, 3);
            substring.getClass();
            String upperCase = substring.toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                return new cjg(r2, str);
            }
        }
        return new cjh(r2, str);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, java.lang.Object] */
    public final void m(cjj cjjVar) {
        cjjVar.getClass();
        int i = cjjVar.a;
        ?? r1 = this.a;
        Integer valueOf = Integer.valueOf(i);
        Object obj = r1.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            r1.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        Integer valueOf2 = Integer.valueOf(cjjVar.b);
        if (treeMap.containsKey(valueOf2)) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(valueOf2) + " with " + cjjVar);
        }
        treeMap.put(valueOf2, cjjVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final cgk n(String str) {
        str.getClass();
        return (cgk) this.a.get(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final Set o() {
        return new HashSet(this.a.keySet());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    public final void p() {
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ((cgk) it.next()).s();
        }
        this.a.clear();
    }

    public final cgk q(Class cls) {
        mql c = moz.c(cls);
        String b = c.b();
        if (b != null) {
            return ((eld) this.a).f(c, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public final ccd r() {
        return (ccd) ((myu) this.a).c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:            if (r6.c > r2.c) goto L61;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(defpackage.ccd r6) {
        /*
            r5 = this;
            r6.getClass()
        L3:
            java.lang.Object r0 = r5.a
            myu r0 = (defpackage.myu) r0
            java.lang.Object r1 = r0.c()
            r2 = r1
            ccd r2 = (defpackage.ccd) r2
            boolean r3 = r2 instanceof defpackage.cbw
            if (r3 == 0) goto L13
            goto L26
        L13:
            ccg r3 = defpackage.ccg.a
            boolean r3 = defpackage.amr.i(r2, r3)
            if (r3 == 0) goto L1c
            goto L26
        L1c:
            boolean r3 = r2 instanceof defpackage.cal
            if (r3 == 0) goto L28
            int r3 = r6.c
            int r4 = r2.c
            if (r3 <= r4) goto L2c
        L26:
            r2 = r6
            goto L2c
        L28:
            boolean r3 = r2 instanceof defpackage.cbv
            if (r3 == 0) goto L33
        L2c:
            boolean r0 = r0.f(r1, r2)
            if (r0 == 0) goto L3
            return
        L33:
            mku r6 = new mku
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddh.s(ccd):void");
    }

    public ddh(TextView textView) {
        this.a = new cdf(textView);
    }

    public ddh(Object obj) {
        this.a = obj;
    }

    public ddh(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public ddh() {
        this.a = new HashMap();
        new HashMap();
    }

    public ddh(ddh ddhVar, cgn cgnVar) {
        this(ddhVar, cgnVar, cgs.a);
    }

    public ddh(char[] cArr, byte[] bArr) {
        this.a = myv.a(ccg.a);
    }

    public ddh(ddh ddhVar, cgn cgnVar, cgu cguVar) {
        cgnVar.getClass();
        cguVar.getClass();
        this.a = new eld(ddhVar, cgnVar, cguVar);
    }

    public ddh(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayDeque(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ddh(defpackage.cgq r3) {
        /*
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof defpackage.ces
            ddh r1 = r3.aE()
            if (r0 == 0) goto L13
            r0 = r3
            ces r0 = (defpackage.ces) r0
            cgn r0 = r0.P()
            goto L15
        L13:
            cgx r0 = defpackage.cgx.a
        L15:
            cgu r3 = defpackage.bvz.d(r3)
            r2.<init>(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddh.<init>(cgq):void");
    }

    public ddh(char[] cArr) {
        this.a = new ArrayList();
    }

    public ddh(byte[] bArr, byte[] bArr2) {
        this.a = new HashMap();
    }

    public ddh(byte[] bArr) {
        this.a = new ArrayList();
    }

    public ddh(cgq cgqVar, cgn cgnVar) {
        this(cgqVar.aE(), cgnVar, bvz.d(cgqVar));
    }

    public ddh(byte[] bArr, char[] cArr) {
        this.a = new LinkedHashMap();
    }

    public ddh(short[] sArr) {
        this.a = new LinkedHashMap();
    }
}
