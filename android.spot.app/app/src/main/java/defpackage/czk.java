package defpackage;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class czk implements czj, czr, czh {
    private final String b;
    private final cym c;
    private final boolean d;
    private final boolean e;
    private final czw f;
    private final czw g;
    private final czw h;
    private final czw i;
    private final czw j;
    private final czw k;
    private final czw l;
    private boolean m;
    private final int n;
    private final Path a = new Path();
    private final bet o = new bet((char[]) null);

    public czk(cym cymVar, dcu dcuVar, dcj dcjVar) {
        this.c = cymVar;
        this.b = dcjVar.a;
        int i = dcjVar.k;
        this.n = i;
        this.d = dcjVar.i;
        this.e = dcjVar.j;
        czw a = dcjVar.b.a();
        this.f = a;
        czw a2 = dcjVar.c.a();
        this.g = a2;
        czw a3 = dcjVar.d.a();
        this.h = a3;
        czw a4 = dcjVar.f.a();
        this.j = a4;
        czw a5 = dcjVar.h.a();
        this.l = a5;
        if (i == 1) {
            this.i = dcjVar.e.a();
            this.k = dcjVar.g.a();
        } else {
            this.i = null;
            this.k = null;
        }
        dcuVar.i(a);
        dcuVar.i(a2);
        dcuVar.i(a3);
        dcuVar.i(a4);
        dcuVar.i(a5);
        if (i == 1) {
            dcuVar.i(this.i);
            dcuVar.i(this.k);
        }
        a.h(this);
        a2.h(this);
        a3.h(this);
        a4.h(this);
        a5.h(this);
        if (i == 1) {
            this.i.h(this);
            this.k.h(this);
        }
    }

    @Override // defpackage.dbn
    public final void a(Object obj, dfe dfeVar) {
        czw czwVar;
        czw czwVar2;
        if (obj == cyq.w) {
            this.f.k(dfeVar);
            return;
        }
        if (obj == cyq.x) {
            this.h.k(dfeVar);
            return;
        }
        if (obj == cyq.n) {
            this.g.k(dfeVar);
            return;
        }
        if (obj == cyq.y && (czwVar2 = this.i) != null) {
            czwVar2.k(dfeVar);
            return;
        }
        if (obj == cyq.z) {
            this.j.k(dfeVar);
            return;
        }
        if (obj == cyq.A && (czwVar = this.k) != null) {
            czwVar.k(dfeVar);
        } else if (obj == cyq.B) {
            this.l.k(dfeVar);
        }
    }

    @Override // defpackage.czr
    public final void d() {
        this.m = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.dbn
    public final void e(dbm dbmVar, int i, List list, dbm dbmVar2) {
        dew.d(dbmVar, i, list, dbmVar2, this);
    }

    @Override // defpackage.cyz
    public final void f(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            cyz cyzVar = (cyz) list.get(i);
            if (cyzVar instanceof czq) {
                czq czqVar = (czq) cyzVar;
                if (czqVar.e == 1) {
                    this.o.m(czqVar);
                    czqVar.a(this);
                }
            }
        }
    }

    @Override // defpackage.cyz
    public final String g() {
        return this.b;
    }

    @Override // defpackage.czj
    public final Path i() {
        float f;
        float f2;
        float f3;
        float f4;
        float cos;
        double d;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i;
        double d2;
        float f11;
        float f12;
        float f13;
        float f14;
        double d3;
        double d4;
        if (this.m) {
            return this.a;
        }
        this.a.reset();
        if (this.d) {
            this.m = true;
            return this.a;
        }
        int i2 = this.n;
        if (i2 != 0) {
            if (i2 != 1) {
                int floor = (int) Math.floor(((Float) this.f.e()).floatValue());
                double floatValue = ((Float) this.h.e()).floatValue();
                czw czwVar = this.l;
                double radians = Math.toRadians(floatValue - 90.0d);
                float floatValue2 = ((Float) czwVar.e()).floatValue() / 100.0f;
                float floatValue3 = ((Float) this.j.e()).floatValue();
                double d5 = floatValue3;
                float cos2 = (float) (d5 * Math.cos(radians));
                float sin = (float) (d5 * Math.sin(radians));
                this.a.moveTo(cos2, sin);
                double d6 = floor;
                double d7 = (float) (6.283185307179586d / d6);
                double d8 = radians + d7;
                double ceil = Math.ceil(d6);
                float f15 = cos2;
                int i3 = 0;
                while (i3 < ceil) {
                    double d9 = d8;
                    float cos3 = (float) (Math.cos(d8) * d5);
                    float sin2 = (float) (d5 * Math.sin(d8));
                    if (floatValue2 != 0.0f) {
                        d3 = ceil;
                        double atan2 = (float) (Math.atan2(sin, f15) - 1.5707963267948966d);
                        d4 = d5;
                        double atan22 = (float) (Math.atan2(sin2, cos3) - 1.5707963267948966d);
                        float f16 = floatValue3 * floatValue2 * 0.25f;
                        this.a.cubicTo(f15 - (((float) Math.cos(atan2)) * f16), sin - (((float) Math.sin(atan2)) * f16), cos3 + (((float) Math.cos(atan22)) * f16), sin2 + (f16 * ((float) Math.sin(atan22))), cos3, sin2);
                    } else {
                        d3 = ceil;
                        d4 = d5;
                        this.a.lineTo(cos3, sin2);
                    }
                    i3++;
                    f15 = cos3;
                    d8 = d9 + d7;
                    ceil = d3;
                    d5 = d4;
                    sin = sin2;
                }
                PointF pointF = (PointF) this.g.e();
                this.a.offset(pointF.x, pointF.y);
                this.a.close();
            } else {
                float floatValue4 = ((Float) this.f.e()).floatValue();
                double floatValue5 = ((Float) this.h.e()).floatValue();
                double d10 = floatValue4;
                boolean z = this.e;
                float f17 = (float) (6.283185307179586d / d10);
                double radians2 = Math.toRadians(floatValue5 - 90.0d);
                if (z) {
                    f17 = -f17;
                }
                float f18 = floatValue4 - ((int) floatValue4);
                int i4 = (f18 > 0.0f ? 1 : (f18 == 0.0f ? 0 : -1));
                float f19 = f17 / 2.0f;
                if (i4 != 0) {
                    radians2 += (1.0f - f18) * f19;
                }
                float floatValue6 = ((Float) this.j.e()).floatValue();
                float floatValue7 = ((Float) this.i.e()).floatValue();
                czw czwVar2 = this.k;
                if (czwVar2 != null) {
                    f = ((Float) czwVar2.e()).floatValue() / 100.0f;
                } else {
                    f = 0.0f;
                }
                float floatValue8 = ((Float) this.l.e()).floatValue() / 100.0f;
                if (i4 != 0) {
                    float f20 = floatValue7 + ((floatValue6 - floatValue7) * f18);
                    f2 = f17;
                    double d11 = f20;
                    f4 = floatValue8;
                    f6 = f20;
                    f3 = floatValue7;
                    cos = (float) (d11 * Math.cos(radians2));
                    float sin3 = (float) (d11 * Math.sin(radians2));
                    this.a.moveTo(cos, sin3);
                    d = radians2 + ((f17 * f18) / 2.0f);
                    f5 = sin3;
                } else {
                    f2 = f17;
                    f3 = floatValue7;
                    f4 = floatValue8;
                    double d12 = floatValue6;
                    cos = (float) (Math.cos(radians2) * d12);
                    float sin4 = (float) (d12 * Math.sin(radians2));
                    this.a.moveTo(cos, sin4);
                    d = radians2 + f19;
                    f5 = sin4;
                    f6 = 0.0f;
                }
                double ceil2 = Math.ceil(d10);
                double d13 = ceil2 + ceil2;
                int i5 = i4;
                int i6 = 0;
                boolean z2 = false;
                while (true) {
                    double d14 = i6;
                    if (d14 >= d13) {
                        break;
                    }
                    if (true != z2) {
                        f7 = f3;
                    } else {
                        f7 = floatValue6;
                    }
                    if (f6 != 0.0f && d14 == d13 - 2.0d) {
                        f8 = (f2 * f18) / 2.0f;
                    } else {
                        f8 = f19;
                    }
                    if (f6 != 0.0f && d14 == d13 - 1.0d) {
                        f9 = floatValue6;
                        f10 = f6;
                    } else {
                        f9 = floatValue6;
                        f10 = f7;
                    }
                    double d15 = f10;
                    double d16 = d13;
                    float cos4 = (float) (d15 * Math.cos(d));
                    float sin5 = (float) (d15 * Math.sin(d));
                    if (f == 0.0f && f4 == 0.0f) {
                        this.a.lineTo(cos4, sin5);
                        d2 = d;
                        f11 = sin5;
                        i = i5;
                    } else {
                        i = i5;
                        d2 = d;
                        double atan23 = (float) (Math.atan2(f5, cos) - 1.5707963267948966d);
                        float cos5 = (float) Math.cos(atan23);
                        float sin6 = (float) Math.sin(atan23);
                        f11 = sin5;
                        double atan24 = (float) (Math.atan2(sin5, cos4) - 1.5707963267948966d);
                        float cos6 = (float) Math.cos(atan24);
                        float sin7 = (float) Math.sin(atan24);
                        if (true != z2) {
                            f12 = f4;
                        } else {
                            f12 = f;
                        }
                        if (true != z2) {
                            f13 = f;
                        } else {
                            f13 = f4;
                        }
                        if (true != z2) {
                            f14 = f9;
                        } else {
                            f14 = f3;
                        }
                        float f21 = f14 * f12 * 0.47829f;
                        float f22 = cos5 * f21;
                        float f23 = f21 * sin6;
                        float f24 = f7 * f13 * 0.47829f;
                        float f25 = cos6 * f24;
                        float f26 = f24 * sin7;
                        if (i != 0) {
                            if (i6 == 0) {
                                f22 *= f18;
                                f23 *= f18;
                            } else if (d14 == d16 - 1.0d) {
                                f25 *= f18;
                                f26 *= f18;
                            }
                        }
                        this.a.cubicTo(cos - f22, f5 - f23, cos4 + f25, f11 + f26, cos4, f11);
                    }
                    d = d2 + f8;
                    z2 = !z2;
                    i6++;
                    i5 = i;
                    cos = cos4;
                    floatValue6 = f9;
                    d13 = d16;
                    f5 = f11;
                }
                PointF pointF2 = (PointF) this.g.e();
                this.a.offset(pointF2.x, pointF2.y);
                this.a.close();
            }
            this.a.close();
            this.o.n(this.a);
            this.m = true;
            return this.a;
        }
        throw null;
    }
}
