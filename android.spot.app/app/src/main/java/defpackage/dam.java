package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dam {
    public czw a;
    public czw b;
    public czw c;
    public czw d;
    public czw e;
    public daa f;
    public daa g;
    public czw h;
    public czw i;
    private final Matrix j = new Matrix();
    private final Matrix k;
    private final Matrix l;
    private final Matrix m;
    private final float[] n;

    public dam(dcb dcbVar) {
        czw a;
        czw a2;
        czw a3;
        czw a4;
        czw a5;
        czw a6;
        dbv dbvVar = dcbVar.a;
        if (dbvVar == null) {
            a = null;
        } else {
            a = dbvVar.a();
        }
        this.a = a;
        dcc dccVar = dcbVar.b;
        if (dccVar == null) {
            a2 = null;
        } else {
            a2 = dccVar.a();
        }
        this.b = a2;
        dbx dbxVar = dcbVar.c;
        if (dbxVar == null) {
            a3 = null;
        } else {
            a3 = dbxVar.a();
        }
        this.c = a3;
        dbs dbsVar = dcbVar.d;
        if (dbsVar == null) {
            a4 = null;
        } else {
            a4 = dbsVar.a();
        }
        this.d = a4;
        dbs dbsVar2 = dcbVar.f;
        if (dbsVar2 == null) {
            a5 = null;
        } else {
            a5 = dbsVar2.a();
        }
        daa daaVar = (daa) a5;
        this.f = daaVar;
        if (daaVar != null) {
            this.k = new Matrix();
            this.l = new Matrix();
            this.m = new Matrix();
            this.n = new float[9];
        } else {
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
        }
        dbs dbsVar3 = dcbVar.g;
        if (dbsVar3 == null) {
            a6 = null;
        } else {
            a6 = dbsVar3.a();
        }
        this.g = (daa) a6;
        dbu dbuVar = dcbVar.e;
        if (dbuVar != null) {
            this.e = dbuVar.a();
        }
        dbs dbsVar4 = dcbVar.h;
        if (dbsVar4 != null) {
            this.h = dbsVar4.a();
        } else {
            this.h = null;
        }
        dbs dbsVar5 = dcbVar.i;
        if (dbsVar5 != null) {
            this.i = dbsVar5.a();
        } else {
            this.i = null;
        }
    }

    private final void f() {
        for (int i = 0; i < 9; i++) {
            this.n[i] = 0.0f;
        }
    }

    public final Matrix a() {
        PointF pointF;
        float cos;
        float sin;
        float l;
        PointF pointF2;
        this.j.reset();
        czw czwVar = this.b;
        if (czwVar != null && (pointF2 = (PointF) czwVar.e()) != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            this.j.preTranslate(pointF2.x, pointF2.y);
        }
        czw czwVar2 = this.d;
        if (czwVar2 != null) {
            if (czwVar2 instanceof dan) {
                l = ((Float) czwVar2.e()).floatValue();
            } else {
                l = ((daa) czwVar2).l();
            }
            if (l != 0.0f) {
                this.j.preRotate(l);
            }
        }
        if (this.f != null) {
            if (this.g == null) {
                cos = 0.0f;
            } else {
                cos = (float) Math.cos(Math.toRadians((-r3.l()) + 90.0f));
            }
            if (this.g == null) {
                sin = 1.0f;
            } else {
                sin = (float) Math.sin(Math.toRadians((-r5.l()) + 90.0f));
            }
            float tan = (float) Math.tan(Math.toRadians(r0.l()));
            f();
            float[] fArr = this.n;
            fArr[0] = cos;
            fArr[1] = sin;
            float f = -sin;
            fArr[3] = f;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.k.setValues(fArr);
            f();
            float[] fArr2 = this.n;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.l.setValues(fArr2);
            f();
            float[] fArr3 = this.n;
            fArr3[0] = cos;
            fArr3[1] = f;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.m.setValues(fArr3);
            this.l.preConcat(this.k);
            this.m.preConcat(this.l);
            this.j.preConcat(this.m);
        }
        czw czwVar3 = this.c;
        if (czwVar3 != null) {
            dff dffVar = (dff) czwVar3.e();
            float f2 = dffVar.a;
            if (f2 != 1.0f || dffVar.b != 1.0f) {
                this.j.preScale(f2, dffVar.b);
            }
        }
        czw czwVar4 = this.a;
        if (czwVar4 != null && (((pointF = (PointF) czwVar4.e()) != null && pointF.x != 0.0f) || pointF.y != 0.0f)) {
            this.j.preTranslate(-pointF.x, -pointF.y);
        }
        return this.j;
    }

    public final Matrix b(float f) {
        PointF pointF;
        dff dffVar;
        float f2;
        czw czwVar = this.b;
        PointF pointF2 = null;
        if (czwVar == null) {
            pointF = null;
        } else {
            pointF = (PointF) czwVar.e();
        }
        czw czwVar2 = this.c;
        if (czwVar2 == null) {
            dffVar = null;
        } else {
            dffVar = (dff) czwVar2.e();
        }
        this.j.reset();
        if (pointF != null) {
            this.j.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (dffVar != null) {
            double d = f;
            this.j.preScale((float) Math.pow(dffVar.a, d), (float) Math.pow(dffVar.b, d));
        }
        czw czwVar3 = this.d;
        if (czwVar3 != null) {
            float floatValue = ((Float) czwVar3.e()).floatValue();
            czw czwVar4 = this.a;
            if (czwVar4 != null) {
                pointF2 = (PointF) czwVar4.e();
            }
            Matrix matrix = this.j;
            float f3 = floatValue * f;
            float f4 = 0.0f;
            if (pointF2 == null) {
                f2 = 0.0f;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.j;
    }

    public final void c(dcu dcuVar) {
        dcuVar.i(this.e);
        dcuVar.i(this.h);
        dcuVar.i(this.i);
        dcuVar.i(this.a);
        dcuVar.i(this.b);
        dcuVar.i(this.c);
        dcuVar.i(this.d);
        dcuVar.i(this.f);
        dcuVar.i(this.g);
    }

    public final void d(czr czrVar) {
        czw czwVar = this.e;
        if (czwVar != null) {
            czwVar.h(czrVar);
        }
        czw czwVar2 = this.h;
        if (czwVar2 != null) {
            czwVar2.h(czrVar);
        }
        czw czwVar3 = this.i;
        if (czwVar3 != null) {
            czwVar3.h(czrVar);
        }
        czw czwVar4 = this.a;
        if (czwVar4 != null) {
            czwVar4.h(czrVar);
        }
        czw czwVar5 = this.b;
        if (czwVar5 != null) {
            czwVar5.h(czrVar);
        }
        czw czwVar6 = this.c;
        if (czwVar6 != null) {
            czwVar6.h(czrVar);
        }
        czw czwVar7 = this.d;
        if (czwVar7 != null) {
            czwVar7.h(czrVar);
        }
        daa daaVar = this.f;
        if (daaVar != null) {
            daaVar.h(czrVar);
        }
        daa daaVar2 = this.g;
        if (daaVar2 != null) {
            daaVar2.h(czrVar);
        }
    }

    public final boolean e(Object obj, dfe dfeVar) {
        if (obj == cyq.f) {
            czw czwVar = this.a;
            if (czwVar == null) {
                this.a = new dan(dfeVar, new PointF());
                return true;
            }
            czwVar.k(dfeVar);
            return true;
        }
        if (obj == cyq.g) {
            czw czwVar2 = this.b;
            if (czwVar2 == null) {
                this.b = new dan(dfeVar, new PointF());
                return true;
            }
            czwVar2.k(dfeVar);
            return true;
        }
        if (obj == cyq.h) {
            czw czwVar3 = this.b;
            if (czwVar3 instanceof daj) {
                daj dajVar = (daj) czwVar3;
                dfe dfeVar2 = dajVar.e;
                if (dfeVar2 != null) {
                    dfeVar2.d = null;
                }
                dajVar.e = dfeVar;
                if (dfeVar != null) {
                    dfeVar.d = dajVar;
                    return true;
                }
                return true;
            }
        }
        if (obj == cyq.i) {
            czw czwVar4 = this.b;
            if (czwVar4 instanceof daj) {
                daj dajVar2 = (daj) czwVar4;
                dfe dfeVar3 = dajVar2.f;
                if (dfeVar3 != null) {
                    dfeVar3.d = null;
                }
                dajVar2.f = dfeVar;
                if (dfeVar != null) {
                    dfeVar.d = dajVar2;
                    return true;
                }
                return true;
            }
        }
        if (obj == cyq.o) {
            czw czwVar5 = this.c;
            if (czwVar5 == null) {
                this.c = new dan(dfeVar, new dff());
                return true;
            }
            czwVar5.k(dfeVar);
            return true;
        }
        if (obj == cyq.p) {
            czw czwVar6 = this.d;
            if (czwVar6 == null) {
                this.d = new dan(dfeVar, Float.valueOf(0.0f));
                return true;
            }
            czwVar6.k(dfeVar);
            return true;
        }
        if (obj == cyq.c) {
            czw czwVar7 = this.e;
            if (czwVar7 == null) {
                this.e = new dan(dfeVar, 100);
                return true;
            }
            czwVar7.k(dfeVar);
            return true;
        }
        if (obj == cyq.C) {
            czw czwVar8 = this.h;
            if (czwVar8 == null) {
                this.h = new dan(dfeVar, Float.valueOf(100.0f));
                return true;
            }
            czwVar8.k(dfeVar);
            return true;
        }
        if (obj == cyq.D) {
            czw czwVar9 = this.i;
            if (czwVar9 == null) {
                this.i = new dan(dfeVar, Float.valueOf(100.0f));
                return true;
            }
            czwVar9.k(dfeVar);
            return true;
        }
        if (obj == cyq.q) {
            if (this.f == null) {
                this.f = new daa(Collections.singletonList(new dfc(Float.valueOf(0.0f))));
            }
            this.f.k(dfeVar);
            return true;
        }
        if (obj == cyq.r) {
            if (this.g == null) {
                this.g = new daa(Collections.singletonList(new dfc(Float.valueOf(0.0f))));
            }
            this.g.k(dfeVar);
            return true;
        }
        return false;
    }
}
