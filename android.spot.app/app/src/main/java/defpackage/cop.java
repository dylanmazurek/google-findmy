package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cop extends lj {
    public final cex a;
    public final be e;
    public final sl f;
    public final sl g;
    public boolean h;
    public boolean i;
    public boolean j;
    final bet k;
    private final sl l;
    private coo m;

    public cop(ag agVar) {
        be G = agVar.G();
        cex cexVar = agVar.ad;
        this.f = new sl();
        this.g = new sl();
        this.l = new sl();
        this.k = new bet((byte[]) null, (byte[]) null, (byte[]) null);
        this.h = false;
        this.i = false;
        this.e = G;
        this.a = cexVar;
        if (!this.b.e()) {
            this.c = true;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    private final void A(ag agVar, FrameLayout frameLayout) {
        ax axVar = new ax(agVar, frameLayout);
        ((CopyOnWriteArrayList) this.e.x.a).add(new bet(axVar));
    }

    public static long b(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    public static String c(String str, long j) {
        return str + j;
    }

    public static boolean u(String str, String str2) {
        if (str.startsWith(str2) && str.length() > str2.length()) {
            return true;
        }
        return false;
    }

    public static final void w(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() <= 1) {
            if (view.getParent() == frameLayout) {
                return;
            }
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    private final Long y(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.l.b(); i2++) {
            if (((Integer) this.l.g(i2)).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.l.c(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List, java.lang.Object] */
    private final void z(long j) {
        af afVar;
        ViewParent parent;
        ag agVar = (ag) this.f.e(j);
        if (agVar == null) {
            return;
        }
        View view = agVar.P;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!t(j)) {
            this.g.k(j);
        }
        if (!agVar.au()) {
            this.f.k(j);
            return;
        }
        if (v()) {
            this.i = true;
            return;
        }
        if (agVar.au() && t(j)) {
            bet betVar = this.k;
            ArrayList arrayList = new ArrayList();
            Iterator it = betVar.a.iterator();
            if (!it.hasNext()) {
                be beVar = this.e;
                fil k = beVar.a.k(agVar.l);
                if (k == null || !((ag) k.c).equals(agVar)) {
                    beVar.T(new IllegalStateException(a.af(agVar, "Fragment ", " is not currently in the FragmentManager")));
                }
                if (((ag) k.c).g >= 0) {
                    afVar = new af(k.b());
                } else {
                    afVar = null;
                }
                bet.u(arrayList);
                this.g.j(j, afVar);
            } else {
                throw null;
            }
        }
        bet betVar2 = this.k;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = betVar2.a.iterator();
        if (!it2.hasNext()) {
            try {
                f fVar = new f(this.e);
                fVar.k(agVar);
                fVar.b();
                this.f.k(j);
                return;
            } finally {
                bet.u(arrayList2);
            }
        }
        throw null;
    }

    @Override // defpackage.lj
    public final int a() {
        if (this.j) {
            return 2;
        }
        return 1;
    }

    @Override // defpackage.lj
    public final long e(int i) {
        return i;
    }

    @Override // defpackage.lj
    public final /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new mh(frameLayout);
    }

    @Override // defpackage.lj
    public final void j(RecyclerView recyclerView) {
        boolean z;
        if (this.m == null) {
            z = true;
        } else {
            z = false;
        }
        bqd.l(z);
        coo cooVar = new coo(this);
        this.m = cooVar;
        cooVar.b = coo.b(recyclerView);
        cooVar.d = new con(cooVar);
        cooVar.b.j(cooVar.d);
        cooVar.e = new com(cooVar);
        cooVar.c.q(cooVar.e);
        cooVar.a = new nx(cooVar, 2);
        cooVar.c.a.a(cooVar.a);
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void k(mh mhVar, int i) {
        Bundle bundle;
        long j = mhVar.f;
        int id = mhVar.C().getId();
        Long y = y(id);
        if (y != null && y.longValue() != j) {
            z(y.longValue());
            this.l.k(y.longValue());
        }
        this.l.j(j, Integer.valueOf(id));
        long j2 = i;
        if (!this.f.l(j2)) {
            dzl dzlVar = new dzl();
            Bundle bundle2 = new Bundle();
            boolean z = true;
            if (i != 1) {
                z = false;
            }
            bundle2.putBoolean("DISPLAY_ONLY_SUPERVISED_ACCOUNTS_ARG", z);
            dzlVar.ak(bundle2);
            af afVar = (af) this.g.e(j2);
            if (dzlVar.A == null) {
                Bundle bundle3 = null;
                if (afVar != null && (bundle = afVar.a) != null) {
                    bundle3 = bundle;
                }
                dzlVar.h = bundle3;
                this.f.j(j2, dzlVar);
            } else {
                throw new IllegalStateException("Fragment already added");
            }
        }
        if (mhVar.C().isAttachedToWindow()) {
            x(mhVar);
        }
        s();
    }

    @Override // defpackage.lj
    public final void l(RecyclerView recyclerView) {
        coo cooVar = this.m;
        ViewPager2 b = coo.b(recyclerView);
        b.a.a.remove(cooVar.d);
        cooVar.c.r(cooVar.e);
        cooVar.c.a.c(cooVar.a);
        cooVar.b = null;
        this.m = null;
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void m(mh mhVar) {
        x(mhVar);
        s();
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void n(mh mhVar) {
        Long y = y(mhVar.C().getId());
        if (y != null) {
            z(y.longValue());
            this.l.k(y.longValue());
        }
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ boolean p() {
        return true;
    }

    public final void s() {
        ag agVar;
        View view;
        if (this.i && !v()) {
            rz rzVar = new rz();
            for (int i = 0; i < this.f.b(); i++) {
                long c = this.f.c(i);
                if (!t(c)) {
                    rzVar.add(Long.valueOf(c));
                    this.l.k(c);
                }
            }
            if (!this.h) {
                this.i = false;
                for (int i2 = 0; i2 < this.f.b(); i2++) {
                    sl slVar = this.f;
                    sl slVar2 = this.l;
                    long c2 = slVar.c(i2);
                    if (!slVar2.l(c2) && ((agVar = (ag) this.f.e(c2)) == null || (view = agVar.P) == null || view.getParent() == null)) {
                        rzVar.add(Long.valueOf(c2));
                    }
                }
            }
            ry ryVar = new ry(rzVar);
            while (ryVar.hasNext()) {
                z(((Long) ryVar.next()).longValue());
            }
        }
    }

    public final boolean t(long j) {
        if (j >= 0 && j < a()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        return this.e.ac();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.List, java.lang.Object] */
    public final void x(mh mhVar) {
        ag agVar = (ag) this.f.e(mhVar.f);
        if (agVar != null) {
            FrameLayout C = mhVar.C();
            View view = agVar.P;
            if (!agVar.au() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            }
            if (agVar.au() && view == null) {
                A(agVar, C);
                return;
            }
            if (agVar.au() && view.getParent() != null) {
                if (view.getParent() != C) {
                    w(view, C);
                    return;
                }
                return;
            }
            if (agVar.au()) {
                w(view, C);
                return;
            }
            if (!v()) {
                A(agVar, C);
                bet betVar = this.k;
                ArrayList arrayList = new ArrayList();
                Iterator it = betVar.a.iterator();
                if (!it.hasNext()) {
                    try {
                        agVar.am(false);
                        f fVar = new f(this.e);
                        fVar.q(agVar, "f" + mhVar.f);
                        fVar.l(agVar, cew.STARTED);
                        fVar.b();
                        this.m.a(false);
                        return;
                    } finally {
                        bet.u(arrayList);
                    }
                }
                throw null;
            }
            if (!this.e.v) {
                this.a.a(new cok(this, mhVar, 0));
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }
}
