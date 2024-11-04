package defpackage;

import android.graphics.PointF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ddo implements dem {
    public static final ddo a = new ddo();
    private static final elo b = elo.J("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    private ddo() {
    }

    @Override // defpackage.dem
    public final /* synthetic */ Object a(dep depVar, float f) {
        depVar.h();
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        int i = 3;
        int i2 = 0;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        float f5 = 0.0f;
        boolean z = true;
        while (depVar.n()) {
            switch (depVar.q(b)) {
                case 0:
                    str = depVar.f();
                    break;
                case 1:
                    str2 = depVar.f();
                    break;
                case 2:
                    f2 = (float) depVar.a();
                    break;
                case 3:
                    int b2 = depVar.b();
                    if (b2 <= 2 && b2 >= 0) {
                        i = a.y()[b2];
                        break;
                    } else {
                        i = 3;
                        break;
                    }
                    break;
                case 4:
                    i2 = depVar.b();
                    break;
                case 5:
                    f3 = (float) depVar.a();
                    break;
                case 6:
                    f4 = (float) depVar.a();
                    break;
                case 7:
                    i3 = ddw.b(depVar);
                    break;
                case 8:
                    i4 = ddw.b(depVar);
                    break;
                case 9:
                    f5 = (float) depVar.a();
                    break;
                case 10:
                    z = depVar.o();
                    break;
                case 11:
                    depVar.g();
                    PointF pointF3 = new PointF(((float) depVar.a()) * f, ((float) depVar.a()) * f);
                    depVar.i();
                    pointF = pointF3;
                    break;
                case 12:
                    depVar.g();
                    PointF pointF4 = new PointF(((float) depVar.a()) * f, ((float) depVar.a()) * f);
                    depVar.i();
                    pointF2 = pointF4;
                    break;
                default:
                    depVar.l();
                    depVar.m();
                    break;
            }
        }
        depVar.j();
        return new dbj(str, str2, f2, i, i2, f3, f4, i3, i4, f5, z, pointF, pointF2);
    }
}
