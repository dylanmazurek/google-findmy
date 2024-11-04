package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.apps.adm.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class xx extends mpe implements mol {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(Object obj, Object obj2, int i) {
        super(2);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [awh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, mol] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.lang.Object, mom] */
    @Override // defpackage.mol
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        Set set;
        View view;
        Object obj3;
        switch (this.c) {
            case 0:
                axc axcVar = (axc) obj;
                long j = ((bld) obj2).a;
                return this.a.a(axcVar, axcVar.p(mlh.a, new alf(-1945019079, true, new xx(this.b, new xy(axcVar, j), 1, null))), j);
            case 1:
                abi abiVar = (abi) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && abiVar.G()) {
                    abiVar.r();
                } else {
                    this.b.a(this.a, abiVar, 0);
                }
                return mlh.a;
            case 2:
                abi abiVar2 = (abi) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && abiVar2.G()) {
                    abiVar2.r();
                } else {
                    aah.a(((aaj) this.a).a, this.b, abiVar2, 0);
                }
                return mlh.a;
            case 3:
                abi abiVar3 = (abi) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && abiVar3.G()) {
                    abiVar3.r();
                } else {
                    Object obj4 = this.a;
                    ?? r0 = this.b;
                    boolean a = ((avv) obj4).a();
                    abiVar3.I(Boolean.valueOf(a));
                    boolean C = abiVar3.C(a);
                    abiVar3.u(-869707859);
                    if (a) {
                        r0.a(abiVar3, 0);
                    } else {
                        abiVar3.l(C);
                    }
                    abiVar3.o();
                    abiVar3.q();
                }
                return mlh.a;
            case 4:
                abi abiVar4 = (abi) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && abiVar4.G()) {
                    abiVar4.r();
                } else {
                    AndroidCompositionLocals_androidKt.a(((beb) this.a).a, this.b, abiVar4, 0);
                }
                return mlh.a;
            case 5:
                abi abiVar5 = (abi) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && abiVar5.G()) {
                    abiVar5.r();
                } else {
                    Object tag = ((beb) this.a).a.getTag(R.id.inspection_slot_table_set);
                    if (mpp.f(tag)) {
                        set = (Set) tag;
                    } else {
                        set = null;
                    }
                    if (set == null) {
                        Object parent = ((beb) this.a).a.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            obj3 = view.getTag(R.id.inspection_slot_table_set);
                        } else {
                            obj3 = null;
                        }
                        if (mpp.f(obj3)) {
                            set = (Set) obj3;
                        } else {
                            set = null;
                        }
                    }
                    if (set != null) {
                        set.add(abiVar5.e());
                        abiVar5.j();
                    }
                    Object obj5 = this.a;
                    boolean D = abiVar5.D(obj5);
                    Object obj6 = this.a;
                    Object g = abiVar5.g();
                    if (D || g == abh.a) {
                        g = new bea((beb) obj6, (mmx) null, 0);
                        abiVar5.w(g);
                    }
                    act.e(((beb) obj5).a, (mol) g, abiVar5);
                    Object obj7 = this.a;
                    boolean D2 = abiVar5.D(obj7);
                    Object obj8 = this.a;
                    Object g2 = abiVar5.g();
                    if (D2 || g2 == abh.a) {
                        g2 = new bea((beb) obj8, (mmx) null, 2, (byte[]) null);
                        abiVar5.w(g2);
                    }
                    act.e(((beb) obj7).a, (mol) g2, abiVar5);
                    acb.a(aol.a.b(set), alg.e(-1193460702, new xx(this.a, this.b, 4), abiVar5), abiVar5, 56);
                }
                return mlh.a;
            case 6:
                abi abiVar6 = (abi) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && abiVar6.G()) {
                    abiVar6.r();
                } else {
                    cfk cfkVar = (cfk) this.a;
                    Object d = cfkVar.d();
                    d.getClass();
                    agt a2 = alw.a(cfkVar, d, abiVar6);
                    aou aouVar = aox.d;
                    bsn.j(yh.a(yh.b(), 1.0f), a2, new eru(Integer.valueOf(R.raw.outer_star_with_dial), Integer.valueOf(R.raw.compass_res), Integer.valueOf(R.raw.compass_celebration), Integer.valueOf(R.raw.dial), this.b), abiVar6, 518);
                }
                return mlh.a;
            case 7:
                abi abiVar7 = (abi) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && abiVar7.G()) {
                    abiVar7.r();
                } else {
                    fma.bS(alg.e(-69119297, new xx(this.a, this.b, 6), abiVar7), abiVar7, 6);
                }
                return mlh.a;
            case 8:
                abi abiVar8 = (abi) obj;
                if ((((Number) obj2).intValue() & 11) == 2 && abiVar8.G()) {
                    abiVar8.r();
                } else {
                    acb.b(new aeq[]{zu.a.b(gen.a), zq.a.b(this.a), zx.b.b(false)}, this.b, abiVar8, 8);
                }
                return mlh.a;
            default:
                mmz mmzVar = (mmz) obj2;
                ((mlh) obj).getClass();
                mmzVar.getClass();
                mpl mplVar = (mpl) this.a;
                int i = mplVar.a;
                mplVar.a = i + 1;
                ((mnb[]) this.b)[i] = mmzVar;
                return mlh.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xx(Object obj, Object obj2, int i, byte[] bArr) {
        super(2);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
