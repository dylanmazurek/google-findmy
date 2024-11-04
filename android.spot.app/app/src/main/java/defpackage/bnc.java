package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnc {
    static final boolean[] a = new boolean[3];

    public static void a(bmx bmxVar, bmo bmoVar, bmw bmwVar) {
        bmwVar.q = -1;
        bmwVar.r = -1;
        if (bmxVar.ar[0] != 2 && bmwVar.ar[0] == 4) {
            bmv bmvVar = bmwVar.K;
            int i = bmvVar.f;
            int j = bmxVar.j() - bmwVar.M.f;
            bmvVar.h = bmoVar.b(bmvVar);
            bmv bmvVar2 = bmwVar.M;
            bmvVar2.h = bmoVar.b(bmvVar2);
            bmoVar.f(bmwVar.K.h, i);
            bmoVar.f(bmwVar.M.h, j);
            bmwVar.q = 2;
            bmwVar.aa = i;
            int i2 = j - i;
            bmwVar.W = i2;
            int i3 = bmwVar.ad;
            if (i2 < i3) {
                bmwVar.W = i3;
            }
        }
        if (bmxVar.ar[1] != 2 && bmwVar.ar[1] == 4) {
            bmv bmvVar3 = bmwVar.L;
            int i4 = bmvVar3.f;
            int h = bmxVar.h() - bmwVar.N.f;
            bmvVar3.h = bmoVar.b(bmvVar3);
            bmv bmvVar4 = bmwVar.N;
            bmvVar4.h = bmoVar.b(bmvVar4);
            bmoVar.f(bmwVar.L.h, i4);
            bmoVar.f(bmwVar.N.h, h);
            if (bmwVar.ac > 0 || bmwVar.ai == 8) {
                bmv bmvVar5 = bmwVar.O;
                bmvVar5.h = bmoVar.b(bmvVar5);
                bmoVar.f(bmwVar.O.h, bmwVar.ac + i4);
            }
            bmwVar.r = 2;
            bmwVar.ab = i4;
            int i5 = h - i4;
            bmwVar.X = i5;
            int i6 = bmwVar.ae;
            if (i5 < i6) {
                bmwVar.X = i6;
            }
        }
    }

    public static final boolean b(int i, int i2) {
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }
}
