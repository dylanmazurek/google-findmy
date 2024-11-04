package defpackage;

import android.app.Notification;
import android.graphics.Matrix;
import androidx.compose.foundation.layout.SizeElement;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bpp {
    public static Notification.Style a() {
        return new Notification.DecoratedCustomViewStyle();
    }

    public static final gga c(adt adtVar) {
        return (gga) adtVar.a();
    }

    public static final void d(cyb cybVar, mnw mnwVar, aox aoxVar, gga ggaVar, abi abiVar, int i, int i2) {
        mnwVar.getClass();
        abi b = abiVar.b(1413992462);
        int i3 = aon.a;
        aon aonVar = aom.e;
        int i4 = avo.a;
        avo avoVar = avn.b;
        b.u(1444728492);
        abp abpVar = (abp) b;
        Object P = abpVar.P();
        if (P == abh.a) {
            P = new cym();
            abpVar.Z(P);
        }
        cym cymVar = (cym) P;
        abpVar.U();
        b.u(1444729988);
        Object P2 = abpVar.P();
        if (P2 == abh.a) {
            P2 = new Matrix();
            abpVar.Z(P2);
        }
        Matrix matrix = (Matrix) P2;
        abpVar.U();
        b.u(1444732560);
        Object P3 = abpVar.P();
        if (P3 == abh.a) {
            aee aeeVar = new aee(null, agw.a);
            abpVar.Z(aeeVar);
            P3 = aeeVar;
        }
        adt adtVar = (adt) P3;
        abpVar.U();
        b.u(1444733850);
        if (cybVar != null && cybVar.a() != 0.0f) {
            abpVar.U();
            float a = dfb.a();
            float width = cybVar.h.width() / a;
            float height = cybVar.h.height() / a;
            rh.c(aoxVar.a(new SizeElement(width, height, width, height)), new dau(cybVar, avoVar, aonVar, matrix, cymVar, ggaVar, mnwVar, adtVar), b, 0);
            afv d = b.d();
            if (d != null) {
                ((aeu) d).d = new dav(cybVar, mnwVar, aoxVar, ggaVar, i, i2, 0);
                return;
            }
            return;
        }
        xt.a(aoxVar, b, (i >> 6) & 14);
        abpVar.U();
        afv d2 = b.d();
        if (d2 != null) {
            ((aeu) d2).d = new dav(cybVar, mnwVar, aoxVar, ggaVar, i, i2, 1);
        }
    }

    public static final gga e(bso[] bsoVarArr, abi abiVar) {
        bsoVarArr.getClass();
        abiVar.u(-395574495);
        int hashCode = Arrays.hashCode(bsoVarArr);
        abiVar.u(1068508243);
        boolean z = abiVar.z(hashCode);
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (z || P == abh.a) {
            P = new gga(mkm.m(bsoVarArr));
            abpVar.Z(P);
        }
        gga ggaVar = (gga) P;
        abpVar.U();
        abpVar.U();
        return ggaVar;
    }

    public static final bso f(Object obj, Object obj2, String[] strArr, abi abiVar) {
        abiVar.u(-1788530187);
        abiVar.u(-1522843975);
        boolean B = abiVar.B(strArr);
        abp abpVar = (abp) abiVar;
        Object P = abpVar.P();
        if (B || P == abh.a) {
            P = new dbm((String[]) Arrays.copyOf(strArr, 1));
            abpVar.Z(P);
        }
        dbm dbmVar = (dbm) P;
        abpVar.U();
        abiVar.u(-1522842278);
        boolean B2 = abiVar.B(dbmVar) | abiVar.B(obj) | abiVar.B(obj2);
        Object P2 = abpVar.P();
        if (B2 || P2 == abh.a) {
            P2 = new bso(obj, dbmVar, obj2);
            abpVar.Z(P2);
        }
        bso bsoVar = (bso) P2;
        abpVar.U();
        abpVar.U();
        return bsoVar;
    }
}
