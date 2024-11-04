package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.adm.R;
import j$.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dym implements ewk {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public dym(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v104, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v105, types: [mnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v106, types: [mnw, java.lang.Object] */
    @Override // defpackage.ewk
    public final void cx() {
        ebf ebfVar;
        boolean z;
        efp a;
        ViewGroup viewGroup = null;
        dzu dzuVar = null;
        switch (this.b) {
            case 0:
                if (((dyo) this.a).g.a() != null && ((dyo) this.a).h()) {
                    ((dyo) this.a).f();
                    return;
                }
                return;
            case 1:
                ((dxf) this.a).e();
                return;
            case 2:
                ewf ewfVar = ((dyo) this.a).g;
                Object obj = this.a;
                lqc a2 = ewfVar.a();
                if (a2 == null) {
                    ((ebf) ((dyo) obj).d.a()).s();
                    return;
                }
                ebf ebfVar2 = (ebf) ((dyo) obj).d.a();
                lqd lqdVar = a2.d;
                if (lqdVar == null) {
                    lqdVar = lqd.d;
                }
                ehu h = ebfVar2.b.h(lqdVar);
                ag a3 = h.a(lqdVar);
                if ((ebfVar2.a().e(R.id.main_fragment) instanceof dzo) && (a3 instanceof dzb)) {
                    cs csVar = ebfVar2.a;
                    dzb dzbVar = (dzb) a3;
                    View findViewById = csVar.findViewById(R.id.main_fragment);
                    if (findViewById instanceof ViewGroup) {
                        viewGroup = (ViewGroup) findViewById;
                    }
                    if (viewGroup == null) {
                        ebfVar = ebfVar2;
                    } else {
                        cmk cmkVar = new cmk();
                        eae eaeVar = new eae("transition_name:device_picker_selected_item", "transition_name:common_device_panel_device", dzbVar, false);
                        eaeVar.A("transition_name:device_picker_item_icon");
                        eaeVar.b = 100L;
                        ebfVar = ebfVar2;
                        eaeVar.c = 500L;
                        cmkVar.e(eaeVar);
                        eae eaeVar2 = new eae("transition_name:device_picker_item_icon", "transition_name:common_device_panel_niv_device_icon", dzbVar, true);
                        eaeVar2.b = 100L;
                        eaeVar2.c = 500L;
                        cmkVar.e(eaeVar2);
                        dzy dzyVar = new dzy();
                        dzyVar.b = 100L;
                        dzyVar.c = 300L;
                        cmkVar.e(dzyVar);
                        clu cluVar = new clu();
                        cluVar.z("transitionName:device_picker_fragment_layout");
                        cluVar.A("transition_name:device_picker_selected_item");
                        cluVar.c = 100L;
                        cmkVar.e(cluVar);
                        cmkVar.e(new dzd(dzbVar));
                        dzv dzvVar = new dzv(viewGroup, csVar);
                        csVar.c().a(dzvVar);
                        fma.bR(cmkVar, new bco(dzvVar, 17));
                        cmh.b(viewGroup, cmkVar);
                    }
                    z = true;
                } else {
                    ebfVar = ebfVar2;
                    z = false;
                }
                ebb a4 = ebc.a();
                a4.a = "DEVICE_UI_FRAGMENT_TAG";
                a4.b = "DEVICE_UI_BACK_STACK_STATE";
                a4.c(false);
                a4.b(!z);
                ebf ebfVar3 = ebfVar;
                ebfVar3.k(a3, a4.a());
                Collection.EL.forEach(h.c(lqdVar), new ebd(ebfVar3, 0));
                ebfVar3.a().ag();
                return;
            case 3:
                if (((dyr) this.a).b.a() == null) {
                    Object obj2 = this.a;
                    if (((dxu) obj2).a) {
                        ((dyr) obj2).d();
                        ((dyr) this.a).h();
                        return;
                    }
                }
                Object obj3 = this.a;
                if (((dxu) obj3).a) {
                    dyr dyrVar = (dyr) obj3;
                    if (dyrVar.i()) {
                        dyrVar.e();
                        return;
                    }
                    return;
                }
                return;
            case 4:
                ((dzx) this.a).e();
                ewg ewgVar = ((dzx) this.a).a;
                jis c = ewgVar.c();
                if (!ewgVar.y() && !((dzx) this.a).a.z()) {
                    if (((dzx) this.a).a.x()) {
                        cfn cfnVar = ((dzx) this.a).c;
                        dzr a5 = dzu.a();
                        a5.c(true);
                        cfnVar.i(a5.a());
                        return;
                    }
                    if (c != null && !c.isEmpty()) {
                        dzx dzxVar = (dzx) this.a;
                        dzxVar.c.i(dzxVar.d(c));
                        ((dzx) this.a).g();
                        return;
                    } else {
                        dzx dzxVar2 = (dzx) this.a;
                        cfn cfnVar2 = dzxVar2.c;
                        dzr a6 = dzu.a();
                        a6.f(dzxVar2.b());
                        cfnVar2.i(a6.a());
                        return;
                    }
                }
                cfn cfnVar3 = ((dzx) this.a).c;
                if (cfnVar3 != null) {
                    dzuVar = (dzu) cfnVar3.d();
                }
                if (dzuVar != null && !dzuVar.a) {
                    ((dzx) this.a).c.i(dzuVar.b());
                    return;
                }
                cfn cfnVar4 = ((dzx) this.a).c;
                dzr a7 = dzu.a();
                a7.d(true);
                cfnVar4.i(a7.a());
                return;
            case 5:
                ilv.A((ilv) this.a);
                return;
            case 6:
                ilv.A((ilv) this.a);
                return;
            case 7:
                ((cfk) this.a).i(mlh.a);
                return;
            case 8:
                ((cfk) this.a).i(mlh.a);
                return;
            case 9:
                ((efa) this.a).f();
                return;
            case 10:
                Object obj4 = this.a;
                ((efq) obj4).b.execute(new dzw(obj4, 4));
                return;
            case 11:
                efu efuVar = (efu) this.a;
                cfn cfnVar5 = efuVar.d;
                if (cfnVar5 != null) {
                    cfnVar5.l(efuVar.c());
                    return;
                }
                return;
            case 12:
                efy efyVar = (efy) this.a;
                lqc a8 = efyVar.d.a();
                boolean q = eyf.q(a8);
                if (q && a8 != null) {
                    jer b = efyVar.b();
                    if (!b.g()) {
                        a = null;
                    } else {
                        lqd lqdVar2 = ((lqc) b.c()).d;
                        if (lqdVar2 == null) {
                            lqdVar2 = lqd.d;
                        }
                        a = efyVar.a(lqdVar2);
                    }
                    if (a == null) {
                        efn efnVar = new efn((byte[]) null);
                        efnVar.e(false);
                        efnVar.g(false);
                        efnVar.h(false);
                        efnVar.j = 1;
                        efnVar.i = 1;
                        efnVar.i(false);
                        efp c2 = efnVar.c();
                        lqd lqdVar3 = a8.d;
                        if (lqdVar3 == null) {
                            lqdVar3 = lqd.d;
                        }
                        efyVar.j(lqdVar3, c2, 1);
                    }
                }
                Iterator it = efyVar.b.iterator();
                while (it.hasNext()) {
                    ((buc) it.next()).a(Boolean.valueOf(q));
                }
                return;
            case 13:
                ((ejg) this.a).f();
                return;
            case 14:
                apc apcVar = (apc) this.a;
                ((cfk) apcVar.b).i(apcVar.o());
                return;
            case 15:
                ((cfk) this.a).i(mlh.a);
                return;
            case 16:
                ((cfk) this.a).i(mlh.a);
                return;
            case 17:
                ekp ekpVar = (ekp) this.a;
                if (ekpVar.d.b() != null) {
                    esa esaVar = ekpVar.f;
                    ivc.N(esaVar.b(esaVar.f.C()), new dup(esaVar, 7), esaVar.b);
                    return;
                }
                return;
            case 18:
                ?? r1 = this.a;
                r1.getClass();
                r1.a();
                return;
            case 19:
                ?? r12 = this.a;
                r12.getClass();
                r12.a();
                return;
            default:
                ?? r13 = this.a;
                r13.getClass();
                r13.a();
                return;
        }
    }

    public /* synthetic */ dym(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
