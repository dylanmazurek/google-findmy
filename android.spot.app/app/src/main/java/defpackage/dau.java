package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dau extends mpe implements moh {
    final /* synthetic */ cyb a;
    final /* synthetic */ avo b;
    final /* synthetic */ aon c;
    final /* synthetic */ Matrix d;
    final /* synthetic */ cym e;
    final /* synthetic */ mnw f;
    final /* synthetic */ adt g;
    final /* synthetic */ gga h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dau(cyb cybVar, avo avoVar, aon aonVar, Matrix matrix, cym cymVar, gga ggaVar, mnw mnwVar, adt adtVar) {
        super(1);
        this.a = cybVar;
        this.b = avoVar;
        this.c = aonVar;
        this.d = matrix;
        this.e = cymVar;
        this.h = ggaVar;
        this.f = mnwVar;
        this.g = adtVar;
    }

    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v11, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v14, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v17, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v20, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v23, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v26, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v29, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v32, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v35, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v36, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v38, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v40, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v42, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v44, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v46, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v48, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v50, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        asn asnVar = (asn) obj;
        asnVar.getClass();
        aqv b = asnVar.n().b();
        cyb cybVar = this.a;
        long k = a.k(cybVar.h.width(), cybVar.h.height());
        long m = bef.m(mpu.j(aqn.b(asnVar.l())), mpu.j(aqn.a(asnVar.l())));
        long a = this.b.a(k, asnVar.l());
        long a2 = this.c.a(bef.m((int) (aqn.b(k) * aww.a(a)), (int) (aqn.a(k) * aww.b(a))), m, asnVar.m());
        Matrix matrix = this.d;
        matrix.reset();
        matrix.preTranslate(blk.a(a2), blk.b(a2));
        matrix.preScale(aww.a(a), aww.b(a));
        cym cymVar = this.e;
        cymVar.h(false);
        cymVar.s(1);
        cymVar.r(cybVar);
        adt adtVar = this.g;
        gga ggaVar = this.h;
        if (ggaVar != bpp.c(adtVar)) {
            gga c = bpp.c(adtVar);
            if (c != null) {
                cymVar.getClass();
                for (bso bsoVar : c.a) {
                    cymVar.f((dbm) bsoVar.b, bsoVar.c, null);
                }
                for (bso bsoVar2 : c.d) {
                    cymVar.f((dbm) bsoVar2.b, bsoVar2.c, null);
                }
                for (bso bsoVar3 : c.i) {
                    cymVar.f((dbm) bsoVar3.b, bsoVar3.c, null);
                }
                for (bso bsoVar4 : c.e) {
                    cymVar.f((dbm) bsoVar4.b, bsoVar4.c, null);
                }
                for (bso bsoVar5 : c.c) {
                    cymVar.f((dbm) bsoVar5.b, bsoVar5.c, null);
                }
                for (bso bsoVar6 : c.b) {
                    cymVar.f((dbm) bsoVar6.b, bsoVar6.c, null);
                }
                for (bso bsoVar7 : c.h) {
                    cymVar.f((dbm) bsoVar7.b, bsoVar7.c, null);
                }
                for (bso bsoVar8 : c.g) {
                    cymVar.f((dbm) bsoVar8.b, bsoVar8.c, null);
                }
                for (bso bsoVar9 : c.f) {
                    cymVar.f((dbm) bsoVar9.b, bsoVar9.c, null);
                }
            }
            if (ggaVar != null) {
                cymVar.getClass();
                for (bso bsoVar10 : ggaVar.a) {
                    cymVar.f((dbm) bsoVar10.b, bsoVar10.c, new dbb(bsoVar10.a));
                }
                for (bso bsoVar11 : ggaVar.d) {
                    cymVar.f((dbm) bsoVar11.b, bsoVar11.c, new dbb(bsoVar11.a));
                }
                for (bso bsoVar12 : ggaVar.i) {
                    cymVar.f((dbm) bsoVar12.b, bsoVar12.c, new dbb(bsoVar12.a));
                }
                for (bso bsoVar13 : ggaVar.e) {
                    cymVar.f((dbm) bsoVar13.b, bsoVar13.c, new dbb(bsoVar13.a));
                }
                for (bso bsoVar14 : ggaVar.c) {
                    cymVar.f((dbm) bsoVar14.b, bsoVar14.c, new dbb(bsoVar14.a));
                }
                for (bso bsoVar15 : ggaVar.b) {
                    cymVar.f((dbm) bsoVar15.b, bsoVar15.c, new dbb(bsoVar15.a));
                }
                for (bso bsoVar16 : ggaVar.h) {
                    cymVar.f((dbm) bsoVar16.b, bsoVar16.c, new dbb(bsoVar16.a));
                }
                for (bso bsoVar17 : ggaVar.g) {
                    cymVar.f((dbm) bsoVar17.b, bsoVar17.c, new dbb(bsoVar17.a));
                }
                for (bso bsoVar18 : ggaVar.f) {
                    cymVar.f((dbm) bsoVar18.b, bsoVar18.c, new dbb(bsoVar18.a));
                }
            }
            adtVar.h(ggaVar);
        }
        mnw mnwVar = this.f;
        cymVar.m(true);
        cymVar.o(((Number) mnwVar.a()).floatValue());
        cymVar.setBounds(0, 0, cybVar.h.width(), cybVar.h.height());
        Canvas a3 = aqp.a(b);
        dcv dcvVar = cymVar.i;
        cyb cybVar2 = cymVar.a;
        if (dcvVar != null && cybVar2 != null) {
            if (cymVar.k) {
                a3.save();
                a3.concat(matrix);
                cymVar.k(a3, dcvVar);
                a3.restore();
            } else {
                dcvVar.b(a3, matrix, cymVar.j);
            }
            cymVar.l = false;
        }
        return mlh.a;
    }
}
