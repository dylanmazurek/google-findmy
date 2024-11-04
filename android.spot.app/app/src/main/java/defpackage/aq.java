package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aq extends op {
    final /* synthetic */ be a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aq(be beVar) {
        super(false);
        this.a = beVar;
    }

    @Override // defpackage.op
    public final void a() {
        if (be.Z(3)) {
            Objects.toString(this.a);
        }
        be beVar = this.a;
        f fVar = beVar.e;
        if (fVar != null) {
            fVar.b = false;
            w wVar = new w(beVar, 2);
            if (fVar.t == null) {
                fVar.t = new ArrayList();
            }
            fVar.t.add(wVar);
            beVar.e.h();
            beVar.ag();
        }
        this.a.e = null;
    }

    @Override // defpackage.op
    public final void b() {
        int i;
        if (be.Z(3)) {
            Objects.toString(this.a);
        }
        be beVar = this.a;
        beVar.al(true);
        if (beVar.e != null) {
            if (!beVar.j.isEmpty()) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(be.ah(beVar.e));
                ArrayList arrayList = beVar.j;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    ba baVar = (ba) arrayList.get(i2);
                    Iterator it = linkedHashSet.iterator();
                    while (true) {
                        i = i2 + 1;
                        if (it.hasNext()) {
                            baVar.c();
                        }
                    }
                    i2 = i;
                }
            }
            ArrayList arrayList2 = beVar.e.d;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ag agVar = ((bm) arrayList2.get(i3)).b;
                if (agVar != null) {
                    agVar.t = false;
                }
            }
            for (cb cbVar : beVar.k(new ArrayList(Collections.singletonList(beVar.e)), 0, 1)) {
                cbVar.g(cbVar.c);
                cbVar.e(cbVar.c);
            }
            ArrayList arrayList3 = beVar.e.d;
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                ag agVar2 = ((bm) arrayList3.get(i4)).b;
                if (agVar2 != null && agVar2.O == null) {
                    beVar.an(agVar2).f();
                }
            }
            beVar.e = null;
            beVar.U();
            if (be.Z(3)) {
                boolean z = beVar.f.b;
                Objects.toString(beVar);
                return;
            }
            return;
        }
        if (beVar.f.b) {
            beVar.ad();
        } else {
            beVar.d.d();
        }
    }

    @Override // defpackage.op
    public final void c(nu nuVar) {
        if (be.Z(2)) {
            Objects.toString(this.a);
        }
        be beVar = this.a;
        f fVar = beVar.e;
        if (fVar != null) {
            ArrayList arrayList = new ArrayList(Collections.singletonList(fVar));
            for (cb cbVar : beVar.k(arrayList, 0, 1)) {
                if (be.Z(2)) {
                    float f = nuVar.a;
                }
                List list = cbVar.c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mkm.an(arrayList2, ((ca) it.next()).g);
                }
                List ag = mkm.ag(mkm.aj(arrayList2));
                int size = ag.size();
                for (int i = 0; i < size; i++) {
                    by byVar = (by) ag.get(i);
                    ViewGroup viewGroup = cbVar.a;
                    byVar.e(nuVar);
                }
            }
            ArrayList arrayList3 = this.a.j;
            int size2 = arrayList3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((ba) arrayList3.get(i2)).d();
            }
        }
    }

    @Override // defpackage.op
    public final void d() {
        if (be.Z(3)) {
            Objects.toString(this.a);
        }
        this.a.F();
        be beVar = this.a;
        beVar.G(new bd(beVar), false);
    }
}
