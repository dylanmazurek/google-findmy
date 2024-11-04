package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.ar.core.ImageMetadata;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dsf implements Cloneable {
    private int a;
    public Drawable e;
    public int f;
    public Drawable g;
    public int h;
    public boolean m;
    public boolean r;
    public boolean t;
    private Drawable u;
    private int v;
    private boolean w;
    private Resources.Theme x;
    private boolean y;
    private boolean z;
    public float b = 1.0f;
    public dkp c = dkp.d;
    public dgs d = dgs.NORMAL;
    public boolean i = true;
    public int j = -1;
    public int k = -1;
    public dir l = dta.b;
    public boolean n = true;
    public div o = new div();
    public Map p = new dte();
    public Class q = Object.class;
    public boolean s = true;

    private static boolean a(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public final void A() {
        this.w = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void B() {
        if (!this.w) {
        } else {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public final dsf C() {
        if (this.r) {
            return clone().C();
        }
        this.i = false;
        this.a |= 256;
        B();
        return this;
    }

    public final void D() {
        if (this.w && !this.r) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.r = true;
        A();
    }

    public boolean equals(Object obj) {
        if (obj instanceof dsf) {
            dsf dsfVar = (dsf) obj;
            if (Float.compare(dsfVar.b, this.b) == 0) {
                int i = dsfVar.f;
                Drawable drawable = dsfVar.e;
                if (amr.i(null, null)) {
                    int i2 = dsfVar.h;
                    Drawable drawable2 = dsfVar.g;
                    if (amr.i(null, null)) {
                        int i3 = dsfVar.v;
                        Drawable drawable3 = dsfVar.u;
                        if (amr.i(null, null) && this.i == dsfVar.i && this.j == dsfVar.j && this.k == dsfVar.k && this.m == dsfVar.m && this.n == dsfVar.n) {
                            boolean z = dsfVar.y;
                            boolean z2 = dsfVar.z;
                            if (this.c.equals(dsfVar.c) && this.d == dsfVar.d && this.o.equals(dsfVar.o) && this.p.equals(dsfVar.p) && this.q.equals(dsfVar.q) && amr.i(this.l, dsfVar.l)) {
                                Resources.Theme theme = dsfVar.x;
                                if (amr.i(null, null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public dsf f(dsf dsfVar) {
        if (this.r) {
            return clone().f(dsfVar);
        }
        int i = dsfVar.a;
        if (a(i, 2)) {
            this.b = dsfVar.b;
        }
        if (a(i, 262144)) {
            boolean z = dsfVar.y;
            this.y = false;
        }
        if (a(i, ImageMetadata.SHADING_MODE)) {
            this.t = dsfVar.t;
        }
        if (a(i, 4)) {
            this.c = dsfVar.c;
        }
        if (a(i, 8)) {
            this.d = dsfVar.d;
        }
        if (a(i, 16)) {
            Drawable drawable = dsfVar.e;
            this.e = null;
            this.f = 0;
            this.a &= -33;
        }
        if (a(dsfVar.a, 32)) {
            int i2 = dsfVar.f;
            this.f = 0;
            this.e = null;
            this.a &= -17;
        }
        if (a(dsfVar.a, 64)) {
            Drawable drawable2 = dsfVar.g;
            this.g = null;
            this.h = 0;
            this.a &= -129;
        }
        if (a(dsfVar.a, 128)) {
            int i3 = dsfVar.h;
            this.h = 0;
            this.g = null;
            this.a &= -65;
        }
        int i4 = dsfVar.a;
        if (a(i4, 256)) {
            this.i = dsfVar.i;
        }
        if (a(i4, 512)) {
            this.k = dsfVar.k;
            this.j = dsfVar.j;
        }
        if (a(i4, 1024)) {
            this.l = dsfVar.l;
        }
        if (a(i4, 4096)) {
            this.q = dsfVar.q;
        }
        if (a(i4, 8192)) {
            Drawable drawable3 = dsfVar.u;
            this.u = null;
            this.v = 0;
            this.a &= -16385;
        }
        if (a(dsfVar.a, 16384)) {
            int i5 = dsfVar.v;
            this.v = 0;
            this.u = null;
            this.a &= -8193;
        }
        int i6 = dsfVar.a;
        if (a(i6, 32768)) {
            Resources.Theme theme = dsfVar.x;
            this.x = null;
        }
        if (a(i6, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE)) {
            this.n = dsfVar.n;
        }
        if (a(i6, 131072)) {
            this.m = dsfVar.m;
        }
        if (a(i6, 2048)) {
            this.p.putAll(dsfVar.p);
            this.s = dsfVar.s;
        }
        if (a(dsfVar.a, ImageMetadata.LENS_APERTURE)) {
            boolean z2 = dsfVar.z;
            this.z = false;
        }
        if (!this.n) {
            this.p.clear();
            int i7 = this.a;
            this.m = false;
            this.a = i7 & (-133121);
            this.s = true;
        }
        this.a |= dsfVar.a;
        this.o.c(dsfVar.o);
        B();
        return this;
    }

    @Override // 
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public dsf clone() {
        try {
            dsf dsfVar = (dsf) super.clone();
            div divVar = new div();
            dsfVar.o = divVar;
            divVar.c(this.o);
            dte dteVar = new dte();
            dsfVar.p = dteVar;
            dteVar.putAll(this.p);
            dsfVar.w = false;
            dsfVar.r = false;
            return dsfVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public int hashCode() {
        return dtq.d(null, dtq.d(this.l, dtq.d(this.q, dtq.d(this.p, dtq.d(this.o, dtq.d(this.d, dtq.d(this.c, dtq.c(0, dtq.c(0, dtq.c(this.n ? 1 : 0, dtq.c(this.m ? 1 : 0, dtq.c(this.k, dtq.c(this.j, dtq.c(this.i ? 1 : 0, dtq.d(null, dtq.c(0, dtq.d(null, dtq.c(0, dtq.d(null, dtq.c(0, dtq.c(Float.floatToIntBits(this.b), 17)))))))))))))))))))));
    }

    public final dsf k(Class cls) {
        if (this.r) {
            return clone().k(cls);
        }
        bsc.q(cls);
        this.q = cls;
        this.a |= 4096;
        B();
        return this;
    }

    public final dsf l(dkp dkpVar) {
        if (this.r) {
            return clone().l(dkpVar);
        }
        bsc.q(dkpVar);
        this.c = dkpVar;
        this.a |= 4;
        B();
        return this;
    }

    public final dsf m() {
        return p(dpc.c, new dor());
    }

    public final dsf n() {
        return o(dpc.b, new dos());
    }

    public final dsf o(dpc dpcVar, diz dizVar) {
        dsf p = p(dpcVar, dizVar);
        p.s = true;
        return p;
    }

    final dsf p(dpc dpcVar, diz dizVar) {
        if (this.r) {
            return clone().p(dpcVar, dizVar);
        }
        diu diuVar = dpc.f;
        bsc.q(dpcVar);
        s(diuVar, dpcVar);
        return v(dizVar, false);
    }

    public final dsf q(int i, int i2) {
        if (this.r) {
            return clone().q(i, i2);
        }
        this.k = i;
        this.j = i2;
        this.a |= 512;
        B();
        return this;
    }

    public final dsf r(dgs dgsVar) {
        if (this.r) {
            return clone().r(dgsVar);
        }
        bsc.q(dgsVar);
        this.d = dgsVar;
        this.a |= 8;
        B();
        return this;
    }

    public final dsf s(diu diuVar, Object obj) {
        if (this.r) {
            return clone().s(diuVar, obj);
        }
        bsc.q(diuVar);
        bsc.q(obj);
        this.o.d(diuVar, obj);
        B();
        return this;
    }

    public final dsf t(dir dirVar) {
        if (this.r) {
            return clone().t(dirVar);
        }
        bsc.q(dirVar);
        this.l = dirVar;
        this.a |= 1024;
        B();
        return this;
    }

    public final dsf u(diz dizVar) {
        return v(dizVar, true);
    }

    final dsf v(diz dizVar, boolean z) {
        if (this.r) {
            return clone().v(dizVar, z);
        }
        dpi dpiVar = new dpi(dizVar, z);
        w(Bitmap.class, dizVar, z);
        w(Drawable.class, dpiVar, z);
        w(BitmapDrawable.class, dpiVar, z);
        w(dqo.class, new dqr(dizVar), z);
        B();
        return this;
    }

    final dsf w(Class cls, diz dizVar, boolean z) {
        if (this.r) {
            return clone().w(cls, dizVar, z);
        }
        bsc.q(cls);
        bsc.q(dizVar);
        this.p.put(cls, dizVar);
        int i = this.a;
        this.n = true;
        this.a = 67584 | i;
        this.s = false;
        if (z) {
            this.a = i | 198656;
            this.m = true;
        }
        B();
        return this;
    }

    public final boolean x(int i) {
        return a(this.a, i);
    }

    public final boolean y() {
        return dtq.l(this.k, this.j);
    }

    public final dsf z() {
        if (this.r) {
            return clone().z();
        }
        this.t = true;
        this.a |= ImageMetadata.SHADING_MODE;
        B();
        return this;
    }
}
