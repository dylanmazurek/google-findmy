package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bmn {
    bmr a = null;
    public float b = 0.0f;
    final ArrayList c = new ArrayList();
    boolean d = false;
    public bmm e;

    public bmn() {
    }

    public static final boolean l(bmr bmrVar) {
        if (bmrVar.l <= 1) {
            return true;
        }
        return false;
    }

    public final bmr a(boolean[] zArr, bmr bmrVar) {
        int i;
        int i2 = this.e.a;
        bmr bmrVar2 = null;
        float f = 0.0f;
        for (int i3 = 0; i3 < i2; i3++) {
            float b = this.e.b(i3);
            if (b < 0.0f) {
                bmr d = this.e.d(i3);
                if ((zArr == null || !zArr[d.c]) && d != bmrVar && (((i = d.n) == 3 || i == 4) && b < f)) {
                    f = b;
                    bmrVar2 = d;
                }
            }
        }
        return bmrVar2;
    }

    public final void b(bmr bmrVar) {
        bmr bmrVar2 = this.a;
        if (bmrVar2 != null) {
            this.e.g(bmrVar2, -1.0f);
            this.a.d = -1;
            this.a = null;
        }
        float f = -this.e.c(bmrVar, true);
        this.a = bmrVar;
        if (f != 1.0f) {
            this.b /= f;
            bmm bmmVar = this.e;
            int i = bmmVar.e;
            for (int i2 = 0; i != -1 && i2 < bmmVar.a; i2++) {
                float[] fArr = bmmVar.d;
                fArr[i] = fArr[i] / f;
                i = bmmVar.c[i];
            }
        }
    }

    public final void c(bmo bmoVar, bmr bmrVar, boolean z) {
        if (bmrVar != null && bmrVar.g) {
            this.b += bmrVar.f * this.e.a(bmrVar);
            this.e.c(bmrVar, z);
            if (z) {
                bmrVar.b(this);
            }
            if (this.e.a == 0) {
                this.d = true;
                bmoVar.c = true;
            }
        }
    }

    public void d(bmo bmoVar, bmn bmnVar, boolean z) {
        bmm bmmVar = this.e;
        float a = bmmVar.a(bmnVar.a);
        bmmVar.c(bmnVar.a, z);
        bmm bmmVar2 = bmnVar.e;
        int i = bmmVar2.a;
        for (int i2 = 0; i2 < i; i2++) {
            bmr d = bmmVar2.d(i2);
            bmmVar.e(d, bmmVar2.a(d) * a, z);
        }
        this.b += bmnVar.b * a;
        if (z) {
            bmnVar.a.b(this);
        }
        if (this.a != null && this.e.a == 0) {
            this.d = true;
            bmoVar.c = true;
        }
    }

    public boolean e() {
        if (this.a == null && this.b == 0.0f && this.e.a == 0) {
            return true;
        }
        return false;
    }

    public final void f(bmo bmoVar, int i) {
        this.e.g(bmoVar.p(i), 1.0f);
        this.e.g(bmoVar.p(i), -1.0f);
    }

    public final void g(bmr bmrVar, bmr bmrVar2, bmr bmrVar3, bmr bmrVar4, float f) {
        this.e.g(bmrVar, -1.0f);
        this.e.g(bmrVar2, 1.0f);
        this.e.g(bmrVar3, f);
        this.e.g(bmrVar4, -f);
    }

    public final void h(bmr bmrVar, bmr bmrVar2, bmr bmrVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(bmrVar, 1.0f);
                this.e.g(bmrVar2, -1.0f);
                this.e.g(bmrVar3, -1.0f);
                return;
            }
        }
        this.e.g(bmrVar, -1.0f);
        this.e.g(bmrVar2, 1.0f);
        this.e.g(bmrVar3, 1.0f);
    }

    public final void i(bmr bmrVar, bmr bmrVar2, bmr bmrVar3, int i) {
        boolean z;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            } else {
                z = false;
            }
            this.b = i;
            if (z) {
                this.e.g(bmrVar, 1.0f);
                this.e.g(bmrVar2, -1.0f);
                this.e.g(bmrVar3, 1.0f);
                return;
            }
        }
        this.e.g(bmrVar, -1.0f);
        this.e.g(bmrVar2, 1.0f);
        this.e.g(bmrVar3, -1.0f);
    }

    public final void j(bmr bmrVar, bmr bmrVar2, bmr bmrVar3, bmr bmrVar4, float f) {
        this.e.g(bmrVar3, 0.5f);
        this.e.g(bmrVar4, 0.5f);
        this.e.g(bmrVar, -0.5f);
        this.e.g(bmrVar2, -0.5f);
        this.b = -f;
    }

    public bmr k(boolean[] zArr) {
        return a(zArr, null);
    }

    public String toString() {
        String concat;
        boolean z;
        String str;
        bmr bmrVar = this.a;
        if (bmrVar == null) {
            concat = "0";
        } else {
            Objects.toString(bmrVar);
            concat = "".concat(String.valueOf(bmrVar));
        }
        float f = this.b;
        String concat2 = concat.concat(" = ");
        if (f != 0.0f) {
            concat2 = concat2 + this.b;
            z = true;
        } else {
            z = false;
        }
        int i = this.e.a;
        for (int i2 = 0; i2 < i; i2++) {
            bmr d = this.e.d(i2);
            if (d != null) {
                float b = this.e.b(i2);
                if (b != 0.0f) {
                    String bmrVar2 = d.toString();
                    if (!z) {
                        if (b < 0.0f) {
                            b = -b;
                            concat2 = concat2.concat("- ");
                        }
                    } else {
                        if (b > 0.0f) {
                            str = " + ";
                        } else {
                            b = -b;
                            str = " - ";
                        }
                        concat2 = concat2.concat(str);
                    }
                    if (b == 1.0f) {
                        concat2 = concat2.concat(bmrVar2);
                    } else {
                        concat2 = concat2 + b + " " + bmrVar2;
                    }
                    z = true;
                }
            }
        }
        if (!z) {
            return concat2.concat("0.0");
        }
        return concat2;
    }

    public bmn(ksr ksrVar) {
        this.e = new bmm(this, ksrVar);
    }
}
