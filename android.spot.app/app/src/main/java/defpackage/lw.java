package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lw {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    int e;
    public final /* synthetic */ RecyclerView f;
    kvu g;

    public lw(RecyclerView recyclerView) {
        this.f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
    }

    public final int a(int i) {
        if (i >= 0 && i < this.f.M.a()) {
            RecyclerView recyclerView = this.f;
            if (!recyclerView.M.g) {
                return i;
            }
            return recyclerView.g.a(i);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + this.f.M.a() + this.f.k());
    }

    public final View b(int i) {
        return o(i, Long.MAX_VALUE).b;
    }

    public final void c(mh mhVar, boolean z) {
        buk bukVar;
        RecyclerView.s(mhVar);
        View view = mhVar.b;
        mj mjVar = this.f.Q;
        if (mjVar != null) {
            mi miVar = mjVar.b;
            if (miVar instanceof mi) {
                bukVar = (buk) miVar.b.remove(view);
            } else {
                bukVar = null;
            }
            bwn.q(view, bukVar);
        }
        if (z) {
            int size = this.f.n.size();
            for (int i = 0; i < size; i++) {
                ((lx) this.f.n.get(i)).a();
            }
            lj ljVar = this.f.l;
            if (ljVar != null) {
                ljVar.n(mhVar);
            }
            RecyclerView recyclerView = this.f;
            if (recyclerView.M != null) {
                recyclerView.V.j(mhVar);
            }
        }
        mhVar.q = null;
        mhVar.p = null;
        kvu p = p();
        int i2 = mhVar.g;
        ArrayList arrayList = p.f(i2).a;
        int i3 = ((lv) ((SparseArray) p.a).get(i2)).b;
        if (arrayList.size() >= 5) {
            brl.b(mhVar.b);
        } else {
            mhVar.i();
            arrayList.add(mhVar);
        }
    }

    public final void d() {
        this.a.clear();
        h();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    public final void e() {
        RecyclerView recyclerView;
        lj ljVar;
        kvu kvuVar = this.g;
        if (kvuVar != null && (ljVar = (recyclerView = this.f).l) != null && recyclerView.r) {
            kvuVar.c.add(ljVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Set, java.lang.Object] */
    public final void f(lj ljVar, boolean z) {
        kvu kvuVar = this.g;
        if (kvuVar != null) {
            kvuVar.c.remove(ljVar);
            if (kvuVar.c.size() == 0 && !z) {
                for (int i = 0; i < ((SparseArray) kvuVar.a).size(); i++) {
                    SparseArray sparseArray = (SparseArray) kvuVar.a;
                    ArrayList arrayList = ((lv) sparseArray.get(sparseArray.keyAt(i))).a;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        brl.b(((mh) arrayList.get(i2)).b);
                    }
                }
            }
        }
    }

    public final void g(View view) {
        mh h = RecyclerView.h(view);
        h.l = null;
        h.m = false;
        h.f();
        k(h);
    }

    public final void h() {
        int size = this.c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else {
                i(size);
            }
        }
        this.c.clear();
        if (RecyclerView.b) {
            this.f.L.b();
        }
    }

    public final void i(int i) {
        int i2 = RecyclerView.W;
        c((mh) this.c.get(i), true);
        this.c.remove(i);
    }

    public final void j(View view) {
        mh h = RecyclerView.h(view);
        if (h.u()) {
            this.f.removeDetachedView(view, false);
        }
        if (h.t()) {
            h.m();
        } else if (h.y()) {
            h.f();
        }
        k(h);
        if (this.f.D != null && !h.r()) {
            this.f.D.f(h);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:            if (r6.f.L.d(r7.d) == false) goto L110;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0077, code lost:            r3 = r3 - 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:            if (r3 < 0) goto L136;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008d, code lost:            if (r6.f.L.d(((defpackage.mh) r6.c.get(r3)).d) != false) goto L138;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:            r3 = r3 + 1;     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(defpackage.mh r7) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw.k(mh):void");
    }

    public final void l(View view) {
        lo loVar;
        mh h = RecyclerView.h(view);
        if (!h.n(12) && h.v() && (loVar = this.f.D) != null && mh.a.isEmpty() && loVar.a && !h.q()) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            h.l(this, true);
            this.b.add(h);
            return;
        }
        if (h.q() && !h.s()) {
            RecyclerView recyclerView = this.f;
            if (!recyclerView.l.c) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.k()));
            }
        }
        h.l(this, false);
        this.a.add(h);
    }

    public final void m(mh mhVar) {
        if (mhVar.m) {
            this.b.remove(mhVar);
        } else {
            this.a.remove(mhVar);
        }
        mhVar.l = null;
        mhVar.m = false;
        mhVar.f();
    }

    public final void n() {
        int i;
        lr lrVar = this.f.m;
        if (lrVar != null) {
            i = lrVar.y;
        } else {
            i = 0;
        }
        this.e = i + 2;
        int size = this.c.size();
        while (true) {
            size--;
            if (size >= 0 && this.c.size() > this.e) {
                i(size);
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:248:0x0453, code lost:            if ((r6 + r9) >= r20) goto L540;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b8, code lost:            if (r18.f.M.g == false) goto L437;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f2, code lost:            if (r8.f != r9.e(r8.d)) goto L437;     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x054f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x046e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.mh o(int r19, long r20) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw.o(int, long):mh");
    }

    public final kvu p() {
        if (this.g == null) {
            this.g = new kvu();
            e();
        }
        return this.g;
    }
}
