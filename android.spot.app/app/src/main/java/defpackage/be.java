package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.FragmentContainerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class be {
    private ArrayList A;
    private pf I;
    private pf J;
    private boolean K;
    private ArrayList L;
    private ArrayList M;
    private ArrayList N;
    public ox d;
    public an m;
    public al n;
    public ag o;
    ag p;
    public pf q;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public bg w;
    private boolean z;
    private final ArrayList y = new ArrayList();
    public final bl a = new bl();
    public ArrayList b = new ArrayList();
    public final ao c = new ao(this);
    public f e = null;
    public final op f = new aq(this);
    public final AtomicInteger g = new AtomicInteger();
    private final Map B = DesugarCollections.synchronizedMap(new HashMap());
    public final Map h = DesugarCollections.synchronizedMap(new HashMap());
    public final Map i = DesugarCollections.synchronizedMap(new HashMap());
    final ArrayList j = new ArrayList();
    public final bfi x = new bfi(this);
    public final CopyOnWriteArrayList k = new CopyOnWriteArrayList();
    private final buc C = new ah(this, 2);
    private final buc D = new ah(this, 3);
    private final buc E = new ah(this, 4);
    private final buc F = new ah(this, 5);
    private final bvd G = new ar(this);
    int l = -1;
    private final am H = new as(this);
    private final a P = new a();
    ArrayDeque r = new ArrayDeque();
    private final Runnable O = new w(this, 3, null);

    public static boolean Z(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    private final void aA() {
        Iterator it = this.a.d().iterator();
        while (it.hasNext()) {
            ao((fil) it.next());
        }
    }

    public static final Set ah(f fVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < fVar.d.size(); i++) {
            ag agVar = ((bm) fVar.d.get(i)).b;
            if (agVar != null && fVar.j) {
                hashSet.add(agVar);
            }
        }
        return hashSet;
    }

    public static final boolean ai(ag agVar) {
        if (!agVar.L || !agVar.M) {
            boolean z = false;
            for (ag agVar2 : agVar.C.a.e()) {
                if (agVar2 != null) {
                    z = ai(agVar2);
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    static final boolean aj(ag agVar) {
        if (agVar == null) {
            return true;
        }
        if (agVar.M && (agVar.A == null || aj(agVar.D))) {
            return true;
        }
        return false;
    }

    static final void ak(ag agVar) {
        if (Z(2)) {
            Objects.toString(agVar);
        }
        if (agVar.H) {
            agVar.H = false;
            agVar.T = !agVar.T;
        }
    }

    private final ViewGroup aq(ag agVar) {
        ViewGroup viewGroup = agVar.O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (agVar.F > 0 && this.n.b()) {
            View a = this.n.a(agVar.F);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
            return null;
        }
        return null;
    }

    private final Set ar() {
        HashSet hashSet = new HashSet();
        Iterator it = this.a.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((ag) ((fil) it.next()).c).O;
            if (viewGroup != null) {
                hashSet.add(a.ab(viewGroup, ap()));
            }
        }
        return hashSet;
    }

    private final void as() {
        if (!ac()) {
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private final void at() {
        this.z = false;
        this.M.clear();
        this.L.clear();
    }

    private final void au() {
        if (this.K) {
            this.K = false;
            aA();
        }
    }

    private final void av(boolean z) {
        if (!this.z) {
            if (this.m == null) {
                if (this.v) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.m.d.getLooper()) {
                if (!z) {
                    as();
                }
                if (this.L == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /* JADX WARN: Code restructure failed: missing block: B:320:0x0655, code lost:            if (r6 == r12) goto L782;     */
    /* JADX WARN: Removed duplicated region for block: B:433:0x07e6 A[Catch: all -> 0x0811, TryCatch #0 {, blocks: (B:259:0x04e4, B:455:0x04ec, B:456:0x04fc, B:458:0x0502, B:460:0x050f, B:461:0x0512, B:464:0x051c, B:261:0x052c, B:262:0x053c, B:264:0x0542, B:266:0x054f, B:267:0x0552, B:270:0x055f, B:275:0x0565, B:282:0x0578, B:283:0x0588, B:285:0x058e, B:287:0x05a5, B:291:0x05b0, B:292:0x05ba, B:294:0x05c0, B:296:0x05d7, B:300:0x05e0, B:302:0x05e9, B:303:0x05ef, B:304:0x0605, B:306:0x060b, B:308:0x0634, B:309:0x063a, B:311:0x0640, B:317:0x065e, B:322:0x0670, B:323:0x0679, B:325:0x067f, B:328:0x068c, B:333:0x0690, B:334:0x0699, B:336:0x069f, B:338:0x06a9, B:339:0x06ad, B:341:0x06b3, B:343:0x06bd, B:344:0x06cb, B:346:0x06d1, B:348:0x06df, B:349:0x06e8, B:351:0x06ee, B:353:0x0705, B:371:0x0709, B:355:0x070d, B:358:0x0717, B:360:0x071e, B:365:0x0722, B:367:0x0727, B:368:0x072a, B:374:0x0736, B:375:0x073b, B:377:0x0741, B:393:0x074d, B:396:0x0754, B:386:0x075a, B:389:0x0761, B:382:0x0765, B:400:0x076f, B:401:0x077d, B:403:0x0783, B:405:0x0791, B:409:0x07b2, B:410:0x079b, B:411:0x079f, B:413:0x07a5, B:421:0x07ba, B:423:0x07be, B:424:0x07c7, B:426:0x07cd, B:428:0x07d9, B:431:0x07e2, B:433:0x07e6, B:434:0x0805, B:439:0x07ef, B:441:0x07f9), top: B:258:0x04e4 }] */
    /* JADX WARN: Removed duplicated region for block: B:438:0x07ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void aw(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 2226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be.aw(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private final void ax() {
        for (cb cbVar : ar()) {
        }
    }

    private final void ay(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((f) arrayList.get(i)).s) {
                        if (i2 != i) {
                            aw(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((f) arrayList.get(i2)).s) {
                                i2++;
                            }
                        }
                        aw(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    aw(arrayList, arrayList2, i2, size);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private final void az(ag agVar) {
        ViewGroup aq = aq(agVar);
        if (aq != null && agVar.s() + agVar.t() + agVar.u() + agVar.v() > 0) {
            if (aq.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                aq.setTag(R.id.visible_removing_fragment_view_tag, agVar);
            }
            ((ag) aq.getTag(R.id.visible_removing_fragment_view_tag)).ao(agVar.at());
        }
    }

    public static ag d(View view) {
        ag g = g(view);
        if (g != null) {
            return g;
        }
        throw new IllegalStateException(a.af(view, "View ", " does not have a Fragment set"));
    }

    public static ag g(View view) {
        while (view != null) {
            ag h = h(view);
            if (h != null) {
                return h;
            }
            Object parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static ag h(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof ag) {
            return (ag) tag;
        }
        return null;
    }

    public final void A() {
        this.t = false;
        this.u = false;
        this.w.g = false;
        C(7);
    }

    public final void B() {
        this.t = false;
        this.u = false;
        this.w.g = false;
        C(5);
    }

    public final void C(int i) {
        try {
            this.z = true;
            for (fil filVar : this.a.b.values()) {
                if (filVar != null) {
                    filVar.a = i;
                }
            }
            J(i, false);
            Iterator it = ar().iterator();
            while (it.hasNext()) {
                ((cb) it.next()).f();
            }
            this.z = false;
            al(true);
        } catch (Throwable th) {
            this.z = false;
            throw th;
        }
    }

    public final void D() {
        this.u = true;
        this.w.g = true;
        C(4);
    }

    public final void E(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        bl blVar = this.a;
        if (!blVar.b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (fil filVar : blVar.b.values()) {
                printWriter.print(str);
                if (filVar != null) {
                    String valueOf = String.valueOf(str);
                    Object obj = filVar.c;
                    printWriter.println(obj);
                    ((ag) obj).V(valueOf.concat("    "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = blVar.a.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                ag agVar = (ag) blVar.a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(agVar.toString());
            }
        }
        ArrayList arrayList = this.A;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                ag agVar2 = (ag) this.A.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(agVar2.toString());
            }
        }
        int size3 = this.b.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                String valueOf2 = String.valueOf(str);
                f fVar = (f) this.b.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(fVar.toString());
                fVar.e(valueOf2.concat("    "), printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.g.get());
        synchronized (this.y) {
            int size4 = this.y.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    bb bbVar = (bb) this.y.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(bbVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.t);
        printWriter.print(" mStopped=");
        printWriter.print(this.u);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.v);
        if (this.s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.s);
        }
    }

    public final void F() {
        Iterator it = ar().iterator();
        while (it.hasNext()) {
            ((cb) it.next()).f();
        }
    }

    public final void G(bb bbVar, boolean z) {
        if (!z) {
            if (this.m == null) {
                if (this.v) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            as();
        }
        synchronized (this.y) {
            if (this.m == null) {
                if (z) {
                    return;
                } else {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            }
            this.y.add(bbVar);
            synchronized (this.y) {
                if (this.y.size() == 1) {
                    this.m.d.removeCallbacks(this.O);
                    this.m.d.post(this.O);
                    U();
                }
            }
        }
    }

    public final void H(bb bbVar, boolean z) {
        if (z && (this.m == null || this.v)) {
            return;
        }
        av(z);
        bbVar.g(this.L, this.M);
        this.z = true;
        try {
            ay(this.L, this.M);
            at();
            U();
            au();
            this.a.h();
        } catch (Throwable th) {
            at();
            throw th;
        }
    }

    final void I(ag agVar) {
        if (Z(2)) {
            Objects.toString(agVar);
        }
        if (!agVar.H) {
            agVar.H = true;
            agVar.T = true ^ agVar.T;
            az(agVar);
        }
    }

    final void J(int i, boolean z) {
        an anVar;
        if (this.m == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.l) {
            this.l = i;
            bl blVar = this.a;
            ArrayList arrayList = blVar.a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                fil filVar = (fil) blVar.b.get(((ag) arrayList.get(i2)).l);
                if (filVar != null) {
                    filVar.f();
                }
            }
            for (fil filVar2 : blVar.b.values()) {
                if (filVar2 != null) {
                    filVar2.f();
                    ag agVar = (ag) filVar2.c;
                    if (agVar.s && !agVar.aw()) {
                        boolean z2 = agVar.u;
                        blVar.m(filVar2);
                    }
                }
            }
            aA();
            if (this.s && (anVar = this.m) != null && this.l == 7) {
                anVar.e();
                this.s = false;
            }
        }
    }

    public final void K() {
        if (this.m != null) {
            this.t = false;
            this.u = false;
            this.w.g = false;
            for (ag agVar : this.a.f()) {
                if (agVar != null) {
                    agVar.C.K();
                }
            }
        }
    }

    public final void L() {
        G(new bc(this, -1, 0), false);
    }

    final void M(ag agVar) {
        if (Z(2)) {
            Objects.toString(agVar);
            int i = agVar.z;
        }
        boolean aw = agVar.aw();
        if (agVar.I && aw) {
            return;
        }
        this.a.i(agVar);
        if (ai(agVar)) {
            this.s = true;
        }
        agVar.s = true;
        az(agVar);
    }

    public final void N(Parcelable parcelable) {
        boolean z;
        fil filVar;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3 = (Bundle) parcelable;
        for (String str : bundle3.keySet()) {
            if (str.startsWith("result_") && (bundle2 = bundle3.getBundle(str)) != null) {
                bundle2.setClassLoader(this.m.c.getClassLoader());
                this.h.put(str.substring(7), bundle2);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle3.keySet()) {
            if (str2.startsWith("fragment_") && (bundle = bundle3.getBundle(str2)) != null) {
                bundle.setClassLoader(this.m.c.getClassLoader());
                hashMap.put(str2.substring(9), bundle);
            }
        }
        bl blVar = this.a;
        blVar.c.clear();
        blVar.c.putAll(hashMap);
        bf bfVar = (bf) bundle3.getParcelable("state");
        if (bfVar == null) {
            return;
        }
        this.a.b.clear();
        ArrayList arrayList = bfVar.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Bundle a = this.a.a((String) arrayList.get(i), null);
            if (a != null) {
                bk bkVar = (bk) a.getParcelable("state");
                ag agVar = (ag) this.w.b.get(bkVar.b);
                if (agVar != null) {
                    if (Z(2)) {
                        Objects.toString(agVar);
                    }
                    filVar = new fil(this.x, this.a, agVar, a);
                } else {
                    filVar = new fil(this.x, this.a, this.m.c.getClassLoader(), i(), a);
                }
                Object obj = filVar.c;
                ag agVar2 = (ag) obj;
                agVar2.h = a;
                agVar2.A = this;
                if (Z(2)) {
                    String str3 = agVar2.l;
                    Objects.toString(obj);
                }
                filVar.g(this.m.c.getClassLoader());
                this.a.l(filVar);
                filVar.a = this.l;
            }
        }
        for (ag agVar3 : new ArrayList(this.w.b.values())) {
            if (!this.a.j(agVar3.l)) {
                if (Z(2)) {
                    Objects.toString(agVar3);
                    Objects.toString(bfVar.a);
                }
                this.w.d(agVar3);
                agVar3.A = this;
                fil filVar2 = new fil(this.x, this.a, agVar3);
                filVar2.a = 1;
                filVar2.f();
                agVar3.s = true;
                filVar2.f();
            }
        }
        bl blVar2 = this.a;
        ArrayList<String> arrayList2 = bfVar.b;
        blVar2.a.clear();
        if (arrayList2 != null) {
            for (String str4 : arrayList2) {
                ag b = blVar2.b(str4);
                if (b != null) {
                    if (Z(2)) {
                        Objects.toString(b);
                    }
                    blVar2.g(b);
                } else {
                    throw new IllegalStateException(a.ag(str4, "No instantiated fragment for (", ")"));
                }
            }
        }
        g[] gVarArr = bfVar.c;
        if (gVarArr != null) {
            this.b = new ArrayList(gVarArr.length);
            int i2 = 0;
            while (true) {
                g[] gVarArr2 = bfVar.c;
                if (i2 >= gVarArr2.length) {
                    break;
                }
                g gVar = gVarArr2[i2];
                f fVar = new f(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = gVar.a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    bm bmVar = new bm();
                    int i5 = i3 + 1;
                    bmVar.a = iArr[i3];
                    if (Z(2)) {
                        fVar.toString();
                        int i6 = gVar.a[i5];
                    }
                    bmVar.h = cew.values()[gVar.c[i4]];
                    bmVar.i = cew.values()[gVar.d[i4]];
                    int[] iArr2 = gVar.a;
                    int i7 = i3 + 2;
                    if (iArr2[i5] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bmVar.c = z;
                    int i8 = iArr2[i7];
                    bmVar.d = i8;
                    int i9 = iArr2[i3 + 3];
                    bmVar.e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr2[i3 + 4];
                    bmVar.f = i11;
                    i3 += 6;
                    int i12 = iArr2[i10];
                    bmVar.g = i12;
                    fVar.e = i8;
                    fVar.f = i9;
                    fVar.g = i11;
                    fVar.h = i12;
                    fVar.n(bmVar);
                    i4++;
                }
                fVar.i = gVar.e;
                fVar.l = gVar.f;
                fVar.j = true;
                fVar.m = gVar.h;
                fVar.n = gVar.i;
                fVar.o = gVar.j;
                fVar.p = gVar.k;
                fVar.q = gVar.l;
                fVar.r = gVar.m;
                fVar.s = gVar.n;
                fVar.c = gVar.g;
                for (int i13 = 0; i13 < gVar.b.size(); i13++) {
                    String str5 = (String) gVar.b.get(i13);
                    if (str5 != null) {
                        ((bm) fVar.d.get(i13)).b = c(str5);
                    }
                }
                fVar.a(1);
                if (Z(2)) {
                    int i14 = fVar.c;
                    fVar.toString();
                    PrintWriter printWriter = new PrintWriter(new bu());
                    fVar.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.b.add(fVar);
                i2++;
            }
        } else {
            this.b = new ArrayList();
        }
        this.g.set(bfVar.d);
        String str6 = bfVar.e;
        if (str6 != null) {
            ag c = c(str6);
            this.p = c;
            x(c);
        }
        ArrayList arrayList3 = bfVar.f;
        if (arrayList3 != null) {
            for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                this.B.put((String) arrayList3.get(i15), (i) bfVar.g.get(i15));
            }
        }
        this.r = new ArrayDeque(bfVar.h);
    }

    final void O(ag agVar, boolean z) {
        ViewGroup aq = aq(agVar);
        if (aq != null && (aq instanceof FragmentContainerView)) {
            ((FragmentContainerView) aq).a = !z;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.i
            java.lang.Object r0 = r0.get(r4)
            az r0 = (defpackage.az) r0
            if (r0 == 0) goto L1a
            cex r1 = r0.a
            cew r2 = defpackage.cew.STARTED
            cew r1 = r1.b
            boolean r1 = r1.a(r2)
            if (r1 == 0) goto L1a
            r0.a(r4, r5)
            goto L1f
        L1a:
            java.util.Map r0 = r3.h
            r0.put(r4, r5)
        L1f:
            r4 = 2
            boolean r4 = Z(r4)
            if (r4 == 0) goto L29
            java.util.Objects.toString(r5)
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be.P(java.lang.String, android.os.Bundle):void");
    }

    public final void Q(String str, cfc cfcVar, bj bjVar) {
        cex N = cfcVar.N();
        if (N.b == cew.DESTROYED) {
            return;
        }
        at atVar = new at(this, str, bjVar, N);
        az azVar = (az) this.i.put(str, new az(N, bjVar, atVar));
        if (azVar != null) {
            azVar.a.c(azVar.b);
        }
        if (Z(2)) {
            Objects.toString(N);
            Objects.toString(bjVar);
        }
        N.a(atVar);
    }

    final void R(ag agVar, cew cewVar) {
        if (agVar.equals(c(agVar.l)) && (agVar.B == null || agVar.A == this)) {
            agVar.X = cewVar;
            return;
        }
        throw new IllegalArgumentException(a.ah(this, agVar, "Fragment ", " is not an active fragment of FragmentManager "));
    }

    final void S(ag agVar) {
        if (agVar != null && (!agVar.equals(c(agVar.l)) || (agVar.B != null && agVar.A != this))) {
            throw new IllegalArgumentException(a.ah(this, agVar, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        ag agVar2 = this.p;
        this.p = agVar;
        x(agVar2);
        x(this.p);
    }

    public final void T(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new bu());
        an anVar = this.m;
        if (anVar != null) {
            try {
                ((ai) anVar).a.dump("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
                throw runtimeException;
            }
        }
        try {
            E("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e2) {
            Log.e("FragmentManager", "Failed dumping state", e2);
            throw runtimeException;
        }
    }

    public final void U() {
        synchronized (this.y) {
            boolean z = true;
            if (!this.y.isEmpty()) {
                this.f.h(true);
                if (Z(3)) {
                    toString();
                }
            } else {
                if (a() <= 0 || !ab(this.o)) {
                    z = false;
                }
                if (Z(3)) {
                    toString();
                }
                this.f.h(z);
            }
        }
    }

    public final boolean V(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (ag agVar : this.a.f()) {
            if (agVar != null && !agVar.H && agVar.C.V(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean W(Menu menu, MenuInflater menuInflater) {
        boolean z;
        if (this.l <= 0) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (ag agVar : this.a.f()) {
            if (agVar != null && aj(agVar) && !agVar.H) {
                if (agVar.L && agVar.M) {
                    agVar.aa(menu, menuInflater);
                    z = true;
                } else {
                    z = false;
                }
                if (z | agVar.C.W(menu, menuInflater)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(agVar);
                    z2 = true;
                }
            }
        }
        if (this.A != null) {
            for (int i = 0; i < this.A.size(); i++) {
                ag agVar2 = (ag) this.A.get(i);
                if (arrayList != null) {
                    arrayList.contains(agVar2);
                }
            }
        }
        this.A = arrayList;
        return z2;
    }

    public final boolean X(MenuItem menuItem) {
        if (this.l <= 0) {
            return false;
        }
        for (ag agVar : this.a.f()) {
            if (agVar != null && !agVar.H && ((agVar.L && agVar.M && agVar.ay(menuItem)) || agVar.C.X(menuItem))) {
                return true;
            }
        }
        return false;
    }

    public final boolean Y(Menu menu) {
        boolean z;
        if (this.l <= 0) {
            return false;
        }
        boolean z2 = false;
        for (ag agVar : this.a.f()) {
            if (agVar != null && aj(agVar) && !agVar.H) {
                if (agVar.L && agVar.M) {
                    agVar.ae(menu);
                    z = true;
                } else {
                    z = false;
                }
                if (agVar.C.Y(menu) | z) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final int a() {
        int i;
        int size = this.b.size();
        if (this.e != null) {
            i = 1;
        } else {
            i = 0;
        }
        return size + i;
    }

    public final boolean aa() {
        ag agVar = this.o;
        if (agVar == null) {
            return true;
        }
        if (agVar.au() && agVar.H().aa()) {
            return true;
        }
        return false;
    }

    final boolean ab(ag agVar) {
        if (agVar == null) {
            return true;
        }
        be beVar = agVar.A;
        if (agVar.equals(beVar.p) && ab(beVar.o)) {
            return true;
        }
        return false;
    }

    public final boolean ac() {
        if (!this.t && !this.u) {
            return false;
        }
        return true;
    }

    public final boolean ad() {
        return ae(null, -1, 0);
    }

    public final boolean ae(String str, int i, int i2) {
        al(false);
        av(true);
        ag agVar = this.p;
        if (agVar != null && i < 0 && str == null && agVar.G().ad()) {
            return true;
        }
        boolean af = af(this.L, this.M, str, i, i2);
        if (af) {
            this.z = true;
            try {
                ay(this.L, this.M);
            } finally {
                at();
            }
        }
        U();
        au();
        this.a.h();
        return af;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean af(java.util.ArrayList r6, java.util.ArrayList r7, java.lang.String r8, int r9, int r10) {
        /*
            r5 = this;
            java.util.ArrayList r0 = r5.b
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = -1
            if (r0 == 0) goto Ld
        La:
            r8 = -1
            goto L74
        Ld:
            if (r8 != 0) goto L1e
            if (r9 >= 0) goto L1e
            if (r10 == 0) goto L16
            r8 = 0
            goto L74
        L16:
            java.util.ArrayList r8 = r5.b
            int r8 = r8.size()
            int r8 = r8 + r2
            goto L74
        L1e:
            java.util.ArrayList r0 = r5.b
            int r0 = r0.size()
            int r0 = r0 + r2
        L25:
            if (r0 < 0) goto L43
            java.util.ArrayList r3 = r5.b
            java.lang.Object r3 = r3.get(r0)
            f r3 = (defpackage.f) r3
            if (r8 == 0) goto L3a
            java.lang.String r4 = r3.l
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L3a
            goto L43
        L3a:
            if (r9 < 0) goto L40
            int r3 = r3.c
            if (r9 == r3) goto L43
        L40:
            int r0 = r0 + (-1)
            goto L25
        L43:
            if (r0 >= 0) goto L47
        L45:
            r8 = r0
            goto L74
        L47:
            if (r10 != 0) goto L56
            java.util.ArrayList r8 = r5.b
            int r8 = r8.size()
            int r8 = r8 + r2
            if (r0 != r8) goto L53
            goto La
        L53:
            int r8 = r0 + 1
            goto L74
        L56:
            if (r0 <= 0) goto L45
            java.util.ArrayList r10 = r5.b
            int r3 = r0 + (-1)
            java.lang.Object r10 = r10.get(r3)
            f r10 = (defpackage.f) r10
            if (r8 == 0) goto L6c
            java.lang.String r4 = r10.l
            boolean r4 = r8.equals(r4)
            if (r4 != 0) goto L72
        L6c:
            if (r9 < 0) goto L45
            int r10 = r10.c
            if (r9 != r10) goto L45
        L72:
            r0 = r3
            goto L56
        L74:
            if (r8 >= 0) goto L77
            return r1
        L77:
            java.util.ArrayList r9 = r5.b
            int r9 = r9.size()
            int r9 = r9 + r2
        L7e:
            r10 = 1
            if (r9 < r8) goto L96
            java.util.ArrayList r0 = r5.b
            java.lang.Object r0 = r0.remove(r9)
            f r0 = (defpackage.f) r0
            r6.add(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r7.add(r10)
            int r9 = r9 + (-1)
            goto L7e
        L96:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be.af(java.util.ArrayList, java.util.ArrayList, java.lang.String, int, int):boolean");
    }

    public final void ag() {
        al(true);
        ax();
    }

    public final void al(boolean z) {
        av(z);
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.y) {
                if (this.y.isEmpty()) {
                    break;
                }
                try {
                    int size = this.y.size();
                    boolean z2 = false;
                    for (int i = 0; i < size; i++) {
                        z2 |= ((bb) this.y.get(i)).g(arrayList, arrayList2);
                    }
                    if (!z2) {
                        break;
                    }
                    this.z = true;
                    try {
                        ay(this.L, this.M);
                    } finally {
                        at();
                    }
                } finally {
                    this.y.clear();
                    this.m.d.removeCallbacks(this.O);
                }
            }
        }
        U();
        au();
        this.a.h();
    }

    public final fil am(ag agVar) {
        String str = agVar.W;
        if (str != null) {
            cdr.a(agVar, str);
        }
        if (Z(2)) {
            Objects.toString(agVar);
        }
        fil an = an(agVar);
        agVar.A = this;
        this.a.l(an);
        if (!agVar.I) {
            this.a.g(agVar);
            agVar.s = false;
            if (agVar.P == null) {
                agVar.T = false;
            }
            if (ai(agVar)) {
                this.s = true;
            }
        }
        return an;
    }

    public final fil an(ag agVar) {
        fil k = this.a.k(agVar.l);
        if (k != null) {
            return k;
        }
        fil filVar = new fil(this.x, this.a, agVar);
        filVar.g(this.m.c.getClassLoader());
        filVar.a = this.l;
        return filVar;
    }

    public final void ao(fil filVar) {
        ag agVar = (ag) filVar.c;
        if (agVar.Q) {
            if (this.z) {
                this.K = true;
            } else {
                agVar.Q = false;
                filVar.f();
            }
        }
    }

    public final a ap() {
        ag agVar = this.o;
        if (agVar != null) {
            return agVar.A.ap();
        }
        return this.P;
    }

    public final Bundle b() {
        g[] gVarArr;
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        ax();
        F();
        al(true);
        this.t = true;
        this.w.g = true;
        bl blVar = this.a;
        ArrayList arrayList2 = new ArrayList(blVar.b.size());
        for (fil filVar : blVar.b.values()) {
            if (filVar != null) {
                Object obj = filVar.c;
                ag agVar = (ag) obj;
                blVar.a(agVar.l, filVar.b());
                arrayList2.add(agVar.l);
                if (Z(2)) {
                    Objects.toString(obj);
                    Objects.toString(agVar.h);
                }
            }
        }
        HashMap hashMap = this.a.c;
        if (!hashMap.isEmpty()) {
            bl blVar2 = this.a;
            synchronized (blVar2.a) {
                gVarArr = null;
                if (blVar2.a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(blVar2.a.size());
                    Iterator it = blVar2.a.iterator();
                    while (it.hasNext()) {
                        ag agVar2 = (ag) it.next();
                        arrayList.add(agVar2.l);
                        if (Z(2)) {
                            String str = agVar2.l;
                            Objects.toString(agVar2);
                        }
                    }
                }
            }
            int size = this.b.size();
            if (size > 0) {
                gVarArr = new g[size];
                for (int i = 0; i < size; i++) {
                    gVarArr[i] = new g((f) this.b.get(i));
                    if (Z(2)) {
                        Objects.toString(this.b.get(i));
                    }
                }
            }
            bf bfVar = new bf();
            bfVar.a = arrayList2;
            bfVar.b = arrayList;
            bfVar.c = gVarArr;
            bfVar.d = this.g.get();
            ag agVar3 = this.p;
            if (agVar3 != null) {
                bfVar.e = agVar3.l;
            }
            bfVar.f.addAll(this.B.keySet());
            bfVar.g.addAll(this.B.values());
            bfVar.h = new ArrayList(this.r);
            bundle.putParcelable("state", bfVar);
            for (String str2 : this.h.keySet()) {
                bundle.putBundle("result_".concat(String.valueOf(str2)), (Bundle) this.h.get(str2));
            }
            for (String str3 : hashMap.keySet()) {
                bundle.putBundle("fragment_".concat(String.valueOf(str3)), (Bundle) hashMap.get(str3));
            }
        }
        return bundle;
    }

    public final ag c(String str) {
        return this.a.b(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6, types: [ag] */
    public final ag e(int i) {
        ?? r2;
        bl blVar = this.a;
        int size = blVar.a.size();
        while (true) {
            size--;
            if (size >= 0) {
                r2 = (ag) blVar.a.get(size);
                if (r2 != 0 && r2.E == i) {
                    break;
                }
            } else {
                Iterator it = blVar.b.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        fil filVar = (fil) it.next();
                        if (filVar != null) {
                            r2 = filVar.c;
                            if (((ag) r2).E == i) {
                                break;
                            }
                        }
                    } else {
                        r2 = 0;
                        break;
                    }
                }
            }
        }
        return (ag) r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ag f(String str) {
        ag agVar;
        bl blVar = this.a;
        if (str != null) {
            int size = blVar.a.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                agVar = (ag) blVar.a.get(size);
                if (agVar != null && str.equals(agVar.G)) {
                    break;
                }
            }
            return agVar;
        }
        agVar = null;
        if (str != null) {
            Iterator it = blVar.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fil filVar = (fil) it.next();
                if (filVar != null) {
                    Object obj = filVar.c;
                    if (str.equals(((ag) obj).G)) {
                        agVar = obj;
                        break;
                    }
                }
            }
        }
        return agVar;
    }

    public final am i() {
        ag agVar = this.o;
        if (agVar != null) {
            return agVar.A.i();
        }
        return this.H;
    }

    public final List j() {
        return this.a.f();
    }

    public final Set k(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((f) arrayList.get(i)).d;
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                ag agVar = ((bm) arrayList2.get(i3)).b;
                if (agVar != null && (viewGroup = agVar.O) != null) {
                    hashSet.add(cb.c(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void l(bh bhVar) {
        this.k.add(bhVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [cjz, an] */
    /* JADX WARN: Type inference failed for: r4v9, types: [pl, an] */
    public final void m(an anVar, al alVar, ag agVar) {
        String str;
        ag agVar2;
        if (this.m == null) {
            this.m = anVar;
            this.n = alVar;
            this.o = agVar;
            if (agVar != null) {
                l(new au());
            } else if (anVar instanceof bh) {
                l(anVar);
            }
            if (this.o != null) {
                U();
            }
            if (anVar instanceof oy) {
                ox c = anVar.c();
                this.d = c;
                if (agVar != null) {
                    agVar2 = agVar;
                } else {
                    agVar2 = anVar;
                }
                c.b(agVar2, this.f);
            }
            int i = 0;
            if (agVar != null) {
                bg bgVar = agVar.A.w;
                bg bgVar2 = (bg) bgVar.c.get(agVar.l);
                if (bgVar2 == null) {
                    bg bgVar3 = new bg(bgVar.e);
                    bgVar.c.put(agVar.l, bgVar3);
                    bgVar2 = bgVar3;
                }
                this.w = bgVar2;
            } else {
                if (anVar instanceof cgq) {
                    this.w = (bg) new ddh(anVar.aE(), bg.a).q(bg.class);
                } else {
                    this.w = new bg(false);
                }
                agVar = null;
            }
            bg bgVar4 = this.w;
            bgVar4.g = ac();
            this.a.d = bgVar4;
            ?? r4 = this.m;
            if ((r4 instanceof cjz) && agVar == null) {
                cjy R = r4.R();
                R.b("android:support:fragments", new ap(this, i));
                Bundle a = R.a("android:support:fragments");
                if (a != null) {
                    N(a);
                }
            }
            ?? r42 = this.m;
            if (r42 instanceof pl) {
                pk d = r42.d();
                if (agVar != null) {
                    str = String.valueOf(agVar.l).concat(":");
                } else {
                    str = "";
                }
                pq pqVar = new pq();
                av avVar = new av(this, 0);
                String concat = "FragmentManager:".concat(str);
                this.q = d.a(concat.concat("StartActivityForResult"), pqVar, avVar);
                this.I = d.a(concat.concat("StartIntentSenderForResult"), new aw(), new av(this, 2));
                this.J = d.a(concat.concat("RequestPermissions"), new po(), new av(this, 1));
            }
            an anVar2 = this.m;
            if (anVar2 instanceof bqy) {
                ((ai) anVar2).a.l(this.C);
            }
            an anVar3 = this.m;
            if (anVar3 instanceof bqz) {
                buc bucVar = this.D;
                aj ajVar = ((ai) anVar3).a;
                bucVar.getClass();
                ajVar.j.add(bucVar);
            }
            an anVar4 = this.m;
            if (anVar4 instanceof bv) {
                buc bucVar2 = this.E;
                aj ajVar2 = ((ai) anVar4).a;
                bucVar2.getClass();
                ajVar2.l.add(bucVar2);
            }
            an anVar5 = this.m;
            if (anVar5 instanceof bw) {
                buc bucVar3 = this.F;
                aj ajVar3 = ((ai) anVar5).a;
                bucVar3.getClass();
                ajVar3.m.add(bucVar3);
            }
            an anVar6 = this.m;
            if ((anVar6 instanceof buz) && agVar == null) {
                bvd bvdVar = this.G;
                aj ajVar4 = ((ai) anVar6).a;
                bvdVar.getClass();
                ajVar4.o.i(bvdVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    final void n(ag agVar) {
        if (Z(2)) {
            Objects.toString(agVar);
        }
        if (agVar.I) {
            agVar.I = false;
            if (!agVar.r) {
                this.a.g(agVar);
                if (Z(2)) {
                    Objects.toString(agVar);
                }
                if (ai(agVar)) {
                    this.s = true;
                }
            }
        }
    }

    final void o(ag agVar) {
        if (Z(2)) {
            Objects.toString(agVar);
        }
        if (!agVar.I) {
            agVar.I = true;
            if (agVar.r) {
                if (Z(2)) {
                    Objects.toString(agVar);
                }
                this.a.i(agVar);
                if (ai(agVar)) {
                    this.s = true;
                }
                az(agVar);
            }
        }
    }

    public final void p() {
        this.t = false;
        this.u = false;
        this.w.g = false;
        C(4);
    }

    public final void q(Configuration configuration, boolean z) {
        if (z && (this.m instanceof bqy)) {
            T(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (ag agVar : this.a.f()) {
            if (agVar != null) {
                agVar.onConfigurationChanged(configuration);
                if (z) {
                    agVar.C.q(configuration, true);
                }
            }
        }
    }

    public final void r() {
        this.t = false;
        this.u = false;
        this.w.g = false;
        C(1);
    }

    public final void s() {
        boolean isChangingConfigurations;
        this.v = true;
        al(true);
        F();
        an anVar = this.m;
        if (anVar instanceof cgq) {
            isChangingConfigurations = this.a.d.f;
        } else {
            isChangingConfigurations = true ^ ((Activity) anVar.c).isChangingConfigurations();
        }
        if (isChangingConfigurations) {
            Iterator it = this.B.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((i) it.next()).a.iterator();
                while (it2.hasNext()) {
                    this.a.d.b((String) it2.next(), false);
                }
            }
        }
        C(-1);
        an anVar2 = this.m;
        if (anVar2 instanceof bqz) {
            buc bucVar = this.D;
            aj ajVar = ((ai) anVar2).a;
            bucVar.getClass();
            ajVar.j.remove(bucVar);
        }
        an anVar3 = this.m;
        if (anVar3 instanceof bqy) {
            buc bucVar2 = this.C;
            aj ajVar2 = ((ai) anVar3).a;
            bucVar2.getClass();
            ajVar2.i.remove(bucVar2);
        }
        an anVar4 = this.m;
        if (anVar4 instanceof bv) {
            buc bucVar3 = this.E;
            aj ajVar3 = ((ai) anVar4).a;
            bucVar3.getClass();
            ajVar3.l.remove(bucVar3);
        }
        an anVar5 = this.m;
        if (anVar5 instanceof bw) {
            buc bucVar4 = this.F;
            aj ajVar4 = ((ai) anVar5).a;
            bucVar4.getClass();
            ajVar4.m.remove(bucVar4);
        }
        an anVar6 = this.m;
        if ((anVar6 instanceof buz) && this.o == null) {
            bvd bvdVar = this.G;
            aj ajVar5 = ((ai) anVar6).a;
            bvdVar.getClass();
            ajVar5.o.l(bvdVar);
        }
        this.m = null;
        this.n = null;
        this.o = null;
        if (this.d != null) {
            this.f.f();
            this.d = null;
        }
        pf pfVar = this.q;
        if (pfVar != null) {
            pfVar.a();
            this.I.a();
            this.J.a();
        }
    }

    public final void t(boolean z) {
        if (z && (this.m instanceof bqz)) {
            T(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (ag agVar : this.a.f()) {
            if (agVar != null) {
                agVar.onLowMemory();
                if (z) {
                    agVar.C.t(true);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        ag agVar = this.o;
        if (agVar != null) {
            sb.append(agVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.o)));
            sb.append("}");
        } else {
            an anVar = this.m;
            if (anVar != null) {
                sb.append(anVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.m)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(boolean z, boolean z2) {
        if (z2 && (this.m instanceof bv)) {
            T(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (ag agVar : this.a.f()) {
            if (agVar != null && z2) {
                agVar.C.u(z, true);
            }
        }
    }

    public final void v() {
        for (ag agVar : this.a.e()) {
            if (agVar != null) {
                agVar.C.v();
            }
        }
    }

    public final void w(Menu menu) {
        if (this.l > 0) {
            for (ag agVar : this.a.f()) {
                if (agVar != null && !agVar.H) {
                    agVar.C.w(menu);
                }
            }
        }
    }

    public final void x(ag agVar) {
        if (agVar != null && agVar.equals(c(agVar.l))) {
            boolean ab = agVar.A.ab(agVar);
            Boolean bool = agVar.q;
            if (bool == null || bool.booleanValue() != ab) {
                agVar.q = Boolean.valueOf(ab);
                be beVar = agVar.C;
                beVar.U();
                beVar.x(beVar.p);
            }
        }
    }

    public final void y() {
        C(5);
    }

    public final void z(boolean z, boolean z2) {
        if (z2 && (this.m instanceof bw)) {
            T(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (ag agVar : this.a.f()) {
            if (agVar != null && z2) {
                agVar.C.z(z, true);
            }
        }
    }
}
