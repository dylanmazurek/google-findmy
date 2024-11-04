package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcy extends lj {
    public jis a;
    private final Context f;
    private final haw g;
    private final cfk h;
    private final hgw i;
    private final hjp j;
    private final hdq k;
    private final cfo l;
    private final int m;
    private cfc n;
    private jis o;
    public final imr e = new imr(Integer.class, new fg(this));
    private final frx p = new hcw(this);

    public hcy(Context context, haw hawVar, cfk cfkVar, hgw hgwVar, hjp hjpVar, int i) {
        this.f = context;
        this.k = new hdq(hfe.e(context), hbk.b(context) + i);
        this.g = hawVar;
        this.h = cfkVar;
        int i2 = jis.d;
        jis jisVar = jmi.a;
        this.a = jisVar;
        this.i = hgwVar;
        this.j = hjpVar;
        this.o = jisVar;
        this.m = i;
        this.l = new eqn(this, hawVar, 14);
    }

    private final void s(jis jisVar) {
        for (int i = 0; i < ((jmi) jisVar).c; i++) {
            ((hcu) jisVar.get(i)).c(this.n);
        }
    }

    @Override // defpackage.lj
    public final int a() {
        return this.e.a;
    }

    public final jer b(int i) {
        hcu hcuVar = (hcu) this.o.get(i);
        if (hcuVar instanceof hdj) {
            return ((hdj) hcuVar).w;
        }
        return jdl.a;
    }

    public final void c(Object obj) {
        jin jinVar = new jin();
        jis jisVar = this.a;
        int size = jisVar.size();
        for (int i = 0; i < size; i++) {
            hcu a = ((hcr) jisVar.get(i)).a.a(obj);
            if (a != null) {
                a.g = this.i;
                a.g();
                jinVar.h(a);
            }
        }
        jis g = jinVar.g();
        s(this.o);
        this.e.f();
        this.o = g;
        for (int i2 = 0; i2 < ((jmi) g).c; i2++) {
            ((hcu) g.get(i2)).b(this.n, new hcx(this, i2));
        }
        g();
    }

    @Override // defpackage.lj
    public final int d(int i) {
        int i2;
        hcu hcuVar = (hcu) this.o.get(((Integer) this.e.e(i)).intValue());
        if (hcuVar instanceof hcs) {
            i2 = 4;
        } else if (!(hcuVar instanceof hde) && !(hcuVar instanceof hdb)) {
            if (hcuVar instanceof hcp) {
                i2 = 3;
            } else if (hcuVar instanceof hdj) {
                i2 = 1;
            } else {
                throw new IllegalArgumentException("Unsupported card type");
            }
        } else {
            i2 = 2;
        }
        return i2 - 1;
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ mh f(ViewGroup viewGroup, int i) {
        hcv hdnVar;
        int i2 = new int[]{1, 2, 3, 4}[i];
        int i3 = i2 - 1;
        if (i2 != 0) {
            hjp hjpVar = this.j;
            Context context = this.f;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            hdnVar = new hct(viewGroup, context, hjpVar);
                        } else {
                            throw new IllegalArgumentException("Unsupported card type");
                        }
                    }
                } else {
                    hdnVar = new hdc(viewGroup, context, hjpVar);
                }
                int i4 = this.m;
                int[] iArr = bwn.a;
                DynamicCardRootView dynamicCardRootView = hdnVar.t;
                int paddingStart = dynamicCardRootView.getPaddingStart() + i4;
                DynamicCardRootView dynamicCardRootView2 = hdnVar.t;
                dynamicCardRootView.setPaddingRelative(paddingStart, dynamicCardRootView2.getPaddingTop(), dynamicCardRootView2.getPaddingEnd() + i4, hdnVar.t.getPaddingBottom());
                return hdnVar;
            }
            hdnVar = new hdn(viewGroup, context, hjpVar);
            int i42 = this.m;
            int[] iArr2 = bwn.a;
            DynamicCardRootView dynamicCardRootView3 = hdnVar.t;
            int paddingStart2 = dynamicCardRootView3.getPaddingStart() + i42;
            DynamicCardRootView dynamicCardRootView22 = hdnVar.t;
            dynamicCardRootView3.setPaddingRelative(paddingStart2, dynamicCardRootView22.getPaddingTop(), dynamicCardRootView22.getPaddingEnd() + i42, hdnVar.t.getPaddingBottom());
            return hdnVar;
        }
        throw null;
    }

    @Override // defpackage.lj
    public final void j(RecyclerView recyclerView) {
        recyclerView.ap(this.k);
        this.n = be.d(recyclerView);
        this.g.d(this.p);
        this.p.a(this.g.a());
        this.h.g(this.n, this.l);
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void k(mh mhVar, int i) {
        hcv hcvVar = (hcv) mhVar;
        hcvVar.H(this.n, (hcu) this.o.get(((Integer) this.e.e(i)).intValue()));
        Integer num = (Integer) hcvVar.b.getTag(R.id.og_card_highlight_id_tag);
        if (num != null) {
            num.intValue();
        }
    }

    @Override // defpackage.lj
    public final void l(RecyclerView recyclerView) {
        this.g.e(this.p);
        recyclerView.ar(this.k);
        this.h.j(this.l);
        s(this.o);
        this.e.f();
    }

    @Override // defpackage.lj
    public final /* bridge */ /* synthetic */ void n(mh mhVar) {
        ((hcv) mhVar).F(this.n);
    }
}
